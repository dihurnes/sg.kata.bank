package sg.kata.bank;

import org.junit.Test;

public class CompteTest {
	@Test
    public void testDepot() {
    	Compte verifCompte = new Compte(Compte.CHECKING);
    	try {
    		 verifCompte.depot(100.0);
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}
    }
	
	
	@Test
    public void testRetrait() {
    	Compte verifCompte = new Compte(Compte.CHECKING);
    	try {
    		 verifCompte.depot(100.0);
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}
    }

}
