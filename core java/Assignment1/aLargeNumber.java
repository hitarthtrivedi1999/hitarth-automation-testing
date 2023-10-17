package Assignment1;
/*
 Question  1 - take 3 numbers from user & print grater one
 */
import java.util.Scanner;

public class aLargeNumber
{
   public static void main(String[] args) 
   {
	   int a,b,c;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter first Number: ");
	   a=sc.nextInt();
	   System.out.println("Enter second Number: ");
	   b=sc.nextInt();
	   System.out.println("Enter third Number: ");
	   c=sc.nextInt();
	   
	   if(a>b && a>c)
		   
	   {
		   System.out.println("A is the Greater number: ");

   
	   }
	   else if(b>a && b>c)
	   {
		   
		   System.out.println("B is the Greater number: ");
	   }
	   else
	   {
		   System.out.println("C is the Greater number: ");   
	   }
    }
   
}

      