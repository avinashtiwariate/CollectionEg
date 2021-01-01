package CollectionFrame;

import java.util.ArrayList;

public class IntroductionList 
{
	public static void main(String[] args) 
	{
		/* List preserves order
		 * list allows duplication
		 */
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(4);
		al.add(2);
		al.add(6); //4th index
		
		//System.out.println(al.get(3));
		
		System.out.println("size of the arraylist is "+al.size());
		
		                  
		/*
		 * for (int i = 0; i<al.size() ; i++) { System.out.println(al.get(i)); }
		 */
		
		for ( Integer o : al) 
		{
			System.out.println(o);
		}
	}

}
