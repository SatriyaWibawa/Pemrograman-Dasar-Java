package studikasus5job2;

import java.util.Scanner;

public class StudiKasus5Job2 {

    public static void main(String[] args) {
        double berat, jumlahBeli, kopiPerKilo, total, totalBerat;
        final double pajak = 0.1;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Berat Kotak (kg) = ");
        berat = input.nextDouble();
        System.out.print("Jumlah Pembelian Kotak = ");
        jumlahBeli = input.nextDouble();
        totalBerat = berat*jumlahBeli;
        System.out.println("Total Berat = " + totalBerat);
        System.out.print("Harga Kopi per Kilo = ");
        kopiPerKilo = input.nextDouble();
        total = kopiPerKilo*totalBerat;
        System.out.print("Total Pembayaran (termasuk pajak) = " + total*pajak);
        
        
        
    }
    
}
