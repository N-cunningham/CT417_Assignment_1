package ie.nuigalway.cunningham.studentRegistrationSystem;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.joda.time.DateTime;
import org.junit.Test;

public class AppTest {


	@Test
	public void getUsernameMethodTest() {
		
		DateTime d1 = new DateTime();		
		ArrayList<Module> modules = new ArrayList();
		String name = "Conway Stern";
		int age = 49;
				
		Student s1 = new Student(name, age, d1, 1066, "BCT", modules);
		
		assertEquals(s1.getUsername(), (name + age));
	     
	}
	
	@Test
	public void testStudentsGetsAndSets() {
		
		DateTime d1 = new DateTime();		
		ArrayList<Module> modules = new ArrayList();
		String name = "Raqndy Randerson";
		int age = 45;
		String cource = "BCT";
		Student s1 = new Student(name, age, d1, 1056, cource, modules);
		
		assertEquals(s1.getName(), name);
		assertEquals(s1.getAge(), age);
		assertEquals(s1.getCourses(), cource);
		assertEquals(s1.getDOB(), d1);
		assertEquals(s1.getModules(), modules);
	     
	}
	
	@Test
	public void testModulesGetsAndSets() {
		
		DateTime d1 = new DateTime();		
		ArrayList<Student> students = new ArrayList();
		ArrayList<String> courses = new ArrayList();
		String name = "Nets & comms II";
		int ID = 201;
		String cource = "BCT";
		Module s1 = new Module(name, 201, students, courses);
				
		assertEquals(s1.getName(), name);
		assertEquals(s1.getId(), ID);
		assertEquals(s1.getStudents(), students);
		assertEquals(s1.getCourses(), courses);
	     
	}
	
	@Test
	public void testCourseProgrammeGetsAndSets() {
		
		DateTime d1 = new DateTime();		
		ArrayList<Module> modules = new ArrayList();
		ArrayList<Student> students = new ArrayList();
		String courseName = "CS & IT";
		int age = 45;
		String cource = "BCT";
		DateTime startDate = new DateTime();
		DateTime endDate = new DateTime();
		CourseProgramme c1 = new CourseProgramme(courseName, modules, students, startDate, endDate);
				
		assertEquals(c1.getCourseName(), courseName);
		assertEquals(c1.getModules(), modules);
		assertEquals(c1.getStudents(), students);
		assertEquals(c1.getStartDate(), startDate);
		assertEquals(c1.getEndDate(), endDate);
	     
	}
	
	
}




