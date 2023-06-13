package HomeworkPrbl;

public class School extends Course{
	
	  


			private int school_id;
			public int getSchool_id() {
				return school_id;
			}

			public void setSchool_id(int school_id) {
				this.school_id = school_id;
			}

			public String school_type;
			public String school_Description;
			public String school_name;
			
			
			
			public void addSchool() {
				System.out.println("School added");
			};
			
			public void editSchool() {
				System.out.println("School edited");
			};

			public void deleteSchool() {
				System.out.println("School deleted");
			};
			
			public void searchSchool() {
				System.out.println("School Ssearched");
			};
			
		}
		
	