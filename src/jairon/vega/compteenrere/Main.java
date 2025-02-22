package jairon.vega.compteenrere;

public class Main {
    public static void main(String[] args) {
        CompteEnrere c1 = new CompteEnrere("C1", 7);
        CompteEnrere c2 = new CompteEnrere("C2", 9);
        CompteEnrere c3 = new CompteEnrere("C3", 3);
        CompteEnrere c4 = new CompteEnrere("C4", 12);
        CompteEnrere c5 = new CompteEnrere("C5", 3);
        CompteEnrere c6 = new CompteEnrere("C6", 8);

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
    }
}

