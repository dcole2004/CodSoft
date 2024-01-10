import java.util.*;
public class number{
  public static void main(String[] args)
  
  
  public class numberGame
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Hello, Welcome to Cole Number Game);
    int ran_num = Math.random()*101;
    System.out.println("Please, pick a number between 1 and 100");
    int user_num = in.NextInt();
    if (user_num = ran_num)
    {
      System.out.println("Congratulations, you guessed the right number");
      counter++;
      numberGame();
    }
     else if (user_num < ran_num)
     {
       System.out.println("Not quite! Your number is too low, Try again!");
       attemtps--;
     }
      else if (user_num > ran_num)
     {
       System.out.println("Not quite! Your number is too high, Try again!");
       attemps--;
     }
      else if (user_num > 100 || user_num < 1)
      {
        System.out.println("Error! Your number is not between 1 - 100");
      else
      {
        System.out.println("Error!")
      }
       
       
       
