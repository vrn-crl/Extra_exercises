package ires.corso.parttwo.cellulare;

/*Progettare una classe di nome Cellulare, per rappresentare un telefono cellulare
        con contratto a ricarica.
        Tale classe prevede due variabili d'istanza. La prima variabile d'istanza e'
        definita come private double carica, e rappresenta il quantitativo di euro
        disponibile per le chiamate. La seconda variabile d'istanza e' definita come
private int numeroChiamate, e rappresenta il numero di chiamate effettuate con
        il cellulare. La classe deve implementare un costruttore public Cellulare(double
        unaCarica), che prende come parametro esplicito la quantita' di euro della
        ricarica iniziale. La classe deve inoltre implementare i seguenti metodi. Un
        metodo definito come public void ricarica(double unaRicarica), che ricarica il
        telefonino. Un metodo definito come public void chiama(double minutiDurata), che
        effettua una chiamata di durata in minuti specificata dal parametro esplicito.
        Tale metodo dovra' aggiornare la carica disponibile, ed incrementare la memoria
        contenente il numero di chiamate effettuate dal telefonino. Si assuma un costo
        di 0.20 euro per ogni minuto di chiamata. Un metodo public double numero404(),
        che restituisce il valore della carica disponibile. Un metodo public int
        getNumeroChiamate(), che restituisce il valore della variabile d'istanza
        numeroChiamate. Infine, un metodo public void azzeraChiamate(), che azzera la
        variabile contenente il numero di chiamate effettuate dal telefonino.*/

public class Cellulare {

    private double credito;
    private int numeroChiamate;

    public Cellulare (double creditoIniziale, int numInizialeChiamate){
        credito = creditoIniziale;
        numeroChiamate = numInizialeChiamate;
    }

    public void ricarica(double unaRicarica){
        credito = credito + unaRicarica;
    }

    public void chiama(double minutiDurata){
        numeroChiamate = numeroChiamate+1;
        credito = credito - (minutiDurata * 0.20);
    }

    public double numero404(){
        return credito;
    }

    public int getNumeroChiamate(){
        return numeroChiamate;
    }

    public void azzeraChiamate(){
        numeroChiamate = 0;
    }
}
