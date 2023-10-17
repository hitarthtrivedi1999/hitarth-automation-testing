package Assignment6Thread;
class A implements Runnable
{

	@Override
	public void run() 
	{
		
		
			System.out.println("Thread has been ended ");
		
		
	}
	
}
public class aThreadWithRunnableInterface

{

	
	public static void main(String[] args) 
	{
		A r=new A();
		Thread t=new Thread(r);
		t.start();
		
			System.out.println("Hii all.. ");
			
		
	}
}
