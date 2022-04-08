public class nilai {
    private String []nama =null;
    private int []nilai_uts=null;
    private int []nilai_uas=null;
    private int []nilai_akhir=null;
    public int n;
    
    public void setNama(String[] nama){
        this.nama =  nama;
        nama = null;
    }
    
    public String[] getNama (){
        return this.nama;
    }
    
    public void setNilaiUts(int[] nilai_uts){
        this.nilai_uts =  nilai_uts;
        nilai_uts = null;
    }
    
    public int[] getNilaiUts (){
        return this.nilai_uts;
    }
    
    public void setNilaiUas(int[] nilai_uas){
        this.nilai_uas =  nilai_uas;
        nilai_uas = null;
    }
    
    public int[] getNilaiUas (){
        return this.nilai_uas;
    }
    
    public void setNilaiAkhir(int[] nilai_akhir){
        this.nilai_akhir =  nilai_akhir;
        nilai_akhir = null;
    }
    
    public int[] getNilaiAkhir (){
        return this.nilai_akhir;
    }
    
}
