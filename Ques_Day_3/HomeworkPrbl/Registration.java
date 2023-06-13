package HomeworkPrbl;
import java.util.*;
public class Registration extends PermissionClass {


		private int registration_id;
		
		public int getRegistration_id() {
			return registration_id;
		}

		public void setRegistration_id(int registration_id) {
			this.registration_id = registration_id;
		}

		public String registration_type;
		public String registrations_Description;
		public int registration_student_id;
		public String registration_name;
		public String registration_number;
		public Date registration_date=new Date();

		
		
		public void addRegistration() {
			System.out.println("Registration added");
		};
		
		public void editRegistration() {
			System.out.println("Registration edited");
		};

		public void deleteRegistration() {
			System.out.println("Registration deleted");
		};
		
		public void searchRegistration() {
			System.out.println("Registration Ssearched");
		};
		
	}
	
	

