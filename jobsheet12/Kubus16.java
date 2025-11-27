package jobsheet12;
import java.util.Scanner;
public class Kubus16 {
    public static double volumeKubus(double sisi) {
        return sisi * sisi * sisi;
    }
    public static double luasPermukaanKubus(double sisi) {
        return 6 * sisi * sisi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = sc.nextDouble();
        
        System.out.println("\nHasil Perhitungan:");
        System.out.println("Volume kubus dengan sisi " + sisi + " adalah: " + volumeKubus(sisi));
        System.out.println("Luas permukaan kubus dengan sisi " + sisi + " adalah: " + luasPermukaanKubus(sisi));
        
        sc.close();
    }
}