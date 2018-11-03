package org.jfaster.mango.example.crud1;

import org.jfaster.mango.annotation.ID;

public class Student {
	 @ID(autoGenerateId = false)
	private Long studentId;
	private String name;
	private Integer age;
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
