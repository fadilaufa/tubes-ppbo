import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class nilai_mhs extends nilai{
    public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public Scanner input = new Scanner(System.in);
    public int n;
    private String []nim;
    
    public void setNim(String[] nim){
        this.nim =  nim;
        nim = null;
    }
    
    public String[] getNim (){
        return this.nim;
    }
    
    public void input() throws IOException {
        System.out.print("Masukkan jumlah data : ");
        n = input.nextInt();
        String nama[] = new String[n];
        String nim[] = new String[n];
        int nilai_uts[] = new int[n];
        int nilai_uas[] = new int[n];
        int nilai_akhir[] = new int[n];
        
        for (int i = 0; i < n; i ++){
            System.out.println("Masukkan data mahasiswa ke-" + (i+1) + " : ");
            System.out.print("Nama : ");
                nama[i] = br.readLine();
            System.out.print("NIM : ");
                nim[i] = br.readLine();
            System.out.print("Nilai UTS : ");
                nilai_uts[i] = input.nextInt();
            System.out.print("Nilai UAS : ");
                nilai_uas[i] = input.nextInt();
            nilai_akhir[i] = HitungNilaiAkhir(nilai_uts[i], nilai_uas[i]);
        }
        super.setNama(nama);
        this.setNim(nim);
        super.setNilaiUts(nilai_uts);
        super.setNilaiUas(nilai_uas);
        super.setNilaiAkhir(nilai_akhir);
        
        System.out.println("Data Berhasil Di Input");
        System.out.println();
        
        nama = null;
        nim = null;
        nilai_uts = null;
        nilai_uas = null;
        nilai_akhir = null;
    }
    
    public int HitungNilaiAkhir (int uts, int uas) {
        int nilai_akhir = (uts + uas) / 2;
        return nilai_akhir;
    }
    
    public void tampil(){
        String nama[] = super.getNama();
        String nim[] = this.getNim();
        int nilai_uts[] = super.getNilaiUts();
        int nilai_uas[] = super.getNilaiUas();
        int nilai_akhir[] = super.getNilaiAkhir();
        if (nama == null){
            System.out.println("Data Masih Kosong, Lakukan Input Dahulu !");
            System.out.println();return;
        }
        System.out.println("Data Mahasiswa : ");
        for (int i = 0; i < n; i++){
            System.out.println("| " + nama[i] + "\t| " + nim[i] + "\t| " + nilai_uts[i] + "\t| " + nilai_uas[i] + "\t| " + nilai_akhir[i] + "\t|"); 
        }
    }
    
    public void perangkingan(){
        String nama[] = super.getNama();
        String nim[] = this.getNim();
        int nilai_uts[] = super.getNilaiUts();
        int nilai_uas[] = super.getNilaiUas();
        int nilai_akhir[] = super.getNilaiAkhir();
        
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(nilai_akhir[j] > nilai_akhir[i]){
                    tukar(nama, i, j);
                    tukar(nim, i, j);
                    tukar(nilai_uts, i, j);
                    tukar(nilai_uas, i, j);
                    tukar(nilai_akhir, i, j);
                }
            }
        }
        
        System.out.println("Ranking Mahasiswa : ");
        for (int i = 0; i < n; i++){
            System.out.println("| " + nama[i] + "\t| " + nim[i] + "\t| " + nilai_uts[i] + "\t| " + nilai_uas[i] + "\t| " + nilai_akhir[i] + "\t|"); 
        }
    }
    
    public static void tukar(int []data, int i, int j){
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
    
   public static void tukar(String []data, int i, int j){
        String temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
    
    
   
}
