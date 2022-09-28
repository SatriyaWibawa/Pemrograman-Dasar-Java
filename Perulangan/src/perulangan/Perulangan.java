
package perulangan;

import java.util.Scanner;


public class Perulangan {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int ulang = input.nextInt();
        
        for(int i=1; i<ulang; i++){
            System.out.println("Perulagan ke " + i);
        }
        
    }
}
