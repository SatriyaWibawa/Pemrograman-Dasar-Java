
package biayawartel;


public class BiayaWartel {

    public static void main(String[] args) {
        float pulsaPerDetik, totalPulsa, totalBiaya, lamaMenelpon;
        final float sambunganLokal = 100;
        
        pulsaPerDetik = 30;
        lamaMenelpon = 1000;
        totalPulsa = lamaMenelpon/pulsaPerDetik;
        totalBiaya = totalPulsa*sambunganLokal;
        
        System.out.print("Total Pulsa = " + "Lama Menelpon " + lamaMenelpon + " / " + " Pulsa Per Detik " + pulsaPerDetik + " = ");
        System.out.println(totalPulsa);
        
        System.out.print("Total Biaya = " + "Total Pulsa " + totalPulsa + " * " + "Sambungan Pulsa " + sambunganLokal + " =");
        System.out.print(totalBiaya);
    }
    
}
