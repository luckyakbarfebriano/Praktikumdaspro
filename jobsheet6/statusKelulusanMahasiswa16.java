import java.util.Scanner;
public class statusKelulusanMahasiswa16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("NIM  : ");
        String nim = sc.nextLine();

        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS   : ");
        double uts1 = sc.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uas1 = sc.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas1 = sc.nextDouble();

        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS   : ");
        double uts2 = sc.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uas2 = sc.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas2 = sc.nextDouble();

        double akhir1 = (uts1 * 0.30) + (uas1 * 0.40) + (tugas1 * 0.30);
        double akhir2 = (uts2 * 0.30) + (uas2 * 0.40) + (tugas2 * 0.30);

        String huruf1, status1;
        if (akhir1 >= 85) { huruf1 = "A"; status1 = "LULUS"; }
        else if (akhir1 >= 80) { huruf1 = "B+"; status1 = "LULUS"; }
        else if (akhir1 >= 70) { huruf1 = "B"; status1 = "LULUS"; }
        else if (akhir1 >= 65) { huruf1 = "C+"; status1 = "LULUS"; }
        else if (akhir1 >= 60) { huruf1 = "C"; status1 = "LULUS"; }
        else if (akhir1 >= 50) { huruf1 = "D"; status1 = "TIDAK LULUS"; }
        else { huruf1 = "E"; status1 = "TIDAK LULUS"; }

        String huruf2, status2;
        if (akhir2 >= 85) { huruf2 = "A"; status2 = "LULUS"; }
        else if (akhir2 >= 80) { huruf2 = "B+"; status2 = "LULUS"; }
        else if (akhir2 >= 70) { huruf2 = "B"; status2 = "LULUS"; }
        else if (akhir2 >= 65) { huruf2 = "C+"; status2 = "LULUS"; }
        else if (akhir2 >= 60) { huruf2 = "C"; status2 = "LULUS"; }
        else if (akhir2 >= 50) { huruf2 = "D"; status2 = "TIDAK LULUS"; }
        else { huruf2 = "E"; status2 = "TIDAK LULUS"; }

        double rataRata = (akhir1 + akhir2) / 2.0;
        String statusSemester;
        if (status1.equals("LULUS") && status2.equals("LULUS")) {
            if (rataRata >= 70) statusSemester = "LULUS";
            else statusSemester = "TIDAK LULUS (Rata-rata < 70)";
        } else {
            statusSemester = "TIDAK LULUS";
        }

        System.out.println();
        System.out.println("==================== HASIL PENILAIAN AKADEMIK ====================");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println();
        System.out.println("Mata Kuliah\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("------------------------------------------------------------------");
        System.out.printf("Algoritma Pemrograman\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s%n", uts1, uas1, tugas1, akhir1, huruf1, status1);
        System.out.printf("Struktur Data\t\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s%n", uts2, uas2, tugas2, akhir2, huruf2, status2);
        System.out.println();
        System.out.printf("Rata-rata Nilai Akhir: %.2f%n", rataRata);
        System.out.println("Status Semester     : " + statusSemester);

        sc.close();
    }
}

