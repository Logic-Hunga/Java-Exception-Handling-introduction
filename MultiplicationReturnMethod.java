import java.util.*;

public class MultiplicationReturnMethod {

    //Defining Multiplication Return Method
    public static int multiplication(int number1, int number2) {

        if (number2 == 0) {
            System.out.println("Multiplying by zero");
            System.exit(1);
        }
        return number1 * number2;
    }

    // Defining main method from java library
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number1 = input.nextInt();

        System.out.print("Enter number: ");
        int number2 = input.nextInt();


        // invoking the return method
        int result = multiplication(number1, number2);

        System.out.println("Result: " + result);
    }
    
}