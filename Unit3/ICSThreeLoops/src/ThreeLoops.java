
/* Programmer: Seth Stobart
 * Date: 2/28/2018
 * Project: 3.1
 * File Name: ThreeLoops.java
 * Description: Produces three counting loops
 */

public class ThreeLoops {

	public static void main (String [] args) {
		countdown();
		countdownEven();
		countdownOdd();
	}
	
	private static void countdown() {
	
		System.out.println("Countdown...");
		for (int c = 10; c > 0; c--) {
			System.out.println(c);
		}
		System.out.println("Blast Off!");
	}
	
	private static void countdownEven() {
		System.out.println();
		System.out.println("Even Counting");
		for (int c = 0; c <= 20; c+=2) {
			System.out.print(c + " ");
		}
		System.out.print("\nFinished");
	}
	
	private static void countdownOdd() {
		System.out.println();
		System.out.println("\nOdd Counting");
		for (int c = 15; c > 0; c-=2) {
			System.out.print(c + " ");
		}
		System.out.print("\nFinished");
	}
}
