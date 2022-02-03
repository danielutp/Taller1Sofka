import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/**
 * Esta es la clase main donde realize las pruebas para verificar la funcionalidad de las variables e hice algunos print.
 * Para ejecutar el codigo solo es ejecutar la clase main.
 * @author Daniel Steven Gil Cruz
 *
 */

public class Main {

	public static void main(String[] args) throws ParseException { // Es hacer un catch en caso tal que parse de string a date no sea posible
		String pattern = "yyyy/MM/dd"; // Se define el formato en el que se recibe la fecha
		SimpleDateFormat format = new SimpleDateFormat(pattern, Locale.ENGLISH); // Sea crea el simple date format con el patron y la localizacion de la fecha.
		String dob = "1995/08/27"; // Se crea la fecha tipo string 
		Date date = new Date(); // Se instancia el objeto tipo date
		date = format.parse(dob); //Usando el simple date format se hace el parse de string a date
		Person person = new Person(1088032578,"Daniel","Gil", "Cruz", date, 1.17f);
		ArrayList<String> a = new ArrayList<String>();// Se instancia la lista
		a.add("sapote"); // en las siguientes 3 lineas se agregan los valores en este caso los colores a la Arraylist
		a.add("green");
		a.add("yellow");
		Fruit fruit = new Fruit(2,"papaya",12.5,a);
		System.out.println("La identificacion de la persona es : "+person.getId());
		System.out.println("El nombre de la persona es : "+person.getName()+" "+person.getLastName1()+" "+person.getLastName2());
		System.out.println ("La fecha de cumpleaños es: "+format.format(person.getDatebirth()));
		System.out.println ("La altura es de : "+person.getHeight());
		System.out.println ("La fruta favorita es : "+fruit.getName());
		for (Object object : a) {
			System.out.println("Los posibles colores de esta son : "+ object);
		}
		

	}
	 
}
