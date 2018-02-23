import java.text.DateFormatSymbols;
import java.util.Scanner;

public class MonthConverterRight {
	
	private static Scanner keyboard = new Scanner(System.in);
	private static DateFormatSymbols date = new DateFormatSymbols();
	
	public static void main(String [] args) {
		int year;
		int month;
		int day;
		String monthString;
		
		System.out.print("Enter Year (yyyy): ");
		year = keyboard.nextInt();
		System.out.print("Enter Month (mm): ");
		month = keyboard.nextInt();
		System.out.print("Enter Date (dd): ");	
		day = keyboard.nextInt();
		monthString = date.getMonths()[month -1];
		
		System.out.println("The date is " + monthString + " " + day + ", " + year);
	}
}
