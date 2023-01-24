/**
 * Student class represent student with her/his fields which are:
 * studentIs, name, age, phone, email, and address
 *
 */
public class Student {
	/**
	 * @param studentId
	 * @param name
	 * @param age
	 * @param phone
	 * @param email
	 * @param address
	 */
	public Student(int studentId, String name, int age, String phone, String email, String address) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}

	 int studentId;
	 String name;
	 int age;
	 String phone;
	 String email;
	 String address;
	

	public void enrollCourse(Course course) {
		
	}
	
	public void dropCourse(Course course) {

	}

	

}
