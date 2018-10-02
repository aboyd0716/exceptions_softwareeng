/**
 * Bank Account Class
 * -Creates Object of Type Bank Account
 * @author aboyd
 */

import java.io.FileNotFoundException;
import java.math.BigDecimal;

public class BankAccount {

	//Big Decimal Type for that money
	private BigDecimal val;
	
	/**
	 * Basic Constructor for Bank Account Object
	 * @param val - mula you got
	 */
	public BankAccount(double val) {
		this.val = new BigDecimal(val);
	}

	/**
	 * Throws Negative and Tells you why
	 * @param input
	 * @throws FileNotFoundException
	 * @throws NegativeBalanceException
	 */
	public void withdraw(double input) throws FileNotFoundException, NegativeBalanceException {

		double exception = val.floatValue() - input;
		
		if (input < val.floatValue()) {
			val.subtract(new BigDecimal(input));
		}else {
			
			throw new NegativeBalanceException(exception);
		}
	}
	/**
	 * Throws Negative if you don't have that much mula
	 * @param input
	 * @throws NegativeBalanceException
	 */
	public void quickWithdraw(double input) throws NegativeBalanceException{
		
		if (input < val.floatValue()) {
			val.subtract(new BigDecimal(input));
		}else {
			
			throw new NegativeBalanceException();
		}
	}
	
}
