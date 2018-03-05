import java.util.Scanner;

/* Programmer: Seth Stobart
 * Date: 2/28/2018
 * Project: 2.7
 * File Name: MyLoop.java
 * Description: Inputs a num 2-100 and counts to that num at an input of increments
 */

public class MyLoop {

	private static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String [] args) {
		double num;
		double increment;
		double counter = 0;
		
		do {
			System.out.println("Enter a number between 2 and 100: ");
			num = keyboard.nextDouble();
		} while (num < 2 || num > 100);
		
		do {
			System.out.println("Enter a positive number smaller than " + num + ": ");
			increment = keyboard.nextDouble();
		} while (increment > num || increment < 0);
		
		System.out.print("MyLoop = ");
		
		while (counter <= num) {
			System.out.print(" " + counter);
			counter += increment;
		}
	}
}
