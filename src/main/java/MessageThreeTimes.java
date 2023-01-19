
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here
        // Store the users input to the string variable 'message'
        String message = scanner.nextLine();

        // Print out the value of the variable 'message' three consecutive times
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
    }
}
