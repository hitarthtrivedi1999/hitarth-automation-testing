package Assignment6Thread;

public class bThreadWithExtendingThreadClass extends Thread
{
   public void run()
   {
	   System.out.println("Thread is running ");
   }


   public static void main(String[] args) 
   {
	
	   bThreadWithExtendingThreadClass a=new bThreadWithExtendingThreadClass();
	   a.start();
	   
   
   }
}
