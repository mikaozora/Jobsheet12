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
public class kalkulator {
    public static void kalkulator(double a, double b){
        
        System.out.println("Bil 1 + bil 2 = " + (a+b));
        System.out.println("Bil 1 - bil 2 = " + (a-b));
        System.out.println("Bil 1 x bil 2 = " + (a*b));
        System.out.println("bil 1 : bil 2 = " + (a/b));
        System.out.println("Sisa hasil bagi bil 1 dibagi bil 2 adalah " + (a%b));
    }
    public static void main(String[] args) {
        Scanner mahal = new Scanner(System.in);
        System.out.print("Masukkan bilagan pertama = ");
        int bil1 = mahal.nextInt();
        System.out.print("Masukkan bilangan kedua = ");
        int bil2 = mahal.nextInt();
        kalkulator(bil1,bil2);
        
    }
    
}
