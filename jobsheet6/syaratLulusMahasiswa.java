package jobsheet6;
import java.util.Scanner;
public class syaratLulusMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Sistem Penentuan Kelulusan Mahasiswa ===");
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = sc.nextLine();
        System.out.println("--- Algoritma dan Pemrograman ---");
        System.out.print("Masukkan Nilai UTS  (0-100): ");
        double uts1 = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS  (0-100): ");
        double uas1 = sc.nextDouble();
        System.out.print("Masukkan Nilai Tugas(0-100): ");
        double tugas1 = sc.nextDouble();
        double akhir1 = (uts1 * 0.30) + (uas1 * 0.40) + (tugas1 * 0.30);
        String huruf1, status1;
        if (akhir1 >= 85) {
            huruf1 = "A";
            status1 = "LULUS";
        } else if (akhir1 >= 80) {
            huruf1 = "B+";
            status1 = "LULUS";
        } else if (akhir1 >= 70) {
            huruf1 = "B";
            status1 = "LULUS";
        } else if (akhir1 >= 65) {
            huruf1 = "C+";
            status1 = "LULUS";
        } else if (akhir1 >= 60) {
            huruf1 = "C";
            status1 = "LULUS";
        } else if (akhir1 >= 50) {
            huruf1 = "D";
            status1 = "TIDAK LULUS";
        } else {
            huruf1 = "E";
            status1 = "TIDAK LULUS";
        }
        System.out.println("--- Struktur Data ---");
        System.out.print("Masukkan Nilai UTS  (0-100): ");
        double uts2 = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS  (0-100): ");
        double uas2 = sc.nextDouble();
        System.out.print("Masukkan Nilai Tugas(0-100): ");
        double tugas2 = sc.nextDouble();
        double akhir2 = (uts2 * 0.30) + (uas2 * 0.40) + (tugas2 * 0.30);
        String huruf2, status2;
        if (akhir2 >= 85) {
            huruf2 = "A";
            status2 = "LULUS";
        } else if (akhir2 >= 80) {
            huruf2 = "B+";
            status2 = "LULUS";
        } else if (akhir2 >= 70) {
            huruf2 = "B";
            status2 = "LULUS";
        } else if (akhir2 >= 65) {
            huruf2 = "C+";
            status2 = "LULUS";
        } else if (akhir2 >= 60) {
            huruf2 = "C";
            status2 = "LULUS";
        } else if (akhir2 >= 50) {
            huruf2 = "D";
            status2 = "TIDAK LULUS";
        } else {
            huruf2 = "E";
            status2 = "TIDAK LULUS";
        }

        double rataRata = (akhir1 + akhir2) / 2.0;
        String statusSemester;
        if (status1.equals("LULUS") && status2.equals("LULUS")) {
            if (rataRata >= 70) {
                statusSemester = "LULUS";
            } else {
                statusSemester = "TIDAK LULUS";
            }
        } else {
            statusSemester = "TIDAK LULUS";
        }

        System.out.println("=== HASIL PENILAIAN ===");
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.printf("Algoritma & Pemrograman: %.2f (%s) - %s%n", akhir1, huruf1, status1);
        System.out.printf("Struktur Data           : %.2f (%s) - %s%n", akhir2, huruf2, status2);
        System.out.printf("Rata-rata Semester      : %.2f%n", rataRata);
        System.out.println("Status Kelulusan Semester: " + statusSemester);

        sc.close();
    }
}
