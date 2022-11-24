package hashmap;

import java.util.HashMap;

public class Hashbasic {

	public static void main(String[] args) {
		HashMap<String, Integer> hash = new HashMap<>();
		hash.put("Bangalure ", 1);
		hash.put("NewYork ", 2);
		hash.put("London ", 3);
		hash.put("London ", 3);
		hash.put("London ", 3);
		hash.put("London ", 3);
		hash.put("jakarta ", 4);
		System.out.println(hash);
		System.out.println(hash.size());
		System.out.println(hash.containsKey("Lon "));
		System.out.println(hash.get("London "));
		System.out.println(hash.get("Lond "));
		for(String coun:hash) {
			System.out.println(i);
		}

	}

}
