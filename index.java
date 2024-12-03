import java.util.Scanner;

public class index {
    static String dataPrestasi[][] = new String[10][5];
    static int jumlahPrestasi = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        while (true) {
            System.out.println("=== PENCATATAN PRESTASI MAHASISWA ===");
            System.out.println("1. Tambah Data Prestasi");
            System.out.println("2. Tampilkan Semua Prestasi");
            System.out.println("3. Analisis Prestasi Berdasarkan Jenis");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            
            if (pilihan == 1) {
                tambahPrestasi();
            } else if (pilihan == 2) {
                tampilkanPrestasi();
            } else if (pilihan == 3) {
                analisisPrestasi();
            } else if (pilihan == 4) {
                System.out.println("Program Selesai. Terimakasih!");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        } 
    }
    
    static void tambahPrestasi(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Jenis Prestasi: ");
        String jenis = sc.nextLine();

        String tingkat;
        while (true) {
            System.out.print("Masukkan Tingkat Prestasi (Lokal/Nasional/Internasional): ");
            tingkat = sc.nextLine();
            if (tingkat.equalsIgnoreCase("Lokal") || tingkat.equalsIgnoreCase("nasional") || tingkat.equalsIgnoreCase("internasional")) {
                break;
            } else {
                System.out.println("Tingkat prestasi tidak valid coba lagi.");
            }   
        }

        while (true) {
            System.out.print("Masukkan Tahun Prestasi: ");
            int tahun = sc.nextInt();
            if (tahun < 2010 || tahun > 2024) {
                System.out.println("Tahun tidak valid coba lagi.");
                continue;
            }
            
            for (int i = 0; i < jumlahPrestasi; i++) {
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
            break;            
        }
        System.out.println();
    }
    
    static void tampilkanPrestasi() {
        if (jumlahPrestasi == 0) {
            System.out.println("Belum ada data prestasi.");
        } else {
            for (int i = 0; i < jumlahPrestasi; i++) {
                System.out.println("Nama: " + dataPrestasi[i][0] + " | NIM: " + dataPrestasi[i][1] + " | Jenis: " + dataPrestasi[i][2] +  " | Tingkat: " + dataPrestasi[i][3] + " | Tahun: " + dataPrestasi[i][4]);
            }
        }
        System.out.println();
    }
    
    static void analisisPrestasi() {
        if (jumlahPrestasi == 0) {
            System.out.println("Belum ada data prestasi.");
            return;
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jenis Prestasi yang ingin dianalisis: ");
        String jenisPrestasi = sc.nextLine();
        
        boolean prestasi = false;
        System.out.print("Masukkan Tahun Prestasi (0 untuk semua tahun): ");
        int tahun = sc.nextInt();
        
        System.out.println();
        System.out.println("=== ANALISIS PRESTASI ===");

        if (!prestasi) {
            System.out.println("Tidak ada prestasi ditemukan untuk jenis " + jenisPrestasi + (tahun != 0 ? " di tahun " + tahun : ""));
        }
        for (int i = 0; i < jumlahPrestasi; i++) {
            if (dataPrestasi[i][2].equalsIgnoreCase(jenisPrestasi)) {
                if (tahun == 0 || Integer.parseInt(dataPrestasi[i][4]) == tahun) {
                    System.out.println("Nama: " + dataPrestasi[i][0] + " | NIM: " + dataPrestasi[i][1] + " | Tingkat: " + dataPrestasi[i][3] + " | Tahun: " + dataPrestasi[i][4]);
                    prestasi = true;
                }
            }
        }

        System.out.println();
    }
}