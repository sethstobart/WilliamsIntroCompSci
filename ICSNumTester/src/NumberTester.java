import java.util.Scanner;

/* Programmer: Seth Stobart
 * Date: 2/13/2018
 * Project: 2.2 Bus Driver
 * File Name: NumberTester
 * Description: Tests is a int is > 10 or < 1
 */

public class NumberTester {
	
	private static Scanner keyboard = new Scanner(System.in);
	
	public static void main (String [] args) {
		int num;
		System.out.println("Input a number!");
		num = keyboard.nextInt();
		
		if (num >= 1 && num <= 10) 
			System.out.println(num + " is in the range of 1 to 10");
		
		else 
			System.out.println(num + " is not in the range of 1 to 10");
	}
}