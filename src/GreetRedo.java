import java.util.*;

/**
 *   File Name: GreetRedo.java<br>
 *
 *   Venkatraman, Arunkumar<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: May 21, 2016
 *   
 */

/**
 * GreetRedo //ADDD (description of class)
 * 
 * @author Venkatraman, Arunkumar
 * @version 1.0.0
 * @since 1.0
 *
 */
public class GreetRedo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create Scanner object
		Scanner scanner = new Scanner(System.in);
		// String variable to hold user's name
		String name;
		// Greet the user to the application
		System.out.println("Welcome to simple Greeting App");
		// Ask the user name
		System.out.print("Could I please get your name: ");
		// Store the user's name inside the name variable
		name = scanner.nextLine();
		// Farewell the user and exit application
		System.out.println("Thank you for using this app " + name + ".\nHave great day!");

	}

}
