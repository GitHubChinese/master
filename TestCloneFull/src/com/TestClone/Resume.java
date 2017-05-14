package com.TestClone;

import java.io.Serializable;

public class Resume implements Serializable {

	private String name;
	private String sex;
	private String age;
	
	private WorkExperience work;
	
	public Resume(String name){
		this.name = name;
		work = new WorkExperience();
	}
	
	private Resume(WorkExperience work) throws CloneNotSupportedException {
		this.work = (WorkExperience) work.Clone();
	}
	
	//���ø�����Ϣ
	public void setPersonalInfo(String sex,String age){
		this.sex = sex;
		this.age = age;
	}
	
	//���ù�������
	public void setWorkExperience(String workDate,String company){
		work.workDate = workDate;
		work.company = company;
	}
	
	//��ʾ
	public void Display(){
		System.out.println(name + " " + sex + " " + age);
		System.out.println("����������" + work.workDate + " " + work.company);
	}
	
	public Object Clone() throws CloneNotSupportedException {
		Resume obj = new Resume(this.work);
		obj.name = this.name;
		obj.sex = this.sex;
		obj.age = this.age;
		return obj;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Resume a = new Resume("����");
		a.setPersonalInfo("Ů", "29");
		a.setWorkExperience("1998-2000", "xx��˾");
		
		Resume b = (Resume) a.Clone();
		b.setWorkExperience("1998-2006", "YY��ҵ");
		
		Resume c = (Resume) a.Clone();
		c.setPersonalInfo("��", "24");
		c.setWorkExperience("1998-2003", "zz��ҵ");
		
		a.Display();
		b.Display();
		c.Display();
		
	}
	
}
