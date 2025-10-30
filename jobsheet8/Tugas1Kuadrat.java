import java.util.Scanner;
public class Tugas1Kuadrat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int jumlah = 0;
        for (int i = 1; i <= n; i++) {
            jumlah += (i * i);
            System.out.print("n = " + i + " , jumlah kuadrat = ");
            for (int j = 1; j <= i; j++) {
                System.out.print(j * j);
                if (j < i) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + jumlah);
        }
        sc.close();
    }
}