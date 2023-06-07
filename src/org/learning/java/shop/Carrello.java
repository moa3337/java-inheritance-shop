package org.learning.java.shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ecco il tuo carrello");

        // Creazione dell'array del carrello
        Prodotto[] carrello = new Prodotto[5];
        int indice = 0;

        // Ciclo per inserire i prodotti all'interno del carrello
        while (true) {
            System.out.println("Vuoi inserire: 1 = Smartphone, 2 = Televisore, 3 = Cuffie, 0 = Esci:");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            if (scelta == 0) {
                // Break per uscire dal ciclo di inserimento
                break;
            }

            // Richiesta informazioni prodotto
            System.out.println("Inserisci il nome del prodotto");
            String nome = scanner.nextLine();

            System.out.println("Inserisci la descrizione del prodotto");
            String descrizione = scanner.nextLine();

            System.out.println("Inserisci il prezzo del prodotto");
            double prezzo = scanner.nextDouble();

            System.out.println("Inserisci l'iva del prodotto");
            double iva = scanner.nextDouble();

            scanner.nextLine();

            // Creazione del prodotto inserito dall'utente
            switch (scelta) {
                // Smartphone
                case 1: System.out.println("inserishi l'IMEI smartphone");
                        String imei = scanner.nextLine();

                        System.out.println("inserishi memoria smartphone");
                        int memoria = scanner.nextInt();

                        scanner.nextLine();

                        Smartphone smartphone = new Smartphone(nome, descrizione, prezzo, iva, imei, memoria);
                        carrello[indice] = smartphone;
                        break;

                // Televisore
                case 2: System.out.println("Inserisci dimensione televisore");
                        String dimensioni = scanner.nextLine();

                        System.out.println("E' uno smartTV? (true/false):");
                        boolean isSmart = scanner.nextBoolean();

                        Televisore televisore = new Televisore(nome, descrizione, prezzo, iva, dimensioni, isSmart);
                        carrello[indice] = televisore;
                        break;

                // Cuffie
                case 3: System.out.println("Inserisci colore cuffie");
                        String colore = scanner.nextLine();

                        System.out.println("Sono wireless? (true/false):");
                        boolean isWireless = scanner.nextBoolean();

                        scanner.nextLine();

                        Cuffie cuffie = new Cuffie(nome, descrizione, prezzo, iva, colore,isWireless);
                        carrello[indice] = cuffie;
                        break;

                default: System.out.println("Scelta non valida! Riprova.");
                break;
            }

            indice++;
        }

        // Stampa riepilogo carrello
        System.out.println("\nRiepilogo carrello");
        for (int i = 0; i < indice; i++) {
            System.out.println(carrello[i].toString());
        }
    }
}
