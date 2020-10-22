package com.diamond.readfiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import testdatacsv.Persons;

public class ReadCsvFileDemo1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileReader fileReader = new FileReader(".\\src\\main\\resources\\filereader\\data1.csv");
		try(BufferedReader br = new BufferedReader(fileReader);){
		String line = br.readLine();
		
		
		int i=0;
		while(line!=null) {
			/*
			 * Excluding 
			 * headers data 
			 * i should be 
			 * greater than 0
			 */
			if(!line.startsWith("#")&&(i>0)) {
				String [] elements=line.split(",");
				String name=elements[0];
				String age=elements[1];
				String city=elements[2];
				Persons per=new Persons(name, age, city);
				System.out.println("per =  "+ per);
			}
			line=br.readLine();
			i++;
		}
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		
	}
	
	

}



