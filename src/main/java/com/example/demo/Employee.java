package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name="employer_feedback")
public class Employee {
	@Id
	private String employeeId;
	
	private String companyName;
	private String addressOfCompany;
	private String evaluatingPersonName;
	private String employeeName;
	
	private String employeeDesignation;
	private String dept;
	private int q1;
	private int q2;
	private int q3;
	private int q4;
	private int q5;
	private int q6;
	private int q7;
	private int q8;
	private int q9;
	private int q10;
	
	
	
	public Employee() {

		// TODO Auto-generated constructor stub
	}



	public String getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}



	public String getCompanyName() {
		return companyName;
	}



	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}



	public String getAddressOfCompany() {
		return addressOfCompany;
	}



	public void setAddressOfCompany(String addressOfCompany) {
		this.addressOfCompany = addressOfCompany;
	}



	public String getEvaluatingPersonName() {
		return evaluatingPersonName;
	}



	public void setEvaluatingPersonName(String evaluatingPersonName) {
		this.evaluatingPersonName = evaluatingPersonName;
	}



	public String getEmployeeName() {
		return employeeName;
	}



	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}



	public String getEmployeeDesignation() {
		return employeeDesignation;
	}



	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}



	public String getDept() {
		return dept;
	}



	public void setDept(String dept) {
		this.dept = dept;
	}



	public int getQ1() {
		return q1;
	}



	public void setQ1(int q1) {
		this.q1 = q1;
	}



	public int getQ2() {
		return q2;
	}



	public void setQ2(int q2) {
		this.q2 = q2;
	}



	public int getQ3() {
		return q3;
	}



	public void setQ3(int q3) {
		this.q3 = q3;
	}



	public int getQ4() {
		return q4;
	}



	public void setQ4(int q4) {
		this.q4 = q4;
	}



	public int getQ5() {
		return q5;
	}



	public void setQ5(int q5) {
		this.q5 = q5;
	}



	public int getQ6() {
		return q6;
	}



	public void setQ6(int q6) {
		this.q6 = q6;
	}



	public int getQ7() {
		return q7;
	}



	public void setQ7(int q7) {
		this.q7 = q7;
	}



	public int getQ8() {
		return q8;
	}



	public void setQ8(int q8) {
		this.q8 = q8;
	}



	public int getQ9() {
		return q9;
	}



	public void setQ9(int q9) {
		this.q9 = q9;
	}



	public int getQ10() {
		return q10;
	}



	public void setQ10(int q10) {
		this.q10 = q10;
	}



	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", companyName=" + companyName + ", addressOfCompany="
				+ addressOfCompany + ", evaluatingPersonName=" + evaluatingPersonName + ", employeeName=" + employeeName
				+ ", employeeDesignation=" + employeeDesignation + ", dept=" + dept + ", q1=" + q1 + ", q2=" + q2
				+ ", q3=" + q3 + ", q4=" + q4 + ", q5=" + q5 + ", q6=" + q6 + ", q7=" + q7 + ", q8=" + q8 + ", q9=" + q9
				+ ", q10=" + q10 + "]";
	}
	
	
	
	
}
