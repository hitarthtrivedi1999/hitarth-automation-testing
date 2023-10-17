package Assignment3ArraysCollections;

import java.util.Scanner;


public class bSumOfValuesInArray 

{
 public static void main(String[] args) 
    {
        int sum1=0;
        int sum2=0;
        int total;   
       int a[]=new int[5];
       
       Scanner s=new Scanner(System.in);
       
       System.out.println("Enter elements in 1st array ");
       for(int i=0;i<a.length;i++)
       {
    	   a[i]=s.nextInt();
     
       }
     
       for(int i=0;i<a.length;i++)
       {
    	
             sum1=sum1+a[i];
       }
       
       int b[]=new int[5];
       
       Scanner s1=new Scanner(System.in);
       
       System.out.println("Enter elements in 2nd array ");
       for(int i=0;i<b.length;i++)
       {
    	   b[i]=s1.nextInt();
     
       }
       
       for(int i=0;i<a.length;i++)
       {
    	
    	   
           sum2=sum2+b[i];
       }
     
      total=sum1+sum2;
      System.out.println("Sum of 2 arrays is: "+total);
    }
}

 
