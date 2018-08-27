package sg.kata.bank;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClientTest {

    @Test //Test Client Releve generation
    public void testApp(){

        Compte verifCompte = new Compte(Compte.CHECKING);

        Client henry = new Client("Henry").ouvrirCompte(verifCompte);

        verifCompte.depot(100.0);

        assertEquals("Releve for Henry\n" +
                "\n" +
                "Verification Compte\n" +
                "  depot $100.00\n" +
                "Total $100.00\n" +
                "\n" +

                "Total dans le compte $100.00", henry.getReleve());
    }

    @Test
    public void testUnCompte(){
        Client oscar = new Client("Oscar").ouvrirCompte(new Compte(Compte.CHECKING));
    }


}
