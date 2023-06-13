package HomeworkPrbl;

public class Course extends PermissionClass {
	

				private int course_id;
				
				public int getCourse_id() {
					return course_id;
				}

				public void setCourse_id(int course_id) {
					this.course_id = course_id;
				}

				public String  course_type;
				public String  course_Description;
				public String  course_name;
				public int course_student_id;
				public String  course_year;

				
				
				
				
				
				public void addCourse() {
					System.out.println("Course added");
				};
				
				public void editCourse() {
					System.out.println("Course edited");
				};

				public void deleteCourse() {
					System.out.println("Course deleted");
				};
				
				public void searchCourse() {
					System.out.println("Course Ssearched");
				};
				
			}
			
		


