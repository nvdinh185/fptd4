package collection;

public class Course2 implements Comparable<Course2> {
	private String courseId;
	private String subjectId;
	private String courseCode;
	private String courseTitle;
	private int numOfCredits;

	public Course2() {
	}

	public Course2(String courseId, String subjectId, String courseCode, String courseTitle, int numOfCredits) {
		super();
		this.courseId = courseId;
		this.subjectId = subjectId;
		this.courseCode = courseCode;
		this.courseTitle = courseTitle;
		this.numOfCredits = numOfCredits;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", subjectId=" + subjectId + ", courseCode=" + courseCode
				+ ", courseTitle=" + courseTitle + ", numOfCredits=" + numOfCredits + "]";
	}

	@Override
	public int compareTo(Course2 c) {
		return (this.numOfCredits - c.numOfCredits);
	}

}
