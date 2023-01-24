import java.util.ArrayList;


/**
 * Course class to represent the course with couresId, name, teacher, student
 * and department.
 */
public class Course {
	/**
	 * @param courseId
	 * @param name
	 * @param teacher
	 * @param students
	 * @param department
	 * @param maxEnrollment
	 */
	public Course(int courseId, String name, Teacher teacher, ArrayList<Student> students, Department department,
			int maxEnrollment) {
		super();
		this.courseId = courseId;
		this.name = name;
		this.teacher = teacher;
		this.students = students;
		this.department = department;
		this.maxEnrollment = maxEnrollment;
	}

	 int courseId;
	 String name;
	 Teacher teacher;
	 ArrayList<Student> students;
	 Department department;
	 int maxEnrollment;

	public int getMaxEnrollment() {
		return maxEnrollment;
	}

	public void enrollStudent(Student student) {
	}

	public boolean isFull() {
		return false ;
	}

	public void addStudent(Student student) {

	}

	public void removeStudent(Student student) {

	}
 
}
