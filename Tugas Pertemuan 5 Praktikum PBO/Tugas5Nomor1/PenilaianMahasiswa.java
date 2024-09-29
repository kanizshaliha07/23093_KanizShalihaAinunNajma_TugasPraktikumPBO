/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas5Nomor1;
import java.util.Scanner;

/**
 *
 * @author LG
 */
public class PenilaianMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Tampilan input
        System.out.print("NPM : ");
        String npm = input.nextLine();
        System.out.print("Nama Mahasiswa : ");
        String nama = input.nextLine();
        System.out.print("Nilai Kehadiran : ");
        Double nilaiKehadiran = input.nextDouble();
        System.out.print("Nilai Tugas : ");
        Double nilaiTugas = input.nextDouble();
        System.out.print("Nilai UTS : ");
        Double nilaiUTS = input.nextDouble();
        System.out.print("Nilai UAS : ");
        Double nilaiUAS = input.nextDouble();
        
        //Menghitung nilai akhir
        double nilaiAkhir = (0.10 * nilaiKehadiran) + (0.20 * nilaiTugas) + (0.30 * nilaiUTS) + (0.40 * nilaiUAS);
        
        //Menentukan grade dan keterangan
        String grade;
        String keterangan;
        
        if (nilaiAkhir >= 76 && nilaiAkhir <= 100){
            grade = "A";
            keterangan = "ISTIMEWA";
        }else if (nilaiAkhir >= 66 && nilaiAkhir <= 75){
            grade = "B";
            keterangan = "BAIK";
        }else if (nilaiAkhir >= 56 && nilaiAkhir <= 65){
            grade = "C";
            keterangan = "CUKUP";
        }else if (nilaiAkhir >= 46 && nilaiAkhir <= 55){
            grade = "D";
            keterangan = "KURANG";
        }else{
            grade = "E";
            keterangan = "KURANG SEKALI";
        }
        
        //Tampilan output
        System.out.println("\nTampilan Output");
        System.out.println("NPM Mahasiswa : " + npm);
        System.out.println("Nama Mahasiswa :" + nama);
        System.out.println("Nilai Rata-rata :" + String.format("%.2f", nilaiAkhir));
        System.out.println("Grade : " + grade);
        System.out.println("Keterangan : " + keterangan);
        
        input.close();
    } 
}
