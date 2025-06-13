package utenti;

import java.util.ArrayList;

public class GestioneUtenti {
    private ArrayList<Utente> utenti;

    // costruttore
    public GestioneUtenti() {
        utenti = new ArrayList<>();
    }

    // metodo per aggiungere un utente
    public void aggiungiUtente(Utente u) {
        utenti.add(u);
    }

    // metodo per stampare informazioni e permessi di tutti gli utenti
    public void stampaPermessi() {
        for (Utente utente : utenti) {
            utente.stampaInfo();
            System.out.println("Permessi: " + utente.getPermessi());
        }
    }
}