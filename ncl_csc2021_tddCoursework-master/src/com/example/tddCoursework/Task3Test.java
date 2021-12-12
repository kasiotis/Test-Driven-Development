package com.example.tddCoursework;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.example.tddCoursework.RecordManager;

public class Task3Test extends AbstractLoggingJUnitTest{

	@Test
	public void testChangeNameAddress() {
		RecordManager test = new RecordManager();
		Student person = new Student(8099312,"John","ne1 5at","john@gmail.com","Computer Science","25/9/2018",null);
		test.insertValues(person);
		test.changeNameAddress("John", "Mary", "ne3 6aa");

		
		assertEquals("Mary", person.getName() );
		assertEquals("ne3 6aa", person.getPostalAddress());
	}

	
	
	@Test
	public void testAddModule() {
		RecordManager test = new RecordManager();
		Module mod1 = new Module("CSC2055","Mathematics",55, 20);
		Module mod2 = new Module("CSC2000","Programming",60, 20);
		ArrayList<Module> set = new ArrayList<Module>();
		set.add(mod1);
		//new module list to be used
		ArrayList<Module> set1 = new ArrayList<Module>();
		set1.add(mod2);
		Student person = new Student(8099312,"John","ne1 5at","john@gmail.com","Computer Science","25/9/2018", set);
		test.insertValues(person);
		test.addModule(8099312, set1);
		
		assertEquals(set1, person.getModuleList());
		
	}
	

	@Test
	public void testAverageMark() {
		RecordManager test = new RecordManager();
		
		Module mod1 = new Module("CSC2055","Mathematics",50, 20);
		Module mod2 = new Module("CSC2000","Programming",60, 20);
		ArrayList<Module> set = new ArrayList<Module>();
		set.add(mod2);
		set.add(mod1);
		
		Student person = new Student(8053355,"lele","ne5 00a","lele@gmail.com","Economics","25/9/2018",set);
		test.insertValues(person);
		double a = test.averageMark(person.getId());
		
		assertEquals( 55.0 , a, 0.001);
	}
	
}
