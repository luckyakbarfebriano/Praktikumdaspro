package jobsheet11;
import java.util.Scanner;
public class BioskopWithScanner16 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];
        
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            sc.nextLine();
            
            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();
                        
                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Nomor baris atau kolom tidak tersedia! Baris harus 1-4, Kolom harus 1-2");
                            continue;
                        }
                        
                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Warning: Kursi sudah terisi oleh, pilih yang lain");
                            System.out.print("Apakah ingin memasukkan baris dan kolom kembali? (y/n): ");
                            String pilihan = sc.nextLine();
                            if (pilihan.equalsIgnoreCase("y")) {
                                continue;
                            } else {
                                break; 
                            }
                        }
                        
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil disimpan.");
                        break;
                    }
                    
                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                    break;
                    
                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.printf("Baris %d, Kolom %d: %s\t", (i+1), (j+1), "***");
                            } else {
                                System.out.printf("Baris %d, Kolom %d: %s\t", (i+1), (j+1), penonton[i][j]);
                            }
                        }
                        System.out.println();
                    }
                    break;
                    
                case 3:
                    System.out.println("Terima kasih!");
                    return;
                    
                default:
                    System.out.println("Menu tidak valid!");
            }
        }
    }
}