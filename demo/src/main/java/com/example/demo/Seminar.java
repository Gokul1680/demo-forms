package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="seminar_feedback")
public class Seminar {

	@Id
	private String pk;
	
	private String email;
	
	private String facultyName;
	
	private String dept;
	private String sem;
	private String yearOfStudy;
	private String passoutYear;
	private String sub;
	
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
	
	
	public Seminar() {
	
		// TODO Auto-generated constructor stub
	}

	

	public String getPk() {
		return pk;
	}



	public void setPk(String pk) {
		this.pk = pk;
	}



	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFacultyName() {
		return facultyName;
	}


	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public String getSem() {
		return sem;
	}


	public void setSem(String sem) {
		this.sem = sem;
	}


	public String getYearOfStudy() {
		return yearOfStudy;
	}


	public void setYearOfStudy(String yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}


	public String getPassoutYear() {
		return passoutYear;
	}


	public void setPassoutYear(String passoutYear) {
		this.passoutYear = passoutYear;
	}


	public String getSub() {
		return sub;
	}


	public void setSub(String sub) {
		this.sub = sub;
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
		return "Seminar [pk=" + pk + ", email=" + email + ", facultyName=" + facultyName + ", dept=" + dept + ", sem="
				+ sem + ", yearOfStudy=" + yearOfStudy + ", passoutYear=" + passoutYear + ", sub=" + sub + ", q1=" + q1
				+ ", q2=" + q2 + ", q3=" + q3 + ", q4=" + q4 + ", q5=" + q5 + ", q6=" + q6 + ", q7=" + q7 + ", q8=" + q8
				+ ", q9=" + q9 + ", q10=" + q10 + "]";
	}


	


		
	
	
	
	
}
