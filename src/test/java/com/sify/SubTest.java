package com.sify;

import org.testng.annotations.Test;

public class SubTest {
	public static void sub(int a, int b) {
		int c = a - b;
		System.out.println("Sum Value :" + c);
	}

	@Test
	public void addScenario() {
		SubTest.sub(10, 16);
	}

}
