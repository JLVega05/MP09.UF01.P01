package jairon.vega.compteenrere;

public class CompteEnrere extends Thread {
    private String identificador;
    private int inici;

    public CompteEnrere(String identificador, int inici) {
        this.identificador = identificador;
        this.inici = inici;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getInici() {
        return inici;
    }

    public void setInici(int inici) {
        this.inici = inici;
    }

    @Override
    public String toString() {
        return "( Identificador: " + identificador + " Inici= " + inici + " )";
    }

    @Override
    public void run() {
        iniciarCompteEnrere();
    }

    private void iniciarCompteEnrere() {
        int comptador = inici;
        while (comptador > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
            System.out.println(this + " - Comptador: " + comptador);
            comptador--;
        }
    }
}

