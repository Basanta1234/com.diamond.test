package com.diamond.generaljava;

public class DoRegister {

	public static void main(String[] args) {
		Register();
	}

	public static void Register() {
		for (int p = 1; p < 34; p++) {
			for (int l = 1; l < 4; l++) {
				addItem(p, l);
			}
		}
	}

	public static void addItem(int p, int l) {

		String fieldName = "P" + Integer.toString(p) + "L" + Integer.toString(setLineIndex(p, l, 3)) + " -REV";
		int row = 2;
		int column = 5;
		System.out.println(fieldName);

	}

	public static int setLineIndex(int p, int l, int linePerPage) {
		int lineNumber = 0;
		if (p == 1) {
			lineNumber = l;
		} else {
			lineNumber = (p * linePerPage) + l - linePerPage;
		}
		return lineNumber;

	}
}
