/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LG
 */
public class HitungHari {
    public int hitung(int year, String month) {
        switch (month) {
            case "Januari": case "Maret": case "Mei": case "Juli":
            case "Agustus": case "Oktober": case "Desember":
                return 31;
            case "April": case "Juni": case "September": case "November":
                return 30;
            case "Februari":
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    return 29; // Leap year
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }
}
