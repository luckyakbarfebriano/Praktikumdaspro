package jobsheet13;
import java.util.Scanner;
public class Jobsheet13Beasiswa16 {
    static String[][] dataPendaftar = new String[100][5];
    static int jumlahPendaftar = 0;
    static Scanner scanner = new Scanner(System.in);
    public static void tampilkanMenu() {
        System.out.println("\n=== Sistem Pendaftaran Beasiswa ===");
        System.out.println("1. Tambah Data Pendaftar Beasiswa");
        System.out.println("2. Tampilkan Semua Pendaftar");
        System.out.println("3. Cari Pendaftar berdasarkan Jenis Beasiswa");
        System.out.println("4. Hitung Rata-rata IPK per Jenis Beasiswa");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
    }

    public static boolean validasiJenisBeasiswa(String jenis) {
        return jenis.equalsIgnoreCase("Reguler") || 
               jenis.equalsIgnoreCase("Unggulan") || 
               jenis.equalsIgnoreCase("Riset");
    }

    public static boolean validasiPenghasilan(int penghasilan) {
        return penghasilan <= 2000000;
    }

    public static void tambahData() {
        if (jumlahPendaftar >= 100) {
            System.out.println("Kapasitas pendaftar sudah penuh!");
            return;
        }
        
        System.out.print("Nama Mahasiswa: ");
        String nama = scanner.nextLine();
        
        System.out.print("NIM: ");
        String nim = scanner.nextLine();
        
        System.out.print("IPK terakhir: ");
        String ipk = scanner.nextLine();
        
        String jenisBeasiswa = "";
        while (true) {
            System.out.print("Jenis Beasiswa (Reguler/Unggulan/Riset): ");
            jenisBeasiswa = scanner.nextLine();
            if (validasiJenisBeasiswa(jenisBeasiswa)) {
                jenisBeasiswa = jenisBeasiswa.substring(0, 1).toUpperCase() + 
                               jenisBeasiswa.substring(1).toLowerCase();
                break;
            } else {
                System.out.println("Jenis beasiswa harus Reguler, Unggulan, atau Riset!");
            }
        }
        
        System.out.print("Penghasilan orang tua (maksimal 2000000): ");
        String penghasilanStr = scanner.nextLine();
        int penghasilan = Integer.parseInt(penghasilanStr);
        
        if (!validasiPenghasilan(penghasilan)) {
            System.out.println("Pendaftaran dibatalkan karena penghasilan melebihi batas maksimal.");
            return;
        }
        
        dataPendaftar[jumlahPendaftar][0] = nama;
        dataPendaftar[jumlahPendaftar][1] = nim;
        dataPendaftar[jumlahPendaftar][2] = ipk;
        dataPendaftar[jumlahPendaftar][3] = jenisBeasiswa;
        dataPendaftar[jumlahPendaftar][4] = penghasilanStr;
        
        jumlahPendaftar++;
        System.out.println("Pendaftar berhasil disimpan. Total pendaftar: " + jumlahPendaftar);
    }

    public static void tampilkanSemuaData() {
        if (jumlahPendaftar == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }
        
        System.out.println("\n=== Daftar Semua Pendaftar ===");
        System.out.println("=".repeat(70));
        System.out.printf("| %-20s | %-10s | %-8s | %-15s | %-10s |\n",
                "Nama", "NIM", "IPK", "Jenis Beasiswa", "Penghasilan");
        System.out.println("=".repeat(70));

        for (int i = 0; i < jumlahPendaftar; i++) {
            System.out.printf("| %-20s | %-10s | %-8s | %-15s | Rp %-7s |\n",
                    dataPendaftar[i][0], 
                    dataPendaftar[i][1], 
                    dataPendaftar[i][2], 
                    dataPendaftar[i][3], 
                    dataPendaftar[i][4]); 
        }
        
        System.out.println("=".repeat(70));
    }

    public static void cariBerdasarkanJenis() {
        if (jumlahPendaftar == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }
        
        System.out.print("Masukkan jenis beasiswa (Regular/Unggulan/Riset): ");
        String jenisDicari = scanner.nextLine();
        
        if (!validasiJenisBeasiswa(jenisDicari)) {
            System.out.println("Jenis beasiswa tidak valid!");
            return;
        }
        
        jenisDicari = jenisDicari.substring(0, 1).toUpperCase() + 
                     jenisDicari.substring(1).toLowerCase();
        
        boolean ditemukan = false;
        System.out.println("\n=== Hasil Pencarian: " + jenisDicari + " ===");
        System.out.println("=".repeat(70));
        System.out.printf("| %-20s | %-10s | %-8s | %-15s | %-10s |\n",
                "Nama", "NIM", "IPK", "Jenis Beasiswa", "Penghasilan");
        System.out.println("=".repeat(70));

        for (int i = 0; i < jumlahPendaftar; i++) {
            if (dataPendaftar[i][3].equalsIgnoreCase(jenisDicari)) {
                System.out.printf("| %-20s | %-10s | %-8s | %-15s | Rp %-7s |\n",
                        dataPendaftar[i][0], dataPendaftar[i][1], dataPendaftar[i][2],
                        dataPendaftar[i][3], dataPendaftar[i][4]);
                ditemukan = true;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Tidak ditemukan pendaftar dengan jenis beasiswa " + jenisDicari);
        } else {
            System.out.println("=".repeat(70));
        }
    }

    public static void hitungRataRataIPK() {
        if (jumlahPendaftar == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }
        
        String[] jenisList = {"Regular", "Unggulan", "Riset"};
        int[] jumlah = new int[3];
        double[] totalIPK = new double[3];

        for (int i = 0; i < jumlahPendaftar; i++) {
            for (int j = 0; j < jenisList.length; j++) {
                if (dataPendaftar[i][3].equals(jenisList[j])) {
                    jumlah[j]++;
                    totalIPK[j] += Double.parseDouble(dataPendaftar[i][2]);
                    break;
                }
            }
        }
        
        for (int i = 0; i < jenisList.length; i++) {
            if (jumlah[i] > 0) {
                double rataRata = totalIPK[i] / jumlah[i];
                System.out.printf("%s : rata-rata IPK = %.2f\n", jenisList[i], rataRata);
            } else {
                System.out.printf("%s : tidak ada pendaftar.\n", jenisList[i]);
            }
        }
    }

    public static void main(String[] args) {
        int pilihan;
        
        do {
            tampilkanMenu();
            
            try {
                pilihan = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka!");
                pilihan = 0;
                continue;
            }
            
            switch (pilihan) {
                case 1:
                    tambahData();
                    break;
                case 2:
                    tampilkanSemuaData();
                    break;
                case 3:
                    cariBerdasarkanJenis();
                    break;
                case 4:
                    hitungRataRataIPK();
                    break;
                case 5:
                    System.out.println("\nTerima kasih telah menggunakan Sistem Pendaftaran Beasiswa!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih 1-5.");
            }
            
        } while (pilihan != 5);
        
        scanner.close();
    }
}