import java.util.*;

public class Quotient {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        // prompt the user to enter integers
        System.out.print("Enter number: ");
        int number1 = input.nextInt();

        System.out.print("Enter number: ");
        int number2 = input.nextInt();


        System.out.print(number1 + "/" +  number2 + " is  " + (number1 / number2));
    }
}