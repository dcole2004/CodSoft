import java.util.*;
public class gradeCalculator
  {
    public static void main(String[] args)
    Scanner in = new Scanner(System.in);
    System.out.println("Welcome to Cole Grade Calculator");
    gradeInfo()


 public gradeInfo(ArrayList<String, Integer>, String subject, int grade, int gradePer, String ans)
   {
   ArrayList<String, Integer> grades = new ArrayList<String, Integer>();
   System.out.println("You can add up to ten (10) grades");
   System.out.println("What subject are you trying to caluclate");
   String subject = in.next();
   System.out.println("How many points out of 100 did you earn?");
   int grade = in.NextInt();
   int gradePer = grade / 100;
   grades.add(subject, gradePer)
   System.out.print("Are you ready to calculate?")
   String ans = in.next();
   if (ans.equals("Yes" || "yes")
       {
         gradeCalc();
       }
    if (ans.equals("No" || "no"
       {
          gradeInfo();
       }
    else
      {
      System.out.println("Error!")
      }
    }

     public gradeCalc(double sum)
     {
     double sum = 0;
     System.out.println("Your Grades: " + grades)
     arraylength = grades.size();
     for (i<0; i<array.size(); i++)
       {
       sum += grades.get(i) ;
       }
      gradeAvg = sum / arraylength
      System.out.print("Your average is: " + gradeAvg);
    }

}
   
