package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CourseExample {
	public static void main(String[] args) {
		List<Course> courses = new ArrayList<>();

		Course c1 = new Course("1", "CSCI", "1301", "Introduction to Java I", 4);
		Course c2 = new Course("2", "CSCI", "1302", "Introduction to Java II", 3);
		Course c3 = new Course("3", "MATH", "2750", "Calculus I", 5);
		Course c4 = new Course("4", "EDUC", "1111", "Reading", 3);
		Course c5 = new Course("5", "ITEC", "1344", "Database Administration", 3);

		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
		courses.add(c4);
		courses.add(c5);

		courses.forEach(c -> System.out.println(c));

		Collections.sort(courses, new Comparator<Course>() {
			public int compare(Course ts1, Course ts2) {
				if (ts1.getNumOfCredits() > ts2.getNumOfCredits()) {
					return 1;
				} else {
					return -1;
				}
			}
		});


		System.out.println("After sorting:");

		courses.forEach(c -> System.out.println(c));
	}
}
