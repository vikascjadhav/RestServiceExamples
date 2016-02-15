package com.consys.liveexam.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import com.consys.liveexam.domain.Exam;
import com.consys.liveexam.mapper.ExamRowMapper;

@Component
public class ExamServiceDao {
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	private static String GET_EXAM_SQL = "SELECT * FROM Exam WHERE examId = :examId";
	
	public Exam getExambyId(Exam exam) {	
		//namedParameterJdbcTemplate.queryForObject(GET_EXAM_SQL, null, String.class);
		 SqlParameterSource namedParameters = new MapSqlParameterSource("examId",exam.getExamId());
		 List<Exam> examList = (List<Exam>) namedParameterJdbcTemplate.query(GET_EXAM_SQL, namedParameters, new ExamRowMapper());
		 if(examList.size() > 0)
			 return examList.get(0);
		 else 
			 return new Exam();
	}
	 
	/**
	 * 
	 * @param namedParameterJdbcTemplate
	 */
	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {  
	  this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;  
	 }

}
