import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello, Welcome to Cole Number Game");
        
        // Generate a random number between 1 and 100 (inclusive)
        int ran_num = (int) (Math.random() * 100) + 1;
        
        int attempts = 3;

        while (attempts > 0) {
            System.out.println("Please, pick a number between 1 and 100");
            int user_num = in.nextInt();

            if (user_num == ran_num) {
                System.out.println("Congratulations, you guessed the right number");
                break; // Exit the loop if the correct number is guessed
            } else if (user_num < ran_num) {
                System.out.println("Not quite! Your number is too low, Try again!");
            } else {
                System.out.println("Not quite! Your number is too high, Try again!");
            }

            attempts--;
        }

        if (attempts == 0) {
            System.out.println("Out of attempts. The correct number was: " + ran_num);
        }

        in.close();
    }
}
