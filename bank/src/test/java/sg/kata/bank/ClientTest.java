package sg.kata.bank;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClientTest {

    @Test //Test Client Releve generation
    public void testApp(){

        Compte verifCompte = new Compte(Compte.CHECKING);

        Client henry = new Client("Henry").ouvrirCompte(verifCompte);

        verifCompte.depot(90.0);
    }

    @Test
    public void testUnCompte(){
        Client oscar = new Client("Oscar").ouvrirCompte(new Compte(Compte.CHECKING));
    }


    
    
}
