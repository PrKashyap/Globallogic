package HomeworkPrbl;

public class MainClass {

public static void main(String args[]) {
	
	PermissionClass pc=new PermissionClass();
	pc.addPermission();
	
	Role rl=new Role();
	rl.addRole();
	
	
	rl.setRole_id(20);
	
	
	int id=rl.getRole_id();
	System.out.println(id);
	
}

}
