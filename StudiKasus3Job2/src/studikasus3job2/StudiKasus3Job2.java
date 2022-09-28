package studikasus3job2;

import java.util.Scanner;

public class StudiKasus3Job2 {

    public static void main(String[] args) {
        double totalBelanja, hargaBarang, jumlahBarang, kembalian, nominalUang;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Harga Barang = ");
        hargaBarang = input.nextDouble();
        System.out.print("Jumlah Barang = ");
        jumlahBarang = input.nextDouble();
        totalBelanja = hargaBarang*jumlahBarang;
        System.out.println("Total Harga = " + totalBelanja);
        System.out.print("Nominal Uang = ");
        nominalUang = input.nextDouble();
        kembalian = nominalUang-totalBelanja;
        System.out.println("Kembalian = " + kembalian);
        
    }
    
}
