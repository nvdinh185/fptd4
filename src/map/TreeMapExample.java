package map;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "Java");
		map.put(102, "Net");
		map.put(101, "Test");
		map.put(103, "C++");
		map.put(101, "Automation Test");

		System.out.println("Before invoking remove() method");
		for (Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		map.remove(102);
		System.out.println("After invoking remove() method");
		for (Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		map.put(104, "Android");
		map.put(105, "iOS");

		// Returns key-value pairs whose keys are less than the specified key.
		System.out.println("headMap: " + map.headMap(104));
		// Returns key-value pairs whose keys are greater than or equal to the
		// specified key.
		System.out.println("tailMap: " + map.tailMap(104, false));
		// Returns key-value pairs exists in between the specified key.
		System.out.println("subMap: " + map.subMap(100, 104));

	}

}
