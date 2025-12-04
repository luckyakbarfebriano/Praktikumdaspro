package jobsheetFungsi12;
import java.util.Scanner;
public class percobaan2fungsi2_16 { 
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            System.out.print("1 = ");
            return 1;
        } else {
            System.out.print(x + "x");
            return x * hitungPangkat(x, y - 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bilangan yang dihitung: ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = sc.nextInt();
        System.out.print(hitungPangkat(bilangan, pangkat));
        sc.close();
    }
}