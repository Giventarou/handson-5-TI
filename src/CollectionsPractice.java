import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Collections
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * ArrayList, generics, operasi CRUD, dan iterasi collections.
         */

        // ===== PERBEDAAN ARRAY VS ARRAYLIST =====
        System.out.println("=== PERBEDAAN ARRAY VS ARRAYLIST ===");

        // Latihan 1: Demonstrasi keterbatasan array vs keunggulan ArrayList
        // - Buat array integer dengan ukuran tetap 3
        int[] arr = new int[3];

        // - Buat ArrayList<Integer> kosong
        ArrayList<Integer> arrList = new ArrayList<>();

        // - Coba tambahkan 5 elemen ke array (akan error/terbatas)
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        // arr[3] = 40; // jika dijalankan akan error karena ukuran tetap

        // - Tambahkan 5 elemen ke ArrayList (dinamis)
        for (int i = 10; i <= 50; i += 10) {
            arrList.add(i);
        }

        // - Print ukuran keduanya dan jelaskan perbedaannya dalam komentar
        System.out.println("Ukuran array: " + arr.length);
        System.out.println("Ukuran ArrayList: " + arrList.size());
        // Array berukuran tetap, sedangkan ArrayList dapat bertambah secara dinamis.

        // ===== GENERICS DASAR =====
        System.out.println("\n=== GENERICS DASAR ===");

        // Latihan 2: Memahami generics dan type safety
        // - Buat ArrayList tanpa generics (raw type) dan tambahkan berbagai tipe data
        ArrayList rawList = new ArrayList();
        rawList.add("Teks");
        rawList.add(123);
        rawList.add(true);

        // - Buat ArrayList<String> dengan generics dan tambahkan hanya String
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Halo");
        stringList.add("Dunia");

        // - Buat ArrayList<Double> untuk menyimpan nilai desimal
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(3.14);
        doubleList.add(2.71);

        // - Demonstrasikan type safety dengan mencoba menambahkan tipe yang salah
        // stringList.add(123); // error: tidak bisa menambah selain String

        // ===== OPERASI CRUD PADA ARRAYLIST =====
        System.out.println("\n=== OPERASI CRUD PADA ARRAYLIST ===");

        // Latihan 3: Create - Menambah data
        ArrayList<String> daftarMahasiswa = new ArrayList<>();

        // - Tambahkan 5 nama mahasiswa menggunakan add()
        daftarMahasiswa.add("Akari");
        daftarMahasiswa.add("Banri");
        daftarMahasiswa.add("Chimaru");
        daftarMahasiswa.add("Denzo");
        daftarMahasiswa.add("Eita");

        // - Tambahkan mahasiswa di posisi tertentu menggunakan add(index, element)
        daftarMahasiswa.add(2, "Fujimiya");

        // - Print daftar mahasiswa
        System.out.println("Daftar mahasiswa: " + daftarMahasiswa);

        // Latihan 4: Read - Membaca data
        // - Baca mahasiswa pertama menggunakan get(0)
        System.out.println("Mahasiswa pertama: " + daftarMahasiswa.get(0));

        // - Baca mahasiswa terakhir
        System.out.println("Mahasiswa terakhir: " + daftarMahasiswa.get(daftarMahasiswa.size() - 1));

        // - Cek apakah ada mahasiswa dengan nama tertentu menggunakan contains()
        System.out.println("Apakah ada 'Akari'? " + daftarMahasiswa.contains("Ani"));

        // - Temukan index mahasiswa tertentu menggunakan indexOf()
        System.out.println("Index 'Chimaru': " + daftarMahasiswa.indexOf("Cici"));

        // - Print ukuran ArrayList menggunakan size()
        System.out.println("Jumlah mahasiswa: " + daftarMahasiswa.size());

        // Latihan 5: Update - Mengubah data
        // - Ubah nama mahasiswa di index tertentu menggunakan set()
        daftarMahasiswa.set(1, "Antari");

        // - Print daftar setelah update
        System.out.println("Setelah update: " + daftarMahasiswa);

        // Latihan 6: Delete - Menghapus data
        // - Hapus mahasiswa berdasarkan index menggunakan remove(index)
        daftarMahasiswa.remove(3);

        // - Hapus mahasiswa berdasarkan nama menggunakan remove(object)
        daftarMahasiswa.remove("Ekun");

        // - Hapus semua mahasiswa menggunakan clear()
        daftarMahasiswa.clear();

        // - Cek apakah ArrayList kosong menggunakan isEmpty()
        System.out.println("Apakah daftar kosong? " + daftarMahasiswa.isEmpty());

        // ===== ITERASI ARRAYLIST =====
        System.out.println("\n=== ITERASI ARRAYLIST ===");

        // Latihan 7: Berbagai cara iterasi
        ArrayList<Integer> angka = new ArrayList<>();
        // Isi dengan angka 10, 20, 30, 40, 50
        for (int i = 10; i <= 50; i += 10) angka.add(i);

        // - Iterasi menggunakan traditional for loop
        for (int i = 0; i < angka.size(); i++) {
            System.out.println("for loop: " + angka.get(i));
        }

        // - Iterasi menggunakan enhanced for loop (for-each)
        for (int a : angka) {
            System.out.println("for-each: " + a);
        }

        // - Iterasi menggunakan while loop
        int i = 0;
        while (i < angka.size()) {
            System.out.println("while loop: " + angka.get(i));
            i++;
        }

        // - Iterasi menggunakan Iterator
        Iterator<Integer> it = angka.iterator();
        while (it.hasNext()) {
            System.out.println("iterator: " + it.next());
        }

        // ===== ARRAYLIST DENGAN TIPE DATA KOMPLEKS =====
        System.out.println("\n=== ARRAYLIST DENGAN TIPE DATA KOMPLEKS ===");

        ArrayList<String[]> dataMahasiswa = new ArrayList<>();

        // - Tambahkan 3 data mahasiswa
        dataMahasiswa.add(new String[]{"Akari", "2481034", "Informatika"});
        dataMahasiswa.add(new String[]{"Banri", "2481054", "Sistem Informasi"});
        dataMahasiswa.add(new String[]{"Chika", "2481022", "Teknik Komputer"});

        // - Print semua data dengan format tabel
        System.out.println("Nama\tNIM\tJurusan");
        for (String[] mhs : dataMahasiswa) {
            System.out.println(mhs[0] + "\t" + mhs[1] + "\t" + mhs[2]);
        }

        // ===== UTILITY METHODS COLLECTIONS =====
        System.out.println("\n=== UTILITY METHODS COLLECTIONS ===");

        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 64, 34, 25, 12, 22, 11, 90);

        // - Sort
        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);

        // - Reverse
        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers);

        // - Shuffle
        Collections.shuffle(numbers);
        System.out.println("Shuffled: " + numbers);

        // - Max & Min
        System.out.println("Max: " + Collections.max(numbers));
        System.out.println("Min: " + Collections.min(numbers));

        // - Frequency
        numbers.add(22);
        System.out.println("Frekuensi 22: " + Collections.frequency(numbers, 22));

        // ===== SEARCHING DAN SORTING =====
        System.out.println("\\n=== SEARCHING DAN SORTING ===");

        ArrayList<String> buah = new ArrayList<>();
        Collections.addAll(buah, "Apel", "Jeruk", "Mangga", "Pisang", "Anggur");

        // - Sort alphabetically
        Collections.sort(buah);
        System.out.println("Buah terurut: " + buah);

        // - Binary search
        int pos = Collections.binarySearch(buah, "Mangga");
        System.out.println("Binary search 'Mangga': index " + pos);

        // - Linear search
        int index = linearSearch(buah, "Pisang");
        System.out.println("Linear search 'Pisang': index " + index);

        // ===== ARRAYLIST 2D =====
        System.out.println("\\n=== ARRAYLIST 2D ===");

        ArrayList<ArrayList<Integer>> matrix2D = new ArrayList<>();

        // - Create jagged 2D ArrayList
        for (int r = 0; r < 3; r++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int c = 0; c <= r; c++) {
                row.add((r + 1) * (c + 1));
            }
            matrix2D.add(row);
        }

        // - Print matrix
        printMatrix2D(matrix2D);

        // ===== SKENARIO APLIKASI NYATA =====
        System.out.println("\n=== SKENARIO APLIKASI NYATA ===");

        ArrayList<String[]> daftarBuku = new ArrayList<>();
        daftarBuku.add(new String[]{"Java Dasar", "Akari", "2020", "tersedia"});
        daftarBuku.add(new String[]{"Database", "Banri", "2019", "dipinjam"});
        daftarBuku.add(new String[]{"Algoritma", "Chika", "2021", "tersedia"});
        daftarBuku.add(new String[]{"Jaringan", "Denzel", "2022", "tersedia"});
        daftarBuku.add(new String[]{"Web", "Eita", "2018", "tersedia"});

        // - Pinjam buku
        pinjamBuku(daftarBuku, "Algoritma");

        // - Kembalikan buku
        kembalikanBuku(daftarBuku, "Database");

        // - Cari buku
        String[] hasilCari = cariBuku(daftarBuku, "Jaringan");
        if (hasilCari != null) {
            System.out.println("Buku ditemukan: " + hasilCari[0] + " - " + hasilCari[3]);
        }

        // - Print buku yang tersedia
        System.out.println("Daftar buku tersedia:");
        for (String[] b : daftarBuku) {
            if (b[3].equals("tersedia")) {
                System.out.println(b[0] + " (" + b[2] + ")");
            }
        }

        // ===== PERFORMANCE COMPARISON =====
        System.out.println("\n=== PERFORMANCE COMPARISON ===");
        // Implementasi sederhana
        int[] arrayPerf = new int[1000];
        ArrayList<Integer> listPerf = new ArrayList<>();
        for (int n = 0; n < 1000; n++) listPerf.add(n);
        System.out.println("Array akses cepat tapi ukuran tetap, ArrayList lebih fleksibel.");
    }

    // ===== HELPER METHODS =====
    public static void printArrayList(ArrayList<?> list, String title) {
        System.out.println(title + ": " + list);
    }

    public static int linearSearch(ArrayList<String> list, String target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) return i;
        }
        return -1;
    }

    public static void printMatrix2D(ArrayList<ArrayList<Integer>> matrix) {
        for (ArrayList<Integer> row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static boolean pinjamBuku(ArrayList<String[]> daftarBuku, String judul) {
        for (String[] b : daftarBuku) {
            if (b[0].equalsIgnoreCase(judul) && b[3].equals("tersedia")) {
                b[3] = "dipinjam";
                return true;
            }
        }
        return false;
    }

    public static boolean kembalikanBuku(ArrayList<String[]> daftarBuku, String judul) {
        for (String[] b : daftarBuku) {
            if (b[0].equalsIgnoreCase(judul) && b[3].equals("dipinjam")) {
                b[3] = "tersedia";
                return true;
            }
        }
        return false;
    }

    public static String[] cariBuku(ArrayList<String[]> daftarBuku, String judul) {
        for (String[] b : daftarBuku) {
            if (b[0].equalsIgnoreCase(judul)) {
                return b;
            }
        }
        return null;
    }

    public static double hitungRataRata(ArrayList<Integer> values) {
        if (values.isEmpty()) return 0.0;
        int sum = 0;
        for (int v : values) sum += v;
        return (double) sum / values.size();
    }
}

