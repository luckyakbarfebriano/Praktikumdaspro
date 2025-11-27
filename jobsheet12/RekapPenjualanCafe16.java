package jobsheet12;
import java.util.Scanner;

public class RekapPenjualanCafe16 {
    public static void inputDataPenjualan(int[][] penjualan, String[] menu) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input data penjualan:");
        for(int i = 0; i < penjualan.length; i++) {
            System.out.println("Menu: " + menu[i]);
            for(int j = 0; j < penjualan[i].length; j++) {
                System.out.print("Hari ke-" + (j+1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }
    public static void tampilDataPenjualan(int[][] penjualan, String[] menu) {
        System.out.println("Rekap Penjualan Cafe");
        System.out.println("==========================================================");
        System.out.print("Menu\t\t");
        for(int i = 0; i < penjualan[0].length; i++) {
            System.out.print("Hari " + (i+1) + "\t");
        }
        System.out.println("Total");
        System.out.println("==========================================================");
        for(int i = 0; i < penjualan.length; i++) {
            System.out.print(menu[i]);
            if(menu[i].length() < 8) System.out.print("\t");
            System.out.print("\t");
            
            int total = 0;
            for(int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + "\t");
                total += penjualan[i][j];
            }
            System.out.println(total);
        }
        System.out.println("==========================================================");
    }
    public static void menuPenjualanTertinggi(int[][] penjualan, String[] menu) {
        int maxTotal = 0;
        String menuTerlaris = "";
        for(int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for(int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            if(total > maxTotal) {
                maxTotal = total;
                menuTerlaris = menu[i];
            }
        }
        System.out.println("\nMenu dengan penjualan tertinggi: " + menuTerlaris);
        System.out.println("Total penjualan: " + maxTotal + " cup/porsi");
    }
    public static void rataRataPenjualan(int[][] penjualan, String[] menu) {
        System.out.println("\nRata-rata Penjualan per Menu:");
        for(int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for(int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rataRata = (double) total / penjualan[i].length;
            System.out.printf("%s: %.2f cup/hari\n", menu[i], rataRata);
        }
    }
    
    // Versi dengan data statis sesuai PDF
    public static void main(String[] args) {
        String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar"};
        int[][] penjualan = {
            {30, 80, 40, 10, 15, 20, 25},
            {5, 9, 20, 25, 10, 5, 45},
            {50, 8, 17, 18, 10, 30, 6},
            {15, 10, 16, 15, 10, 10, 55} 
        };
        
        tampilDataPenjualan(penjualan, menu);
        menuPenjualanTertinggi(penjualan, menu);
        rataRataPenjualan(penjualan, menu);
    }
}