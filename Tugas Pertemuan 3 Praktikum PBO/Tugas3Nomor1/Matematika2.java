/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3Nomor1;

/**
 *
 * @author LG
 */
class Matematika2 extends Matematika {
    // Method modulus
    public int modulus(int a, int b) {
        if (b != 0) {
            return a % b;
        } else {
            System.out.println("Error: Pembagi tidak boleh 0");
            return 0;
        }
    }
}