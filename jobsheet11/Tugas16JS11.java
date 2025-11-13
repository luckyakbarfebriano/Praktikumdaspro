package jobsheet11;
import java.util.Scanner;
public class Tugas16JS11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] hasilSurvey = new int[10][6];
        double totalKeseluruhan = 0;
        System.out.println("=== PROGRAM SURVEI KEPUASAN PELANGGAN ===");
        System.out.println("\n--- Input Hasil Survey ---");
        for (int i = 0; i < hasilSurvey.length; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < hasilSurvey[i].length; j++) {
                while (true) {
                    System.out.print("  Pertanyaan " + (j + 1) + " (1-5): ");
                    int nilai = sc.nextInt();
                    if (nilai >= 1 && nilai <= 5) {
                        hasilSurvey[i][j] = nilai;
                        totalKeseluruhan += nilai;
                        break;
                    } else {
                        System.out.println("    Nilai harus antara 1-5!");
                    }
                }
            }
            System.out.println();

        }
        System.out.println("--- Rata-rata per Responden ---");
        for (int i = 0; i < hasilSurvey.length; i++) {
            double totalResponden = 0;
            for (int j = 0; j < hasilSurvey[i].length; j++) {
                totalResponden += hasilSurvey[i][j];
            }
            double rataResponden = totalResponden / hasilSurvey[i].length;
            System.out.printf("Responden %d: %.2f\n", (i + 1), rataResponden);
        }

        System.out.println("\n--- Rata-rata per Pertanyaan ---");
        for (int j = 0; j < hasilSurvey[0].length; j++) {
            double totalPertanyaan = 0;
            for (int i = 0; i < hasilSurvey.length; i++) {
                totalPertanyaan += hasilSurvey[i][j];
            }
            double rataPertanyaan = totalPertanyaan / hasilSurvey.length;
            System.out.printf("Pertanyaan %d: %.2f\n", (j + 1), rataPertanyaan);
        }
        
        System.out.println("\n--- Rata-rata Keseluruhan ---");
        double rataKeseluruhan = totalKeseluruhan / (hasilSurvey.length * hasilSurvey[0].length);
        System.out.printf("Rata-rata keseluruhan: %.2f\n", rataKeseluruhan);
        
        System.out.println("\n--- Data Lengkap Hasil Survey ---");
        System.out.print("Responden\t");
        for (int j = 0; j < hasilSurvey[0].length; j++) {
            System.out.print("P" + (j + 1) + "\t");
        }
        System.out.println("Rata2");
        
        for (int i = 0; i < hasilSurvey.length; i++) {
            System.out.print("R" + (i + 1) + "\t\t");
            double totalPerResponden = 0;
            for (int j = 0; j < hasilSurvey[i].length; j++) {
                System.out.print(hasilSurvey[i][j] + "\t");
                totalPerResponden += hasilSurvey[i][j];
            }
            double rataPerResponden = totalPerResponden / hasilSurvey[i].length;
            System.out.printf("%.2f\n", rataPerResponden);
        }
        
        sc.close();
    }
}