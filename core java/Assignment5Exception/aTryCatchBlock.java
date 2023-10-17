package Assignment5Exception;

public class aTryCatchBlock 
{
   public static void main(String[] args) 
   
   {
	  try
	  {
	  int number=50/0;
	  System.out.println("NUmber is "+number);
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }   
  
     System.out.println("After try - catch start programme");
   }
   
  
}

