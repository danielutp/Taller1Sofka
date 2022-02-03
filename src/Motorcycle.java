/**
 * Esta es una clase Motorcycle con sus respectivas variables, se hace el constructor y sus respectivos get and set.
 * @author Daniel Steven Gil Cruz
 *
 */
public class Motorcycle {
	/**
     * Variables de la clase Motorcycle
     */
	public String tires;
	protected String key;
	private String seat;
	public String mirrors;
	private String tank;
		
	/**
     * Constructor de la clase Motorcycle
     */
	public Motorcycle(String tires,String key,String seat,String mirrors,String tank) {
		this.tires = tires;
		this.key = key;
		this.seat = seat;
		this.mirrors = mirrors;
		this.tank = tank;
				
	}
	
	/**
	 *Getters and setters de cada una de las variables de la clase Motorcycle
	 */

	public String getTires() {
		return tires;
	}

	public void setTires(String tires) {
		this.tires = tires;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public String getMirrors() {
		return mirrors;
	}

	public void setMirrors(String mirrors) {
		this.mirrors = mirrors;
	}

	public String getTank() {
		return tank;
	}

	public void setTank(String tank) {
		this.tank = tank;
	}
	
	
	
}
