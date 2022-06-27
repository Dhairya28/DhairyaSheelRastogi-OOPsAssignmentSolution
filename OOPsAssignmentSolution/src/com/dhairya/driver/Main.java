package com.dhairya.driver;

import com.dhairya.services.AdminDepartment;
import com.dhairya.services.HrDepartment;
import com.dhairya.services.TechDepartment;


/*This is the main  class for the department it 
 *will shows the functionality of all department 
 * 
 */
public class Main {

	public static void main(String[] args) {
		
		// object creation for admin department
		AdminDepartment admin = new AdminDepartment();
		System.out.println("Welcome to "+ admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday()+'\n');
		
		// object creation for hr department
		HrDepartment hr = new HrDepartment();
		System.out.println("Welcome to "+ hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday()+'\n');
		
		// object creation for tech department
		TechDepartment tech = new TechDepartment();
		System.out.println("Welcome to "+ tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
			
	}

}
