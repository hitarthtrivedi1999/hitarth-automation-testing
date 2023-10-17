package Assignment1;

import java.util.Scanner;

/*
 Question 5 - Armstrong number
 */
//153 = 1^3+5^3+3^3=153
public class eArmstrongNumber 
{
   public static void main(String[] args) 
   {
       int a,temp;
       
	   Scanner s=new Scanner(System.in);
       System.out.println("Enter number: ");
       a=s.nextInt();
       temp=a;//a=153;temp=153;
       int result=0;
       while(temp>0)//(153>0)
    	   
       {
    	   int reminder=temp%10;//rem=153/10,rem=3
    	   result=result + reminder*reminder*reminder;
    	   //r=r +(3*3*3)
    	   temp=temp/10; //int temp=153/10;int temp = 15;int temp=15
       }
       //(temp=153/10) ,int temp=15
       if(result==a)
       {
    	   System.out.println("Number is armstrong: ");
       }
       else
       {
    	   System.out.println("Not Armstrong");
       }
   }
}
