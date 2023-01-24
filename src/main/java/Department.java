import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * The Department class represents a department in the institute.
 * It contains the name of the department and lists of students, Staff, 
 * and courses associated with the department.
 */
public class Department {
	/**
	 * @param name
	 * @param staff
	 * @param students
	 * @param courses
	 */
	public Department(String name, List<Staff> staff, List<Student> students, List<Course> courses) {
		super();
		this.name = name;
		this.staff = staff;
		this.students = students;
		this.courses = courses;
	}

	private String name;
	private List<Staff> staff;
	private List<Student> students;
    private List<Course> courses;
	

    
    /**
     * Add a Staff to the department.
     * @param Staff: The staff to add to the department.
     */
    public void addStaff(Staff staff) {
        
    }
	
    
    /**
     * Add a course to the department.
     * @param course The course to add to the department.
     */
    public void addCourse(Course course) {
        this.courses.add(course);
    }
    
    /**
     * Get the list of courses associated with the department.
     * @return The list of courses associated with the department.
     */
    public List<Course> getCourses() {
        return courses;
    }
    
    
	
	 
	

	

}
