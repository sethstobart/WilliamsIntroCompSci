import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Kohls2 {
	
	private static Scanner keyboard = new Scanner(System.in);
	private static DecimalFormat finalFormat = new DecimalFormat("$0.00");
	private static HashMap hash = new HashMap();
	private static String color;
	private static double origPrice;
	private static int age;
	
	public static void main(String [] args) {
		hashSetup();
		getInputs();
		outPut(origPrice, getDiscount(color, origPrice, age));
	}
	
	private static void hashSetup() {
		hash.put("red", .7);
		hash.put("blue", .75);
		hash.put("green", .85);
		hash.put("old", .80);
	}
	
	private static void getInputs() {
		System.out.print("Enter color of card:");
		color = keyboard.nextLine().trim().toLowerCase();
		System.out.print("Enter the original price: $");
		origPrice = keyboard.nextDouble();
		System.out.print("Enter your age:");
		age = keyboard.nextInt();
	}
	
	private static void outPut(double price, double discount) {
		double finalPrice;
		finalPrice = price * discount;
		System.out.println("Final Price: " + finalFormat.format(finalPrice));		
	}
	
	private static boolean senior() {
		if (age > 62) 
			return true;
		else
			return false;

	}

	private static double getDiscount(String color, double origPrice, int age) {
		double discount = 0;
		String key = color;
		
		if (!senior()) {
			discount = (double) hash.get(key);
			System.out.println("You are using the " + key + " " + (int)(100-(discount*100)) + "% discount!");
		}
		else {
			if(key.equals("green")) {
				discount = (double) hash.get("old");
				System.out.println("You are using the senior " + (int)(100-(discount*100)) + "% discount!");
			}
			else {
				discount = (double) hash.get(key);
				System.out.println("You are using the " + key + " " + (int)(100-(discount*100)) + "% discount!");
			}
		}
		
		return discount;	
	}
}
