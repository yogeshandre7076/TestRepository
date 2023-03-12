package com.facebook.pages;

import com.facebook.genericPage.MasterPage;

public class LoginPage extends MasterPage {

	public LoginPage() throws Exception {
		super();
	}
	
	//click Email or Phone
	public void EmailOrPhone() {
		click("EmailaddressorPhonenumber");}
	
	//Enter Email
	public void enterEmail(){
		enterData("EmailaddressorPhonenumber", "testData1");
	}
	
	//click password
	public void clickPassword() {
		click("Password");
	}
	
	//enter password
	public void enterPassword() {
		enterData("Password", "testData2");
	}
	
	//click login Button
	public void clickLoginButton() {
		click("loginbutton");
		
	}
}
