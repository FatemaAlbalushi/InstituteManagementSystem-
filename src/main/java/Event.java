import java.sql.Date;
import java.util.List;

/**
 * 
 */

/**
 * Event class represent the class session and uses time,
 * date, course and teacher fields.
 */
public class Event {
	/**
	 * @param time
	 * @param date
	 * @param course
	 * @param teacher
	 * @param eventTopic
	 */
	public Event(String time, Date date, Course course, Teacher teacher, EventTopic eventTopic) {
		super();
		this.time = time;
		this.date = date;
		this.course = course;
		this.teacher = teacher;
		this.eventTopic = eventTopic;
	}
	
	 String time;
	 Date date;
	 Course course;
	 Teacher teacher;
	 EventTopic eventTopic;

}
   