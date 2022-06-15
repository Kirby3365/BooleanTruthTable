import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //Simple Truth Table Program

    //Take the two booleans as inputs from the user.

    Scanner IN = new Scanner(System.in);

    System.out.println("Welcome to the truth table program. \n\nPlease enter a boolean value.");

    boolean INPUT1 = IN.nextBoolean();

    System.out.println("Great. \nPlease enter a second input boolean");

    boolean INPUT2 = IN.nextBoolean();

    System.out.println("\nThank you. Here are your outputs.");
    System.out.println("Input1 is " + INPUT1);
    System.out.println("Input2 is " + INPUT2);
    System.out.println("Not Input1 is " + !INPUT1);
    System.out.println("Not Input2 is " + !INPUT2);

    System.out.println("Input1 AND Input2 = " + (INPUT1 && INPUT2));
    System.out.println("Input1 OR Input2 = " + (INPUT1 || INPUT2));
    System.out.println("Input1 NAND Input2 = " + !(INPUT1 && INPUT2));
    System.out.println("Input1 NOR Input2 = " + !(INPUT1 || INPUT2));
    System.out.println("Input1 XOR Input2 = " + (INPUT1 ^ INPUT2));
  }
}