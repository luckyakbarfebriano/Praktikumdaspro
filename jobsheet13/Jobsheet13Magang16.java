package jobsheet13;
import java.util.Scanner;
public class Jobsheet13Magang16 {
    static String[][] dataMagang = new String[100][6];
    static int jumlahPendaftar = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void tampilkanMenu() {
        System.out.println("\n=== Sistem Pendaftaran Magang Mahasiswa ===");
        System.out.println("1. Tambah Data Magang");
        System.out.println("2. Tampilkan Semua Pendaftar Magang");
        System.out.println("3. Cari Pendaftar berdasarkan Program Studi");
        System.out.println("4. Hitung Jumlah Pendaftar untuk Setiap Status");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
    }

    public static boolean validasiSemester(int semester) {
        return semester == 6 || semester == 7;
    }

    public static boolean validasiStatus(String status) {
        return status.equalsIgnoreCase("Diterima") || 
               status.equalsIgnoreCase("Menunggu") || 
               status.equalsIgnoreCase("Ditolak");
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
        
        System.out.print("Program Studi: ");
        String prodi = scanner.nextLine();
        
        System.out.print("Perusahaan Tujuan Magang: ");
        String perusahaan = scanner.nextLine();
        
        int semester = 0;
        while (true) {
            System.out.print("Semester pengambilan magang (6 atau 7): ");
            try {
                semester = Integer.parseInt(scanner.nextLine());
                if (validasiSemester(semester)) {
                    break;
                } else {
                    System.out.println("Semester harus 6 atau 7!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka!");
            }
        }
        
        String status = "";
        while (true) {
            System.out.print("Status magang (Diterima/Menunggu/Ditolak): ");
            status = scanner.nextLine();
            if (validasiStatus(status)) {
                status = status.substring(0, 1).toUpperCase() + 
                        status.substring(1).toLowerCase();
                break;
            } else {
                System.out.println("Status harus Diterima, Menunggu, atau Ditolak!");
            }
        }
        
        dataMagang[jumlahPendaftar][0] = nama;
        dataMagang[jumlahPendaftar][1] = nim;
        dataMagang[jumlahPendaftar][2] = prodi;
        dataMagang[jumlahPendaftar][3] = perusahaan;
        dataMagang[jumlahPendaftar][4] = String.valueOf(semester);
        dataMagang[jumlahPendaftar][5] = status;
        
        jumlahPendaftar++;
        System.out.println("Data pendaftaran magang berhasil ditambahkan. Total pendaftar: " + jumlahPendaftar);
    }

    public static void tampilkanSemuaData() {
        if (jumlahPendaftar == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }
        
        System.out.println("No  Nama         NIM       Prodi                   Perusahaan    Semester  Status");
        
        for (int i = 0; i < jumlahPendaftar; i++) {
            System.out.printf("%-3d %-12s %-9s %-23s %-13s %-9s %-10s\n",
                    i + 1,
                    dataMagang[i][0],  
                    dataMagang[i][1],  
                    dataMagang[i][2],  
                    dataMagang[i][3],
                    dataMagang[i][4],
                    dataMagang[i][5]);
        }
    }

    public static void cariBerdasarkanProdi() {
        if (jumlahPendaftar == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }
        
        System.out.print("Masukkan Program Studi: ");
        String prodiDicari = scanner.nextLine();
        
        System.out.println("No  Nama         NIM       Prodi                   Perusahaan    Semester  Status");
        
        int nomor = 1;
        boolean ditemukan = false;
        
        for (int i = 0; i < jumlahPendaftar; i++) {
            if (dataMagang[i][2].equalsIgnoreCase(prodiDicari)) {
                ditemukan = true;
                
                System.out.printf("%-3d %-12s %-9s %-23s %-13s %-9s %-10s\n",
                        nomor,
                        dataMagang[i][0], 
                        dataMagang[i][1],
                        dataMagang[i][2],
                        dataMagang[i][3],
                        dataMagang[i][4],
                        dataMagang[i][5]);
                nomor++;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Tidak ditemukan pendaftar dengan program studi " + prodiDicari);
        }
    }

    public static void hitungJumlahPerStatus() {
        if (jumlahPendaftar == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }
        
        int diterima = 0, menunggu = 0, ditolak = 0;
        
        for (int i = 0; i < jumlahPendaftar; i++) {
            if (dataMagang[i][5].equalsIgnoreCase("Diterima")) {
                diterima++;
            } else if (dataMagang[i][5].equalsIgnoreCase("Menunggu")) {
                menunggu++;
            } else if (dataMagang[i][5].equalsIgnoreCase("Ditolak")) {
                ditolak++;
            }
        }
        
        System.out.println("Diterima: " + diterima);
        System.out.println("Menunggu: " + menunggu);
        System.out.println("Ditolak: " + ditolak);
        System.out.println("Total pendaftar: " + jumlahPendaftar);
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
                    cariBerdasarkanProdi();
                    break;
                case 4:
                    hitungJumlahPerStatus();
                    break;
                case 5:
                    System.out.println("\nTerima kasih telah menggunakan Sistem Pendaftaran Magang!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih 1-5.");
            }
            
        } while (pilihan != 5);
        
        scanner.close();
    }
}