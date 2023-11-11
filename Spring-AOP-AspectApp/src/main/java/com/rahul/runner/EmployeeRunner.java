package com.rahul.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rahul.dao.EmployeeDAO;

@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private EmployeeDAO dao;

	@Override
	public void run(String... args) throws Exception {

		dao.saveEmployee();

	}

}
