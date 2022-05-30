package com.example.demo;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DemoService {
	
	@Autowired
	JdbcTemplate jdbc;
	
	@Autowired
	EmployeeRepository erepo;
	
	@Autowired
	ParentRepository prepo;
	
	@Autowired
	TheoryRepository trepo;
	
	@Autowired
	PracticalRepository lrepo;
	
	@Autowired
	SeminarRepository srepo;
	
	@Autowired
	LoginRepository logrepo;
	
	@Autowired
	ProjectRepository projrepo;
	
	@Autowired
	ExitStudentRepository exitrepo;
	
	public String saveEmployee(Employee emp) {
		emp.setAddressOfCompany(emp.getAddressOfCompany().toString());
		emp.setCompanyName(emp.getCompanyName().toString());
		emp.setDept(emp.getDept().toLowerCase().toString());
		emp.setEmployeeDesignation(emp.getEmployeeDesignation().toString());
		emp.setEmployeeId(emp.getEmployeeId().toUpperCase().toString());
		emp.setEmployeeName(emp.getEmployeeName().toString());
		emp.setEvaluatingPersonName(emp.getEvaluatingPersonName().toString());
		
		erepo.save(emp);
		System.out.println(emp.toString());
		return "success";
	}
	
	public String saveParent(Parent parent) {
		parent.setAddress(parent.getAddress().toString());
		parent.setBranch(parent.getBranch().toLowerCase().toString());
		parent.setContact(parent.getContact().toString());
		parent.setEmail(parent.getEmail().toString());
		parent.setParentName(parent.getParentName().toString());
		parent.setQualAndOcc(parent.getQualAndOcc().toString());
		parent.setSem(parent.getSem().toString());
		parent.setStudentId(parent.getStudentId().toUpperCase().toString());
		parent.setStudentName(parent.getStudentName().toString());
		prepo.save(parent);
		System.out.println(parent.toString());
		return "success";
	}
	
	public String saveTheory(Theory theory) {
		theory.setDept(theory.getDept().toLowerCase().toString());
		theory.setEmail(theory.getEmail().toString());
		theory.setFacultyName(theory.getFacultyName().toLowerCase().toString());
		theory.setPassoutYear(theory.getPassoutYear().toString() );
		theory.setPk(theory.getPk().toString());
		theory.setSem(theory.getSem().toString());
		theory.setSub(theory.getSub().toUpperCase().toString());
		theory.setYearOfStudy(theory.getYearOfStudy().toString());
		trepo.save(theory);
		System.out.println(theory.toString());
		return "success";
	}
	
	public String savePractical(Practical practical) {
		practical.setDept(practical.getDept().toLowerCase().toString());
		practical.setEmail(practical.getEmail().toString());
		practical.setFacultyName(practical.getFacultyName().toLowerCase().toString());
		practical.setPassoutYear(practical.getPassoutYear().toString());
		practical.setPk(practical.getPk().toString());
		practical.setSem(practical.getSem().toString());
		practical.setSub(practical.getSub().toUpperCase().toString());
		practical.setYearOfStudy(practical.getYearOfStudy().toString());
		lrepo.save(practical);
		System.out.println(practical.toString());
		return "success";
	}
	
	public String saveSeminar(Seminar seminar) {
		seminar.setDept(seminar.getDept().toLowerCase().toString());
		seminar.setEmail(seminar.getEmail().toString());
		seminar.setFacultyName(seminar.getFacultyName().toLowerCase().toString());
		seminar.setPassoutYear(seminar.getPassoutYear().toString());
		seminar.setPk(seminar.getPk().toString());
		seminar.setSem(seminar.getSem().toString());
		seminar.setSub(seminar.getSub().toUpperCase().toString());
		seminar.setYearOfStudy(seminar.getYearOfStudy().toString());
		srepo.save(seminar);
		System.out.println(seminar.toString());
		return "success";
	}
	
	public String saveProject(Project project) {
		project.setDept(project.getDept().toLowerCase().toString());
		project.setEmail(project.getEmail().toString());
		project.setFacultyName(project.getFacultyName().toLowerCase().toString());
		project.setPassoutYear(project.getPassoutYear().toString());
		project.setPk(project.getPk().toString());
		project.setSem(project.getSem().toString());
		project.setSub(project.getSub().toUpperCase().toString());
		project.setYearOfStudy(project.getYearOfStudy().toString());
		projrepo.save(project);
		System.out.println(project.toString());
		return "success";
	}

	public String saveExitStudent(ExitStudent exitStudent) {
		exitStudent.setBatch(exitStudent.getBatch().toLowerCase().toString());
		exitStudent.setCurrentPosition(exitStudent.getCurrentPosition().toString());
		exitStudent.setEmailId(exitStudent.getEmailId().toString());
		exitStudent.setEntrepreneur(exitStudent.getEntrepreneur().toString());
		exitStudent.setName(exitStudent.getName().toString());
		exitStudent.setStudentId(exitStudent.getStudentId().toUpperCase().toString());
		exitStudent.setWorking(exitStudent.getWorking().toString());
		exitrepo.save(exitStudent);
		System.out.println(exitStudent.toString());
		return "success";
	}
	public Map<String,Integer> getParentFeedback() {
		
		String q2;
		Map<String,Integer> hm = new HashMap<>();
		
			 for(int j = 1 ; j < 6 ; j++) {
				 q2 ="q1_" + j;
				 hm.put(q2,prepo.getCountForQuestion1(j));
			 }
			
			 for(int j = 1 ; j < 6 ; j++) {
				 q2 = "q2_" + j;
				 hm.put(q2,prepo.getCountForQuestion2(j));
			 }
			
			 for(int j = 1 ; j < 6 ; j++) {
				 q2 = "q3_" + j;
				 hm.put(q2,prepo.getCountForQuestion3(j));
			 }
			
			 for(int j = 1 ; j < 6 ; j++) {
				 q2 = "q4_" + j;
				 hm.put(q2,prepo.getCountForQuestion4(j));
			 }
			 
			 for(int j = 1 ; j < 6 ; j++) {
				 q2 = "q5_" + j;
				 hm.put(q2,prepo.getCountForQuestion5(j));
			 }
			 
			 for(int j = 1 ; j < 6 ; j++) {
				 q2 = "q6_" + j;
				 hm.put(q2,prepo.getCountForQuestion6(j));
			 }
			 for(int j = 1 ; j < 6 ; j++) {
				 q2 = "q7_" + j;
				 hm.put(q2,prepo.getCountForQuestion7(j));
			 }
			 for(int j = 1 ; j < 6 ; j++) {
				 q2 = "q8_" + j;
				 hm.put(q2,prepo.getCountForQuestion8(j));
			 }
			 for(int j = 1 ; j < 6 ; j++) {
				 q2 = "q9_" + j;
				 hm.put(q2,prepo.getCountForQuestion9(j));
			 }
			 for(int j = 1 ; j < 6 ; j++) {
				 q2 = "q10_" + j;
				 hm.put(q2,prepo.getCountForQuestion10(j));
			 }
			 for(int j = 1 ; j < 6 ; j++) {
				 q2 = "q11_" + j;
				 hm.put(q2,prepo.getCountForQuestion11(j));
			 }
			 for(int j = 1 ; j < 6 ; j++) {
				 q2 = "q12_" + j;
				 hm.put(q2,prepo.getCountForQuestion12(j));
			 }
		System.out.println(hm.toString());
		return hm;
	}
	
public Map<String,Integer> getEmployerFeedback() {
		
		String q2;
		Map<String,Integer> hm = new HashMap<>();
		
			 for(int j = 1 ; j < 6 ; j++) {
				 q2 ="q1_" + j;
				 hm.put(q2,erepo.getCountForQuestion1(j));
			 }
			
			 for(int j = 1 ; j < 6 ; j++) {
				 q2 = "q2_" + j;
				 hm.put(q2,erepo.getCountForQuestion2(j));
			 }
			
			 for(int j = 1 ; j < 6 ; j++) {
				 q2 = "q3_" + j;
				 hm.put(q2,erepo.getCountForQuestion3(j));
			 }
			
			 for(int j = 1 ; j < 6 ; j++) {
				 q2 = "q4_" + j;
				 hm.put(q2,erepo.getCountForQuestion4(j));
			 }
			 
			 for(int j = 1 ; j < 6 ; j++) {
				 q2 = "q5_" + j;
				 hm.put(q2,erepo.getCountForQuestion5(j));
			 }
			 
			 for(int j = 1 ; j < 6 ; j++) {
				 q2 = "q6_" + j;
				 hm.put(q2,erepo.getCountForQuestion6(j));
			 }
			 for(int j = 1 ; j < 6 ; j++) {
				 q2 = "q7_" + j;
				 hm.put(q2,erepo.getCountForQuestion7(j));
			 }
			 for(int j = 1 ; j < 6 ; j++) {
				 q2 = "q8_" + j;
				 hm.put(q2,erepo.getCountForQuestion8(j));
			 }
			 for(int j = 1 ; j < 6 ; j++) {
				 q2 = "q9_" + j;
				 hm.put(q2,erepo.getCountForQuestion9(j));
			 }
			 for(int j = 1 ; j < 6 ; j++) {
				 q2 = "q10_" + j;
				 hm.put(q2,erepo.getCountForQuestion10(j));
			 }
		
		System.out.println(hm.toString());
		return hm;
	}
	
public Map<String,Integer> getTheoryFeedback(String code) {
	
	String q2;
	Map<String,Integer> hm = new HashMap<>();
	
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 ="q1_" + j;
			 hm.put(q2,trepo.getCountForQuestion1(j,code));
		 }
		
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q2_" + j;
			 hm.put(q2,trepo.getCountForQuestion2(j,code));
		 }
		
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q3_" + j;
			 hm.put(q2,trepo.getCountForQuestion3(j,code));
		 }
		
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q4_" + j;
			 hm.put(q2,trepo.getCountForQuestion4(j,code));
		 }
		 
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q5_" + j;
			 hm.put(q2,trepo.getCountForQuestion5(j,code));
		 }
		 
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q6_" + j;
			 hm.put(q2,trepo.getCountForQuestion6(j,code));
		 }
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q7_" + j;
			 hm.put(q2,trepo.getCountForQuestion7(j,code));
		 }
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q8_" + j;
			 hm.put(q2,trepo.getCountForQuestion8(j,code));
		 }
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q9_" + j;
			 hm.put(q2,trepo.getCountForQuestion9(j,code));
		 }
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q10_" + j;
			 hm.put(q2,trepo.getCountForQuestion10(j,code));
		 }
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q11_" + j;
			 hm.put(q2,trepo.getCountForQuestion11(j,code));
		 }
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q12_" + j;
			 hm.put(q2,trepo.getCountForQuestion12(j,code));
		 }
	
	System.out.println(hm.toString());
	return hm;
}

