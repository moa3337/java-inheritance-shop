package org.learning.java.shop;

import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;
public class Carrello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Prodotto> carrello = new ArrayList<>();

        System.out.println("Ecco il tuo carrello");

        // Ciclo per inserire i prodotti all'interno del carrello
        while (true) {
            System.out.println("Vuoi inserire: 1 = Smartphone, 2 = Televisore, 3 = Cuffie, 0 = Esci:");
            int scelta = scanner.nextInt();

            if (scelta == 0) {
                // Break per uscire dal ciclo di inserimento
                break;
            }

            // Richiesta informazioni prodotto
            System.out.println("Inserisci il nome del prodotto");
            String nome = scanner.next();

            System.out.println("Inserisci la descrizione del prodotto");
            String descrizione = scanner.next();

            System.out.println("Inserisci il prezzo del prodotto");
            double prezzo = scanner.nextDouble();

            System.out.println("Inserisci l'iva del prodotto");
            double iva = scanner.nextDouble();

            // Creazione del prodotto inserito dall'utente
            switch (scelta) {
                // Smartphone
                case 1: System.out.println("inserishi l'IMEI smartphone");
                        String imei = scanner.next();

                        System.out.println("inserishi memoria smartphone");
                        String memoria = scanner.next();

                        Smartphone smartphone = new Smartphone(nome, descrizione, prezzo, iva, imei, memoria);
                        carrello.add(smartphone);
                        break;

                // Televisore
                case 2: System.out.println("Inserisci dimensione televisore");
                        String dimensioni = scanner.next();

                        System.out.println("E' uno smartTV? (SI/NO):");
                        boolean isSmart = scanner.nextBoolean();

                        Televisore televisore = new Televisore(nome, descrizione, prezzo, iva, dimensioni, isSmart);
                        carrello.add(televisore);
                        break;

                // Cuffie
                case 3: System.out.println("Inserisci colore cuffie");
                        String colore = scanner.next();

                        System.out.println("Sono wireless? (SI/NO):");
                        boolean isWireless = scanner.nextBoolean();

                        Cuffie cuffie = new Cuffie(nome, descrizione, prezzo, iva, colore,isWireless);
                        carrello.add(cuffie);
                        break;

                default: System.out.println("Scelta non valida! Riprova.");
                break;
            }
        }
    }
}
