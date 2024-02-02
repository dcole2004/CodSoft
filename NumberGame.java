import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter = 0;
        int attempts = 5; // Assuming you have a certain number of attempts

        System.out.println("Hello, Welcome to Cole Number Game");

        while (attempts > 0) {
            int ran_num = (int) (Math.random() * 101);

            System.out.println("Please, pick a number between 1 and 100");
            int user_num = in.nextInt();

            if (user_num == ran_num) {
                System.out.println("Congratulations, you guessed the right number");
                counter++;
                break; // Exit the loop if the user guessed correctly
            } else if (user_num < ran_num) {
                System.out.println("Not quite! Your number is too low, Try again!");
            } else if (user_num > ran_num) {
                System.out.println("Not quite! Your number is too high, Try again!");
            }

            attempts--;
        }

        if (attempts == 0) {
            System.out.println("Out of attempts. The correct number was: " + ran_num);
        }

        System.out.println("You guessed the right number in " + counter + " attempts.");
        in.close();
    }
}
