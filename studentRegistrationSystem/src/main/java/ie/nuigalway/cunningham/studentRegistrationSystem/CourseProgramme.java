package ie.nuigalway.cunningham.studentRegistrationSystem;

//A course programme class containing course name (CS & IT or ECE, etc.), list of modules, list of students that are enrolled, academic start date and end date. 

import java.util.ArrayList;
import org.joda.time.DateTime;

public class CourseProgramme {
	
	
	private String courseName;
	private ArrayList<Module> modules;
	private ArrayList<Student> students;
	private DateTime startDate;
	private DateTime endDate;

	public CourseProgramme(String courseName, ArrayList<Module> modules, ArrayList<Student> students, DateTime startDate, DateTime endDate){
		
		this.courseName = courseName;
		this.modules = modules;
		this.students = students;
		this.startDate = startDate;
		this.endDate = endDate;		
				
	}
	
	//Getters and Setters!

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public ArrayList<Module> getModules() {
		return modules;
	}

	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public DateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}

	public DateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
	
	
	
	

}
