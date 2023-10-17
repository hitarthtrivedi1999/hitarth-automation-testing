package Assignment7OtherPrograms;
/*
91-100 AA
81-90 AB
71-80 BB
61-70 BC
51-60 CD
41-50 DD
<=40 Fail
 */
import java.util.Scanner;

public class bMarksDistribution
{
  public static void main(String[] args) 
  {
	
     Scanner s=new Scanner(System.in);
     System.out.println("Enter your marks: ");
     int marks=s.nextInt();
     if(marks>=91 && marks<=100)
     {
    	 System.out.println("Grade is AA");
     }
     if(marks>=81 && marks<=90)
     {
    	 System.out.println("Grade is AB");
     }
     if(marks>=71 && marks<=80)
     {
    	 System.out.println("Grade is BB");
     }
     if(marks>=61 && marks<=70)
     {
    	 System.out.println("Grade is BC");
     }
     if(marks>=51 && marks<=60)
     {
    	 System.out.println("Grade is CD");
     }
     if(marks>=41 && marks<=50)
     {
    	 System.out.println("Grade is DD");
     }
     if(marks<=40)
     {
    	 System.out.println("Fail");
     }
  }
}
