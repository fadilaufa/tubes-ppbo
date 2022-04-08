import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main (String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        nilai_mhs obj = new nilai_mhs();
        char pil;
        do{
        System.out.println("Menu Utama :");
        System.out.println("1. Input Data");
        System.out.println("2. Tampilkan");
        System.out.println("3. Tampilkan Rangking");
        System.out.println("4. Keluar");
        System.out.print("masukkan pilihan : ");
        pil = input.next().charAt(0);
        switch (pil){
            case '1' : obj.input();break;
            case '2' : obj.tampil();break;
            case '3' : obj.perangkingan();break;
            case '4' : System.out.println("Program Selesai");break;
            default : System.out.println("PILIHAN TIDAK ADA !");
            System.out.println();
        }
      } while (pil != '4');
    }
}
