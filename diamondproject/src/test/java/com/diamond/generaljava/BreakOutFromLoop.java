package com.diamond.generaljava;

public class BreakOutFromLoop {

	public static void main(String[] args) {

		int curLine = 20;
		int desiredLine = 60;
		loopTest(curLine, desiredLine);

	}
	/*
	 * 
	 * Write the condition for negative loop and write the condition that break the
	 * loop
	 * 
	 */

	public static void loopTest(int currentLine, int desiredLine) {
		int totalPress = 0;
		do {
			int press = desiredLine - currentLine;
			System.out.println("press " + press);
			pressPageKey(press);
			totalPress++;
			if (totalPress > 30) {
				return;
			}
			System.out.println(" total Press is : " + totalPress);
			desiredLine++;
		} while (currentLine != desiredLine);
	}

	public static void pressPageKey(int press) {
		if (press > 0) {
			System.out.println("hit up arrow " + press);
		} else if (press < 0) {
			System.out.println("hit down arrow " + press);
		}
	}
}
