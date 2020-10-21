package com.diamond.readfiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadMe1Demo {

	/*
	 * reading txt from file 
	 * using java.nio.file
	 */
	public static void main(String[] args) throws IOException {

		FileReader fileReader = new FileReader(".\\src\\main\\resources\\filereader\\ReadMe1.txt");
		try(BufferedReader br = new BufferedReader(fileReader);){
		String line = br.readLine();
		
		int i=1;
		while(line!=null) {
			System.out.println("The text from line"+" "+i+" is : "+ line);
			line=br.readLine();
			i++;
		}
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}
