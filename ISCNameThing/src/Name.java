import java.util.Scanner;

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
