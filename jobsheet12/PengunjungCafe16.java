package jobsheet12;
public class PengunjungCafe16 {
    
    static void daftarPengunjung(String... namePengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for(String nama : namePengunjung) {
            System.out.println("- " + nama);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}