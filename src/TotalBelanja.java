import java.util.Scanner;

public class To1talBelanja {

    // Fungsi untuk input harga barang
    public static double mintaHargaBarang() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan harga barang: ");
        return input.nextDouble();
    }

    // Fungsi untuk input jumlah barang
    public static int mintaJumlahBarang() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah barang: ");
        return input.nextInt();
    }

    // Fungsi untuk menghitung total belanja
    public static double hitungTotalBelanja(double harga, int jumlah) {
        return harga * jumlah;
    }

    public static void main(String[] args) {
        // Minta input harga barang
        double harga = mintaHargaBarang();

        // Minta input jumlah barang
        int jumlah = mintaJumlahBarang();

        // Hitung total belanja
        double total = hitungTotalBelanja(harga, jumlah);

        // Tampilkan hasil
        System.out.println("Total belanja: " + total);
    }
}
