package com.simplilearn.employee;

public class Employee {

	private int empid;
	private String empname;
	private String empemail;
	private String empaddress;
	private long empsalary;
	private String empdesignation;
	
	
	public Employee() {
		super();
	}
	
	public Employee(String empname, String empemail, String empaddress, long empsalary,
			String empdesignation) {
		super();
		this.empname = empname;
		this.empemail = empemail;
		this.empaddress = empaddress;
		this.empsalary = empsalary;
		this.empdesignation = empdesignation;
	}
	
	public Employee(int empid, String empname, String empemail, String empaddress, long empsalary,
			String empdesignation) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empemail = empemail;
		this.empaddress = empaddress;
		this.empsalary = empsalary;
		this.empdesignation = empdesignation;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpemail() {
		return empemail;
	}

	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}

	public String getEmpaddress() {
		return empaddress;
	}

	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}

	public long getEmpsalary() {
		return empsalary;
	}

	public void setEmpsalary(long empsalary) {
		this.empsalary = empsalary;
	}

	public String getEmpdesignation() {
		return empdesignation;
	}

	public void setEmpdesignation(String empdesignation) {
		this.empdesignation = empdesignation;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empemail=" + empemail + ", empaddress="
				+ empaddress + ", empsalary=" + empsalary + ", empdesignation=" + empdesignation + "]";
	}
	
}
