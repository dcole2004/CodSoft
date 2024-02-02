import java.util.*;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Cole Student Management System");
        System.out.println("Do you want to add, remove, or search a student?");
        String response = in.next();

        if (response.equalsIgnoreCase("add")) {
            addStudent();
        } else if (response.equalsIgnoreCase("remove")) {
            removeStudent();
        } else {
            System.out.println("Invalid option. Please choose add, remove, or search.");
        }

        in.close();
    }

    public static void addStudent() {
        Scanner in = new Scanner(System.in);

        System.out.println("What is the name of the student?");
        String addName = in.next();

        System.out.println("What is the age of the student?");
        int addAge = in.nextInt();

        System.out.println("What is the GPA?");
        double addGPA = in.nextDouble();

        System.out.println("Student added: Name - " + addName + ", Age - " + addAge + ", GPA - " + addGPA);
    }

    public static void removeStudent() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the name of the student you want to remove:");
        String remName = in.next();

        System.out.println("Student removed: Name - " + remName);
    }
