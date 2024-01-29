import java.util.Scanner;

public class Objective5Lab1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("This will evaluate numbers for value and diplay in a greater than statemant");

		System.out.println("Please enter a number");

		int num1 = input.nextInt();
		
		System.out.println("Please enter a second number");

		int num2 = input.nextInt();

		if(num1 > num2){
		
			System.out.println(num1 + " >  " + num2);
		}

		else if (num2 > num1) { 

			System.out.println(num2 + " > " + num1);

		}

		else if (num1 == num2){
			System.out.println(num1 + " = " + num2);



		}
		input.close();
	}
}