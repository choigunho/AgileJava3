
public class CourseSession {
	private String department;
	private final String number;
	
	CourseSession(String department, String number){
		this.department = department;
		this.number = number;
	}
	
	String getDepartment(){
		return department;
	}
	
	String getNumber(){
		return number;
	}

}
