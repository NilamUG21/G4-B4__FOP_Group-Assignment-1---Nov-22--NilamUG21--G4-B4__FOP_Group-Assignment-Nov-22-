package com.gl.assignmentgroup;

public class TechDepartment extends SuperDepartment			//TechDepartment extends SuperDepartment
{
	public String departmentName()						//overrides the departmentName()
	{
		return "Tech Department";
	}
	public String getTodaysWork()						//overrides getTodaysWork()
	{
		return "Complete coding of module 1";
	}
	public String getWorkDeadline()						//overrides getWorkDeadline()
	{
		return "Complete by EOD";
	}
	public String getTechStackInformation()
	{
		return "core Java";
	}
}


