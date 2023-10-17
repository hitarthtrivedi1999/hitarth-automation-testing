package Assignment3ArraysCollections;

import java.util.ArrayList;
import java.util.List;

public class hRemoveThridElementFromArrayList
{
  public static void main(String[] args)
  {
	  List<String> list=new ArrayList<String>();
	  list.add("Sachin Tedulkar");
	  list.add("Virender Sehwag");
	  list.add("M.S Dhoni");
	  list.add("Yuvraj Singh");
	  list.add("Suresh Raina");
	  System.out.println(list);
	  
	  list.remove(2);
	  System.out.println(list);

  }
}
