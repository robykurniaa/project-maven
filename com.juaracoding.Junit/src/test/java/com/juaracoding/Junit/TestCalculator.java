package com.juaracoding.Junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class TestCalculator {
	
	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		int a = 10, b = 20;
		
		int actual = calculator.add(a, b);
//		int expect = 30;
		
		assertEquals(30, actual);
	}
	
	@Test
	public void testSubstrack() {
		Calculator calculator = new Calculator();
		int a = 10, b = 20;
		
		int actual = calculator.substrack(a, b);
//		int expect = 10;
		
		assertEquals(10, actual, 0.0);
	}

}
