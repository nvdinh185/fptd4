package example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Sample {
	public static void main(String[] args) {
		//===========================HashSet============================
		Set<String> set1 = new HashSet<>();
		set1.add("A");
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add(null);
		set1.add("D");

		Set<String> set2 = new HashSet<>();
		set2.add("ABC");
		set2.add("AB");
		set2.add("Z");

		set1.removeIf(t -> t == "B");
		set1.removeIf(t -> t == null);

		set1.addAll(set2);

		Iterator<String> iter = set1.iterator();
		while (iter.hasNext()) {
			String string = (String) iter.next();
			System.out.println(string);
		}

		set1.forEach(t -> System.out.println(t));
		// =============================TreeSet===================================
		TreeSet<Integer> set = new TreeSet<>();
		set.add(1);
		set.add(10);
		set.add(8);
		set.add(9);
		set.add(2);
		set.add(67);

		System.out.println(set.ceiling(11));
		System.out.println(set.floor(11));

		//===============================HashMap=========================================
		Map<Integer, HocVien> map = new HashMap<Integer, HocVien>();
		map.put(1, new HocVien("1", "a"));
		map.put(4, new HocVien("4", "d"));
		map.put(2, new HocVien("2", "b"));
		map.put(3, new HocVien("3", "c"));

		for (Entry<Integer, HocVien> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
}
