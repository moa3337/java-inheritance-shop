package org.learning.java.shop;

class Smartphone extends Prodotto {
    private String imei;
    private int memoria;

    public Smartphone(String nome, String descrizione, double prezzo, double iva, String imei, int memoria) {
        super(nome, descrizione, prezzo, iva);
        this.imei = imei;
        this.memoria = Integer.parseInt(String.valueOf(memoria));
    }

    @Override
    public String toString() {
        // Trasformo "smartphone" in stringa
        return super.toString()
                + "IMEI: " + imei + "\n"
                + "Memoria: " + memoria + "GB\n";
    }
}
