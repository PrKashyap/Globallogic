package HomeworkPrbl;

public class Classes extends PermissionClass {

	private int class_id;
	
	public int getClass_id() {
		return class_id;
	}

	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}

	public String class_type;
	public String class_Description;
	public int class_student_id;
	public String class_name;
	public String class_room;

	
	
	public void addRole() {
		System.out.println("class added");
	};
	
	public void editRole() {
		System.out.println("class edited");
	};

	public void deleteRole() {
		System.out.println("class deleted");
	};
	
	public void searchRole() {
		System.out.println("class Ssearched");
	};
	
}
