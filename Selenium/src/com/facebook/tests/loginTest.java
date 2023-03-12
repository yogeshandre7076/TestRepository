package com.facebook.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.facebook.genericPage.MasterPage;
import com.facebook.pages.LoginPage;

public class loginTest {

	@Test
	public void LoginTest() throws Exception {

		LoginPage lp = new LoginPage();

		lp.EmailOrPhone();
		lp.enterEmail();
		lp.clickPassword();
		lp.enterPassword();
		lp.clickLoginButton();
	}

	@AfterClass
	public static void closeLoginPage() {
		MasterPage.driver.close();
	}
}