public Map<String,Integer> getPracticalFeedback(String code) {
	
	String q2;
	Map<String,Integer> hm = new HashMap<>();
	
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 ="q1_" + j;
			 hm.put(q2,lrepo.getCountForQuestion1(j,code));
		 }
		
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q2_" + j;
			 hm.put(q2,lrepo.getCountForQuestion2(j,code));
		 }
		
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q3_" + j;
			 hm.put(q2,lrepo.getCountForQuestion3(j,code));
		 }
		
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q4_" + j;
			 hm.put(q2,lrepo.getCountForQuestion4(j,code));
		 }
		 
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q5_" + j;
			 hm.put(q2,lrepo.getCountForQuestion5(j,code));
		 }
		 
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q6_" + j;
			 hm.put(q2,lrepo.getCountForQuestion6(j,code));
		 }
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q7_" + j;
			 hm.put(q2,lrepo.getCountForQuestion7(j,code));
		 }
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q8_" + j;
			 hm.put(q2,lrepo.getCountForQuestion8(j,code));
		 }
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q9_" + j;
			 hm.put(q2,lrepo.getCountForQuestion9(j,code));
		 }
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q10_" + j;
			 hm.put(q2,lrepo.getCountForQuestion10(j,code));
		 }
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q11_" + j;
			 hm.put(q2,lrepo.getCountForQuestion11(j,code));
		 }
		
	
	System.out.println(hm.toString());
	return hm;
}

