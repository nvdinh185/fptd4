package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
	public static void main(String a[]) {
		List<String> list = new ArrayList<String>();
		list.add("C");
		list.add("Core Java");
		list.add("Advanced Java");

		System.out.println("Initial collection value: " + list);

		Collections.addAll(list, "Servlet", "JSP");
		System.out.println("After adding elements collection value: " + list);

		String[] strArr = { "C#", ".Net" };
		Collections.addAll(list, strArr);
		
		System.out.println("After adding array collection value: " + list);

		Collections.sort(list);
		System.out.println("After sorting array collection value: " + list);

		System.out.println("Value of maximum element from the collection: " + Collections.max(list));
	}
}
