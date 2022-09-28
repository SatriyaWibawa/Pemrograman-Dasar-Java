package studikasus2job2;

import java.util.Scanner;

public class StudiKasus2Job2 {

    public static void main(String[] args) {
        double luasLingkaran, kelilingLingkaran, luasSegitiga, kelilingSegitiga, volumeTabung;
        double r1, r2, r3, alas, tinggi, a, b, c, tinggi2;
        final double phi = 3.14;
        
        Scanner input = new Scanner(System.in);
        System.out.println("PERHITUNGAN BANGUN RUANG");
        System.out.println("Luas Lingkaran");
        System.out.print("Jari jari = ");
        r1 = input.nextDouble();
        luasLingkaran = phi*r1*r1;
        System.out.println("Hasil Luas Lingkaran = " + luasLingkaran);
        System.out.println("   ");
        System.out.println("Keliling Lingkaran");
        System.out.print("Jari jari = ");
        r2 = input.nextDouble();
        kelilingLingkaran = 2*phi*r2;
        System.out.println("Hasil Keliling Lingkaran = " + kelilingLingkaran);
        System.out.println("    ");
        System.out.println("Luas Segitiga");
        System.out.print("Alas = ");
        alas = input.nextDouble();
        System.out.print("Tinggi = ");
        tinggi = input.nextDouble();
        luasSegitiga = 0.5*alas*tinggi;
        System.out.println("Hasil Luas Segitiga = " + luasSegitiga);
        System.out.println("     ");
        System.out.println("Keliling Segitiga");
        System.out.print("Sisi A = ");
        a = input.nextDouble();
        System.out.print("Sisi B = ");
        b = input.nextDouble();
        System.out.print("Sisi C = ");
        c = input.nextDouble();
        kelilingSegitiga = a+b+c;
        System.out.println("Hasil Keliling Segitiga = " + kelilingSegitiga);
        System.out.println("    ");
        System.out.println("Volume Tabung = ");
        System.out.print("Jari jari = ");
         r3 = input.nextDouble();
        System.out.print("Tinggi = ");
        tinggi2 = input.nextDouble();
        volumeTabung = phi*r3*r3*tinggi2;
        System.out.print("Hasil Volume Tabung = " + volumeTabung);
        
        
    }
    
}
