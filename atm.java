import java.util.*;
private int balance;
private int withdraw;
private int deposit;

Scanner in = new Scanner(System.in);
System.out.println("Hello, Welcome to Cole ATM");
System.out.println("Would you like to withdraw, deposit or check balance?");
decision = in.Next();
if (decision.equals("W"))
{
  withdraw();
}
if (decision.equals("D"))
{
  deposit();
}
else
{
  checkBalance();
}
public int withdraw(int amount)
  {
   System.out.println("How much would you like to withdraw?");
   int withAmount = in.NextInt();
   if balance > withAmount
   {
     balance - withAmount;
     System.out.println("Your transaction was successful! Your new balance is: " + balance);
   }
   else if balance < withAmount
   {
     System.out.println("Your transaction failed. Not enough in balance to withdraw.");
   }
   else
   {
     System.out.println("Error! Your transaction failed");
   }
  }
public int deposit(int depAmount)
  {
  System.out.println("How much would you like to deposit?");
  int depAmount = in.NextInt();

   if balance > depAmount || balance < depAmount
   {
    balance + depAmount;
    System.out.println("Your transaction was successful! Your new balance is: " + balance);
   }
   else
   {
     System.out.println("Error! Your transaction failed");
   }
  }
public int checkBalance()
  {
  System.out.println("Your balance is: " + balance);
  }
