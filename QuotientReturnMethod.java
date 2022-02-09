import java.util.*;

public class QuotientReturnMethod {

    // Defining the return 
    public static int Quotient(int number1, int number2) {
        if (number2==0) {
            System.out.println("Devisor can not be zero");
            System.exit(1);
        }
        
        return number1 / number2;
        
    }

    // Main method from java API library
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompt the user to enter the number of
        int number1 = input.nextInt();
        int number2 = input.nextInt();


        // invoking the return 
        int result = Quotient(number1, number2);
        System.out.println(number1 + " / " + number2 + " is " + result);
    }
}