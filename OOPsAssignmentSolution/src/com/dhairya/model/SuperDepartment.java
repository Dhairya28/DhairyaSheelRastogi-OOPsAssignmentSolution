package com.dhairya.model;

/*This class shows is the super class for all other department 
 *and other department will extend it 
 *functionality department name ,todays work,work deadline, today is a holiday or not 
 * 
 */
public class SuperDepartment {
	
	public String departmentName() {
		return "Super Department";
	}
	
	public String getTodaysWork() {
		return "No Work as of now";
	}
	
	public String getWorkDeadline(){
		return "Nil";
	}
	public String isTodayAHoliday() {
		return "Today is not a holiday";
		
	}
}
