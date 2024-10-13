/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author LG
 */
public class Looping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        // a. Menghitung Deret Bilangan Prima dan Bukan dari 0 – 20
        System.out.println("a. Deret Bilangan Prima dan Bukan dari 0 – 20");
        for (int i = 0; i <= 20; i++) {
            boolean isPrima = true;
            if (i <= 1) {
                isPrima = false;  // Bilangan 0 dan 1 bukan prima
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrima = false;
                        break; // Keluar dari loop karena sudah terbukti bukan prima
                    }
                }
            }
            if (isPrima) {
                System.out.print(i + " (Prima) ");
            } else {
                System.out.print(i + " (Bukan) ");
            }
        }
        System.out.println("\n");

        // b. Menghitung Deret Bilangan Ganjil dan Genap dari 0 – 20
        System.out.println("b. Deret Bilangan Ganjil dan Genap dari 0 – 20");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " (Genap) ");
            } else {
                System.out.print(i + " (Ganjil) ");
            }
        }
        System.out.println("\n");

        // c. Huruf Z – A
        System.out.println("c. Huruf Z – A");
        for (char c = 'Z'; c >= 'A'; c--) {
            System.out.print(c + " ");
        }
        System.out.println("\n");

        // d. Lagu “Anak Ayam Turun N”
        System.out.print("d. Lagu “Anak Ayam Turun N”\nMasukkan nilai N: ");
        int N = input.nextInt();
        for (int i = N; i > 0; i--) {
            System.out.println("Anak ayam turun " + i);
        }

        input.close();
    }
}

