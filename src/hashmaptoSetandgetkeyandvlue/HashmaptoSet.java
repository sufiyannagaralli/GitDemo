package hashmaptoSetandgetkeyandvlue;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmaptoSet {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Asheef");
		hm.put(1, "Abu");
		hm.put(2, "Sufiyan");
		hm.put(3, "Jabbar");
		hm.put(4, "Aaisha");

		Set a = hm.entrySet();
		Iterator i = a.iterator();
		while (i.hasNext()) {
			Map.Entry s = (Map.Entry) i.next();
			System.out.println(s.getKey());
			System.out.println(s.getValue());

		}

	}

}
