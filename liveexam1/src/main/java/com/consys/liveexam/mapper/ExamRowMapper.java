package com.consys.liveexam.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.consys.liveexam.domain.Exam;

public class ExamRowMapper implements RowMapper<Exam> {

	@Override
	public Exam mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		Exam exam = new Exam();
		exam.setExamId(rs.getString("examId"));
		exam.setExamName(rs.getString("examName"));
		return exam;
	}

}
