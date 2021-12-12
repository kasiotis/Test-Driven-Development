package com.example.tddCoursework;

import java.util.List;

public class Student  {
	int id;
	private String name;
	private String postalAddress;
	private String eMail;
	private String courseTitle;
	private String enrollmentDate;
	private List<Module> moduleList;
	public Student(int id, String name, String postalAddress, String eMail, String courseTitle, String enrollmentDate, List<Module> moduleList) {
		super();
		this.id = id;
		this.name = name;
		this.postalAddress = postalAddress;
		this.eMail = eMail;
		this.courseTitle = courseTitle;
		this.enrollmentDate = enrollmentDate;
		this.moduleList = moduleList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPostalAddress() {
		return postalAddress;
	}
	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public String getEnrollmentDate() {
		return enrollmentDate;
	}
	public void setEnrollmentDate(String enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}
	public List<Module> getModuleList() {
		return moduleList;
	}
	public void setModuleList(List<Module> moduleList) {
		this.moduleList = moduleList;
	}

}
