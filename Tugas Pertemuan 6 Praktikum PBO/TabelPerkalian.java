/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author LG
 */
public class TabelPerkalian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan nilai n (maksimal 10) untuk tabel perkalian: ");
        int n = input.nextInt();

        // Memastikan n tidak lebih besar dari 10
        if (n > 10 || n < 1) {
            System.out.println("Nilai n harus antara 1 dan 10.");
        } else {
            // Menampilkan tabel perkalian
            System.out.println("\nTabel Perkalian " + n + " x " + n + ":");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(i * j + "\t"); // Mengalikan baris dan kolom
                }
                System.out.println(); // Baris baru setelah setiap baris selesai
            }
        }

        input.close();
    }
}
