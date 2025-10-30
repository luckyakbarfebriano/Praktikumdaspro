import java.util.Scanner;
public class Tugas3KafeSenja{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah cabang kafe: ");
        int jumlahCabang = sc.nextInt();
        System.out.println("\n=== Input Penjualan Per Cabang ===");
        int totalSeluruhPelanggan = 0;
        int totalSeluruhItem = 0;
        for (int cabang = 1; cabang <= jumlahCabang; cabang++) {
            System.out.println("\n--- Cabang " + cabang + " ---");
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();
            int totalItemCabang = 0;
            for (int pelanggan = 1; pelanggan <= jumlahPelanggan; pelanggan++) {
                System.out.print("- Pelanggan " + pelanggan + " memesan berapa item? ");
                int item = sc.nextInt();
                totalItemCabang += item;
            }
            System.out.println("Cabang " + cabang + ":");
            System.out.println("- Pelanggan: " + jumlahPelanggan + " orang");
            System.out.println("- Item terjual: " + totalItemCabang);
            totalSeluruhPelanggan += jumlahPelanggan;
            totalSeluruhItem += totalItemCabang;
        }
        System.out.println("\nTotal seluruh Cabang:");
        System.out.println("Pelanggan: " + totalSeluruhPelanggan + " orang");
        System.out.println("Item terjual: " + totalSeluruhItem + " item");
        sc.close();
    }
}