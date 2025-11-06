package jobsheet9;
import java.util.Scanner;
public class Tugas1JS9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int jmlMahasiswa = sc.nextInt();
        int[] nilaiMahasiswa = new int[jmlMahasiswa];
        double total = 0;
        for (int i = 0; i < jmlMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = sc.nextInt();
            total += nilaiMahasiswa[i];
        }
        
        double rataRata = total / jmlMahasiswa;
        int nilaiTertinggi = nilaiMahasiswa[0];
        int nilaiTerendah = nilaiMahasiswa[0];
        for (int i = 1; i < jmlMahasiswa; i++) {
            if (nilaiMahasiswa[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMahasiswa[i];
            }
        }
        System.out.println("\n=== HASIL NILAI ===");
        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("\nDaftar semua nilai:");
        for (int i = 0; i < jmlMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiMahasiswa[i]);
        }
        sc.close();
    }
}