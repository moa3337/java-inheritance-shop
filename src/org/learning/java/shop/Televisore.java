package org.learning.java.shop;

class Televisore extends Prodotto {
    private String dimensioni;
    private boolean isSmart;

    public Televisore(String nome, String descrizione, double prezzo, double iva, String dimensioni, boolean isSmart) {
        super(nome, descrizione, prezzo, iva);
        this.dimensioni = dimensioni;
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        // Trasformo "televisore" in stringa
        return super.toString()
                + "Dimensioni: " + dimensioni + "\n"
                + "Smart: " + (isSmart ? "Si" : "NO") + "\n";
    }
}
