package com.diamond.generaljava;

import com.diamond.exceptions.TextDoesNotBelongLoginScreenException;

public class LoginScreenText {

	
	public static void main(String[] args) throws TextDoesNotBelongLoginScreenException {
		LoginScreenText lg = new LoginScreenText();
		String screenText = "B";
		boolean flag = lg.getLoginScreen();
		System.out.println(flag);
	}

	public boolean getLoginScreen() throws TextDoesNotBelongLoginScreenException {
		boolean flag = false;
		String actualText="";
		String expectedText="";
		if (isAtHomePage()) {
			System.out.println("Hit shift plus 12");
			System.out.println("Enter text logoff");
			System.out.println("Hit Enter");
			flag = isAtLoginScreen();

		} else if (isAtMainMenuPage()) {

			System.out.println("Enter text logoff");
			System.out.println("Hit Enter");
			flag = isAtLoginScreen();
			
			return true;
		} else if (isAtLoginScreen()) {
			flag = isAtLoginScreen();
			return true;
		}
		throw new TextDoesNotBelongLoginScreenException(actualText,expectedText );
	}

	private boolean isAtMainMenuPage() {
		String screenText="";
		if (screenText.equals("C")) {
			return true;
		}
		return false;
	}

	private boolean isAtHomePage() {
		String screenText="";
		if (screenText.equals("B")) {
			return true;
		}
		return false;
	}

	public boolean isAtLoginScreen() {
		String screenText="";	
		if (screenText.equals("A")) {
				return true;
			}
			return false;
		}
}
