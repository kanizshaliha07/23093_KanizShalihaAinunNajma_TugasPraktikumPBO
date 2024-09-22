/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4Nomor1;
/**
 *
 * @author LG
 */
public class Berhitung {
    double s, p, l, t;
    
    public Berhitung (double p, double l, double t){
        this.p = p;
        this.l = l;
        this.t = t;
    }
    
    public Berhitung (double s){
        this.s = s;
    }
    
    public double VolumeKubus(){
        return s * s * s;
    }
    
    public double VolumeBalok(){
        return p * l * t;
    }
    
    public double LuasPermuKubus(){
        return 6 * s;
    }
    
    public double LuasPermuBalok(){
        return 2 * ((p * l) + (p * t) + (l * t));
    }
}
