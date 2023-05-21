import java.util.List;

/**
 * computerScience class is computer Science Department enherited from department class
 */
public class computerScience extends Department {

	
	
	

		/**
	 * @param name
	 * @param staff
	 * @param students
	 * @param courses
	 */
	public computerScience(String name1, List<Staff> staff1, List<Student> students, List<Course> courses) {
		super(name1, staff1);
		this.name = name1;
		this.staff = staff1;
		this.students = students;
		this.courses = courses;
	}

		private List<Student> students;
		private List<Course> courses;
	    
	    
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


