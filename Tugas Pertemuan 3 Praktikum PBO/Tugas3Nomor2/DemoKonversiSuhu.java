/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas3Nomor2;

/**
 *
 * @author LG
 */
public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek dari KonversiSuhu2 (yang merupakan turunan dari KonversiSuhu)
        KonversiSuhu2 konversi = new KonversiSuhu2();

        // Nilai yang akan dikonversi
        double celcius = 25.0;
        double fahrenheit = 77.0;

        // Memanggil method konversi dari Celcius ke Fahrenheit
        System.out.println(celcius + " Celcius to Fahrenheit: " + konversi.celciusToFahrenheit(celcius));

        // Memanggil method konversi dari Celcius ke Reamur
        System.out.println(celcius + " Celcius to Reamur: " + konversi.celciusToReamur(celcius));

        // Memanggil method konversi dari Fahrenheit ke Reamur
        System.out.println(fahrenheit + " Fahrenheit to Reamur: " + konversi.fahrenheitToReamur(fahrenheit));
    }
}
