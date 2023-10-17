package Assignment3ArraysCollections;

import java.util.Scanner;

public class eMinMaxArray 

{
	public static void main(String[] args)
	{
		
	
       int [] array = new int [] {25, 11, 7, 75, 56};  
     
       int max=array[0];  
     
       for(int i=0;i<array.length; i++)
       {  
         
          if(array[i]>max)  
           max=array[i];  
       }  
       System.out.println("Max element of array: " +max);  
   
    
      int min=array[0];
      for(int i=0;i<array.length;i++)
      {
    	  
    	  if(array[i]<min)
    	  min=array[i];
      }
      System.out.println("Min element of array: "+min);
	}  

	
	
	
}