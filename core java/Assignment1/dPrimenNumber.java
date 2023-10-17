package Assignment1;
//Need to ask
/*
 Question 4 - prime number
 */
//divisible by 1 & it self
//ex. 3,7,13,17,21,23,29,31,37,43
import java.util.Scanner;

public class dPrimenNumber 
{
  public static void main(String[] args) 
  {
       int temp=0;
	   Scanner s=new Scanner(System.in);
       System.out.println("Enter number: ");
       int a=s.nextInt();
       for(int i=2;i<a-1;i++)
       {
    	   if(a%i==0)
    	   {
    		   
    		   temp=temp+1;
    	   }
       }
       if(temp==0)
       {
    	   System.out.println("Prime: ");
       }
       else
       {
    	   System.out.println("Not Prime: ");
       }
  }
 
  
}

