package com.consys.liveexam;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.consys.liveexam.domain.Exam;
import com.consys.liveexam.service1.ExamService;




@RestController
public class ExamServiceController {

	@Autowired
	@Qualifier("ExamServiceImpl")
	ExamService examservice;
	
	 @RequestMapping(value = "/getExam", method = RequestMethod.POST,consumes ="application/json", produces = "application/json")
	 public @ResponseBody Exam getExam(@RequestBody Exam exam) {
		 return examservice.getExam(exam);
	}
	 
	 
	 @RequestMapping(value = "/getTestExam", method = RequestMethod.GET,consumes ="application/json", produces = "application/json")
	 public String getTestExam() {
		 return "Testing";
	}
	 
	 @RequestMapping(value = "/postTestExam", method = RequestMethod.GET,consumes ="application/json", produces = "application/json")
	 public String postTestExam() {
		 return "Post Testing--";
	}
}
