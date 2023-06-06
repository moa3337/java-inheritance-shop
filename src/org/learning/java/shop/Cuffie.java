package org.learning.java.shop;

class Cuffie extends Prodotto {
    private String colore;
    private boolean isWireless;

    public Cuffie(String nome, String descrizione, double prezzo, double iva, String colore, boolean isWireless) {
        super(nome, descrizione, prezzo, iva);
        this.colore = colore;
        this.isWireless = isWireless;
    }

    @Override
    public String toString() {
        // Trasformo "cuffie" in stringa
        return super.toString()
                + "Colore: " + colore + "\n"
                + "Wireless: " + (isWireless ? "Si" : "NO") + "\n";
    }
}
