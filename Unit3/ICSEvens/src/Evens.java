import java.util.Scanner;

/* Programmer: Seth Stobart
 * Date: 3/12/2018
 * Project: 3.2
 * File Name: Evens.java
 * Description: User inputs num between 10-20 then totals even number from 0 to the input 
 */

public class Evens {
	
	private static Scanner keyboard = new Scanner(System.in);

	public static void main(String [] args) {
		int input;
		int total = 0;
		
		do {
			System.out.print("Enter a number 10-20: ");
			input = keyboard.nextInt();
		}while(input < 10 || input > 20);
		
		for (int count = 0; count <= input; count += 2) {
			total += count;
		}
		
		System.out.print(total);
	}
}
