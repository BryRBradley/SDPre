import java.util.Scanner;

public class Objective9Lab5 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
		double num1, num2;
		boolean keepGoing = true;
		int choice;
		double answer = 0.0;

		System.out.print("Please give me a number: ");
		num1 = scanner.nextDouble();

		System.out.print("Please give me another number: ");
		num2 = scanner.nextDouble();

		
		printMenu();
		System.out.print("Which would you like to do? ");
		
		choice = scanner.nextInt();

			switch (choice) {
			case 1: double sum = findSum (num1,num2);
				System.out.println(num1 + " + " + num2 + " = " + sum);
				break;
			case 2: double average = findAverage (num1, num2);
				System.out.println("The average of " + num1 + " and " + num2 +" is "  + average);
				break;
			case 3: double tax = findTax (num1,num2);
				System.out.println("The tax collected on "+ num1 + " and " +num2 + " is " + tax);
				break;
			case 4: System.out.println("You have chosen to quit.");
				break;
			default: 
					System.out.println("invalid selection");
			}

		
		scanner.close();

	}

	public static void printMenu() {
		System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|   1. Add Numbers     |");
		System.out.println("|   2. Find Average    |");
		System.out.println("|   3. Calculate Tax   |");
		System.out.println("|   4. Exit            |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();
	}

	public static double findSum(double x, double y) {
		double sum = x + y;
		return sum;
	}
    public static double findAverage(double x, double y) {
      double average = (x+y)/2; return average;
  }

  	public static double findTax(double x, double y) {
      double tax = (x+y)* .0831; return tax;

	}
}