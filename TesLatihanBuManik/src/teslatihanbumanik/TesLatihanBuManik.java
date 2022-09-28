
package teslatihanbumanik;

import java.util.Scanner;


public class TesLatihanBuManik {


    public static void main(String[] args) {
        double tunjangan, pajak, gajiPokok, gajiBersih;
        
        Scanner input = new Scanner(System.in);
        
        
        
        gajiPokok = 2000000;
        tunjangan = gajiPokok*0.20;
        pajak = gajiPokok+tunjangan*0.15;
        
        System.out.println("Tunjangan = " + gajiPokok + " * 0.20 =" + tunjangan);
        System.out.println("Total Tunjangan  = " + tunjangan);
        System.out.println("Pajak = " + gajiPokok + " + " + tunjangan + " * 0.15 =" + pajak);
        System.out.println("Total Pajak = " + pajak);
        
        gajiBersih = gajiPokok + tunjangan - pajak;
        System.out.println("Jadi, Jumlah Gaji Bersih adalah = " + gajiPokok + " + " + tunjangan + " - " + pajak + " = " + gajiBersih);
        
        //SPONTAN UHUY
        
        
    }
    
}