public Map<String,Integer> getSeminarFeedback(String code) {
	
	String q2;
	Map<String,Integer> hm = new HashMap<>();
	
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 ="q1_" + j;
			 hm.put(q2,srepo.getCountForQuestion1(j,code));
		 }
		
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q2_" + j;
			 hm.put(q2,srepo.getCountForQuestion2(j,code));
		 }
		
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q3_" + j;
			 hm.put(q2,srepo.getCountForQuestion3(j,code));
		 }
		
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q4_" + j;
			 hm.put(q2,srepo.getCountForQuestion4(j,code));
		 }
		 
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q5_" + j;
			 hm.put(q2,srepo.getCountForQuestion5(j,code));
		 }
		 
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q6_" + j;
			 hm.put(q2,srepo.getCountForQuestion6(j,code));
		 }
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q7_" + j;
			 hm.put(q2,srepo.getCountForQuestion7(j,code));
		 }
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q8_" + j;
			 hm.put(q2,srepo.getCountForQuestion8(j,code));
		 }
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q9_" + j;
			 hm.put(q2,srepo.getCountForQuestion9(j,code));
		 }
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q10_" + j;
			 hm.put(q2,srepo.getCountForQuestion10(j,code));
		 }
		
	
	System.out.println(hm.toString());
	return hm;
}


