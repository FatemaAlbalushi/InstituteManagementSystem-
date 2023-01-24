import java.util.ArrayList;

/**
 * Institute class represent an institue with name, phone, address, and department. 
 */
public class Institute {
	
	/**
	 * @param name
	 * @param phone
	 * @param email
	 * @param address
	 * @param departments
	 */
	public Institute(String name, String phone, String email, String address, ArrayList<Department> departments) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.departments = departments;
	}
	private String name;
	private String phone;
	private String email;
	private String address;
	private ArrayList<Department>departments;

}
