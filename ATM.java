import java.util.Scanner;

public class ATM {
    private static int balance = 1000; // Assuming an initial balance of $1000

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello, Welcome to Cole ATM");
        System.out.println("Would you like to withdraw (W), deposit (D), or check balance (C)?");
        String decision = in.next();

        if (decision.equalsIgnoreCase("W")) {
            withdraw();
        } else if (decision.equalsIgnoreCase("D")) {
            deposit();
        } else if (decision.equalsIgnoreCase("C")) {
            checkBalance();
        } else {
            System.out.println("Invalid option. Please choose W, D, or C.");
        }

        in.close(); // Close the scanner to avoid resource leak
    }

    public static void withdraw() {
        Scanner in = new Scanner(System.in);

        System.out.println("How much would you like to withdraw?");
        int withAmount = in.nextInt();

        if (balance >= withAmount) {
            balance -= withAmount;
            System.out.println("Your transaction was successful! Your new balance is: " + balance);
        } else {
            System.out.println("Your transaction failed. Not enough balance to withdraw.");
        }
    }

    public static void deposit() {
        Scanner in = new Scanner(System.in);

        System.out.println("How much would you like to deposit?");
        int depAmount = in.nextInt();

        if (depAmount > 0) {
            balance += depAmount;
            System.out.println("Your transaction was successful! Your new balance is: " + balance);
        } else {
            System.out.println("Invalid deposit amount. Your transaction failed.");
        }
    }

    public static void checkBalance() {
        System.out.println("Your balance is: " + balance);
    }
}
