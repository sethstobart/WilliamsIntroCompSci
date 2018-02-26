import java.util.Scanner;

/* Programmer: Seth Stobart
 * Date: 2/26/2018
 * Project: 2.6
 * File Name: Name.java
 * Description: Repeats a name an input of times
 */

public class Name {
	
	private static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String [] args) {
		int repeats;
		int count = 0;
		String name = null;
		
		System.out.print("Enter your name: ");
		name  = keyboard.nextLine();
		System.out.print("How many times would you like to repeat?: ");
		repeats = keyboard.nextInt();
		
		while (count < repeats) {
			System.out.println(name);
			count++;
		}
	}

}
