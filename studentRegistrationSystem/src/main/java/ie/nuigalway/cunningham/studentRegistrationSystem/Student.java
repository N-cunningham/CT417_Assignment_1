package ie.nuigalway.cunningham.studentRegistrationSystem;

import java.util.ArrayList;
import org.joda.time.DateTime;
//A student class should contain some attributes such as (Name, Age, DOB, ID,username, courses and modules registered for, etc.).

public class Student {

	private String name;
	private int age;
	private DateTime DOB;
	private int ID;
	private String courses;
	private ArrayList<Module> modules;
	private String username;

	public Student(String name, int age, DateTime DOB, int ID, String courses, ArrayList<Module> modules) {

		this.name = name;
		this.age = age;
		this.DOB = DOB;
		this.ID = ID;
		this.courses = courses;
		this.modules = modules;
		this.username = getUsername();

	}

	//Method to generate a username for a user
	
	public String getUsername() {
		
		return this.name + this.age;
		
	}
	
	//Getters and Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public DateTime getDOB() {
		return DOB;
	}

	public void setDOB(DateTime dOB) {
		DOB = dOB;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public ArrayList<Module> getModules() {
		return modules;
	}

	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
