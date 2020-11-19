package com.diamond.generaljava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadTextFile {

	public static void main(String[] args) throws FileNotFoundException {
		String filePath = "C:\\Users\\basan\\Desktop\\data.txt";
		String searchId = "123456";
		checkRecord(filePath, searchId);
	}

	public static void checkRecord(String filePath, String searchValue) throws FileNotFoundException {
		String idValue = "";
		String name = "";
		String age = "";
		boolean isFound = false;

		try (FileInputStream fr = new FileInputStream(filePath);) {
			Scanner sc = new Scanner(fr);

			while (sc.hasNext() && (!isFound)) {
				idValue = sc.next();
				name = sc.next();
				age = sc.next();
				if (searchValue.equals(idValue)) {
					isFound = true;
				}
			}
			if (isFound) {
				System.out.println("ID " + idValue + " Name " + name + " age " + age);
			} else {
				System.out.println("Record not found");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
