package org.opentutorials.javatutorials.array;

public class GetDemo {

	public static void main(String[] args) {
		
		String[] classGroup = { "ÃÖÁøÇõ", "ÃÖÀ¯ºó", "ÇÑÀÌ¶÷", "ÀÌ°íÀ×" };
		System.out.println(classGroup[0]);
		System.out.println(classGroup[1]);
		System.out.println(classGroup[2]);
		System.out.println(classGroup[classGroup.length-1]);
		
		String[] classGroup2 = new String[4];
		classGroup2[0] = "ÃÖÁøÇõ1";
		System.out.println(classGroup2.length);
	}

}
