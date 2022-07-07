package org.opentutorials.javatutorials.object;

public class CalculatorDemo3 {

	public static void main(String[] args) {
		int left, right;
		
		left = 10;
		right = 20;
		
		sum(left, right);
		avg(left, right);
		
		left = 20;
		right = 40;
		
		sum(left, right);
		avg(left, right);

	}

	private static void sum(int left, int right) {
		System.out.println(left + " + " + right + " = " + (left+right));
	}

	private static void avg(int left, int right) {
		System.out.println("avg = " + ((left + right) / 2));
	}

}
