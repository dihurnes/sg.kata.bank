package sg.kata.bank;

	import java.util.Calendar;
	import java.util.Date;

	public class Transaction {
	    public final double montant;

	    private Date transactionDate;

	    public Transaction(double montant) {
	        this.montant = montant;
	        this.transactionDate = Datep.getInstance().now();
	    }

	}