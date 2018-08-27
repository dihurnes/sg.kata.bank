package sg.kata.bank;


	import java.util.Calendar;
	import java.util.Date;

	public class Datep {
	    private static Datep instance = null;

	    public static Datep getInstance() {
	        if (instance == null)
	            instance = new Datep();
	        return instance;
	    }

	    public Date now() {
	        return Calendar.getInstance().getTime();
	    }
	}


