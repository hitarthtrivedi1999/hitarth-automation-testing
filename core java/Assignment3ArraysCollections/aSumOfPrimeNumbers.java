package Assignment3ArraysCollections;

import java.util.Scanner;

//Can be divide by 1 & itself

public class aSumOfPrimeNumbers 
{
 public static void main(String[] args) 
 {
     int count=0;int sum=0;
     for(int num=1;num<=100;num++)
     {
    	 count =0;
    	 for(int i=2;i<=num/2;i++)
    	 {
    		 if(num%i==0)
    		 {
    			 count ++;
    			 break;
    			 
    		 }
    	 }
    	  if(count == 0 & num !=1)
    	  {
    		  sum=sum+num;
    		  
    	  }
     }
   System.out.println("Sum of first 100 prime number is : "+sum);
    	 
 }
 
}