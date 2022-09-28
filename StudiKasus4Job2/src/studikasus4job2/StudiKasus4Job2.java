package studikasus4job2;

import java.util.Scanner;

public class StudiKasus4Job2 {

    public static void main(String[] args) {
        final int tarif1 = 15000;
        final int tarif2 = 10000;
        int totalkg, harga;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Banyak barang yang dikirim (kg) = ");
        totalkg = input.nextInt();
        harga =  tarif1 + ((totalkg-1)*tarif2);
        System.out.print("Harga = " + harga);
    }
    
}
