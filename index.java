import java.util.Scanner;

public class index {
    static String dataPrestasi[][] = new String[100][5];
    static int jumlahPrestasi = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("=== PENCATATAN PRESTASI MAHASISWA ===");
            System.out.println("1. Tambah Data Prestasi");
            System.out.println("2. Tampilkan Semua Prestasi");
            System.out.println("3. Analisis Prestasi Berdasarkan Jenis");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt();
            if (pilihan == 1) {
                tambahPrestasi();
            }else if (pilihan == 2) {
                tampilkanPrestasi();
            }else if (pilihan == 3) {
                
            }else if (pilihan == 4) {
                System.out.println("Program Selesai. Terimakasih!");
                break;
            }else {
                System.out.println("Pilihan Tidak Valid!");
            }
        } while (pilihan!= 4);   
    }
    static void tambahPrestasi(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Jenis Prestasi: ");
        String jenis = sc.nextLine();
        System.out.print("Masukkan Tingkat Prestasi (Lokal/Nasional/Internasional): ");
        String tingkat = sc.nextLine();
        do {
            System.out.print("Masukkan Tahun Prestasi: ");
            int tahun = sc.nextInt();
            if (tahun < 2010 || tahun > 2024) {
                System.out.println("Tahun tidak valid coba lagi.");
            }else {
                for (int i = 0; i < dataPrestasi.length; i++) {
                    if (dataPrestasi[i][0] == null) {
                        dataPrestasi[i][0] = nama;
                        dataPrestasi[i][1] = nim;
                        dataPrestasi[i][2] = jenis;
                        dataPrestasi[i][3] = tingkat;
                        dataPrestasi[i][4] = Integer.toString(tahun);
                        jumlahPrestasi++;
                        System.out.println("Data Prestasi Berhasil ditambahkan.");
                        break;
                    }
                }
                System.out.println();
                break;            
            }
        } while (true);
    }
    static void tampilkanPrestasi() {
        if (jumlahPrestasi == 0) {

        System.out.println("Belum ada data prestasi.");
        } else {

        for (int i = 0; i < jumlahPrestasi; i++) {

            System.out.println("Nama: " + dataPrestasi[i][0] + 
                            " | NIM: " + dataPrestasi[i][1] + 
                            " | Jenis: " + dataPrestasi[i][2] +  
                            " | Tingkat: " + dataPrestasi[i][3] + 
                            " | Tahun: " + dataPrestasi[i][4]);
            }
        }
        System.out.println();
    }
}