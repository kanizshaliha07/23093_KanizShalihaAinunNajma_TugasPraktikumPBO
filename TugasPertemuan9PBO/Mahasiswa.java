package TugasPertemuan9PBO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LG
 */
public class Mahasiswa {
    private String NIM, Nama, Alamat, Matkul;
    private double nilai1, nilai2, nilai3, nilai4, nilai5, nilaiAkhir;
    public Mahasiswa(String NIM, String Nama, String Alamat, String Matkul, double nilai1, double nilai2, double nilai3, double nilai4, double nilai5, double nilaiAkhir){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Matkul = Matkul;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
        this.nilai4 = nilai4;
        this.nilai5 = nilai5;
        this.nilaiAkhir = nilaiAkhir;
    }
    
    public String getNIM() {
        return NIM;
    }
    
    public String getNama() {
        return Nama;
    }
    
    public String getAlamat() {
        return Alamat;
    }
    
    public String getMatkul() {
        return Matkul;
    }
    
    public double getnilai1() {
        return nilai1;
    }
    
    public double getnilai2() {
        return nilai2;
    }
    
    public double getnilai3() {
        return nilai3;
    }
    
    public double getnilai4() {
        return nilai4;
    }
    
    public double getnilai5() {
        return nilai5;
    }
    
    public double getnilaiAkhir() {
        return nilaiAkhir;
    }
}
