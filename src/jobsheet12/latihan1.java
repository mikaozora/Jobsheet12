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
public class latihan1 {
    public static void hitung(int a, int b){
        System.out.println("Hasil : " + (a+b));
    }
    public static void main(String[] args) {
        Scanner mahal = new Scanner(System.in);
        System.out.print("Masukkan bilangan 1 : " );
        int bil1 = mahal.nextInt();
        System.out.print("Masukkan bilangan 2 : ");
        int bil2 = mahal.nextInt();
        hitung(bil1, bil2);
    }
    
}
