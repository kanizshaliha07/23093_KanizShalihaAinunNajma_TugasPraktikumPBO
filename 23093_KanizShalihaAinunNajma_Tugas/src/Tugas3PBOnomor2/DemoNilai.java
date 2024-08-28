/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas3PBOnomor2;

/**
 *
 * @author LG
 */
public class DemoNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai nilai = new Nilai();

        // Mengisi data pada objek nilai
        nilai.NPM = "2310631170093";
        nilai.Nama = "Kaniz Shaliha Ainun Najma";
        nilai.nilaiAbsen = (int) 85.0;
        nilai.nilaiTugas = (int) 90.0;
        nilai.nilaiUTS = (int) 88.0;
        nilai.nilaiUAS = (int) 92.0;

        // Memanggil method cetakNilai untuk menampilkan hasil
        nilai.cetakNilai();
    }
    
}
