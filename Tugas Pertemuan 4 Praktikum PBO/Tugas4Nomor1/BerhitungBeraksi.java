/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas4Nomor1;

/**
 *
 * @author LG
 */
public class BerhitungBeraksi {
    public static void main(String[] args) {
        Berhitung hitung = new Berhitung(5);
        Berhitung hitung1 = new Berhitung(5,6,7);
        
        System.out.println ("Volume Kubus: " + hitung.VolumeKubus());
        System.out.println ("Volume Balok: " + hitung1.VolumeBalok());
        
        System.out.println (" ");
        
        System.out.println ("Luas Permukaan Kubus: " + hitung.LuasPermuKubus());
        System.out.println ("Luas Permukaan Balok: " + hitung1.LuasPermuBalok());

    }
    
}
