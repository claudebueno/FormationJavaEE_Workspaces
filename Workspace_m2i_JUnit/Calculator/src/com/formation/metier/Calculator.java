package com.formation.metier;

public class Calculator {

	/**
	 *
	 * @param a
	 * @param b
	 * @return
	 */
	private static int nbTentatives = 0;
	int a;
	int b;

	public Calculator() {
	}

	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int add() {
		return a + b;
	}

	public int sub() {
		return a - b;
	}

	public int mul() {
		return a * b;
	}

	public int div() {
		return a / b;
	}

	public int uneMethodeTest(int a, int b) {
		if (nbTentatives % 2 == 0)
			return a + b + nbTentatives;
		else
			return a - b + nbTentatives;
	}

	public boolean divisibleTest(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException();
		}
		else
			return true;
	}

}