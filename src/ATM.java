/**
 * ATM Class
 * - Creates an ATM object which composes itself of other Bank Account objects
 * - Makes it possible to withdraw funds...etc
 * @author aboyd
 */

import java.io.FileNotFoundException;

public class ATM {

	// Bank Account Object
	private BankAccount account;
	
	
	/**
	 * ATM Object
	 * Mula -> 500
	 */
	public ATM() {
		account = new BankAccount(500);
	};
	
	
	/**
	 * Handle Transactions Function
	 * - Built just like they said, throws errors if you try to pull to much mula
	 * @throws FileNotFoundException
	 */
	void handleTransactions() throws FileNotFoundException{
		try {
			account.withdraw(20000);
		}catch(NegativeBalanceException e){
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		try {
			account.quickWithdraw(20000);
		}catch(NegativeBalanceException e){
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void main() throws FileNotFoundException{
		ATM myMula = new ATM();
		myMula.handleTransactions();
	}
}
