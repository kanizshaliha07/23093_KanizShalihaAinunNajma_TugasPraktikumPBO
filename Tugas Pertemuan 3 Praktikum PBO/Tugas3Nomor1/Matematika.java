/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3Nomor1;

/**
 *
 * @author LG
 */
class Matematika {
    // Method penjumlahan
    public int tambah(int a, int b) {
        return a + b;
    }
    
    // Method pengurangan
    public int kurang(int a, int b) {
        return a - b;
    }
    
    // Method perkalian
    public int kali(int a, int b) {
        return a * b;
    }
    
    // Method pembagian
    public int bagi(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Pembagi tidak boleh 0");
            return 0;
        }
    }
}
