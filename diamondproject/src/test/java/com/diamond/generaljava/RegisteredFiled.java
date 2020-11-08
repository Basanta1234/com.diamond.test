package com.diamond.generaljava;

public class RegisteredFiled {

	public static void main(String[] args) {
		RegisteredFiled rf = new RegisteredFiled();
		rf.RegisteredField();
	}

	public void RegisteredField() {
		System.out.println("----------------------------------");
		for (int i = 1; i <= 7; i++) {
			System.out.println(i +" set of data are : ");
			addLineFields(i);
			System.out.println("----------------------------------");
		}

	}

	public void addLineFields(int i) {
		String abc = "abc" + Integer.toString(i);
		int row = 1;
		int value = 6;
		int diff=5;
		int newIndex=setColumnIndexForMultiLinePage(i, value,diff);
		
		System.out.println("Field Name : " +abc);
		System.out.println("Row Index is : " +row);
		System.out.println("Column Index is : "+newIndex);
		
	}
/*
 * 
 * This is the 
 * helper method for
 * setting column Index
 * 
 */
	private int setColumnIndexForMultiLinePage(int i, int firstIndexValue,int diff) {
	
		int colIndexValue=0;
		if(i==1) {
			colIndexValue=firstIndexValue;
		}else  {
			colIndexValue=((i-1)*diff)+firstIndexValue;
		}
		return colIndexValue;
	}

}
