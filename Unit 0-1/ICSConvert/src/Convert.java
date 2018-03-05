import java.util.Scanner;

/* Programmer: Seth Stobart
 * Date: 2/1/2018
 * Project: 1.6 Face
 * File Name: Convert.java
 * Description: Converts an input of inches to feet and inches
 */

public class Convert {
	
	private static Scanner keyboard = new Scanner(System.in);
	
	public static void main (String [] args) {
		
		int inches;
		int feet;
		int yards;
		
		System.out.println("Input and amount in inches: ");
		inches = keyboard.nextInt();
		yards = inches / 36;
		inches = inches % 36;
		feet = inches / 12;
		inches = inches % 12;
		System.out.println("You have... \nYards: " + yards + "\nFeet: " + feet + "\nInches: " + inches);
	}
}
