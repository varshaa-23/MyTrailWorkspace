package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.testng.api.base.RetryEngine;
import com.leaftaps.pages.LoginPage;

public class TC001_VerifyLogin extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setValues() {
		testcaseName = "VerifyLogin";
		testDescription ="Verify Login functionality with positive data";
		authors="Hari";
		category ="Smoke";
		excelFileName="Login";
	}
	
	@Test(dataProvider = "fetchData",retryAnalyzer = RetryEngine.class)
	public void runLogin(String uname,String pass) {
	LoginPage lp=new LoginPage();
	lp.enterUsername(uname).enterPassword(pass).clickLogin();
	}

}
