package com.rahul.methodref;

import java.util.Arrays;

public class SampleTest {

	public static void test(String... args) {

		System.out.println("From Method Ref :: " + Arrays.asList(args));

	}

}
