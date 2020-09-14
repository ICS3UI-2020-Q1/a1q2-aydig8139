import java.util.Scanner;

/**
 * Asks the user for two numbers and then divides them + tells the remainder
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates a Scanner used for input 
    Scanner input = new Scanner(System.in);

    //Ask the user for two numbers
    System.out.println("Please enter in two integers, on seperate lines, to divide.");

    // Get first input
    int firstNumber = input.nextInt();

    // Get second input
    int secondNumber = input.nextInt();

    // Calculate the quotient
    int quotient = firstNumber / secondNumber;

    // Calculate the remainder
    int remainder = firstNumber % secondNumber;

    //Tell the user the answer
    System.out.println( firstNumber + "/" + secondNumber + " is " + quotient + " with a remainder of " + remainder);


  }
}
