package Assignment7OtherPrograms;

import java.util.Scanner;

/*
W.A.J.P. to create a custom exception if Customer withdraw amount
which is greater than account balance then program will show custom 
exception otherwise amount will deduct from account balance.
Account balance is:2000 Enter withdraw
amount:2500
Sorry, insufficient balance, you need more 500 Rs.To perform
this transaction.
*/
class MyException extends Exception 
{
	MyException()
	   {
		   super("Insuffiecient balance : ");
	   }
		
	
	MyException(String message)
    {
        
        super(message);
    }
}
public class cATMCustomException 
{
   public static void main(String[] args) throws MyException 
   {
	  
      int balance=25000;
      
      Scanner s=new Scanner(System.in);
      System.out.println("Enter amount for withdrawl:");
      int withdraw=s.nextInt();
      int amount;
      amount=withdraw-balance;
      int remainbalance=balance-withdraw;
      if(withdraw<=balance)
      {
    	  System.out.println("payment done successful:");
    	  System.out.println("Current balance is: "+remainbalance);
      }
    
      
      else
      {
    	  throw new MyException("Sorry,Insufficieint balance.you need to add more "  +amount  + " Rs. to perfrom this transaction");
      }
    	 
      
      
	   
	   
   }
}
