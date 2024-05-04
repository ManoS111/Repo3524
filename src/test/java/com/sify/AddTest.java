package com.sify;

import org.testng.annotations.Test;

public class AddTest {
	public static void add(int a, int b) {
		int c = a + b;
		System.out.println("Sum Value :" + c);
	}

	@Test
	public void addScenario() {
		AddTest.add(10, 16);
	}

}
