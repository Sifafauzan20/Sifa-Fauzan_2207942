package com.mycompany.mavenproject1;
import java.util.Scanner;

public class Pecahan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
  
        System.out.println("Masukkan tiga bilangan pecahan negatif (-0.5):");
        float pecahan1 = input.nextFloat();
        float pecahan2 = input.nextFloat();
        float pecahan3 = input.nextFloat();
        
        float penjumlahan = pecahan1 + pecahan2 + pecahan3;
        System.out.println("Hasil penjumlahan: " + penjumlahan);
        
        float pengurangan = pecahan1 - pecahan2 - pecahan3;
        System.out.println("Hasil pengurangan: " + pengurangan);
        
        float perkalian = pecahan1 * pecahan2 * pecahan3;
        System.out.println("Hasil perkalian: " + perkalian);
        
        float pembagian = pecahan1 / pecahan2 / pecahan3;
        System.out.println("Hasil pembagian: " + pembagian);
      
        input.close();
    }
}
