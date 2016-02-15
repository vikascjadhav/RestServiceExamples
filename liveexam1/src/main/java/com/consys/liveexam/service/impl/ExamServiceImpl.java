package com.consys.liveexam.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.consys.liveexam.dao.ExamServiceDao;
import com.consys.liveexam.domain.Exam;
import com.consys.liveexam.service1.ExamService;

@Component("ExamServiceImpl")
public class ExamServiceImpl implements ExamService {

	@Autowired
	ExamServiceDao examServiceDao;	

	@Override
	public Exam getExam(Exam exam) {		
		return examServiceDao.getExambyId(exam);
	}
}
