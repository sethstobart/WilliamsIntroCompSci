import java.util.Scanner;

/* Programmer: Seth Stobart
 * Date: 1/25/2018
 * Project: 1.4 Form Letter
 * File Name: Arithmetic.java
 * Description: Calculator for ints and reals
 */

public class Arithmetic {
	
	private static Scanner keyboard = new Scanner(System.in);
	static int firstInt;
	static int secondInt;
	static double firstDouble;
	static double secondDouble;
	
	public static void main (String [] args) {
		Arithmetic.uglyTitleThingIHaveToMake(); //I just don't like looking at this in my main method...
		System.out.println();
		Arithmetic.getInt(); //Grab user int inputs
		Arithmetic.integerTests(firstInt, secondInt); //Pass them to the calculator
		System.out.println();
		Arithmetic.getReal(); //Grab user double inputs
		Arithmetic.realTest(firstDouble, secondDouble); //Pass them to the calculator
		System.out.println("\n\n\n\n\n"); //Get rid of the pesky "press and key"
	}
	
	public static void uglyTitleThingIHaveToMake () {
		System.out.println("**********************************");
		System.out.println("* This is my fourth Java Program *");
		System.out.println("**********************************");
	}
	
	public static void getInt() {
		//Method gets the user int input and stores them in variables
		System .out.println("*****Integer arithmetic tests*****\n");
		System.out.print("Enter the first integer to test: ");
		firstInt = keyboard.nextInt();
		System.out.print("Enter the second integer to test: ");
		secondInt = keyboard.nextInt();
	}
	
	public static void integerTests(int first, int second) {
		//Uses two values and preforms ceratin funtions on them
		int add = first + second;
		int sub = first - second;
		int mul = first * second;
		int div = first / second;
		
		System.out.println("\n" + first + " + " + second + " = " + add);
		System.out.println(first + " - " + second + " = " + sub);
		System.out.println(first + " * " + second + " = " + mul);
		System.out.println(first + " / " + second + " = " + div);
	}
	
	public static void getReal() {
		//Gets user real input
		System .out.println("*****Real arithmetic tests*****\n");
		System.out.print("Enter the first real to test: ");
		firstDouble = keyboard.nextDouble();
		System.out.print("Enter the second real to test: ");
		secondDouble = keyboard.nextDouble();
	}
	
	public static void realTest(double first, double second) {
		//Performs certain functions on two real inputs
		double add = first + second;
		double sub = first - second;
		double mul = first * second;
		double div = first / second;
		
		System.out.println(first + " + " + second + " = " + add);
		System.out.println(first + " - " + second + " = " + sub);
		System.out.println(first + " * " + second + " = " + mul);
		System.out.println(first + " / " + second + " = " + div);
	}
}