package jobsheet5;
import java.util.Scanner;

public class sistemPerpustakaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean bawaKartu, registrasiOnline;
        System.out.print("Apakah membawa kartu mahasiswa? (true/false): ");
        bawaKartu = input.nextBoolean();
        System.out.print("Apakah sudah registrasi online? (true/false): ");
        registrasiOnline = input.nextBoolean();
        if (bawaKartu || registrasiOnline) {
            System.out.println("Boleh masuk.");
        } else {
            System.out.println("Ditolak masuk.");
        }

        input.close();
    }
} 
    

