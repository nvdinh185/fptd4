package collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortExample {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();

		al.add(12);
		al.add(3);
		al.add(6);
		al.add(37);
		al.add(4);
		al.add(9);

		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
	}

}
