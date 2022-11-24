package set;

import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {
		HashSet<Integer> obj1 = new HashSet<Integer>();
		obj1.add(10);
		obj1.add(255);
		obj1.add(20);
		obj1.add(30);
		obj1.contains(5);
		
		Iterator i = obj1.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
 
	}

}