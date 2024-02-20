package com.mycompany.mavenproject1;
import java.util.Scanner;

public class Nikah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah tabungan Anda (per jutaan) : ");
        double tabungan = scanner.nextDouble();
        System.out.print("Apakah Anda memiliki calon pasangan? (true/false): ");
        boolean calonPasangan = scanner.nextBoolean();

        if (tabungan > 100 && calonPasangan) {
            System.out.println("Anda siap untuk menikah!");
        } else {
            System.out.println("Anda belum siap untuk menikah.");
        }

        scanner.close();
    }
}
