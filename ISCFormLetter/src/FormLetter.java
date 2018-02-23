import java.time.LocalDate;

/* Programmer: Seth Stobart
 * Date: 1/17/2018
 * Project: 1.2 Form Letter
 * File Name: FormLetter.java
 * Description: Short form letter informing customer the item they wanted was out of stock
 */

public class FormLetter {
	
	private static LocalDate reStock = LocalDate.now().plusMonths(1);
	
	static String color = "blue";
	static String item = "shirt";
	static String customerName = "Greg";
	static String repName = "Seth Stobart";
	static double price = 19.95;
	static String catalog = "Cool Clothes Inc.";
	static String phoneNum = "1-800-123-456-7890";
	static String signature = "\n\nSincerely,\n" + repName + "\n" + catalog  + "\n" + phoneNum;
	
	public static void main (String [] args) {
		System.out.println(customerName + ",\n We regret to inform you that the " + color + "\n " +
		item + " you have ordered is currently out of stock.\n We here at " + catalog + "  would be happy"
		+ " to reimburse you \n your " + price + "$. We will be back in stock by " + reStock + "\n Please contact "
		+ phoneNum + " with your decision." + signature +"\n\n\n\n\n\n\n\n");
	}
}
