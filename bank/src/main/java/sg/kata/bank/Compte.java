package sg.kata.bank;

import java.util.ArrayList;
import java.util.List;

import sg.kata.bank.Transaction;

public class Compte {
    public static final int CHECKING = 0;
	private final int accountType;
    public List<Transaction> transactions;

    public Compte(int accountType) {
        this.accountType = accountType;
        this.transactions = new ArrayList<Transaction>();
    }

    public void depot(double montant) {
        if (montant <= 0) {
            throw new IllegalArgumentException("montant must be greater than zero");
        } else {
            transactions.add(new Transaction(montant));
        }
    }

public void withdraw(double montant) {
    if (montant <= 0) {
        throw new IllegalArgumentException("montant must be greater than zero");
    } else {
        transactions.add(new Transaction(-montant));
    }
}

}
