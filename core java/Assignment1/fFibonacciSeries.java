package Assignment1;
/*
 Question 6 - Fibonacci series
 */
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233
public class fFibonacciSeries
{
   public static void main(String[] args) 
   {
	 int a=0;int c;
	 int b=1;
	 System.out.print(+a+" "+b);
	 for(int i=0;i<=10;i++)
	 {
		 c=a+b;
	     System.out.print(" "+c);
	     System.out.print(" ");
	      a=b;
	      b=c;
	     
	 }

   }
}
