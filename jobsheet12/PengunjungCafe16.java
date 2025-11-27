package jobsheet12;

public class PengunjungCafe16 {
    static void daftarPengunjung(String...namaPengunjung){
            System.out.println("Daftar Nama Pengunjung Cafe:");
        for(int i = 0 ;i< namaPengunjung.length; i++){
            System.out.println((i+1)+"-"+namaPengunjung[i]);
        }
    }
     public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
    }
}