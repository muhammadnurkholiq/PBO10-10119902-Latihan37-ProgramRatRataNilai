/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10.pkg10119902.latihan37.programratratanilai;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA    : Muhammad Nurkholiq
 * KELAS   : PBO10K
 * NIM     : 10119902
 * Deskripsi Program : Program Ini Berisi Program Untuk Menampilkan Program Rata Rata Nilai
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RataRata mhs = new RataRata();
        double nilaiMahasiswa, ratarata;
        double totalNilai = 0;
        double jumlahMahasiswa = mhs.getBanyak_mahasiswa();

        for (int i =1; i <= jumlahMahasiswa; i++) {
            nilaiMahasiswa = mhs.getNilai(i);
            totalNilai += nilaiMahasiswa;
        }
        ratarata = totalNilai / jumlahMahasiswa;
        System.out.printf("%nMaka, rata-rata nilainya adalah : %1$.1f%n",ratarata);
        System.out.println("Developed by : Muhammad Nurkholiq");
    }
}

