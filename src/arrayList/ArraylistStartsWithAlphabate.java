package arrayList;

import java.util.ArrayList;

public class ArraylistStartsWithAlphabate {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Sufiyan");
		list.add("Abdul");
		list.add("Jabbar");
		list.add("Aaisha");
		list.add("Asif");
		int count = 0;

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);

			if (str.startsWith("A")) {
				count++;

			}

		}

	}

}
