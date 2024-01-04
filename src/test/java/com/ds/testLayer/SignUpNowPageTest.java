package com.ds.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ds.pageLayer.SignUpNowPage;
import com.ds.testBase.TestBase;
import com.ds.utilities.UtilClass;

public class SignUpNowPageTest extends TestBase{

	//private static final String Expected_Output = null;

	@Test
	
	public void verifySignUpWithCorrectCreditionals() throws InterruptedException
	{
		UtilClass util_obj = new UtilClass();
		util_obj.scrollDown(driver, "0", "400");

        Thread.sleep(5000);
        String Expected_Output="https://www.apps.dalalstreet.ai/dashboard";
		SignUpNowPage  SignUp_obj = new SignUpNowPage(driver);
		SignUp_obj.clickOnSignUpNow();
		SignUp_obj.enterFirstName("Aditya");
		SignUp_obj.enterLastName("Sawant");
		SignUp_obj.enterEmailID("adiwant996@gmail.com");
		SignUp_obj.enterYourPassword("Adi@12456");
		SignUp_obj.clickOnAgreementButton();
        Thread.sleep(3000);

		util_obj.scrollDown(driver, "0", "400");
		SignUp_obj.clickOnSubmitButton();
		
        Thread.sleep(5000);
       String actual_output = util_obj.getWebPageUrl();
		Assert.assertEquals(actual_output, Expected_Output);

		
		
		
	}
}
