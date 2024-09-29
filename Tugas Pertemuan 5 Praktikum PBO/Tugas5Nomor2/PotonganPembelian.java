/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas5Nomor2;
import java.util.Scanner;

/**
 *
 * @author LG
 */
public class PotonganPembelian {
    public static void main(String[] args) {
        // Membuat scanner untuk input data dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input total pembelian
        System.out.print("Masukkan total pembelian (Rp.): ");
        double totalPembelian = scanner.nextDouble();
        
        // Variabel untuk menyimpan besarnya potongan
        double potongan = 0.0;
        
        // Menentukan besarnya potongan berdasarkan kriteria
        if (totalPembelian < 50000) {
            potongan = totalPembelian * 0.05;  // 5% potongan untuk pembelian < Rp. 50.000
        } else {
            potongan = totalPembelian * 0.20;  // 20% potongan untuk pembelian >= Rp. 50.000
        }
        
        // Menghitung total yang harus dibayar
        double totalBayar = totalPembelian - potongan;
        
        // Menampilkan hasil
        System.out.println("Total pembelian Rp. " + totalPembelian);
        System.out.println("Besarnya potongan Rp. " + potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp. " + totalBayar);
        
        // Menutup scanner
        scanner.close();
    }
}
