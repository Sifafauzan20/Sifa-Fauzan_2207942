package com.mycompany.mavenproject1;
import java.util.Scanner;

public class mobil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah penumpang: ");
        int jumlahPenumpang = scanner.nextInt();

        int jumlahMobil = jumlahPenumpang / 7;
        if (jumlahPenumpang % 7 != 0) {
            jumlahMobil++;
        }

        System.out.println("mobil yang diperlukan: " + jumlahMobil);

        scanner.close();
    }
}
