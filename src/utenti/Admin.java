package utenti;

import java.util.ArrayList;
import java.util.Arrays;

public class Admin extends Utente {
    public Admin(String username, String email) {
        super(username, email);
    }

    @Override
    public ArrayList<String> getPermessi() {
        return new ArrayList<>(Arrays.asList("READ", "WRITE", "DELETE"));
    }
}