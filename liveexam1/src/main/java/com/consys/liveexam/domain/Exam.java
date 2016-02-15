package com.consys.liveexam.domain;

public class Exam {
	private String examName;
	private String examId;
	
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public String getExamId() {
		return examId;
	}
	public void setExamId(String examId) {
		this.examId = examId;
	}
	
	@Override
	public String toString() {
		return "Exam [examName=" + examName + ", examId=" + examId + "]";
	}
	
}
