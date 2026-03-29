package List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Collections;

public class demo_ArrayList {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//Without Var
		ArrayList<String> cars = new ArrayList<String>();
		
//		to add elements
		cars.add("Rupali");
		cars.add("Aaju");
		cars.add("Arvind");
		cars.add("tulsi");
		
//		You can also add an element at a specified position by referring to the index number:
		cars.add(4,"Purva");
		System.out.println(cars);
		
//		To access the element 
		System.out.println(cars.get(0));
		
//		To modify an element
		cars.set(3,"Abhinav");
		System.out.println(cars);
		
//		To remove an element
		cars.remove(4);
		System.out.println(cars);
		
		
//		To find out size of arraylist
		cars.size();
		System.out.println(cars.size());
		
		
//		loop through arraylist
		for(int i=0;i<cars.size();i++)
		{
			System.out.println(cars.get(i));
		}
		
		
//		for each loop
		for(String i : cars)
		{
			System.out.println(i);
		}
		
		
		
//		To remove all the element
		cars.clear();
		System.out.println(cars);
		
		
//		Integer 
		ArrayList<Integer> mynum = new ArrayList<Integer>();
		mynum.add(10);
		mynum.add(5);
		mynum.add(25);
		mynum.add(15);
		
		for(int i: mynum)
		{
			System.out.println(i);
		}
		
		
//		Sorting of arraylist
		Collections.sort(mynum);
		System.out.println(mynum);
		
//	With Var
		var num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		
		System.out.println(num);
		System.out.println("------------------");
		
//Iterator 
		Iterator<Integer> itr = num.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("------------------");
		
//		ListIterator
		ListIterator<Integer> it = num.listIterator(num.size());
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
		
		
		
	}

}
