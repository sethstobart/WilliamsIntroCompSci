import java.text.DecimalFormat;
import java.util.Scanner;

public class Kohls {
	
	private static Scanner keyboard = new Scanner(System.in);
	private static DecimalFormat finalFormat = new DecimalFormat("$0.00");
	private static String color;
	private static double origPrice;
	private static int age;
	
	public static void main(String [] args) {
		getInputs();
		outPut(origPrice, getDiscount(senior(), card()));	
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
	
	private static int card() {
		int color = 0;
		
		switch (Kohls.color) {
			case "red" :
				color = 1;
				break;
			case "blue" :
				color = 2;
				break;
			case "green":
				color = 3;
				break;
			default :
				System.out.println("Incorrect card type!");
				color = 0;
		}
		
		return color;
	}
	
	private static double getDiscount(boolean senior, int card) {
		double discount = 1;
		String discountName = "No discount";
		boolean determined = false;
		
		if (card == 1 && !determined) {
			discountName = "Red Card";
			discount = .70;
			determined = true;
		}
		if (card == 2 && !determined) {
			discountName = "Blue Card";
			discount = .75;
			determined = true;
		}
		if (senior = true && !determined) {
			discountName = "Senior Discount";
			discount = .8;
			determined = true;
		}
		else if (senior = false){
			discountName = "Green Card";
			discount = .85;
			determined = true;
		}
		if (determined = true) {
			System.out.println("\nDiscount Used: " + discountName + "\n" + discountName + " = " + Math.round((1 - discount) * 100) + "%");
		}

		return discount;
	}

}
