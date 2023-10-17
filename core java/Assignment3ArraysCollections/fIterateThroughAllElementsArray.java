package Assignment3ArraysCollections;

import java.util.ArrayList;

public class fIterateThroughAllElementsArray 
{

	public static void main(String[] args) 
	{
	
		ArrayList<String> ar=new ArrayList();
		ar.add("Hitarth");
		ar.add("Viraj");
		ar.add("Kartik");
		
		System.out.println("Array List  "+ar);
	
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		
		    
		}
	}
}
