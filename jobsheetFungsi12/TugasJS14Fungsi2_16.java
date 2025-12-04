package jobsheetFungsi12;
import java.util.Scanner;
public class TugasJS14Fungsi2_16 {
    static int totalRekursif(int[] arr, int n) {
        if (n == 0) {
            return 0;
        } else {
            return arr[n-1] + totalRekursif(arr, n-1);
        }
    }
    static void inputAngkaRekursif(Scanner sc, int[] arr, int n) {
        if (n > 0) {
            System.out.print("Masukkan angka ke-" + n + ": ");
            arr[n-1] = sc.nextInt();
            inputAngkaRekursif(sc, arr, n-1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N) : ");
        int n = sc.nextInt();
        
        int[] angka = new int[n];
        
        inputAngkaRekursif(sc, angka, n);
        
        int total = totalRekursif(angka, n);
        
        System.out.println("Total dari " + n + " angka yang dimasukkan adalah: " + total);
        
        sc.close();
    }
}