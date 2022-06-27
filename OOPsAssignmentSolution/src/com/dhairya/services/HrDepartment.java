package com.dhairya.services;

import com.dhairya.model.SuperDepartment;

/*This class shows the functionality of hr department 
 * like department name,today work, deadline, activity
 * 
 */
public class HrDepartment extends SuperDepartment{
	
	public String departmentName() {
		return "Hr Department";
	}
	
	public String getTodaysWork() {
		return "Fill today’s worksheet and mark your attendance";
	}
	
	public String getWorkDeadline(){
		return "Complete by EOD";
	}
	
	public String doActivity () {
		return "team lunch";
	}

}
