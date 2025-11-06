package jobsheet9;
import java.util.Scanner;
public class ArrayRataNilai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMhs = sc.nextInt();
        int[] nilaiMhs = new int[jmlMhs];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int hitungLulus = 0;
        int hitungTidakLulus = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                hitungLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                hitungTidakLulus++;
            }
        }
        if (hitungLulus > 0) {
            double rataLulus = totalLulus / hitungLulus;
            System.out.println("Rata-rata nilai lulus = " + rataLulus);
        } else {
            System.out.println("Tidak ada mahasiswa yang lulus");
        }
        if (hitungTidakLulus > 0) {
            double rataTidakLulus = totalTidakLulus / hitungTidakLulus;
            System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
        } else {
            System.out.println("Semua mahasiswa lulus");
        }
        sc.close();
    }
}
