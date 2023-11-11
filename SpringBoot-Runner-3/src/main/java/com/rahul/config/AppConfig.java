package com.rahul.config;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rahul.methodref.SampleTest;

@Configuration
public class AppConfig {

	@Bean
	public CommandLineRunner runA() { // Annonymous Inner Class

		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {

				System.out.println("Hello :: " + Arrays.asList(args));

			}
		};
	}

	@Bean
	public CommandLineRunner runB() { // Lambda Expression

		CommandLineRunner obj = (args) -> {

			System.out.println("From Runner :: " + Arrays.asList(args));

		};

		return obj;
	}

	@Bean
	public CommandLineRunner runC() { // Lambda Expression

		return (args) -> System.out.println("From Runner :: " + Arrays.asList(args));

	}

	@Bean
	public CommandLineRunner runD() { // Scope Resolution Operator

		return SampleTest::test;

	}

}
