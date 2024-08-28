/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3PBOnomor2;

/**
 *
 * @author LG
 */
//class Nilai
public class Nilai {
    String NPM;
    String Nama;
    int nilaiAbsen;
    int nilaiTugas;
    int nilaiUTS;
    int nilaiUAS;
    
    //Method untuk menghitung nilai akhir
    int hitungNilaiAkhir(){
        double nilaiAkhir = (int) ((nilaiAbsen * 0.1) + (nilaiTugas * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4));
        return (int) nilaiAkhir;
    }
    void cetakNilai() {
        System.out.println("NPM : " + NPM);
        System.out.println("Nama : " + Nama);
        System.out.println("Nilai Absen [10%] : " + nilaiAbsen);
        System.out.println("Nilai Tugas [20%] : " + nilaiTugas);
        System.out.println("Nilai UTS [30%] : " + nilaiUTS);
        System.out.println("Nilai UAS [40%] : " + nilaiUAS);
        System.out.println("Nilai Akhir : " + hitungNilaiAkhir());
}
}
