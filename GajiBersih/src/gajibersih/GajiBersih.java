
package gajibersih;

import java.util.Scanner;


public class GajiBersih {

    
    public static void main(String[] args) {
        double gajiKotor, gajiBersih, gajiPokok, tunjangan, gajiLembur, hasilPajak;
        final double pajak = 0.05;
        String nama;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama : ");
        nama = input.nextLine();
        System.out.println("Masukkan Gaji Pokok : ");
        gajiPokok = input.nextDouble();
        System.out.println("Masukkan Tunjangan : ");
        tunjangan = input.nextDouble();
        System.out.println("Masukkan Gaji Lembur : ");
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
