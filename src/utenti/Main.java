package utenti;

public class Main {
    public static void main(String[] args) {
        // creazione della gestione utenti
        GestioneUtenti gestioneUtenti = new GestioneUtenti();

        // creazione di 2 utenti admin
        Utente admin1 = new Admin("adminrosso", "admin@rosso.it");
        Utente admin2 = new Admin("adminazzurro", "admin@azzurro.it");

        // creazione di 2 utenti cliente
        Utente cliente1 = new Cliente("pippo", "pippo@example.com");
        Utente cliente2 = new Cliente("prospero", "prospero@example.com");

        // aggiunta degli utenti al sistema
        gestioneUtenti.aggiungiUtente(admin1);
        gestioneUtenti.aggiungiUtente(admin2);
        gestioneUtenti.aggiungiUtente(cliente1);
        gestioneUtenti.aggiungiUtente(cliente2);

        // stampa info e permessi
        System.out.println("Informazioni e permessi degli utenti:");
        gestioneUtenti.stampaPermessi();
    }
}