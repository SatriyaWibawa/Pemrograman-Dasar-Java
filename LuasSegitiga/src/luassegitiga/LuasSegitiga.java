
package luassegitiga;

import java.util.Scanner;


public class LuasSegitiga {


    public static void main(String[] args) {
        String alas, tinggi;
        double luas;
        
        
        
        
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan alas : ");
        alas = input.next();
        System.out.print("Masukkan tinggi : ");
        tinggi  = input.next();
        luas = Double.parseDouble(alas) * Double.parseDouble(tinggi) / 2;
       
        System.out.println("Alas : " + alas + " x " + " Tinggi " + tinggi + "  x  1/2  = "  + luas);
        
        
        
        
        
        
    }
    
}
