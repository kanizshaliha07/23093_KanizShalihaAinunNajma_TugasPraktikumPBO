/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3Nomor2;

/**
 *
 * @author LG
 */
public class KonversiSuhu2 extends KonversiSuhu {
    // Method untuk mengonversi Fahrenheit ke Reamur
    public double fahrenheitToReamur(double fahrenheit) {
        // Konversi Fahrenheit ke Celcius dulu, kemudian Celcius ke Reamur
        double celcius = (fahrenheit - 32) * 5/9;
        return celcius * 4/5;
    }
}
