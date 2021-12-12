package com.example.tddCoursework;

public class Module {

	private String moduleCode;
	private String moduleTitle;
	int moduleMark;
	int moduleCredit;
	
	public Module(String moduleCode, String moduleTitle, int moduleMark, int moduleCredit) {
		super();
		this.moduleCode = moduleCode;
		this.moduleTitle = moduleTitle;
		this.moduleMark = moduleMark;
		this.moduleCredit = moduleCredit;
	}
	
	public String getModuleCode() {
		return moduleCode;
	}
	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}
	public String getModuleTitle() {
		return moduleTitle;
	}
	public void setModuleTitle(String moduleTitle) {
		this.moduleTitle = moduleTitle;
	}
	public int getModuleMark() {
		return moduleMark;
	}
	public void setModuleMark(int moduleMark) {
		this.moduleMark = moduleMark;
	}
	public int getModuleCredit() {
		return moduleCredit;
	}
	public void setModuleCredit(int moduleCredit) {
		this.moduleCredit = moduleCredit;
	}
}
