import java.util.Random;

/**
 * Classe che rappresenta un prodotto di uno shop online.
 * Questa classe contiene tutte le informazioni necessarie per gestire un prodotto.
 * 
 * @author Studente
 * @version 1.0
 */
public class Prodotto {
    
    // ATTRIBUTI PRIVATI (variabili di istanza)
    // Questi attributi sono privati per rispettare il principio di incapsulamento
    // Possono essere acceduti solo attraverso i metodi getter e setter
    
    /**
      * Codice identificativo del prodotto (numero intero)
      * Viene generato automaticamente in modo casuale alla creazione del prodotto
      * Esempio: 12345
      */
     private int codice;
     
     /**
      * Generatore di numeri casuali per creare il codice del prodotto
      * È statico perché condiviso da tutti gli oggetti della classe
      */
     private static Random random = new Random();
    
    /**
     * Nome del prodotto (stringa di testo)
     * Esempio: "Smartphone Samsung"
     */
    private String nome;
    
    /**
     * Descrizione dettagliata del prodotto (stringa di testo)
     * Esempio: "Smartphone con fotocamera da 64MP e batteria da 4000mAh"
     */
    private String descrizione;
    
    /**
     * Prezzo del prodotto in euro (numero decimale)
     * Esempio: 299.99
     */
    private double prezzo;
    
    /**
     * Percentuale IVA applicata al prodotto (numero decimale)
     * Esempio: 22.0 (che significa 22%)
     */
    private double iva;
    
    // COSTRUTTORE
    // Il costruttore è un metodo speciale che viene chiamato quando creiamo un nuovo oggetto
    // Serve per inizializzare tutti gli attributi dell'oggetto
    
    /**
      * Costruttore della classe Prodotto.
      * Crea un nuovo prodotto con i parametri specificati.
      * Il codice viene generato automaticamente in modo casuale.
      * 
      * @param nome il nome del prodotto
      * @param descrizione la descrizione del prodotto
      * @param prezzo il prezzo del prodotto in euro
      * @param iva la percentuale di IVA (esempio: 22.0 per 22%)
      */
     public Prodotto(String nome, String descrizione, double prezzo, double iva) {
         // Generiamo automaticamente un codice casuale tra 0 e 99999
         this.codice = random.nextInt(100000);
         
         // La parola chiave "this" si riferisce all'oggetto corrente
         // Assegniamo i valori passati come parametri agli attributi dell'oggetto
         this.nome = nome;
         this.descrizione = descrizione;
         this.prezzo = prezzo;
         this.iva = iva;
     }
    
    // METODI GETTER
    // I metodi getter servono per "leggere" il valore degli attributi privati
    // Sono necessari perché gli attributi sono privati e non accessibili dall'esterno
    
    /**
     * Restituisce il codice del prodotto.
     * @return il codice identificativo del prodotto
     */
    public int getCodice() {
        return codice; // Restituisce il valore dell'attributo codice
    }
    
    /**
     * Restituisce il nome del prodotto.
     * @return il nome del prodotto
     */
    public String getNome() {
        return nome; // Restituisce il valore dell'attributo nome
    }
    
    /**
     * Restituisce la descrizione del prodotto.
     * @return la descrizione del prodotto
     */
    public String getDescrizione() {
        return descrizione; // Restituisce il valore dell'attributo descrizione
    }
    
    /**
     * Restituisce il prezzo del prodotto.
     * @return il prezzo del prodotto in euro
     */
    public double getPrezzo() {
        return prezzo; // Restituisce il valore dell'attributo prezzo
    }
    
    /**
     * Restituisce la percentuale di IVA del prodotto.
     * @return la percentuale di IVA (esempio: 22.0 per 22%)
     */
    public double getIva() {
        return iva; // Restituisce il valore dell'attributo iva
    }
    
    // METODI DI UTILITÀ
    // Questi metodi forniscono funzionalità aggiuntive per calcolare prezzi e informazioni
    
