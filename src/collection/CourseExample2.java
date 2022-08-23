package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CourseExample2 {
	public static void main(String[] args) {
		List<Course2> courses = new ArrayList<>();

		Course2 c1 = new Course2("1", "CSCI", "1301", "Introduction to Java I", 4);
		Course2 c2 = new Course2("2", "CSCI", "1302", "Introduction to Java II", 3);
		Course2 c3 = new Course2("3", "MATH", "2750", "Calculus I", 5);
		Course2 c4 = new Course2("4", "EDUC", "1111", "Reading", 3);
		Course2 c5 = new Course2("5", "ITEC", "1344", "Database Administration", 3);

		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
		courses.add(c4);
		courses.add(c5);

		courses.forEach(c -> System.out.println(c));

		Collections.sort(courses);

		System.out.println("After sorting:");

		courses.forEach(c -> System.out.println(c));
	}
}
