package com.mycompany.mavenproject1;

public class ASCII {
    public static void main(String[] args) {
        
        char Karakter1 = 'x';
        char Karakter2 = 'y';

        int ascii1 = (int) Karakter1;
        int ascii2 = (int) Karakter2;

        int ascii_sum = ascii1 + ascii2;

        System.out.printf("Hasil penjumlahan kode ASCII dari '%c'='%d' dan '%c'='%d' adalah: %d\n", Karakter1, ascii1, Karakter2, ascii2, ascii_sum);
    }
}