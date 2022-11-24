package linkedlist;

import java.util.LinkedList;

public class Practice {

	public static void main(String[] args) {
		LinkedList<String> car = new LinkedList();
		car.add("Marazzo");
		car.add("Innova");
		car.add("Ertiga");
		car.add("kia carneval");
		System.out.println(car);
		car.addFirst("Fortuner");
		System.out.println(car);
		car.removeLast();
		System.out.println(car);
		car.contains(car);
		System.out.println(car.getFirst());
		System.out.println(car.getLast());
		car.addFirst("Swift");
		System.out.println(car);
		car.removeFirst();
		System.out.println(car);
		

	}

}
