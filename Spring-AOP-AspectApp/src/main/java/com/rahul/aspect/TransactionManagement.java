package com.rahul.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TransactionManagement {

	@Pointcut("execution(public * com.rahul.dao.*.saveEmployee())")
	public void p1() {

	}

	@Before("p1()")
	public void beginTransaction() {

		System.out.println("Transaction Begin...");

	}

	@AfterReturning("p1()")
	public void commitTransaction() {

		System.out.println("Transaction Commited...");

	}

	@AfterThrowing(value = "p1()", throwing = "obj")
	public void rollBack(Throwable obj) {

		System.out.println("Transaction rollbacked... " + obj.getMessage());

	}

	@After("p1()")
	public void emailSetUpCredentials() {

		System.out.println("***Email Setup is Done***");

	}

}
