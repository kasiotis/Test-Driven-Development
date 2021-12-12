package com.example.tddCoursework;

import static org.junit.Assert.*;

import java.util.ArrayList;


import org.junit.Test;

public class Task2Test {
	
	@Test
	public void testNull(){
		RecordManager test = new RecordManager();
		assertNotNull(test);
	}
	@Test
	public void testRetrieve(){
		RecordManager test = new RecordManager();
		Student person2 = new Student(8053355,"lele","ne5 00a","lele@gmail.com","Economics","25/9/2018",null);
		Student person3 = new Student(8035526,"kiki","ne1 5ax","kiki@gmail.com","Finance","28/9/2019",null);

		test.insertValues(person2);
		test.insertValues(person3);
		
		ArrayList<Student> studentList = new ArrayList<Student>();

		studentList.add(person2);
		studentList.add(person3);
		
		assertEquals(studentList ,test.retrieve());
	}
	
	@Test
	public void testGetId(){	
		Student person2 = new Student(8053355,"lele","ne5 00a","lele@gmail.com","Economics","25/9/2018",null);
		assertEquals(8053355, person2.getId());
	}
	
	@Test
	public void testGetName(){
		Student person = new Student(8099312,"John","ne1 5at","john@gmail.com","Computer Science","25/9/2018",null);

		assertEquals("John", person.getName());
	}
	
	@Test
	public void testGetPostalAddress(){
		Student person = new Student(8099312,"John","ne1 5at","john@gmail.com","Computer Science","25/9/2018",null);

		assertEquals("ne1 5at", person.getPostalAddress());
	}
	
	@Test
	public void testgetEmail(){
		Student person = new Student(8099312,"John","ne1 5at","john@gmail.com","Computer Science","25/9/2018",null);

		assertEquals("john@gmail.com", person.geteMail());
	}
	
	@Test
	public void testGetCourseTitle(){
		Student person1 = new Student(8123444,"fefe","ne2 2ja","fefe@gmail.com","Computer Science","25/9/2017",null);
		assertEquals("Computer Science", person1.getCourseTitle());
	}
	
	@Test
	//testing getModuleList method from Student Class
	public void testGetModuleList(){
		Module mod2 = new Module("CSC2000","Programming",60, 20);
		Module mod3 = new Module("CSC2019","Web Development",92, 10);
		ArrayList<Module> set = new ArrayList<Module>();
		set.add(mod2);
		set.add(mod3);
		Student person1 = new Student(8123444,"fefe","ne2 2ja","fefe@gmail.com","Computer Science","25/9/2017",set);
		assertEquals(set, person1.getModuleList());
	}
	
	@Test
	//testing getModuleCode method from Module Class
	public void testGetModuleCode(){
		Module mod1 = new Module("CSC2055","Mathematics",55, 20);
		assertEquals("CSC2055", mod1.getModuleCode());
	}
	
	@Test
	//testing getModuleTitle method from Module Class
	public void testGetModuleTitle(){
		Module mod1 = new Module("CSC2055","Mathematics",55, 20);
		assertEquals("Mathematics", mod1.getModuleTitle());
	}
	
	@Test
	//testing getModuleMark method from Module Class
	public void testGetModuleMark(){
		Module mod3 = new Module("CSC2019","Web Development",92, 10);
		assertEquals(92, mod3.getModuleMark());
	}
	
	@Test
	//testing getModuleCredit method from Module Class
	public void testGetModuleCredit(){
		Module mod2 = new Module("CSC2000","Programming",60, 20);
		assertEquals(20, mod2.getModuleCredit());
	}
	
	@Test
	//testing searchName method from RecordManager Class
	public void testsearchName(){

		RecordManager test = new RecordManager();
		
		Module mod1 = new Module("CSC2055","Mathematics",55, 20);
		ArrayList<Module> set1 = new ArrayList<Module>();
		set1.add(mod1);
		
		Student person2 = new Student(8053355,"lele","ne5 00a","lele@gmail.com","Economics","25/9/2018",set1);
		test.insertValues(person2);
		
		ArrayList<Student> matched = new ArrayList<Student>();
		matched.add(person2);
		
		assertEquals(matched, test.searchName("lele"));	
	}
	

}
