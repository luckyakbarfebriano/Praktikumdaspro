import java.util.Scanner;
public class NilaiKelompok16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        double maxRata = 0;
        int kelompokTerbaik = 0;
        while (i <= 6) {
            System.out.println("Kelompok " + i);
            int totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nilai dari Kelompok Penilai " + j + ": ");
                int nilai = sc.nextInt();
                totalNilai += nilai;
            }    
            double rataNilai = totalNilai / 5.0;
            System.out.println("Kelompok " + i + ": nilai rata-rata = " + rataNilai);
            System.out.println();
            
            if (rataNilai > maxRata) {
                maxRata = rataNilai;
                kelompokTerbaik = i;
            }
            i++;
        }
        System.out.println("Kelompok dengan nilai rata-rata tertinggi: Kelompok " + 
                          kelompokTerbaik + " dengan nilai " + maxRata);
        sc.close();
    }
}