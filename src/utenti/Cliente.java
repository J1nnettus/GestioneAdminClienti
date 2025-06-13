package utenti;

import java.util.ArrayList;
import java.util.Arrays;

public class Cliente extends Utente {
    public Cliente(String username, String email) {
        super(username, email);
    }

    @Override
    public ArrayList<String> getPermessi() {
        return new ArrayList<>(Arrays.asList("READ"));
    }
}