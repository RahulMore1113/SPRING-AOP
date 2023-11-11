package com.rahul.dao;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDAO {

	public void saveEmployee() {

		if (new Random().nextInt(15) < 10)
			throw new RuntimeException("DUMMY EXCEPTION");

		System.out.println("Employee object is saved...");

	}

}
