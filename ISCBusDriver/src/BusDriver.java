import java.util.Scanner;

/* Programmer: Seth Stobart
 * Date: 2/8/2018
 * Project: 2.1 Bus Driver
 * File Name: BusDriver.java
 * Description: Calculates wages at rate inputed and includes overtime pay
 * Extra Challenge: No if statements and more inputs. Includiing the ovetime scaler and overtime begin
 */

public class BusDriver {
	
	private static Scanner keyboard = new Scanner(System.in);
	private static int hoursWorked; //Input from user for total hours worked that week
	private static int accumHours; //Accumulated hours for while loops
	private static int overtimeBegin; //At what hour does your overtime start
	private static double overtimeRate; //The pay increase you receive 
	private static double additionWage; //Additional wage per instance of the loops
	private static double moneyInPocket; //Total money accumulated
	
	public static void main (String [] args) {
		getInputs();
		System.out.println("Regular Wages: $" + regularWages() + "\nOvertime Wages: $" + overtimeWages(regularWages()) +  " \nTotal Wages: $" + totalWages());
	}
	
	//Method to grab inputs from user. Gets hours worked, hourly wage, overtime begining hour, and overtime rate
	public static void getInputs () {
		System.out.println("How many hours did you work? (Whole Num)");
		hoursWorked = keyboard.nextInt();
		System.out.println("What is your hourly wage?");
		additionWage = keyboard.nextDouble();
		System.out.println("At what hour does overtime start for you? (Whole Num)");
		overtimeBegin = keyboard.nextInt();
		System.out.println("What is your overtime rate? (1.5 for time and a half, 2 for double, etc.)"); //NOT THE OVERTIME RATE YOU SAID WE COULDN'T ASK FOR 
		overtimeRate = keyboard.nextDouble();
	}
	
	//Calculates the user's regular wages
	public static double regularWages() {
		while (accumHours < overtimeBegin && accumHours != hoursWorked) {
			moneyInPocket = moneyInPocket + additionWage;
			accumHours++;
		}
		
		return moneyInPocket;
	}
	
	//Calculates the user's overtime wages
	public static double overtimeWages(double regWage) {
		while (accumHours < hoursWorked) {
			moneyInPocket = moneyInPocket + (additionWage * overtimeRate);
			accumHours++;
		}
		
		double overtimeWages = moneyInPocket - regWage;
		return overtimeWages;
	}
	
	//Adds up regular and overtime wages
	public static double totalWages() {
		double totalWages = regularWages() + overtimeWages(regularWages());
		return totalWages;
		
	}
	
}

