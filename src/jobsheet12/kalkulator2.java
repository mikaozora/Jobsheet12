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
public class kalkulator2 {
    
    public static void penjumlahan(int a, int b){
        System.out.println("Penjumlahan = "+(a+b));
}
    public static void pengurangan(int a, int b){
        System.out.println("Pengurangan = "+(a-b));
    }
    public static void perkalian(int a, int b){
        System.out.println("Perkalian = "+(a*b)); 
    }
    public static void pembagian(double a, double b){
        System.out.println("Pembagian = "+(a/b));
    }
    public static void sisahasilbagi(double a, double b){
        if(a>b){
            System.out.println("Sisa hasil bagi = "+(a%b));
        }else if(a<b){
            System.out.println("Sisa hasil bagi = Tidak ada sisa hasil bagi");
        }
    }
    public static void main(String[] args) {
        System.out.println("=========Kalkulator Sederhana========");
        Scanner mahal = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama = ");
        int bil1 = mahal.nextInt();
        System.out.print("Masukkan bilangan kedua = ");
        int bil2 = mahal.nextInt();
        penjumlahan(bil1,bil2);
        pengurangan(bil1,bil2);
        perkalian(bil1,bil2);
        pembagian(bil1,bil2);
        sisahasilbagi(bil1,bil2);
        
    }
}
