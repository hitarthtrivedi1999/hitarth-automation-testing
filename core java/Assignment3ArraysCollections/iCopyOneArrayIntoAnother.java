package Assignment3ArraysCollections;

import java.util.ArrayList;
import java.util.List;

public class iCopyOneArrayIntoAnother
{

	
	public static void main(String[] args)
	{
	
		
		int[] main= {5,10,15,20,25};
		int[] copy=main;
		
		System.out.println("Main Array Is ");
	    for(int i=1;i<main.length;i++)
	    {
	    	
	    	System.out.print(main[i]+"\t");
	    }
	    
	    System.out.println("\nCopied Array Is ");
	    for(int i=1;i<copy.length;i++)
	    {
	    	
	    	System.out.print(copy[i]+"\t");
	    }
	}
}
