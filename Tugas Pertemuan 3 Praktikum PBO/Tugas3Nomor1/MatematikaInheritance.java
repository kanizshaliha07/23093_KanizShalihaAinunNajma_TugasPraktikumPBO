/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas3Nomor1;

/**
 *
 * @author LG
 */
public class MatematikaInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek dari Matematika2
        Matematika2 math = new Matematika2();

        // Memanggil method dari kelas Matematika
        System.out.println("Penjumlahan 10 + 5 = " + math.tambah(10, 5));
        System.out.println("Pengurangan 10 - 5 = " + math.kurang(10, 5));
        System.out.println("Perkalian 10 * 5 = " + math.kali(10, 5));
        System.out.println("Pembagian 10 / 5 = " + math.bagi(10, 5));

        // Memanggil method modulus dari kelas Matematika2
        System.out.println("Modulus 10 % 3 = " + math.modulus(10, 3));
    }   
}
