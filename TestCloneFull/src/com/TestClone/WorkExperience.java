package com.TestClone;

public class WorkExperience implements Cloneable{
	
	public String workDate;
	public String company;
	
	public void setWorkDate(String workDate){
		this.workDate = workDate;
	}
	
	public String getWorkDate(){
		return workDate;
	}
	
	public void setCompany(String company){
		this.company = company;
	}
	
	public String getCompany(){
		return company;
	}
	
	public Object Clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
