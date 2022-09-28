/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitunggajibersih;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class HitungGajiBersih {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double gajiKotor, gajiBersih, gajiPokok, tunjangan, gajiLembur, hasilPajak;
        final double pajak = 0.05;
        String nama;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukkan Gaji Pokok : ");
        gajiPokok = input.nextDouble();
        System.out.print("Masukkan Tunjangan : ");
        tunjangan = input.nextDouble();
        System.out.print("Masukkan Gaji Lembur : ");
        gajiLembur = input.nextDouble();
        
        gajiKotor = gajiPokok + tunjangan + gajiLembur;
        hasilPajak = pajak * gajiKotor;
        gajiBersih = gajiKotor - hasilPajak;
        
        System.out.println("Nama : " + nama);
        System.out.println("Gaji Kotor : " + gajiKotor);
        System.out.println("Pajak : " + hasilPajak);
        System.out.println("Gaji Bersih : " + gajiBersih);
        
        
        
    }
    
}
