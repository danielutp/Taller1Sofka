/**
 * Esta es una clase Phone con sus respectivas variables, se hace el constructor y sus respectivos get and set.
 * @author Daniel Steven Gil Cruz
 *
 */
public class Phone {
	 /**
     * Variables de la clase Phone
     */
	public int number;
	private int serial;
	protected String password;
	public String color;
	
	/**
     * Constructor de la clase Phone
     */
	
	public Phone(int number,int serial,String password,String color) {
		this.number = number;
		this.serial = serial;
		this.password = password;
		this.color = color;		
	}
	
	/**
	 *Getters and setters de cada una de las variables de la clase Phone
	 */

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

}
