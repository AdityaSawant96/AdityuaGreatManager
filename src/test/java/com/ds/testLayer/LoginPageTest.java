package com.ds.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ds.pageLayer.LoginPage;
import com.ds.testBase.TestBase;
import com.ds.utilities.UtilClass;

public class LoginPageTest extends TestBase {
	
	@Test
	public void verifyLoginWithCorrectCred() throws InterruptedException
	{
		String expected_output = "https://www.apps.dalalstreet.ai/dashboard";
		
		LoginPage login_obj = new LoginPage(driver);
		UtilClass util_obj = new UtilClass();
		
		login_obj.enterEmailAddress("adiwant996@gmail.com");
		login_obj.enterPassword("Adi@12456");
		util_obj.scrollDown(driver, "0", "400");
		Thread.sleep(3000);

		login_obj.clickOnLoginButton();
		
		Thread.sleep(5000);
		String actual_output = util_obj.getWebPageUrl();
		Assert.assertEquals(actual_output, expected_output);
		
	}

}
