/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet12;

import java.util.Scanner;

/**
 *
 * @author ASUS GAMING PC
 */
public class latihan4 {
    public static void method2(double a, double b){
        
        System.out.println("Kecepatan : " + (a/b));
    }
    public static void main(String[] args) {
        int jarak, waktu;
        Scanner mahal = new Scanner(System.in);
        System.out.print("Masukkan jarak : ");
        jarak = mahal.nextInt();
        System.out.print("Masukkan waktu : ");
        waktu = mahal.nextInt();
        method2(jarak,waktu);
    }
    
}
