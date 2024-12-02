import java.util.Scanner;

public class index {
    static Scanner sc = new Scanner(System.in);
    static String dataPrestasi[][] = new String[100][5];
    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("=== PENCATATAN PRESTASI MAHASISWA ===");
            System.out.println("1. Tambah Data Prestasi");
            System.out.println("2. Tampilkan Semua Prestasi");
            System.out.println("3. Analisis Prestasi Berdasarkan Jenis");
            System.out.println("4. Keluar");
            pilihan = sc.nextInt();
            if (pilihan == 1) {
                tambahPrestasi();
            }else if (pilihan == 2) {
                System.out.println("=== DAFTAR SEMUA PRESTASI ===");
            }else if (pilihan == 3) {
                System.out.println("=== ANALISIS PRESTASI ===");
            }else if (pilihan == 4) {
                System.out.println("Program Selesai. Terimakasih!");
                break;
            }else {
                System.out.println("Pilihan Tidak Valid!");
            }
        } while (pilihan!= 4);   
    }
    static void tambahPrestasi(){
        System.out.println("Masukkan Nama Mahasiswa: ");
        String nama = sc.nextLine();
        System.out.println("Masukkan NIM Mahasiswa: ");
        String nim = sc.nextLine();
        System.out.println("Masukkan Jenis Prestasi (Lokal/Nasional/Internasional): ");
        String jenis = sc.nextLine();
        System.out.println("Masukkan Tahun Prestasi: ");
        int tahun = sc.nextInt();
        if (tahun < 2010 || tahun > 2024) {
            System.out.println("Tahun tidak valid coba lagi.");
            return;
        }

        System.out.println("Data Prestasi Berhasil ditambahkan.");
    }
}