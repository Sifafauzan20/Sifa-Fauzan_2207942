package com.mycompany.mavenproject1;
import java.util.Scanner;

public class bilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("bilangan - 1: ");
        int bilangan1 = scanner.nextInt();

        System.out.print("bilangan - 2: ");
        int bilangan2 = scanner.nextInt();

        if (bilangan1 % 2 == 0 && bilangan2 % 2 == 0) {
            int hasilPenjumlahan = bilangan1 + bilangan2;
            System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);
        }else if (bilangan1 % 2 != 0 && bilangan2 % 2 != 0) {
            int hasilPerkalian = bilangan1 * bilangan2;
            System.out.println("Hasil perkalian: " + hasilPerkalian);
        }
        else {
            System.out.println("Input dengan 2 bilangan ganjil / 2 bilangan genap");
        }

        scanner.close();
    }
}

