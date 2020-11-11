package com.diamond.exceptions;

public class TextDoesNotBelongLoginScreenException extends Exception {

public TextDoesNotBelongLoginScreenException(String actualText, String expectedText) {
		
		super("Login Text not Present " + "The Actual text from the screen is : "+ actualText+ " but found : "+expectedText);
	}

}
