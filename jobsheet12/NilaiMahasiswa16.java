package jobsheet12;
import java.util.Scanner;
public class NilaiMahasiswa16 {
    public static void isianArray(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nilai " + array.length + " mahasiswa:");
        for(int i = 0; i < array.length; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i+1) + ": ");
            array[i] = sc.nextInt();
        }
    }
    public static void tampilArray(int[] array) {
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for(int i = 0; i < array.length; i++) {
            System.out.println("Mahasiswa " + (i+1) + ": " + array[i]);
        }
    }
    public static int hitTot(int[] array) {
        int total = 0;
        for(int nilai : array) {
            total += nilai;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = sc.nextInt();
        int[] nilaiMahasiswa = new int[N]; 
        isianArray(nilaiMahasiswa);
        tampilArray(nilaiMahasiswa);
        
        int totalNilai = hitTot(nilaiMahasiswa);
        System.out.println("\nTotal nilai seluruh mahasiswa: " + totalNilai);
        
        sc.close();
    }
}