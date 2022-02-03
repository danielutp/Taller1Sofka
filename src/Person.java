import java.util.Date;

/**
 * Esta es una clase person con sus respectivas variables, se hace el constructor y sus respectivos get and set.
 * @author Daniel Steven Gil Cruz
 *
 */

public class Person {
    /**
     * Variables de la clase person
     */
	public int id;
	public String name;
	public String lastName1;
	public String lastName2;
	public Date datebirth;
	public float height;

	/**
     * Constructor de la clase person
     */
	public Person(int id,String name,String lastName1,String lastName2,Date datebirth,float height)
	{
		this.id = id;
		this.name = name;
		this.lastName1 = lastName1;
		this.lastName2 = lastName2;
		this.datebirth = datebirth;
		this.height = height;		
	}	
	
	/**
	 *Getters and setters de cada una de las variables de la clase person
	 */
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName1() {
		return lastName1;
	}

	public void setLastName1(String lastName1) {
		this.lastName1 = lastName1;
	}

	public String getLastName2() {
		return lastName2;
	}

	public void setLastName2(String lastName2) {
		this.lastName2 = lastName2;
	}

	public Date getDatebirth() {
		return datebirth;
	}

	public void setDatebirth(Date datebirth) {
		this.datebirth = datebirth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	

}
