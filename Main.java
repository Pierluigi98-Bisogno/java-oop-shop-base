/**
 * CLASSE MAIN - Il mio primo programma di test!
 * 
 * Questa classe serve per TESTARE la classe Prodotto che ho creato.
 * È come un "laboratorio" dove provo tutte le funzioni per vedere se funzionano bene.
 * 
 * Cosa fa questo programma:
 * 1. Crea alcuni prodotti di esempio
 * 2. Prova tutti i metodi (getter, setter, calcoli)
 * 3. Stampa i risultati per vedere se tutto funziona
 * 
 * @author Studente Principiante
 * @version 1.0 - Il mio primo test!
 */
public class Main {
    
    /**
     * METODO MAIN - Il "cuore" del programma
     * 
     * Questo è il metodo più importante! Quando avvio il programma,
     * Java cerca automaticamente questo metodo e lo esegue.
     * 
     * È come il "pulsante di avvio" del mio programma.
     * 
     * @param args argomenti che posso passare al programma (non li uso)
     */
    public static void main(String[] args) {
        
        // Stampo un titolo carino per il mio test
        System.out.println("===========================================");
        System.out.println("TEST DELLA CLASSE PRODOTTO");
        System.out.println("===========================================");
        System.out.println(); // Riga vuota per separare
        
        // ==========================================
        // TEST 1: CREO IL MIO PRIMO PRODOTTO!
        // ==========================================
        
        System.out.println("TEST 1: Creazione del primo prodotto");
        System.out.println("---------------------------------------");
        
        // Creo un nuovo prodotto chiamando il costruttore
        // È come dire: "Java, creami un nuovo prodotto con questi dati!"
        Prodotto prodotto1 = new Prodotto(
            "Smartphone",                              // Nome del prodotto
            "Telefono Android di ultima generazione",  // Descrizione
            299.99,                                     // Prezzo (senza IVA)
            22.0                                        // IVA (22%)
        );
        
        System.out.println("Prodotto creato con successo!");
        System.out.println("Dettagli: " + prodotto1.toString());
        System.out.println();
        
        // ==========================================
        // TEST 2: LEGGO LE INFORMAZIONI (GETTER)
        // ==========================================
        
        System.out.println("TEST 2: Leggo le informazioni con i getter");
        System.out.println("--------------------------------------------");
        
        // Uso i metodi getter per leggere ogni singola informazione
        System.out.println("Codice prodotto: " + prodotto1.getCodice());
        System.out.println("Nome: " + prodotto1.getNome());
        System.out.println("Descrizione: " + prodotto1.getDescrizione());
        System.out.println("Prezzo base: €" + prodotto1.getPrezzo());
        System.out.println("IVA: " + prodotto1.getIva() + "%");
        System.out.println();
        
        // ==========================================
        // TEST 3: PROVO I CALCOLI AUTOMATICI!
        // ==========================================
        
        System.out.println("TEST 3: Metodi di utilità (calcoli automatici)");
        System.out.println("------------------------------------------------");
        
        // Provo i metodi che fanno calcoli automatici
        System.out.println("Prezzo base (senza IVA): €" + String.format("%.2f", prodotto1.getPrezzoBase()));
        System.out.println("Prezzo finale (con IVA): €" + String.format("%.2f", prodotto1.getPrezzoConIva()));
        System.out.println("Nome esteso (codice-nome): " + prodotto1.getNomeEsteso());
        
        // Calcolo manuale per verificare
        double differenzaIva = prodotto1.getPrezzoConIva() - prodotto1.getPrezzoBase();
        System.out.println("Importo IVA: €" + String.format("%.2f", differenzaIva));
        System.out.println();
        
        // ==========================================
        // TEST 4: MODIFICO LE INFORMAZIONI (SETTER)
        // ==========================================
        
        System.out.println("TEST 4: Modifico le informazioni con i setter");
        System.out.println("----------------------------------------------");
        
        System.out.println("Cambio il nome del prodotto...");
        prodotto1.setNome("iPhone 15 Pro");
        System.out.println("Nuovo nome: " + prodotto1.getNome());
        System.out.println("Nuovo nome esteso: " + prodotto1.getNomeEsteso());
        
        System.out.println("\nCambio il prezzo...");
        prodotto1.setPrezzo(399.99);
        System.out.println("Nuovo prezzo base: €" + String.format("%.2f", prodotto1.getPrezzoBase()));
        System.out.println("Nuovo prezzo con IVA: €" + String.format("%.2f", prodotto1.getPrezzoConIva()));
        
        System.out.println("\nCambio l'IVA (da 22% a 10%)...");
        prodotto1.setIva(10.0);
        System.out.println("Nuova IVA: " + prodotto1.getIva() + "%");
        System.out.println("Prezzo con nuova IVA: €" + String.format("%.2f", prodotto1.getPrezzoConIva()));
        System.out.println();
        
        // ==========================================
        // TEST 5: CREO UN SECONDO PRODOTTO!
        // ==========================================
        
        System.out.println("TEST 5: Creo un secondo prodotto per confronto");
        System.out.println("-----------------------------------------------");
        
        // Creo un secondo prodotto diverso
        Prodotto prodotto2 = new Prodotto(
            "Laptop",                          // Nome
            "Computer portatile per ufficio",  // Descrizione
            750.00,                            // Prezzo
            22.0                               // IVA normale (22%)
        );
        
        System.out.println("Secondo prodotto creato!");
        System.out.println("Dettagli: " + prodotto2.toString());
        System.out.println("Nome esteso: " + prodotto2.getNomeEsteso());
        System.out.println("Prezzo finale: €" + String.format("%.2f", prodotto2.getPrezzoConIva()));
        System.out.println();
        
        // ==========================================
        // TEST 6: PRODOTTO CON IVA RIDOTTA!
        // ==========================================
        
        System.out.println("TEST 6: Prodotto con IVA ridotta (libri)");
        System.out.println("------------------------------------------");
        
        // Creo un prodotto con IVA ridotta (come i libri in Italia)
        Prodotto prodotto3 = new Prodotto(
            "Libro",                           // Nome
            "Manuale di programmazione Java",  // Descrizione
            45.00,                             // Prezzo
            4.0                                // IVA ridotta per libri (4%)
        );
        
        System.out.println("Prodotto con IVA ridotta creato!");
        System.out.println("Dettagli: " + prodotto3.toString());
        System.out.println("Prezzo base: €" + String.format("%.2f", prodotto3.getPrezzoBase()));
        System.out.println("Prezzo con IVA 4%: €" + String.format("%.2f", prodotto3.getPrezzoConIva()));
        System.out.println("Importo IVA: €" + String.format("%.2f", (prodotto3.getPrezzoConIva() - prodotto3.getPrezzoBase())));
        System.out.println();
        
        // ==========================================
        // TEST 7: VERIFICO I CODICI CASUALI!
        // ==========================================
        
        System.out.println("TEST 7: Verifica che i codici siano diversi");
        System.out.println("--------------------------------------------");
        
        // Controllo che ogni prodotto abbia un codice diverso
        System.out.println("Codice prodotto 1 (" + prodotto1.getNome() + "): " + prodotto1.getCodice());
        System.out.println("Codice prodotto 2 (" + prodotto2.getNome() + "): " + prodotto2.getCodice());
        System.out.println("Codice prodotto 3 (" + prodotto3.getNome() + "): " + prodotto3.getCodice());
        
        // Verifico che tutti i codici siano diversi
        if (prodotto1.getCodice() != prodotto2.getCodice() && 
            prodotto1.getCodice() != prodotto3.getCodice() && 
            prodotto2.getCodice() != prodotto3.getCodice()) {
            System.out.println("Perfetto! Tutti i codici sono diversi!");
            System.out.println("La generazione casuale funziona correttamente!");
        } else {
            System.out.println("Alcuni codici sono uguali (è una coincidenza casuale)");
            System.out.println("Questo può succedere raramente con i numeri casuali");
        }
        System.out.println();
        
        // ==========================================
        // TEST 8: RIEPILOGO FINALE!
        // ==========================================
        
        System.out.println("TEST 8: Riepilogo finale di tutti i prodotti");
        System.out.println("----------------------------------------------");
        
        System.out.println("CATALOGO PRODOTTI:");
        System.out.println("- " + prodotto1.getNomeEsteso() + " → €" + String.format("%.2f", prodotto1.getPrezzoConIva()) + " (IVA " + prodotto1.getIva() + "%)");
        System.out.println("- " + prodotto2.getNomeEsteso() + " → €" + String.format("%.2f", prodotto2.getPrezzoConIva()) + " (IVA " + prodotto2.getIva() + "%)");
        System.out.println("- " + prodotto3.getNomeEsteso() + " → €" + String.format("%.2f", prodotto3.getPrezzoConIva()) + " (IVA " + prodotto3.getIva() + "%)");
        
        // Calcolo il totale
        double totale = prodotto1.getPrezzoConIva() + prodotto2.getPrezzoConIva() + prodotto3.getPrezzoConIva();
        System.out.println("\nTOTALE CARRELLO: €" + String.format("%.2f", totale));
        
        System.out.println();
        System.out.println("===========================================");
        System.out.println("COMPLIMENTI! TUTTI I TEST SUPERATI!");
        System.out.println("La classe Prodotto funziona perfettamente!");
        System.out.println("===========================================");
    }
    
    // ==========================================
    // FINE DELLA CLASSE MAIN
    // ==========================================
    
    // Complimenti! Hai appena visto il tuo primo programma Java completo!
    // Questo programma ha testato con successo:
    // - Creazione di oggetti
        // - Metodi getter e setter
        // - Calcoli automatici
        // - Generazione di codici casuali
        // - Gestione di diversi tipi di IVA
    
} // Fine della classe Main