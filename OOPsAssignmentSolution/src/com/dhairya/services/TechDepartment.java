package com.dhairya.services;

import com.dhairya.model.SuperDepartment;
/*This class shows the functionality of tech department 
 * like department name,today work, deadline, tech stack information
 * 
 */
public class TechDepartment extends SuperDepartment {
	
	public String departmentName() {
		return "Tech Department";
	}
	
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}
	
	public String getWorkDeadline(){
		return "Complete by EOD";
	}
	
	public String getTechStackInformation() {
		return "core Java";
	}

}
