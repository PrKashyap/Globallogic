package HomeworkPrbl;

public class Role extends PermissionClass {

	
	private int role_id;
	
	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String role_title;
	public String role_description;
	
	public void addRole() {
		System.out.println("Roll added");
	};
	
	public void editRole() {
		System.out.println("Roll edited");
	};

	public void deleteRole() {
		System.out.println("Roll deleted");
	};
	
	public void searchRole() {
		System.out.println("Roll Ssearched");
	};

	public void assignRole() {
		System.out.println("Roll assinged");
	};


}
