package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name="parent_feedback")
public class Parent {
	@Id
	private String studentId;
	
	private String studentName;
	private String branch;
	private String sem;
	private String parentName;
	
	private String qualAndOcc;
	private String Address;
	private String email;
	private String contact;
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
	private int q11;
	private int q12;
	
	
	
	public Parent() {
		// TODO Auto-generated constructor stub
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getSem() {
		return sem;
	}
	public void setSem(String sem) {
		this.sem = sem;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public String getQualAndOcc() {
		return qualAndOcc;
	}
	public void setQualAndOcc(String qualAndOcc) {
		this.qualAndOcc = qualAndOcc;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
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
	public int getQ11() {
		return q11;
	}
	public void setQ11(int q11) {
		this.q11 = q11;
	}
	public int getQ12() {
		return q12;
	}
	public void setQ12(int q12) {
		this.q12 = q12;
	}
	@Override
	public String toString() {
		return "Parent [studentId=" + studentId + ", studentName=" + studentName + ", branch=" + branch + ", sem=" + sem
				+ ", parentName=" + parentName + ", qualAndOcc=" + qualAndOcc + ", Address=" + Address + ", email="
				+ email + ", contact=" + contact + ", q1=" + q1 + ", q2=" + q2 + ", q3=" + q3 + ", q4=" + q4 + ", q5="
				+ q5 + ", q6=" + q6 + ", q7=" + q7 + ", q8=" + q8 + ", q9=" + q9 + ", q10=" + q10 + ", q11=" + q11
				+ ", q12=" + q12 + "]";
	}
	
	
	
	
	
	
	
}
