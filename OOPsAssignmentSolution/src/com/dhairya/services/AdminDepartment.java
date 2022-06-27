package com.dhairya.services;

import com.dhairya.model.SuperDepartment;

/*This class shows the functionality of admin department 
 * like department name,today work, deadline
 * 
 */

public class AdminDepartment extends SuperDepartment {
	
	public String departmentName() {
		return "Admin Department";
	}
	
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}
	
	public String getWorkDeadline(){
		return "Complete by EOD";
	}
	
}
