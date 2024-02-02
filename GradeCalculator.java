import java.util.*;

public class GradeCalculator {
    private static ArrayList<String> subjects = new ArrayList<>();
    private static ArrayList<Integer> grades = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Cole Grade Calculator");
        gradeInfo(in);
    }

    public static void gradeInfo(Scanner in) {
        System.out.println("You can add up to ten (10) grades");
        System.out.println("What subject are you trying to calculate?");
        String subject = in.next();
        System.out.println("How many points out of 100 did you earn?");
        int grade = in.nextInt();
        double gradePer = (double) grade / 100.0;
        subjects.add(subject);
        grades.add((int) (gradePer * 100));

        System.out.println("Are you ready to calculate? (Yes/No)");
        String ans = in.next().toLowerCase();
        if (ans.equals("yes")) {
            gradeCalc();
        } else if (ans.equals("no")) {
            gradeInfo(in);
        } else {
            System.out.println("Error!");
        }
    }

    public static void gradeCalc() {
        double sum = 0;
        System.out.println("Your Grades: " + grades);
        int arrayLength = grades.size();
        for (int i = 0; i < arrayLength; i++) {
            sum += grades.get(i);
        }
        double gradeAvg = sum / arrayLength;
        System.out.println("Your average is: " + gradeAvg);
    }
}
