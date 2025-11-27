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
    public static int hitungTotalHarga16(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaMenu = {15000, 20000, 22000, 12000, 10000, 18000};
        
        if (pilihanMenu < 1 || pilihanMenu > hargaMenu.length) {
            System.out.println("Menu tidak valid!");
            return 0;
        }
        int totalHarga = hargaMenu[pilihanMenu - 1] * banyakItem;
        
        if ("DISKON50".equals(kodePromo)) {
            System.out.println("Diskon 50% diterapkan!");
            return (int)(totalHarga * 0.5);
        } else if ("DISKON30".equals(kodePromo)) {
            System.out.println("Diskon 30% diterapkan!");
            return (int)(totalHarga * 0.7);
        } else {
            System.out.println("Kode promo invalid!");
            return totalHarga;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu();
        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.next();
        int totalHarga = hitungTotalHarga16(pilihanMenu, banyakItem, kodePromo);
        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
        sc.close();
    }
}