public Map<String,Integer> getProjectFeedback(String code) {
	
	String q2;
	Map<String,Integer> hm = new HashMap<>();
	
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 ="q1_" + j;
			 hm.put(q2,projrepo.getCountForQuestion1(j,code));
		 }
		
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q2_" + j;
			 hm.put(q2,projrepo.getCountForQuestion2(j,code));
		 }
		
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q3_" + j;
			 hm.put(q2,projrepo.getCountForQuestion3(j,code));
		 }
		
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q4_" + j;
			 hm.put(q2,projrepo.getCountForQuestion4(j,code));
		 }
		 
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q5_" + j;
			 hm.put(q2,projrepo.getCountForQuestion5(j,code));
		 }
		 
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q6_" + j;
			 hm.put(q2,projrepo.getCountForQuestion6(j,code));
		 }
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q7_" + j;
			 hm.put(q2,projrepo.getCountForQuestion7(j,code));
		 }
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q8_" + j;
			 hm.put(q2,projrepo.getCountForQuestion8(j,code));
		 }
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q9_" + j;
			 hm.put(q2,projrepo.getCountForQuestion9(j,code));
		 }
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q10_" + j;
			 hm.put(q2,projrepo.getCountForQuestion10(j,code));
		 }
		
	
	System.out.println(hm.toString());
	return hm;
}


public Map<String,Integer> getExitStudentFeedback() {
	
	String q2;
	Map<String,Integer> hm = new HashMap<>();
	
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 ="q1_" + j;
			 hm.put(q2,exitrepo.getCountForQuestion1(j));
		 }
		
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q2_" + j;
			 hm.put(q2,exitrepo.getCountForQuestion2(j));
		 }
		
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q3_" + j;
			 hm.put(q2,exitrepo.getCountForQuestion3(j));
		 }
		
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q4_" + j;
			 hm.put(q2,exitrepo.getCountForQuestion4(j));
		 }
		 
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q5_" + j;
			 hm.put(q2,exitrepo.getCountForQuestion5(j));
		 }
		 
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q6_" + j;
			 hm.put(q2,exitrepo.getCountForQuestion6(j));
		 }
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q7_" + j;
			 hm.put(q2,exitrepo.getCountForQuestion7(j));
		 }
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q8_" + j;
			 hm.put(q2,exitrepo.getCountForQuestion8(j));
		 }
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q9_" + j;
			 hm.put(q2,exitrepo.getCountForQuestion9(j));
		 }
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q10_" + j;
			 hm.put(q2,exitrepo.getCountForQuestion10(j));
		 }
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q11_" + j;
			 hm.put(q2,exitrepo.getCountForQuestion11(j));
		 }
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q12_" + j;
			 hm.put(q2,exitrepo.getCountForQuestion12(j));
		 }
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q13_" + j;
			 hm.put(q2,exitrepo.getCountForQuestion13(j));
		 }
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q14_" + j;
			 hm.put(q2,exitrepo.getCountForQuestion14(j));
		 }
		 for(int j = 1 ; j < 6 ; j++) {
			 q2 = "q15_" + j;
			 hm.put(q2,exitrepo.getCountForQuestion15(j));
		 }
	
	System.out.println(hm.toString());
	return hm;
}

