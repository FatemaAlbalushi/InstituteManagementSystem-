
/**
 * Enrollment class is to see each student enroll in which course
 * using student and course fields.
 */
public class Enrollment {
	/**
	 * @param student
	 * @param course
	 * @param status
	 * @param grade
	 */
	public Enrollment(Student student, Course course, String status, double grade) {
		super();
		this.student = student;
		this.course = course;
		this.status = status;
		this.grade = grade;
	}

	private Student student;
	private Course course;
	private String status;
	private double grade;

	public void setGrade(double grade) {

	}


}
