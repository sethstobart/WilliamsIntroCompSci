import java.util.Scanner;

/* Programmer: Seth Stobart
 * Date: 2/13/2018
 * Project: 2.3
 * File Name: Gardes.java
 * Description: Calculates users grade
 */

public class Grades {
	private static Scanner keyboard = new Scanner(System.in);

	public static void main (String [] args) {
		String course;
		double inputGrades[] = new double[3];
		double average;
		double caseAverage;
		
		System.out.println("Input name of class:");
		course = keyboard.nextLine();
		course = course.substring(0 , 1).toUpperCase() + course.substring(1);
		System.out.println("Enter your first grade:");
		inputGrades[0] = keyboard.nextDouble();
		System.out.println("Enter your second grade:");
		inputGrades[1] = keyboard.nextDouble();
		System.out.println("Enter your third grade:");
		inputGrades[2] = keyboard.nextDouble();
		
		average = (int)(((inputGrades[0] + inputGrades[1] + inputGrades[2])/3) * 10 + 0.5)/10.0;
		caseAverage = Math.ceil(average/10.0) * 10;
		System.out.println("Class Average: " + average + "%");
		
		switch ((int) caseAverage) {
			case 100: 
				System.out.println(course + " grade is an A");
				break;
			case 90:
				System.out.println(course + " grade is a B");
				break;
			case 80:
				System.out.println(course + " grade is a C");
				break;
			case 70:
				System.out.println(course + " grade is a D");
				break;
			default:
				System.out.println(course + " grade is a F");
		}

	}
}