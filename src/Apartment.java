/**
 * Esta es una clase Apartment con sus respectivas variables, se hace el constructor y sus respectivos get and set.
 * @author Daniel Steven Gil Cruz
 *
 */
public class Apartment {
	/**
     * Variables de la clase Apartment
     */
	public String address;
	protected String bed;
	private String room;
	public int telephoneNumber;
	
	/**
     * Constructor de la clase Apartment
     */
	
	public Apartment(String address,String bed,String room,int telephoneNumber) {
		this.address = address;
		this.bed = bed;
		this.room = room;
		this.telephoneNumber = telephoneNumber;		
	}
	/**
	 *Getters and setters de cada una de las varibles de la clase Apartment
	 */
	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBed() {
		return bed;
	}

	public void setBed(String bed) {
		this.bed = bed;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public int getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(int telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	
	

}
