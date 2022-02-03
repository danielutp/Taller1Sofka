import java.util.ArrayList;

/**
 * Esta es una clase Fruit con sus respectivas variables, se hace el constructor y sus respectivos get and set.
 * @author Daniel Steven Gil Cruz
 *
 */

public class Fruit {
	
	/**
     * Variables de la clase Fruit
     */	
	public int id;
	public String name;
	private double averageWeight;
	public ArrayList<String> colors = new ArrayList<String>();
	
	/**
     * Constructor de la clase Fruit
     */	
	public Fruit(int id, String name, double averageWeight, ArrayList<String> colors){
		this.id = id;
		this.name = name;
		this.averageWeight = averageWeight;
		this.colors = colors;		
	}
	

	/**
	 *Getters and setters de cada una de las varibles de la clase Fruit
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

	public double getAverageWeight() {
		return averageWeight;
	}

	public void setAverageWeight(double averageWeight) {
		this.averageWeight = averageWeight;
	}

	public ArrayList<String> getColors() {
		return colors;
	}

	public void setColors(ArrayList<String> colors) {
		this.colors = colors;
	}
	
	

}
