import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.println ("Enter the first whole number you would like to add?");
    
    int num1 = keyboard.nextInt();

    System.out.println("Enter the second whole number you would like to add?");

    int num2 = keyboard.nextInt();

    System.out.println("Enter the third whole number you would like to add?");

    int num3 = keyboard.nextInt();

    System.out.println("Enter the first decimal number you would like to add?");
    
    double dub1 = keyboard.nextDouble();

    System.out.println("Enter the second decimal number you would like to add?");

    double dub2 = keyboard.nextDouble();

    System.out.println("Enter the third decimal number you would like to add?");

    double dub3 =  keyboard.nextDouble();

    int sumnum1 = (num1+num2+num3);

    double sumdub1 = (dub1+dub2+dub3);

    System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " = " + sumnum1);

    System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + sumdub1);






    //TODO prompt the user to get input for all of the above int variables.

    //TODO prompt the user to get input for all of the above double variables.

    //TODO print the three ints and their sum.

    //TODO print the three doubles and their sum.

  }
}
