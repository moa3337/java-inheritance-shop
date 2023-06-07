package org.learning.java.shop;

import java.util.Random;

public class Prodotto {
    private final int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;

    // Costruttore per creare proddo con codice in modo random
    public Prodotto(String nome, String descrizione, double prezzo, double iva) {
        this.codice = generaNuovoCodice();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    //public Prodotto(int codice) {
        //this.codice = codice;
    //}

    // Metodo privato per generare un codice casuale
    private int generaNuovoCodice() {
        Random random = new Random();
        return (int) (Math.random() * 1000);
    }

    // Metodo getter per ottenere il codice del prodotto
    public int getCodice() {
        return codice;
    }

    // Metodo getter/setter per gli attributi del prodotto
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    // Metodo per ottenere il prezzo in base al prodotto
    public double getPrezzoBase() {
        return prezzo;
    }

    // Metodo per ottenere il prezzo con iva
    public double getPrezzoIva() {
        return prezzo + (prezzo * iva);
    }

    // Metodo per ottenere il nome intero del prodotto
    public String getNomeIntero() {
        return codice + "-" + nome;
    }

    @Override
    public String toString() {
        // // Trasformo "prodotto" in stringa
        return "Codice: " + codice + "\n"
                + "Nme: " + nome + "\n"
                + "Descrizione: " + descrizione + "\n"
                + "Prezzo: " + prezzo + "\n"
                + "Iva: " + iva + "\n";
    }

}
