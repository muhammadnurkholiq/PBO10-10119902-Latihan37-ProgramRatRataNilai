/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10.pkg10119902.latihan37.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author korik
 */
class RataRata {
    Scanner scanner = new Scanner(System.in);
    private int nilai, banyak_mahasiswa, ratarata, totalnilai;

    public double getBanyak_mahasiswa() {
        System.out.print("Masukkan Banyaknya Mahasiswa\t: ");
        return banyak_mahasiswa = scanner.nextInt();
    }

    public double getNilai(int jumlah) {
        System.out.printf("Nilai Mahasiswa ke-%d\t\t: ",jumlah);
        return nilai = scanner.nextInt();
    }
}