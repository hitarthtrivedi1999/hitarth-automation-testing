package Assignment3ArraysCollections;

import java.util.Scanner;

public class jReverseArray
{
  public static void main(String[] args) 
  
  {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the element ");
	int n=s.nextInt();
	int[] array = new int[n];
	
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter array Element "+(i+1));
	    array[i]=s.nextInt();
	    
	
	}
	System.out.println("Original array is ");
	for(int i=0;i<n;i++)
	{
		System.out.println(array[i]+ " ");
	    
	
	}
	System.out.println("Reverse array is ");
	for(int i=n-1;i>=0;i--)
	{
		System.out.println(array[i]+ " ");
	    
	
	}
	
	
	
  
	
  
  }
}
