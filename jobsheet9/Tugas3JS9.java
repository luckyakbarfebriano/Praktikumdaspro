package jobsheet9;
import java.util.Scanner;
public class Tugas3JS9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar",
                        "Kentang Goreng", "Teh Tarik", "Cappucino", 
                        "Chocolate Ice"};
        System.out.println("====SELAMAT DATANG====");
        System.out.println("Menu Makanan : Nasi Goreng, Mie Goreng, Roti Bakar, Kentang Goreng");
        System.out.println("Menu Minuman : Teh Tarik, Cappucino, Chocolate Ice");
        System.out.print("Masukkan nama makanan/minuman yang ingin dicari: ");
        String cariMenu = sc.nextLine();
        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (cariMenu.equalsIgnoreCase(menu[i])) {
                ditemukan = true;
                break;
            }
        }
        if (ditemukan) {
            System.out.println("Makanan '" + cariMenu + "' tersedia di menu.");
        } else {
            System.out.println("Makanan '" + cariMenu + "' tidak tersedia di menu.");
        }
        sc.close();
    }
}