public Map<String,Object> getParentFeedbackbysearch(String regno){
	Parent p = prepo.getByRollNo(regno);

	Map<String,Object> hm = new HashMap<>();
	if(p == null) {
		return hm;
	}
	hm.put("studentId", p.getStudentId());
	hm.put("studentName", p.getStudentName());
	hm.put("branch", p.getBranch());
	hm.put("sem", p.getSem());
	hm.put("parentName", p.getParentName());
	hm.put("qualAndOcc", p.getQualAndOcc());
	hm.put("address", p.getAddress());
	hm.put("email", p.getEmail());
	hm.put("contact", p.getContact());
	
	hm.put("q1", p.getQ1());
	hm.put("q2", p.getQ2());
	hm.put("q3", p.getQ3());
	hm.put("q4", p.getQ4());
	hm.put("q5", p.getQ5());
	hm.put("q6", p.getQ6());
	hm.put("q7", p.getQ7());
	hm.put("q8", p.getQ8());
	hm.put("q9", p.getQ9());
	hm.put("q10", p.getQ10());
	hm.put("q11", p.getQ11());
	hm.put("q12", p.getQ12());
	
	return hm;
}

public Map<String,Object> getEmployerFeedbackbysearch(String regno){
	Employee p = erepo.getByRollNo(regno);

	Map<String,Object> hm = new HashMap<>();
	if(p == null) {
		return hm;
	}
	hm.put("employeeId", p.getEmployeeId());
	hm.put("addressOfCompany", p.getAddressOfCompany());
	hm.put("companyName", p.getCompanyName());
	hm.put("dept", p.getDept());
	hm.put("employeeDesignation", p.getEmployeeDesignation());
	hm.put("employeeName", p.getEmployeeName());
	hm.put("evaluatingPersonName", p.getEvaluatingPersonName());

	
	hm.put("q1", p.getQ1());
	hm.put("q2", p.getQ2());
	hm.put("q3", p.getQ3());
	hm.put("q4", p.getQ4());
	hm.put("q5", p.getQ5());
	hm.put("q6", p.getQ6());
	hm.put("q7", p.getQ7());
	hm.put("q8", p.getQ8());
	hm.put("q9", p.getQ9());
	hm.put("q10", p.getQ10());

	
	return hm;
}

public Map<String,Object> getExitStudentFeedbackbysearch(String regno){
	ExitStudent p = exitrepo.getByRollNo(regno);

	Map<String,Object> hm = new HashMap<>();
	if(p == null) {
		return hm;
	}
	hm.put("batch", p.getBatch());
	hm.put("currentPosition", p.getCurrentPosition());
	hm.put("emailId", p.getEmailId());
	hm.put("entrepreneur", p.getEntrepreneur());
	hm.put("name", p.getName());
	hm.put("studentId", p.getStudentId());
	hm.put("working", p.getWorking());
		
	
	hm.put("q1", p.getQ1());
	hm.put("q2", p.getQ2());
	hm.put("q3", p.getQ3());
	hm.put("q4", p.getQ4());
	hm.put("q5", p.getQ5());
	hm.put("q6", p.getQ6());
	hm.put("q7", p.getQ7());
	hm.put("q8", p.getQ8());
	hm.put("q9", p.getQ9());
	hm.put("q10",p.getQ10());
	hm.put("q11",p.getQ11());
	hm.put("q12",p.getQ12());
	hm.put("q13",p.getQ13());
	hm.put("q14",p.getQ14());
	hm.put("q15",p.getQ15());
	
	return hm;
}

public Map<String,Object> getTheoryFeedbackbysearch(String code , String faculty){
	
	Theory t = trepo.getByRollNo(code,faculty);
	Map<String,Object> hm = new HashMap<>();
	
	if(t == null) {
		return hm;
	}
	System.out.println(t.toString());
	hm.put("email",t.getEmail());
	hm.put("dept", t.getDept());
	hm.put("facultyName",t.getFacultyName());
	hm.put("passOutYear", t.getPassoutYear());
	hm.put("sem",t.getSem());
	hm.put("sub", t.getSub());
	hm.put("yearOfStudy",t.getYearOfStudy());
	
	hm.put("q1", t.getQ1());
	hm.put("q2", t.getQ2());
	hm.put("q3", t.getQ3());
	hm.put("q4", t.getQ4());
	hm.put("q5", t.getQ5());
	hm.put("q6", t.getQ6());
	hm.put("q7", t.getQ7());
	hm.put("q8", t.getQ8());
	hm.put("q9", t.getQ9());
	hm.put("q10",t.getQ10());
	hm.put("q11",t.getQ11());
	hm.put("q12",t.getQ12());




	return hm;
}

