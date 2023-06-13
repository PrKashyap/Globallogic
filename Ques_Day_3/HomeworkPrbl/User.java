package HomeworkPrbl;
import java.util.Date;

public class User extends Role {
	
	private int user_id;
	
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int user_role_id;
	public String user_email;
	Date user_dob=new Date(); 
	public String user_address;
	
	public void addUser() {
		System.out.println("User Added");
	};
	
	public void editUser() {
		System.out.println("User edited");
	};
	
	public void deleteUser() {
		System.out.println("User deleted");
	};
	
	public void searchUser() {
		System.out.println("User Searched");
	};
	
}


