package arrayList;

import java.util.ArrayList;
import java.util.Collections;


public class List12 {
	

	public static void main(String[] args) {
		ArrayList<String> mark = new ArrayList();
		mark.add("Sufiyan");
		mark.add("Nagaralli");
		mark.add("Jabbar");
		mark.add("GreenPark");
		mark.add(2, "Bhai");
		
		String s =mark.get(4);
		System.out.println(s);
		mark.set(0, "aaishanagaralli");
		System.out.println(mark);
		mark.sort(null);
		
		for(int i = 0; i<mark.size();i++) {
			System.out.println(mark.get(i));
		}
		//sort Arraylist
		Collections.sort(mark);
		System.out.println(mark);

	}

}
