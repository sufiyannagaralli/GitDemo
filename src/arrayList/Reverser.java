package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Reverser {

	public static void main(String[] args) {
		ArrayList<Integer> obj1 = new ArrayList<Integer>();
		obj1.add(600);
		obj1.add(5);
		obj1.add(10);
		obj1.add(55);
		obj1.add(100);
		System.out.println(obj1);
		Collections.sort(obj1);
		System.out.println(obj1);
		Collections.reverse(obj1);
		System.out.println(obj1);

	}

}
