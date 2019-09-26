/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet12;

/**
 *
 * @author ASUS GAMING PC
 */
public class Luasbangundatar {
    public static double persegi(){
        int s = 5;
        double hasil = 5*5;
        return hasil;
    }
    public static double persegipanjang(){
        int p = 20;
        int l = 30;
        double hasil2 = p*l;
        return hasil2;
    }
    public static double lingkaran(){
        double phi = 3.14;
        int r = 10;
        double hasil3 = phi*r*r;
        return hasil3;
    }
    public static void main(String[] args) {
        System.out.println("Luas persegi = " +persegi());
        System.out.println("Luas persegipanjang = " +persegipanjang());
        System.out.println("Luas lingkaran = " +lingkaran());
    }
    
}
