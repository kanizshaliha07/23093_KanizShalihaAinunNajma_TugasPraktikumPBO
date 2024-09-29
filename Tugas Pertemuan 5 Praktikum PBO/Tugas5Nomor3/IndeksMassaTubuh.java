/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas5Nomor3;
import java.util.Scanner;
/**
 *
 * @author LG
 */
public class IndeksMassaTubuh {
    public static void main(String[] args) {
        // Membuat scanner untuk input data dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input berat badan dan tinggi badan
        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = scanner.nextDouble();
        
        System.out.print("Masukkan tinggi badan (meter): ");
        double tinggiBadan = scanner.nextDouble();
        
        // Menghitung IMT
        double imt = beratBadan / (tinggiBadan * tinggiBadan);
        
        // Menentukan kriteria berdasarkan nilai IMT
        String kriteria;
        if (imt <= 18.4) {
            kriteria = "Berat Badan Kurang";
        } else if (imt >= 18.5 && imt <= 24.9) {
            kriteria = "Berat Badan Ideal";
        } else if (imt >= 25 && imt <= 29.9) {
            kriteria = "Berat Badan Lebih";
        } else if (imt >= 30 && imt <= 39.9) {
            kriteria = "Gemuk";
        } else {
            kriteria = "Sangat Gemuk";
        }
        
        // Menampilkan hasil
        System.out.println("Nilai IMT Anda: " + imt);
        System.out.println("Kriteria: " + kriteria);
        
        // Menutup scanner
        scanner.close();
    }
}
