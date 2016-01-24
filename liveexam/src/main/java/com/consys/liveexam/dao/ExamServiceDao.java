package com.consys.liveexam.dao;

import org.springframework.stereotype.Component;

import com.consys.liveexam.domain.Exam;

@Component
public class ExamServiceDao {
	
	public Exam getExambyId(Exam exam) {		
		return exam;
	}

}
