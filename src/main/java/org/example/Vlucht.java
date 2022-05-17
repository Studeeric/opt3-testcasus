package org.example;

public class Vlucht {
    int gewicht;
    int passagiers;
    boolean baggage;
    boolean nederlands;

    public Vlucht(int gewicht, int passagiers, boolean baggage, boolean nederlands) {
        this.gewicht = gewicht;
        this.passagiers = passagiers;
        this.baggage = baggage;
        this.nederlands = nederlands;
    }

    public int getGewicht(){
        return this.gewicht;
    }

    public int getPassagiers(){
        return this.passagiers;
    }

    public boolean heeftBaggage(){
        return baggage;
    }

    public boolean isNederlands(){
        return nederlands;
    }
}
