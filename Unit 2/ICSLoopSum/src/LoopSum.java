import java.util.Scanner;

/* Programmer: Seth Stobart
 * Date: 2/28/2018
 * Project: 2.8
 * File Name: LoopSum.java
 * Description: Takes an input of a num < 10 (X) and adds up the numbers from 1-X
 */

public class LoopSum {
	
	private static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String [] args) {
		int num;
		int sum = 0;
		
		do {
			System.out.print("Enter a positive integer under 10: ");
			num = keyboard.nextInt();
		} while (num >= 10 || num <= 0);
		
		for (int count = 1; count < num; count++) {
			System.out.print(count + " + ");
			sum = sum + count;
		}
		
		System.out.print(num + " = " + (sum + num));
	}
}
