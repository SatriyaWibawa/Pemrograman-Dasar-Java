
package hargahandphone;

import java.util.Scanner;


public class HargaHandphone {


    public static void main(String[] args) {
        String merekHp, tipeHp, warnaHp;
        double hargaHape, hargaDiskon, totalHarga;
        final double diskon = 0.2;
        
       
        
        
        Scanner input = new Scanner(System.in);
        System.out.print("Merek Handphone = ");
        merekHp = input.nextLine();
        System.out.print("Tipe Handphone = ");
        tipeHp = input.nextLine();
        System.out.print("Warna Handphone = ");
        warnaHp = input.nextLine();
        System.out.print("Harga Handphone = ");
        hargaHape = input.nextDouble();
        System.out.println("Merek Handphone = " + merekHp);
        System.out.println("Tipe Handphone = " + tipeHp);
        System.out.println("Warna Handphone = " + warnaHp);
        hargaDiskon = hargaHape*diskon;
        System.out.println("Harga Diskon Handphone = " + hargaDiskon);
        totalHarga = hargaHape-hargaDiskon;
        System.out.print("Harga Handphone setelah Diskon = " + totalHarga);
        
        
    }
    
}
