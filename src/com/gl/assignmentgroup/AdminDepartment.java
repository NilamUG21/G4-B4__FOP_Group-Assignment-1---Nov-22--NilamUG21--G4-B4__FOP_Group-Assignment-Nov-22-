package com.gl.assignmentgroup;

public class AdminDepartment extends SuperDepartment{		//AdminDepartment extends SuperDepartment
	
	public String departmentName()
	{
		return "Admin Department";					//overrides the departmentName()
	}
	
	
	public String getTodaysWork()
	{
		return "Complete your documents Submission";	//overrides getTodaysWork()
	}
	
	
	public String getWorkDeadline()
	{
		return "Complete by EOD";						//overrides getWorkDeadline()
	}
	public String doActivity()
	{
		return "teamlunch";						//overrides getWorkDeadline()
	}
}

