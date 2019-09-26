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
public class latihan5 {
    public static void hasil(int a, int b, int c){
        if(a > b && a > c){
            System.out.println("Nilai terbesar adalah " +a);
        }else if(b > a && b > c){
            System.out.println("Nilai terbesar adalah "+b);
        }else if(c > a && c > b){
            System.out.println("Nilai terbesar adalah "+c);
            
        }
        
    }
    public static void main(String[] args) {
        Scanner mahal = new Scanner(System.in);
        System.out.print("Masukkan bilangan I = ");
        int x = mahal.nextInt();
        System.out.print("Masukkan bilangan II = ");
        int y = mahal.nextInt();
        System.out.print("Masukkan bilangan III = ");
        int z = mahal.nextInt();
        hasil(x,y,z);
    }
    
}
