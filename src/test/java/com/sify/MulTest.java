package com.sify;

import org.testng.annotations.Test;

public class MulTest {
	public static void mul(int a, int b) {
		int c = a *b;
		System.out.println("multiplication Value :" + c);
	}

	@Test
	public void addScenario() {
		MulTest.mul(10, 16);
	}

}
