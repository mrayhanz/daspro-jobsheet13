import java.util.Scanner;

public class matriks {
    static int[][] matriks1;
    static int[][] matriks2;
    static int[][] hasil;
    static int baris, kolom;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=== OPERASI MATRIKS ===");
            System.out.println("1. Penjumlahan Matriks");
            System.out.println("2. Pengurangan Matriks");
            System.out.println("3. Perkalian Matriks");
            System.out.println("4. Inverse Matriks");
            System.out.println("5. Transpose Matriks");
            System.out.println("6. Keluar");
            System.out.print("Pilih Operasi: ");
            int pilih = sc.nextInt();
            if (pilih == 1) {
                penjumlahan();
            } else if (pilih == 2) {
                penguranganMatriks();
            } else if (pilih == 3) {
                perkalianMatriks();
            } else if (pilih == 4) {
                inverseMatriks();
            } else if (pilih == 5) {
                transpose();   
            } else if (pilih == 6) {
                break;
            } else {
                System.out.println("Pilihan Menu Tidak Valid");
            }
            System.out.println();
        }
    }

    static void perkalianMatriks(){
        Scanner sc = new Scanner(System.in);
        int baris1 , baris2 , kolom1 , kolom2 , i, j, k;
        System.out.print("Masukkan baris matriks 1: ");
        baris1 = sc.nextInt();
        System.out.print("Masukkan kolom matriks 1: ");
        kolom1 = sc.nextInt();
        System.out.print("Masukkan baris matriks 2: ");
        baris2 = sc.nextInt();
        System.out.print("Masukkan kolom matriks 2: ");
        kolom2 = sc.nextInt();
        matriks1 = new int[baris1][kolom1];
        matriks2 = new int[baris2][kolom2];
        int hasil [][] = new int[baris1][kolom2];

        for (i = 0; i < matriks1.length; i++){
            for (j = 0; j < matriks1[i].length; j++){
                System.out.print("Masukkan Elemen Matriks pertama" + "[" + i + "]" + "[" + j + "]" + " : " );
                matriks1[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < matriks1.length; i++){
            for (j = 0; j < matriks1[i].length; j++){
                System.out.print("Masukkan Elemen Matriks kedua" + "[" + i + "]" + "[" + j + "]" + " : " );
                matriks2[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < matriks1.length; i++) {
            for (j = 0; j < matriks2[i].length; j++) {
                for (k = 0; k < matriks2.length; k++){
                    hasil[i][j] += matriks1[i][k] * matriks2[k][j];
                }
            }
        }
        System.out.println();
        cetakMatriks(hasil,"x");
    }

    static void transpose(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan baris matriks: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan kolom matriks: ");
        int kolom = sc.nextInt();
        matriks1 = new int[baris][kolom];

        for (int i = 0; i < matriks1.length; i++){
            for (int j = 0; j < matriks1[i].length; j++){
                System.out.print("Masukkan Elemen Matriks" + "[" + i + "]" + "[" + j + "]" + " : " );
                matriks1[i][j] = sc.nextInt();
            }
        }

        int [][]transpose = new int[kolom][baris];
        for (int i = 0; i < matriks1.length; i++) {
            for (int j = 0; j < matriks1[i].length; j++) {
                transpose[j][i] = matriks1[i][j];
            }
        }

        for (int i = 0; i < matriks1.length; i++){
            for (int j = 0; j < matriks1[i].length; j++){
                System.out.print(transpose[j][i] + " ");
            }
            System.out.println();
        }
    }

    static void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris matriks: ");
        baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        kolom = sc.nextInt();
        matriks1 = new int[baris][kolom];
        matriks2 = new int[baris][kolom];
        hasil = new int[baris][kolom];
        for (int i = 0; i < baris; i++){
            for (int j = 0; j < kolom; j++){
                System.out.print("Masukkan Elemen Matriks" + "[" + i + "]" + "[" + j + "]" + " : " );
                matriks1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < baris; i++){
            for (int j = 0; j < kolom; j++){
                System.out.print("Masukkan Elemen Matriks" + "[" + i + "]" + "[" + j + "]" + " : " );
                matriks2[i][j] = sc.nextInt();
            }
        }
    }

    static void cetakMatriks(int[][] matriks , String operator){
        for (int i = 0; i < baris; i++) {
            System.out.print("| ");
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriks1[i][j] + " ");
            }
            System.out.print("| ");

            // Menampilkan tanda operator di tengah
            if (i == baris / 2) {
                System.out.print(" " + operator + " ");
            } else {
                System.out.print("   ");
            }

            // Menampilkan Matriks 2
            System.out.print("| ");
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriks2[i][j] + " ");
            }
            System.out.print("|");

            // Menampilkan tanda "=" di tengah
            if (i == baris / 2) {
                System.out.print(" = ");
            } else {
                System.out.print("   ");
            }

            // Menampilkan Hasil Matriks
            System.out.print("| ");
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println("|"); 
        }
        System.out.println();
    }
    
    static void penjumlahan(){
        input();
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }

        System.out.println("Hasil penjumlahan matriks:");
        cetakMatriks(hasil, "+");
    }


    static void penguranganMatriks(){
        input();
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriks1[i][j] -  matriks2[i][j];
            }
        }

        System.out.println("Hasil pengurangan matriks : ");        
        cetakMatriks(hasil,"-");
    }

    static void inverseMatriks(){
        Scanner sc = new Scanner(System.in);
        int pilih;
        while (true) {
            System.out.println("=== Pilih Ordo Matriks Inverse ===");
            System.out.println("1. 2x2");
            System.out.println("2. 3x3");
            System.out.println("3. Kembali Ke Menu Utama");
            System.out.print("Pilih Submenu: ");
            pilih = sc.nextInt();
            if (pilih == 1) {
                inverse2x2();
            }else if (pilih == 2) {
                inverse3x3();
            }else if (pilih == 3) {
                break;
            }else{
                System.out.println("Pilihan tidak valid");
            }
        }
    }
    static void inverse2x2(){
        Scanner sc = new Scanner(System.in);
        double[][] matriks = new double[2][2];
        double[][] invers = new double[2][2];
        double determinan;

        System.out.println("Masukkan elemen matriks 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matriks[i][j] = sc.nextDouble();
            }
        }

        determinan = (matriks[0][0] * matriks[1][1]) - (matriks[0][1] * matriks[1][0]);

        if (determinan == 0) {
            System.out.println("Matriks tidak memiliki invers karena determinan = 0.");
        } else {
            invers[0][0] = matriks[1][1] / determinan;
            invers[0][1] = -matriks[0][1] / determinan;
            invers[1][0] = -matriks[1][0] / determinan;
            invers[1][1] = matriks[0][0] / determinan;

            System.out.println("Invers matriks:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(pembulatan(invers[i][j]) + " ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    static void inverse3x3(){
        Scanner scanner = new Scanner(System.in);
        double[][] matrix = new double[3][3];

        System.out.println("Masukkan elemen matriks :");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }
        
        double det = determinan(matrix);
        if (det == 0) {
            System.out.println("Matriks tidak memiliki invers (determinan = 0)");
            return;
        }
        double[][] inverse = hitungInvers(matrix);
        
        System.out.println("\nMatriks Invers:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(pembulatan(inverse[i][j]) + " ");
            }
            System.out.println();
        }
    }
    public static double pembulatan(double angka) {
        int bulat = (int)(angka * 100);
        return (double)bulat / 100;
    }
    
    public static double determinan(double[][] matrix) {
        return  matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) -
                matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) +
                matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }
    
    public static double[][] hitungInvers(double[][] matrix) {
        double det = determinan(matrix);
        double[][] kofaktor = new double[3][3];
        
        kofaktor[0][0] = (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) / det;
        kofaktor[0][1] = -(matrix[0][1] * matrix[2][2] - matrix[0][2] * matrix[2][1]) / det;
        kofaktor[0][2] = (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]) / det;
        
        kofaktor[1][0] = -(matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) / det;
        kofaktor[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]) / det;
        kofaktor[1][2] = -(matrix[0][0] * matrix[1][2] - matrix[0][2] * matrix[1][0]) / det;
        
        kofaktor[2][0] = (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]) / det;
        kofaktor[2][1] = -(matrix[0][0] * matrix[2][1] - matrix[0][1] * matrix[2][0]) / det;
        kofaktor[2][2] = (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]) / det;
        
        return kofaktor;
    }
}