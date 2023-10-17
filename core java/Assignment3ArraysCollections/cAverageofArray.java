package Assignment3ArraysCollections;

import java.util.Scanner;

public class cAverageofArray 
{
   public static void main(String[] args) 
   {
	 int sum=0;
	 Scanner s1=new Scanner(System.in);
	 System.out.println("array you want ");
	 int n=s1.nextInt();
	 int [] a=new int[n];
	 System.out.println("Enter elements for first array ");
	 for(int i=0;i<n;i++)
	 {
		 a[i]=s1.nextInt();
		 sum=sum+a[i];
		 
	 
	 }

	
	 
	 
	 
     System.out.println("Average is "+sum/n);  
   }
		 
}

