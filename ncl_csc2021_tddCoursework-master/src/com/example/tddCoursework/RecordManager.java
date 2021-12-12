package com.example.tddCoursework;

import java.util.ArrayList;
import java.util.List;

public class RecordManager {

	private String deparment;
	private ArrayList<Student> details = new ArrayList<Student>();

	
	public RecordManager(ArrayList<Student> details, String department) {
		super();
		this.deparment = department; // check later
		this.details = details;
	}

	public RecordManager(){
		this.details=new ArrayList<>();
	}
	
	
	public void insertValues(Student student){
		if (student != null) {
			details.add(student);
		}
	}
	
	public List<Student> retrieve() {	
		return details;
	}

	public ArrayList<Student> searchName(String name) {
		
		ArrayList<Student> Matches = new ArrayList<Student>();
	
		int i = 0;
		if(details.size()!=0){	
			
		while(i<details.size()){	
			
			if (details.get(i).getName().equalsIgnoreCase(name)){
				Matches.add(details.get(i));
			}
			i++;
		}
		
		}else{
			System.out.println("No Entries found!");
		}
		return Matches;
	}
	
	
	public void changeNameAddress(String name, String newName, String newAddress) {
		
		if(details.size()!=0){
		
		for (int i = 0; i < details.size(); i++) {
			if(details.get(i).getName().equalsIgnoreCase(name)) {
				details.get(i).setName(newName);
				details.get(i).setPostalAddress(newAddress);
			}
		}
		
		}else{
			System.out.println("No Entries found!");
		}
	}
	
	//change instead of a whole new list of modules insert only one new module
	public void addModule (int id, ArrayList<Module> moduleList){
		if(details.size()!=0){
			
			for (int i = 0; i < details.size(); i++) {
				
				if(details.get(i).getId() == id) {			
					details.get(i).setModuleList(moduleList);
				}
				
			}
			
		}else{
			System.out.println("No Entries found!");
		}
	
	}


	public double averageMark(int id){
		
		double sum = 0;
		double avg = 0;
		
		if(details.size()!=0){
			//go through all the students
			for (int i = 0; i < details.size(); i++) {
				//check if the given id matches a student's id
				if(details.get(i).getId() == id){
					
					//go through all the student's modules
					int numberOfModules = details.get(i).getModuleList().size();
					for(int j = 0; j < numberOfModules; j++){
						//for each module, get it's mark and add it to the sum
						sum += details.get(i).getModuleList().get(j).getModuleMark();
					}
					//calculate average by dividing the sum with the number of modules
					avg = sum/numberOfModules;
				}
				
			}
			
		}else{
			System.out.println("No Entries found!");
		}
		
		
		return avg;
	}
	
	public static void main(String[] args) {

	}
	
}
