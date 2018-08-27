package sg.kata.bank;

	import java.util.ArrayList;
	import java.util.List;

import sg.kata.bank.Compte;
import sg.kata.bank.Client;
import sg.kata.bank.Transaction;

import static java.lang.Math.abs;

	public class Client {
		private String nom;
	    private List<Compte> Comptes;

	    public Client(String nom) {
	        this.nom = nom;
	        this.Comptes = new ArrayList<Compte>();
	    }

	    public String getnom() {
	        return nom;
	    }

	    public Client ouvrirCompte(Compte Compte) {
	        Comptes.add(Compte);
	        return this;
	    }


	    public String getReleve() {
	        String Releve = null;
	        Releve = "Releve for " + nom + "\n";
	        double total = 0.0;
	        for (Compte a : Comptes) {
	            Releve += "\n" + relevePourCompte(a) + "\n";
	        }
	        Releve += "\nTotal In All Comptes " + toDollars(total);
	        return Releve;
	    }

	    private String relevePourCompte(Compte a) {
	        String s = "";


	        double total = 0.0;
	        for (Transaction t : a.transactions) {
	            s += "  " + (t.montant < 0 ? "retrait" : "depot") + " " + toDollars(t.montant) + "\n";
	            total += t.montant;
	        }
	        s += "Total " + toDollars(total);
	        return s;
	    }

	    private String toDollars(double d){
	        return String.format("$%,.2f", abs(d));
	    }
	}
