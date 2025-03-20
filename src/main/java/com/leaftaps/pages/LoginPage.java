package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage enterUsername(String uName) {
//		WebElement element = locateElement(Locators.XPATH, "//input[@id='username']");
//		clearAndType(element, uName);
		
		clearAndType(locateElement("username"), uName);
		
		
		//clearAndType(locateElement("username"),uName);
		reportStep(uName+" username is entered successfully", "pass");
		
		return this;
	}

	public LoginPage enterPassword(String passWord) {

	
		clearAndType(locateElement("password"),passWord);

		reportStep(passWord+" password is entered successfully", "pass");
		
//		public void reportStep(String desc, String status) {
//			reportStep(desc, status, true);
//		}

		
		return this;

	}

	public HomePage clickLogin() {
		click(Locators.CLASS_NAME, "decorativeSubmit");//
		//click(locateElement(Locators.CLASS_NAME, "decorativeSubmit"));--in HomePage
		//above is going to switch case
	
		reportStep("Login button is clicked successfully", "pass");
		return new HomePage();

	}

}
