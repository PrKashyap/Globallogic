package HomeworkPrbl;

public class PermissionClass{
	
private int permission_id;

public int getPermission_id() {
	return permission_id;
}

public void setPermission_id(int permission_id) {
	this.permission_id = permission_id;
}

public int permission_role_id;
public String permission_title;
public String permission_Description;



	public void addPermission() {
		
		System.out.println("Permission added");
	}
	
	
public void editPermission() {
		
		System.out.println("Permission edited");
	}


public void deletePermission() {
	
	System.out.println("Permission deleted");
}
	

public void searchPermission() {
	
	System.out.println("Permission searched");
}


}





