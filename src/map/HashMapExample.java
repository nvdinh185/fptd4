package map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapExample {
	public static void main(String args[]) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating HashMap
		map.put(1, "Mango"); // Put elements in Map
		map.put(3, "Banana");
		map.put(null, null);
		map.put(5, "Orange");
		map.put(4, "Orange");
		map.put(1, "Grapes"); // trying duplicate key

		System.out.println("Iterating Hashmap...");

		for (Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		HashMap<String, String> map2 = new HashMap<>();// Creating HashMap
		map2.put("b1", "Mango"); // Put elements in Map
		map2.put("a3", "Banana");
		map2.put("c2", null);
		map2.put("d4", "Orange");
		map2.put("b1", "Grapes"); // trying duplicate key

		System.out.println("Iterating Hashmap...");

		for (Entry<String, String> m : map2.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		TreeMap<String, String> map3 = new TreeMap<>();// Creating HashMap
		map3.put("b1", "Mango"); // Put elements in Map
		map3.put(null, "jjjj");//NullPointerException
		map3.put("c2", "Apple");
		map3.put("d4", "Orange");
		map3.put("b1", "Grapes"); // trying duplicate key

		System.out.println("Iterating Hashmap...");

		for (Entry<String, String> m : map3.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
