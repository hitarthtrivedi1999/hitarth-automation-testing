package Assignment7OtherPrograms;

abstract class  Parent

{
  public abstract void message();
}
	class Firstsubclass  extends Parent
	{
	  public void message()
	  {
		  System.out.println("This is first subclass: ");
	  }
	}
	class Secondsubclass  extends Parent
	{
		
		public void message()
		{
			
			System.out.println("This is second subclass: ");
			
		}
	}
	
public class aAbstractMessage 
{
	  public static void main(String[] args) 
	  {
		Firstsubclass fsc=new Firstsubclass();
		Secondsubclass ssc=new Secondsubclass();
		fsc.message();
		ssc.message();

	  }
}
