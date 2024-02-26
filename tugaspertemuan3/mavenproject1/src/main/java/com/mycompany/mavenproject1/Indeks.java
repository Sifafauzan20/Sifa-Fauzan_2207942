package com.mycompany.mavenproject1;
import java.util.Scanner;

public class Indeks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai UTS: ");
        double nilaiUTS = scanner.nextDouble();
        
        System.out.print("Masukkan nilai UAS: ");
        double nilaiUAS = scanner.nextDouble();

        System.out.print("Masukkan nilai Tugas: ");
        double nilaiTugas = scanner.nextDouble();

        double nilaiAkhir = 0.35 * nilaiUTS + 0.45 * nilaiUAS + 0.20 * nilaiTugas;

        char nilaiIndeks;
        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            nilaiIndeks = 'A';
        } else if (nilaiAkhir >= 70 && nilaiAkhir < 80) {
            nilaiIndeks = 'B';
        } else if (nilaiAkhir >= 50 && nilaiAkhir < 70) {
            nilaiIndeks = 'C';
        } else {
            nilaiIndeks = 'E';
        }

        System.out.println("Nilai Akhir (NA): " + nilaiAkhir);
        System.out.println("Nilai Indeks: " + nilaiIndeks);

        scanner.close();
    }
}

