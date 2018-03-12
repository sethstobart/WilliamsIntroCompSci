import java.util.Scanner;

/* Programmer: Seth Stobart
 * Date: 2/15/2018
 * Project: 2.5
 * File Name: MonthConverter.java
 * Description: Takes input of ints for date and outputs nice string/ints.
 */

public class MonthConverter {
	
	private static int monthGlobal;
	private static int year;
	private static int day;
	private static Scanner keyboard = new Scanner(System.in);
	public static void main(String [] args) {
		getInput();
		
		if (monthGlobal <= 0 || monthGlobal > 12 || day <= 0 || day > 31)
			System.out.println("Invalid date!");
		
		else
		System.out.println("The date is " + month() + " " + day + ", " + year);
	}
	
	public static void getInput() {
		System.out.print("Enter Month (int): ");
		monthGlobal = keyboard.nextInt();
		System.out.print("Enter Year (int): ");
		year = keyboard.nextInt();
		System.out.print("Enter Date (int): ");	
		day = keyboard.nextInt();
	}
	
	private static String month() {
		String outMonth = "No Month";
		
		switch (monthGlobal) {
		case 1:
			outMonth = "January";
			break;
		case 2:
			outMonth = "Febuary";
			break;
		case 3:
			outMonth = "March";
			break;
		case 4:
			outMonth = "April";
			break;
		case 5:
			outMonth = "May";
			break;
		case 6:
			outMonth = "June";
			break;
		case 7:
			outMonth = "July";
			break;
		case 8:
			outMonth = "August";
			break;
		case 9:
			outMonth = "September";
			break;
		case 10:
			outMonth = "October";
			break;
		case 11:
			outMonth = "November";
			break;
		case 12:
			outMonth = "December";
			break;
		}
		return outMonth;
		
	}
}
