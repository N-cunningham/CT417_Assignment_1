package ie.nuigalway.cunningham.studentRegistrationSystem;

import java.util.ArrayList;

//A module class, which should contain information such as module name, id (e.g. CT417), list of students, courses it is associated with).

public class Module {
	
	private String name;
	private int id;
	private ArrayList<Student> students;
	private ArrayList<String> courses;

	Module(String name, int id, ArrayList<Student> students, ArrayList<String> courses){
		
		this.name = name;
		this.id = id;
		this.students = students;
		this.courses = courses;
		
	}

	
	//Getters and Setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public ArrayList<String> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<String> courses) {
		this.courses = courses;
	}
	
	

}
