package org.example;

public class Main {
    public static void main(String[] args){
    }

    public static boolean magVliegen(boolean toestemming, int gewicht, int tegenwind){
        return toestemming && (gewicht < 1000 || tegenwind > 50);
    }

    public static double landPrijs(Vlucht vlucht){
        double prijs = 0;
        prijs += gewichtPrijs(vlucht);
        prijs *= (double) passagiersPrijs(vlucht) / 100;
        prijs += baggagePrijs(vlucht);
        prijs *= (double) nederlandsPrijs(vlucht) / 100;
        return prijs;
    }

    public static int gewichtPrijs(Vlucht vlucht){
        int gewicht = vlucht.getGewicht();
        if (gewicht < 1000){
            return 100;
        } else if (gewicht < 5000) {
            return 500;
        } else {
            return 2500;
        }
    }

    public static int passagiersPrijs(Vlucht vlucht){
        if (vlucht.getPassagiers() > 2 ){
            return 150;
        } else {
            return 100;
        }
    }

    public static int baggagePrijs(Vlucht vlucht){
        if (vlucht.heeftBaggage()){
            return 800;
        } else {
            return 0;
        }
    }

    public static int nederlandsPrijs(Vlucht vlucht){
        if (vlucht.isNederlands()){
            return 121;
        } else {
            return 100;
        }
    }
}