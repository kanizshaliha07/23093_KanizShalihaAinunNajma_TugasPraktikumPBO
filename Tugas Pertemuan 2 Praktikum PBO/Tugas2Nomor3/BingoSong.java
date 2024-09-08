/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2Nomor3;
        
/**
 *
 * @author LG
 */
// Class Bingo untuk menyimpan lirik dan metode terkait
public class BingoSong {

    // Konstruktor
    public BingoSong() {
        // Langsung memanggil method untuk menyanyikan lagu
        singSong();
    }

    // Method untuk menampilkan lirik "There was a farmer who had a dog, And Bingo was his name-o."
    public void printIntro() {
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
    }

    // Method untuk menyanyikan bagian "B-I-N-G-O" atau "(clap)"
    public void printBingo(int clapCount) {
        for (int i = 0; i < 5; i++) {
            if (i < clapCount) {
                System.out.print("(clap) ");
            } else {
                System.out.print("B-I-N-G-O".charAt(i) + " ");
            }
        }
        System.out.println();  // Pindah baris setelah selesai
    }

    // Method utama untuk menyanyikan lagu menggunakan loop
    public void singSong() {
        // Total 6 pengulangan (dari tidak ada tepukan hingga semua huruf ditepuk)
        for (int clapCount = 0; clapCount <= 5; clapCount++) {
            // Bagian yang menyanyikan intro
            printIntro();
            
            // Bagian menyanyikan 3 kali pengulangan bagian "B-I-N-G-O"
            for (int i = 0; i < 3; i++) {
                printBingo(clapCount);
            }
            
            // Bagian menutup tiap pengulangan dengan "And Bingo was his name-o."
            System.out.println("And Bingo was his name-o.\n");
        }
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek BingoSong yang otomatis menjalankan lagu
        new BingoSong();
    }
}