    /**
     * Restituisce il prezzo base del prodotto (senza IVA).
     * Questo metodo è utile quando si vuole ottenere il prezzo originale del prodotto
     * prima dell'applicazione dell'IVA.
     * 
     * @return il prezzo base del prodotto in euro (senza IVA)
     */
    public double getPrezzoBase() {
        return prezzo; // Il prezzo base corrisponde al prezzo memorizzato (senza IVA)
    }
    
    /**
     * Restituisce il prezzo del prodotto comprensivo di IVA.
     * Questo metodo calcola automaticamente il prezzo finale che il cliente dovrà pagare,
     * aggiungendo l'IVA al prezzo base.
     * 
     * Formula: prezzo base + (prezzo base * percentuale IVA / 100)
     * Esempio: se prezzo base = 100€ e IVA = 22%, il prezzo finale sarà 122€
     * 
     * @return il prezzo del prodotto con IVA inclusa in euro
     */
    public double getPrezzoConIva() {
        // Calcola l'importo dell'IVA: prezzo base * percentuale IVA / 100
        double importoIva = prezzo * iva / 100;
        
        // Restituisce il prezzo base + l'importo dell'IVA
        return prezzo + importoIva;
    }
    
    /**
     * Restituisce il nome esteso del prodotto.
     * Il nome esteso è formato dalla concatenazione del codice e del nome del prodotto,
     * separati da un trattino (formato: "codice-nome").
     * 
     * Esempio: se codice = 12345 e nome = "Smartphone", 
     * il nome esteso sarà "12345-Smartphone"
     * 
     * @return il nome esteso del prodotto nel formato "codice-nome"
     */
    public String getNomeEsteso() {
        // Concatena il codice, un trattino e il nome del prodotto
        return codice + "-" + nome;
    }
    
    // METODI SETTER
    // I metodi setter servono per "modificare" il valore degli attributi privati
    // Permettono di cambiare i valori degli attributi dopo che l'oggetto è stato creato
    
    /**
     * Modifica il codice del prodotto.
     * @param codice il nuovo codice da assegnare al prodotto
     */
    public void setCodice(int codice) {
        this.codice = codice; // Assegna il nuovo valore all'attributo codice
    }
    
    /**
     * Modifica il nome del prodotto.
     * @param nome il nuovo nome da assegnare al prodotto
     */
    public void setNome(String nome) {
        this.nome = nome; // Assegna il nuovo valore all'attributo nome
    }
    
    /**
     * Modifica la descrizione del prodotto.
     * @param descrizione la nuova descrizione da assegnare al prodotto
     */
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione; // Assegna il nuovo valore all'attributo descrizione
    }
    
    /**
     * Modifica il prezzo del prodotto.
     * @param prezzo il nuovo prezzo da assegnare al prodotto
     */
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo; // Assegna il nuovo valore all'attributo prezzo
    }
    
    /**
     * Modifica la percentuale di IVA del prodotto.
     * @param iva la nuova percentuale di IVA da assegnare al prodotto
     */
    public void setIva(double iva) {
        this.iva = iva; // Assegna il nuovo valore all'attributo iva
    }
    
    // METODO TOSTRING
    // Questo metodo speciale serve per convertire l'oggetto in una stringa di testo
    // È molto utile per stampare le informazioni dell'oggetto o per il debug
    
    /**
     * Restituisce una rappresentazione testuale del prodotto.
     * Questo metodo è utile per stampare tutte le informazioni del prodotto in una volta.
     * 
     * @return una stringa che contiene tutte le informazioni del prodotto
     */
    @Override // Questa annotazione indica che stiamo sovrascrivendo un metodo della classe Object
    public String toString() {
        // Costruiamo una stringa che contiene tutti gli attributi del prodotto
        // Il simbolo + serve per concatenare (unire) le stringhe
        return "Prodotto{" +
                "codice=" + codice +
                ", nome='" + nome + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                ", iva=" + iva +
                "}";
    }
}