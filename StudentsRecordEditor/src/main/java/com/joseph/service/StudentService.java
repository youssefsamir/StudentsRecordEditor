package com.joseph.service;

import java.sql.SQLClientInfoException;
import java.sql.SQLDataException;
import java.util.List;

import com.joseph.model.Student;
import com.mysql.jdbc.SQLError;

public interface StudentService {
	public void add(Student student);
	public void edit(Student student);
	public void delete(int studentId) throws SQLDataException;
	public Student getStudent(int studentId);
	public List getAllStudent();
}
