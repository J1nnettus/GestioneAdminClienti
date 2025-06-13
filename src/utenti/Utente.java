package utenti;

import java.util.ArrayList;

public abstract class Utente {
    private String username;
    private String email;

    // costruttore
    public Utente(String username, String email) {
        this.username = username;
        this.email = email;
    }

    // metodo astratto per ottenere i permessi
    public abstract ArrayList<String> getPermessi();

    // metodo concreto per stampare le informazioni
    public void stampaInfo() {
        System.out.println("Username: " + username + " - Email: " + email);
    }
}