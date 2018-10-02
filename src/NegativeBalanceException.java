/**
 * Negative Balance Exception Class
 * -Exception Class to Handle Overages...etc
 * @author aboyd
 */

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.NumberFormat;

public class NegativeBalanceException extends Exception {

	private double overdraw;
	
	/**
	 * Exception Constructor
	 */
	public NegativeBalanceException() {
		super("Exception: Account Overdrawn");
	}
	
	/**
	 * Constructor taking a value
	 * -Formats errors to be printed
	 * @param input - input for constructor
	 * @throws FileNotFoundException - exception type
	 */
	public NegativeBalanceException(double input) throws FileNotFoundException{
	super("Over by ...." + NumberFormat.getCurrencyInstance().format(Math.abs(input)));
	overdraw = input;
	PrintWriter out = new PrintWriter("log.txt");
	out.write(super.getLocalizedMessage());
	out.close();
	}
	
	/**
	 * Formats error message
	 */
	@Override
	public String toString() {
		return "Invalid Balance: " + NumberFormat.getCurrencyInstance().format(overdraw);
	}
	
	
}
