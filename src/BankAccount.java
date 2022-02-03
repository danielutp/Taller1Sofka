/**
* Esta es una clase BankAccount con sus respectivas variables, se hace el constructor y sus respectivos get and set.
* @author Daniel Steven Gil Cruz
*
*/

public class BankAccount{
	/**
	* Variables de la clase BankAccount
	*/
	private int accountnumber;
	private String user;
	protected boolean activated;
	private double quota;
	
	/**
     * Constructor de la clase BankAccount
     */
	
	public BankAccount(int accountnumber, String user,boolean activated,double quota) {
		this.accountnumber = accountnumber;
		this.user = user;
		this.activated = activated;
		this.quota = quota;
	}
	
	/**
	 *Getters and setters de cada una de las variables de la clase BankAccount
	 */

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	public double getQuota() {
		return quota;
	}

	public void setQuota(double quota) {
		this.quota = quota;
	}	
	

}
