/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author LG
 */
public class TokoSerbaAda {
    // Method untuk mendapatkan nama barang berdasarkan kode
    public static String getNamaBarang(String kode) {
        switch (kode) {
            case "a001":
                return "Buku";
            case "a002":
                return "Pensil";
            case "a003":
                return "Pulpen";
            default:
                return "Kode tidak ditemukan";
        }
    }

    // Method untuk mendapatkan harga barang berdasarkan kode
    public static int getHargaBarang(String kode) {
        switch (kode) {
            case "a001":
                return 3000;
            case "a002":
                return 4000;
            case "a003":
                return 5000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array untuk menyimpan data transaksi
        String[] kodeBarang = new String[3]; // Batas hanya 3 data
        String[] namaBarang = new String[3];
        int[] hargaBarang = new int[3];
        int[] jumlahBeli = new int[3];
        int[] jumlahBayar = new int[3];
        int totalBayar = 0;
        int jumlahData = 0;

        System.out.println("*************************************");
        System.out.println("TOKO SERBA ADA");
        System.out.println("*************************************");

        System.out.println("Masukkan Item Barang : 3");

        // Input data barang dari user
        for (int i = 0; i < 3; i++) { // Loop dibatasi hingga 3
            System.out.println("Data ke " + (i + 1));

            System.out.print("Masukkan Kode Barang : ");
            String kode = input.nextLine();
            
            String nama = getNamaBarang(kode);
            if (nama.equals("Kode tidak ditemukan")) {
                System.out.println("Kode barang tidak valid!");
                break;
            }

            int harga = getHargaBarang(kode);
            System.out.print("Masukkan Jumlah Beli : ");
            int jumlah = input.nextInt();
            input.nextLine();

            // Menyimpan data ke dalam array
            kodeBarang[i] = kode;
            namaBarang[i] = nama;
            hargaBarang[i] = harga;
            jumlahBeli[i] = jumlah;
            jumlahBayar[i] = harga * jumlah;
            totalBayar += jumlahBayar[i];
            jumlahData++;

            System.out.println();
        }

        // Output tabel
        System.out.println("*************************************");
        System.out.println("No  Kode Barang  Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");
        for (int i = 0; i < jumlahData; i++) {
            System.out.printf("%-4d%-13s%-13s%-8d%-12d%d\n", (i + 1), kodeBarang[i], namaBarang[i], hargaBarang[i], jumlahBeli[i], jumlahBayar[i]);
        }
        System.out.println("*************************************");
        System.out.println("Total Bayar = " + totalBayar);
    }
}