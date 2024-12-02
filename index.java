import java.util.Scanner;

public class index {
    static Scanner sc = new Scanner(System.in);
    static String dataPrestasi[][] = new String[100][5];
    static int jumlahPrestasi = 0;
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
        System.out.println("Masukkan Jenis Prestasi: ");
        String jenis = sc.nextLine();
        System.out.println("Masukkan Tingkat Prestasi (Lokal/Nasional/Internasional): ");
        String tingkat = sc.nextLine();
        System.out.println("Masukkan Tahun Prestasi: ");
        int tahun = sc.nextInt();
        if (tahun < 2010 || tahun > 2024) {
            System.out.println("Tahun tidak valid coba lagi.");
            return;
        }
        for (int i = 1; i < dataPrestasi.length; i++) {
            if (dataPrestasi[i][0] == null) {
                dataPrestasi[i][0] = nama;
                dataPrestasi[i][1] = nim;
                dataPrestasi[i][2] = jenis;
                dataPrestasi[i][3] = tingkat;
                dataPrestasi[i][4] = Integer.toString(tahun);
                System.out.println("Data Prestasi Berhasil ditambahkan.");
                break;
            }
        }
    }
        // Fungsi untuk menampilkan semua prestasi yang telah dimasukkan
    static void tampilkanPrestasi(){
        if (jumlahPrestasi == 0) {
        // Jika tidak ada data prestasi
        System.out.println("Belum ada data prestasi.");
        } else {
        // Jika ada data prestasi, lakukan iterasi
        for (int i = 0; i < jumlahPrestasi; i++) {
            // Menampilkan setiap data prestasi
            System.out.printf("Nama: %s | NIM: %s | Jenis: %s | Tingkat: %s | Tahun: %s%n",
                              dataPrestasi[i][0],  // Nama
                              dataPrestasi[i][1],  // NIM
                              dataPrestasi[i][2],  // Jenis Prestasi
                              dataPrestasi[i][3],  // Tingkat Prestasi
                              dataPrestasi[i][4]); // Tahun
        }
    }
}

    
}