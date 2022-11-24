package arrayList;

import java.util.List;
import java.util.stream.Stream;

public class Stream1 {

	public static void main(String[] args) {

		Stream.of("Sufiyan", "Jabbar", "Nagaralli", "Asif").filter(s->s.length()>=4).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		Stream<Integer> a  = Stream.of(11,11,22,22,5,5,44,4,48,0,48,0);
		a.distinct().forEach(s->System.out.println(s));
		
		
		
	}

}
