package com.formation.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.formation.metier.Calculator;

public class TestOpMethode {
	
	// TEST l'addition dans Calculator = OK
	@Test    
	public void testOK() {
		Calculator a = new Calculator();
//		 assertTrue(c.uneMethodeTest(1, 1) == 2);
		assertFalse(a.uneMethodeTest(1, 3) == 2);
	}

	@Test
	public void testKO() {
		Calculator c = new Calculator();
		 assertTrue(c.uneMethodeTest(1, 1) == 5);
//		assertFalse(c.uneMethodeTest(1, 1) == 2);

	}

	// TEST la division dans Calculator = OK
	@Test    
	public void multipleDivisibleTest() {
		Calculator c = new Calculator();
		assertTrue(c.divisibleTest(2, 6));
		;
	}

	// TEST la soustraction dans Calculator
	@Test
	public void testSub() {

		int i = 6, j = 3;

		Calculator fc = new Calculator(i, j);
		int result = i - j;
		assertEquals(result, fc.sub());
	}

	
	@Test
	public void testEgaleString() {
		String str = "Junit is working fine";
		assertEquals("Junit is working fine", str);
	}

}
