import java.util.Arrays;

public class ArraysDeepDivePractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Arrays Deep Dive
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * array multidimensi, operasi lanjutan, parameter/return value, dan utility methods.
         */

        // ===== ARRAY MULTIDIMENSI DASAR =====
        System.out.println("=== ARRAY MULTIDIMENSI DASAR ===");

        // Latihan 1: Membuat dan mengisi array 2D (matriks)
        // - Buat array 2D integer dengan ukuran 3x4 (3 baris, 4 kolom)
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        // - Isi array dengan nilai: baris 0: [1,2,3,4], baris 1: [5,6,7,8], baris 2: [9,10,11,12]

        // - Print seluruh matriks menggunakan nested loop dengan format yang rapi
        displayMatrix(matrix);

        // Latihan 2: Array 2D dengan inisialisasi langsung
        // - Buat array 2D string yang merepresentasikan papan catur 3x3 dengan nilai awal "."
        String[][] board = {
                {".", ".", "."},
                {".", ".", "."},
                {".", ".", "."}
        };

        // - Tempatkan "X" di posisi [0][0], [1][1], dan [2][2] (diagonal)
        // - Tempatkan "O" di posisi [0][2], [1][0], dan [2][1]
        board[0][0] = "X";
        board[1][1] = "X";
        board[2][2] = "X";

        board[0][2] = "O";
        board[1][0] = "O";
        board[2][1] = "O";

        // - Print papan dengan format grid yang rapi
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        // ===== ARRAY JAGGED (IRREGULAR) =====
        System.out.println("\n=== ARRAY JAGGED (IRREGULAR) ===");

        // Latihan 3: Array dengan panjang baris yang berbeda
        // - Buat array 2D integer dengan 4 baris: baris 0 panjang 2, baris 1 panjang 4, baris 2 panjang 3, baris 3 panjang 5
        int[][] jagged = new int[4][];
        jagged[0] = new int[2];
        jagged[1] = new int[4];
        jagged[2] = new int[3];
        jagged[3] = new int[5];

        // - Isi setiap baris dengan angka berurutan dimulai dari 1
        int value = 1;
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = value++;
            }
        }

        // - Print array jagged dengan menampilkan panjang setiap baris
        for (int i = 0; i < jagged.length; i++) {
            System.out.println("Baris " + i + " (panjang " + jagged[i].length + "): " + Arrays.toString(jagged[i]));
        }

        // ===== OPERASI LANJUTAN PADA ARRAY =====
        System.out.println("\n=== OPERASI LANJUTAN PADA ARRAY ===");

        // Latihan 4: Operasi matematika pada array 2D
        // - Buat dua matriks 2x3 dengan nilai bebas
        int[][] m1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] m2 = {{7, 8, 9}, {10, 11, 12}};

        // - Implementasikan penjumlahan matriks (buat method addMatrices)
        int[][] sum = addMatrices(m1, m2);
        System.out.println("Hasil penjumlahan matriks:");
        displayMatrix(sum);

        // - Implementasikan perkalian setiap elemen dengan scalar 2 (buat method multiplyByScalar)
        int[][] scaled = multiplyByScalar(m1, 2);
        System.out.println("Hasil perkalian scalar:");
        displayMatrix(scaled);

        // - Print hasil operasi

        // ===== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE =====
        System.out.println("\n=== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE ===");

        // Latihan 5: Method yang menerima dan mengembalikan array
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        // - Panggil method sortArray untuk mengurutkan array
        int[] sorted = sortArray(numbers.clone());
        System.out.println("Setelah sorting: " + Arrays.toString(sorted));

        // - Panggil method reverseArray untuk membalik array
        int[] reversed = reverseArray(sorted.clone());
        System.out.println("Setelah dibalik: " + Arrays.toString(reversed));

        // - Panggil method findMinMax untuk mencari nilai minimum dan maksimum
        int[] minMax = findMinMax(numbers);
        System.out.println("Nilai min = " + minMax[0] + ", max = " + minMax[1]);

        // ===== UTILITY METHODS JAVA.UTIL.ARRAYS =====
        System.out.println("\n=== UTILITY METHODS JAVA.UTIL.ARRAYS ===");

        // Latihan 6: Eksplorasi utility methods Arrays
        int[] data = {5, 2, 8, 1, 9, 3};

        // - Gunakan Arrays.toString() untuk print array
        System.out.println("Array awal: " + Arrays.toString(data));

        // - Gunakan Arrays.sort() untuk mengurutkan array
        Arrays.sort(data);
        System.out.println("Array setelah sort: " + Arrays.toString(data));

        // - Gunakan Arrays.binarySearch() untuk mencari elemen (array harus sudah diurutkan)
        int idx = Arrays.binarySearch(data, 8);
        System.out.println("Hasil binarySearch untuk angka 8: index " + idx);

        // - Gunakan Arrays.fill() untuk mengisi array dengan nilai tertentu
        Arrays.fill(data, 7);
        System.out.println("Setelah fill dengan 7: " + Arrays.toString(data));

        // - Gunakan Arrays.equals() untuk membandingkan dua array
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println("arr1 equals arr2? " + Arrays.equals(arr1, arr2));

        // - Gunakan Arrays.copyOf() untuk membuat copy array dengan ukuran berbeda
        int[] copy = Arrays.copyOf(arr1, 5);
        System.out.println("Copy array dengan ukuran lebih besar: " + Arrays.toString(copy));

        // ===== ARRAY 3D DAN KOMPLEKS =====
        System.out.println("\n=== ARRAY 3D DAN KOMPLEKS ===");

        // Latihan 7: Array 3 dimensi
        // - Buat array 3D integer ukuran 2x3x4 (seperti 2 buah matriks 3x4)
        int[][][] arr3D = new int[2][3][4];

        // - Isi dengan nilai berurutan dari 1
        value = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    arr3D[i][j][k] = value++;
                }
            }
        }

        // - Print menggunakan triple nested loop dengan format yang jelas
        for (int i = 0; i < 2; i++) {
            System.out.println("Matriks ke-" + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    System.out.print(arr3D[i][j][k] + " ");
                }
                System.out.println();
            }
        }

        // ===== SKENARIO APLIKASI NYATA =====
        System.out.println("\n=== SKENARIO APLIKASI NYATA ===");

        // Latihan 8: Sistem nilai mahasiswa
        // - Buat array 2D untuk menyimpan nilai 5 mahasiswa, 4 mata kuliah
        String[] namaMahasiswa = {"Alice", "Bob", "Charlie", "Diana", "Eva"};
        String[] mataKuliah = {"Math", "Physics", "Chemistry", "Biology"};
        int[][] grades = new int[5][4];

        // - Isi dengan nilai random antara 60-100
        fillRandomGrades(grades, 60, 100);

        // - Hitung rata-rata per mahasiswa
        // - Hitung rata-rata per mata kuliah
        // - Tentukan mahasiswa dengan nilai tertinggi
        // - Print dalam format tabel yang rapi
        System.out.printf("%-10s", "Nama");
        for (String mk : mataKuliah) {
            System.out.printf("%-10s", mk);
        }
        System.out.printf("%-10s%n", "Rata-rata");

        double highest = 0;
        String topStudent = "";

        for (int i = 0; i < grades.length; i++) {
            System.out.printf("%-10s", namaMahasiswa[i]);
            double avg = calculateAverage(grades[i]);
            if (avg > highest) {
                highest = avg;
                topStudent = namaMahasiswa[i];
            }
            for (int j = 0; j < grades[i].length; j++) {
                System.out.printf("%-10d", grades[i][j]);
            }
            System.out.printf("%-10.2f%n", avg);
        }
        System.out.println("Mahasiswa dengan rata-rata tertinggi: " + topStudent);

        // Latihan 9: Game Tic-Tac-Toe sederhana
        // - Buat array 2D char 3x3 untuk papan permainan
        char[][] ticTacToe = new char[3][3];
        for (char[] row : ticTacToe) Arrays.fill(row, '-');

        // - Implementasikan method untuk menampilkan papan
        // - Implementasikan method untuk mengecek apakah ada pemenang
        // - Simulasikan beberapa langkah permainan
        ticTacToe[0][0] = 'X';
        ticTacToe[1][1] = 'X';
        ticTacToe[0][1] = 'O';
        ticTacToe[2][2] = 'X';

        displayTicTacToe(ticTacToe);
        System.out.println("Apakah ada pemenang? " + checkWinner(ticTacToe));
    }

    // ===== IMPLEMENTASI METHODS =====
    // TODO: Implementasikan method-method yang diperlukan di sini

    // Method untuk penjumlahan matriks
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        // Implementasi penjumlahan matriks
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method untuk perkalian scalar
    public static int[][] multiplyByScalar(int[][] matrix, int scalar) {
        // Implementasi perkalian scalar
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix[i][j] * scalar;
            }
        }
        return result;
    }

    // Method untuk sorting array
    public static int[] sortArray(int[] arr) {
        // Implementasi sorting (bisa menggunakan Arrays.sort atau implementasi sendiri)
        Arrays.sort(arr);
        return arr;
    }

    // Method untuk reverse array
    public static int[] reverseArray(int[] arr) {
        // Implementasi reverse array
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    // Method untuk find min dan max
    public static int[] findMinMax(int[] arr) {
        // Return array dengan format [min, max]
        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new int[]{min, max};
    }

    // Method untuk display array 2D
    public static void displayMatrix(int[][] matrix) {
        // Implementasi untuk menampilkan matriks dengan format rapi
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Method untuk mengisi array 2D dengan nilai random
    public static void fillRandomGrades(int[][] grades, int min, int max) {
        // Implementasi untuk mengisi array dengan nilai random
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                grades[i][j] = min + (int) (Math.random() * (max - min + 1));
            }
        }
    }

    // Method untuk menghitung rata-rata array
    public static double calculateAverage(int[] values) {
        // Implementasi untuk menghitung rata-rata
        int sum = 0;
        for (int v : values) sum += v;
        return (double) sum / values.length;
    }

    // Untuk Tic-Tac-Toe
    public static void displayTicTacToe(char[][] board) {
        // Implementasi untuk menampilkan papan
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean checkWinner(char[][] board) {
        // Implementasi untuk mengecek apakah ada pemenang
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2])
                return true;
            if (board[0][i] != '-' && board[0][i] == board[1][i] && board[1][i] == board[2][i])
                return true;
        }
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2])
            return true;
        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0])
            return true;

        return false;
    }
}