public Map<String,Object> getPracticalFeedbackbysearch(String code , String faculty){
	
	Practical t = lrepo.getByRollNo(code,faculty);
	Map<String,Object> hm = new HashMap<>();
	if(t == null) {
		return hm;
	}
	hm.put("email",t.getEmail());
	hm.put("dept", t.getDept());
	hm.put("facultyName",t.getFacultyName());
	hm.put("passOutYear", t.getPassoutYear());
	hm.put("sem",t.getSem());
	hm.put("sub", t.getSub());
	hm.put("yearOfStudy",t.getYearOfStudy());
	
	hm.put("q1", t.getQ1());
	hm.put("q2", t.getQ2());
	hm.put("q3", t.getQ3());
	hm.put("q4", t.getQ4());
	hm.put("q5", t.getQ5());
	hm.put("q6", t.getQ6());
	hm.put("q7", t.getQ7());
	hm.put("q8", t.getQ8());
	hm.put("q9", t.getQ9());
	hm.put("q10",t.getQ10());
	hm.put("q11",t.getQ11());





	return hm;
}

public Map<String,Object> getProjectFeedbackbysearch(String code , String faculty){
	
	Project t = projrepo.getByRollNo(code,faculty);
	Map<String,Object> hm = new HashMap<>();
	if(t == null) {
		return hm;
	}
	hm.put("email",t.getEmail());
	hm.put("dept", t.getDept());
	hm.put("facultyName",t.getFacultyName());
	hm.put("passOutYear", t.getPassoutYear());
	hm.put("sem",t.getSem());
	hm.put("sub", t.getSub());
	hm.put("yearOfStudy",t.getYearOfStudy());
	
	hm.put("q1", t.getQ1());
	hm.put("q2", t.getQ2());
	hm.put("q3", t.getQ3());
	hm.put("q4", t.getQ4());
	hm.put("q5", t.getQ5());
	hm.put("q6", t.getQ6());
	hm.put("q7", t.getQ7());
	hm.put("q8", t.getQ8());
	hm.put("q9", t.getQ9());
	hm.put("q10",t.getQ10());





	return hm;
}


public Map<String,Object> getSeminarFeedbackbysearch(String code , String faculty){
	
	Seminar t = srepo.getByRollNo(code,faculty);
	Map<String,Object> hm = new HashMap<>();
	if(t == null) {
		return hm;
	}
	hm.put("email",t.getEmail());
	hm.put("dept", t.getDept());
	hm.put("facultyName",t.getFacultyName());
	hm.put("passOutYear", t.getPassoutYear());
	hm.put("sem",t.getSem());
	hm.put("sub", t.getSub());
	hm.put("yearOfStudy",t.getYearOfStudy());
	
	hm.put("q1", t.getQ1());
	hm.put("q2", t.getQ2());
	hm.put("q3", t.getQ3());
	hm.put("q4", t.getQ4());
	hm.put("q5", t.getQ5());
	hm.put("q6", t.getQ6());
	hm.put("q7", t.getQ7());
	hm.put("q8", t.getQ8());
	hm.put("q9", t.getQ9());
	hm.put("q10",t.getQ10());




	return hm;
}


	public String encode(String value) {
		try {
		return Base64.getEncoder()
        .encodeToString(value.getBytes(StandardCharsets.UTF_8.toString()));
	}
		catch(UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
		}
	}
	 
	public Map<String,String> validate(String username , String password) {
		Login user = logrepo.getByUserName(username);
		String encodedpwd = encode(password);
		Map<String,String> hm = new HashMap<>();
		if( user.getPassword().equals(encodedpwd)) {
			hm.put("isAdmin","true" );
			hm.put("role", user.getRole());
			
		}
		else hm.put("isAdmin","false");
		return hm;
	}
	
}
