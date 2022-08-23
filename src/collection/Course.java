package collection;

public class Course {
	private String courseId;
	private String subjectId;
	private String courseCode;
	private String courseTitle;
	private int numOfCredits;

	public Course() {
	}

	public Course(String courseId, String subjectId, String courseCode, String courseTitle, int numOfCredits) {
		super();
		this.courseId = courseId;
		this.subjectId = subjectId;
		this.courseCode = courseCode;
		this.courseTitle = courseTitle;
		this.setNumOfCredits(numOfCredits);
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", subjectId=" + subjectId + ", courseCode=" + courseCode
				+ ", courseTitle=" + courseTitle + ", numOfCredits=" + getNumOfCredits() + "]";
	}

	public int getNumOfCredits() {
		return numOfCredits;
	}

	public void setNumOfCredits(int numOfCredits) {
		this.numOfCredits = numOfCredits;
	}

}
