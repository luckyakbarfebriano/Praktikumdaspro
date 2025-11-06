package jobsheet9;
import java.util.Scanner;
public class Tugas2JS9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah pesanan: ");
        int jmlPesanan = sc.nextInt();
        sc.nextLine();
        String[] namaPesanan = new String[jmlPesanan];
        int[] hargaPesanan = new int[jmlPesanan];
        int total = 0;
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.print("Masukkan nama makanan/minuman ke-" + (i + 1) + ": ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Masukkan harga: ");
            hargaPesanan[i] = sc.nextInt();
            sc.nextLine();
            total += hargaPesanan[i];
        }
        System.out.println("\n=== DAFTAR PESANAN ===");
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }
        System.out.println("Total biaya: Rp " + total);
        sc.close();
    }
}