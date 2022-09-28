/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pembagian1;

import java.util.Scanner;


public class Pembagian1 {

    public static void main(String[] args) {
        float jumlahSiswa, kelompok, hasil;
        Scanner input = new Scanner(System.in);
        System.out.print("Input jumlah siswa:");
        jumlahSiswa = input.nextInt();
        System.out.print("Input jumlah kelompok:");
        kelompok = input.nextInt();
        hasil = jumlahSiswa/kelompok;
        System.out.println("Jumlah siswa per kelompok " + hasil);
    }
    
}
