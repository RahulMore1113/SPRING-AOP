package com.rahul.runner;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class EmailRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("******************************************************************");

		System.out.println("From Application Runner :: " + Arrays.asList(args.getSourceArgs()));

		System.out.println("NonOptionalArgs 		:: " + args.getNonOptionArgs());

		System.out.println("OptionalArgs 			:: " + args.getOptionNames());

		System.out.println("******************************************************************");

	}

}
