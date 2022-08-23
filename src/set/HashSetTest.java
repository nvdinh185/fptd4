package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetTest {
	public static void main(String[] args) {

		// Creating HashSet and adding elements
		HashSet<String> set = new HashSet<>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Three"); // ignoring duplicate elements
		set.add("Four");
		set.add(null); //allow null value
		set.add("Five");
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("===============================");
		// Creating HashSet and adding elements
		TreeSet<String> set2 = new TreeSet<>();
		set2.add("One");
		set2.add("Two");
//		set2.add(null);// NullPointerException
		set2.add("Three"); // ignoring duplicate elements
		set2.add("Four");
		set2.add("Five");
		Iterator<String> i2 = set2.iterator();
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}
	}

}
