package Assignment1;

import java.util.Scanner;

/*
 Question 3 - Find factorial for given number
 */
public class cFactorialNumber 
{
   public static void main(String[] args) 
   {
	int number;
	Scanner s=new Scanner(System.in);
	System.out.println("Add number to derive factorial of: ");
    number=s.nextInt();	
	int factorial=1;
	for(int a=1;a<=number;a++)
	{
	   factorial=factorial*a;
	}
    System.out.println("Factorial is: "+factorial);
   }
}
