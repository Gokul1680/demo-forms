package com.example.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestController {


	@Autowired
	DemoService service;

	@Autowired
	Employee emp;
	
	@Autowired
	Parent parent;
	
	@Autowired
	Theory theory;
	
	@Autowired
	Practical practical;
	
	@Autowired
	Seminar seminar;

	@PostMapping(path = "/saveEmployerFeedback", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String employerfeedback(@ModelAttribute Employee empl) {
		
		return service.saveEmployee(empl);
	}

	@PostMapping(path = "/saveParentFeedback", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String parentfeedback(@ModelAttribute Parent par) {
		
		return service.saveParent(par);
	}
	
	@PostMapping(path = "/saveTheoryFeedback", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String theoryfeedback(@ModelAttribute Theory the) {
		
		return service.saveTheory(the);
	}
	
	@PostMapping(path = "/savePracticalFeedback", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String practicalfeedback(@ModelAttribute Practical prac) {
		
		return service.savePractical(prac);
	}
	@PostMapping(path = "/saveSeminarFeedback", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String parentfeedback(@ModelAttribute Seminar sem) {
		
		return service.saveSeminar(sem);
	}
	
	@PostMapping(path = "/saveProjectFeedback", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String projectfeedback(@ModelAttribute Project project) {
		
		return service.saveProject(project);
	}
	
	@PostMapping(path = "/saveExitStudentFeedback", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String exitstudentfeedback(@ModelAttribute ExitStudent exitStudent) {
		
		return service.saveExitStudent(exitStudent);
	}
	
	
	@GetMapping(path = "/getParentFeedback" , produces = "application/json")
	@CrossOrigin
	public Map<String,Integer> showParentFeedback() {
		Map<String,Integer> map = service.getParentFeedback();
		return map;
	}
	
	@GetMapping(path = "/getEmployerFeedback" , produces = "application/json")
	@CrossOrigin
	public Map<String,Integer> showEmployerFeedback() {
		Map<String,Integer> map = service.getEmployerFeedback();
		return map;
	}
	
	@GetMapping(path = "/getTheoryFeedback" , produces = "application/json")
	@CrossOrigin
	public Map<String,Integer> showTheoryFeedback(@RequestParam String code) {
		Map<String,Integer> map = service.getTheoryFeedback(code.toUpperCase());
		return map;
	}
	
	@GetMapping(path = "/getPracticalFeedback" , produces = "application/json")
	@CrossOrigin
	public Map<String,Integer> showPracticalFeedback(@RequestParam String code) {
		Map<String,Integer> map = service.getPracticalFeedback(code.toUpperCase());
		return map;
	}
	
	@GetMapping(path = "/getSeminarFeedback" , produces = "application/json")
	@CrossOrigin
	public Map<String,Integer> showSeminarFeedback(@RequestParam String code) {
		Map<String,Integer> map = service.getSeminarFeedback(code.toUpperCase());
		return map;
	}
	@GetMapping(path = "/getProjectFeedback" , produces = "application/json")
	@CrossOrigin
	public Map<String,Integer> showProjectFeedback(@RequestParam String code) {
		Map<String,Integer> map = service.getProjectFeedback(code.toUpperCase());
		return map;
	}
	
	@GetMapping(path = "/getExitStudentFeedback" , produces = "application/json")
	@CrossOrigin
	public Map<String,Integer> showExitStudentFeedback() {
		Map<String,Integer> map = service.getExitStudentFeedback();
		return map;
	}
	
	
	@GetMapping(path = "/getParentFeedbackbysearch" , produces = "application/json")
	@CrossOrigin
	public Map<String,Object> showParentFeedbackbysearch(@RequestParam String regno) {
		Map<String,Object> map = service.getParentFeedbackbysearch(regno.toUpperCase());
		return map;
	}
	
	@GetMapping(path = "/getEmployerFeedbackbysearch" , produces = "application/json")
	@CrossOrigin
	public Map<String,Object> showEmployerFeedbackbysearch(@RequestParam String regno) {
		Map<String,Object> map = service.getEmployerFeedbackbysearch(regno.toUpperCase());
		return map;
	}

	@GetMapping(path = "/getExitStudentFeedbackbysearch" , produces = "application/json")
	@CrossOrigin
	public Map<String,Object> showExitStudentFeedbackbysearch(@RequestParam String regno) {
		Map<String,Object> map = service.getExitStudentFeedbackbysearch(regno.toUpperCase());
		return map;
	}
	
	@GetMapping(path = "/getTheoryFeedbackbysearch" , produces = "application/json")
	@CrossOrigin
	public Map<String,Object> showTheoryFeedbackbysearch(@RequestParam String code , @RequestParam String faculty) {
		Map<String,Object> map = service.getTheoryFeedbackbysearch(code.toUpperCase() , faculty.toLowerCase());
		return map;
	}
	
	@GetMapping(path = "/getPracticalFeedbackbysearch" , produces = "application/json")
	@CrossOrigin
	public Map<String,Object> showPracticalFeedbackbysearch(@RequestParam String code, @RequestParam String faculty) {
		Map<String,Object> map = service.getPracticalFeedbackbysearch(code.toUpperCase() , faculty.toLowerCase());
		return map;
	}
	
	@GetMapping(path = "/getSeminarFeedbackbysearch" , produces = "application/json")
	@CrossOrigin
	public Map<String,Object> showSeminarFeedbackbysearch(@RequestParam String code , @RequestParam String faculty) {
		Map<String,Object> map = service.getSeminarFeedbackbysearch(code.toUpperCase() , faculty.toLowerCase());
		return map;
	}
	
	@GetMapping(path = "/getProjectFeedbackbysearch" , produces = "application/json")
	@CrossOrigin
	public Map<String,Object> showProjectFeedbackbysearch(@RequestParam String code , @RequestParam String faculty) {
		Map<String,Object> map = service.getProjectFeedbackbysearch(code.toUpperCase(),faculty.toLowerCase());
		return map;
	}
	
	
	
	@PostMapping(path = "/login")
	@CrossOrigin
	public Map<String,String> doLogin(@RequestBody Map<String, String> body) {
//		boolean validation = false;

//		System.out.println(service.encode("AntennaOfEce"));
//		System.out.println(service.encode("ElectricMachines"));
//		System.out.println(service.encode("Aircraft"));
//		System.out.println(service.encode("StrengthOfMaterials"));
//		System.out.println(service.encode("Virus"));
//		System.out.println(service.encode("Principal_1952"));
		Map<String,String> map = service.validate( body.get("username"),body.get("password"));
		
		return map;
	}
	
	
	
}

	
