import java.sql.Date;

/**
 * Attendence class is for representing the attendence in the class room
 *  using date, event which is the class session and student 
 *
 */
public class Attendance {
	
	/**
	 * @param date
	 * @param event
	 * @param student
	 * @param present
	 */
	public Attendance(Date date, Event event, Student student, boolean present) {
		super();
		this.date = date;
		this.event = event;
		this.student = student;
		this.present = present;
	}

	private Date date;
	private Event event;
	private Student student;
	private boolean present;

	// boolean method to see if the student is present or not.
	public boolean isPresent() {
		return present;
	}

}
