import java.sql.Date;
import java.util.List;

/**
 * 
 */

/**
 * Event class represent the class session and uses time,
 * date, course and teacher fields.
 *
 */
public class Event {
	/**
	 * @param time
	 * @param date
	 * @param course
	 * @param teacher
	 */
	public Event(String time, Date date, Course course, Teacher teacher) {
		super();
		this.time = time;
		this.date = date;
		this.course = course;
		this.teacher = teacher;
	}
	private String time;
	private Date date;
	private Course course;
	private Teacher teacher;

}
