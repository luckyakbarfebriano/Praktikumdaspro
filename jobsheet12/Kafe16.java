package jobsheet12;
import java.util.Scanner;
public class Kafe16 {
    public static void Menu() {
        System.out.println("====== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("=======");
    }
    public static int hitungTotalHarga16(int pilihanMenu, int banyakItem) {
        int[] hargaMenu = {15000, 20000, 22000, 12000, 10000, 18000};
        
        if (pilihanMenu < 1 || pilihanMenu > hargaMenu.length) {
            System.out.println("Menu tidak valid!");
            return 0;
        }
        return hargaMenu[pilihanMenu - 1] * banyakItem;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalKeseluruhan = 0;
        char pesanLagi;
        do {
            Menu();
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();
            
            int totalHarga = hitungTotalHarga16(pilihanMenu, banyakItem);
            totalKeseluruhan += totalHarga;
            
            System.out.println("Harga pesanan ini: Rp" + totalHarga);
            System.out.println("Total sementara: Rp" + totalKeseluruhan);
            
            System.out.print("Tambah pesanan lagi? (y/n): ");
            pesanLagi = sc.next().charAt(0);
            
        } while (pesanLagi == 'y' || pesanLagi == 'Y');
        
        System.out.println("Total keseluruhan pesanan: Rp" + totalKeseluruhan);
        sc.close();
    }
}