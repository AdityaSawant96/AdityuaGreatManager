package com.ds.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ds.pageLayer.DashboardPage;
import com.ds.pageLayer.ExchangePage;
import com.ds.pageLayer.LoginPage;
import com.ds.testBase.TestBase;
import com.ds.utilities.UtilClass;

public class BuyFunctionality extends TestBase {
   
@Test

public void verifyBuyFunctionality() throws InterruptedException
{
String Expected_Result = "Order Created successfully";
	LoginPage login_obj = new LoginPage(driver);
	UtilClass util_obj = new UtilClass();
	DashboardPage dash_obj = new DashboardPage(driver);
	ExchangePage  exchange_obj = new ExchangePage(driver);
	login_obj.enterEmailAddress("adiwant996@gmail.com");
	login_obj.enterPassword("Adi@12456");
	util_obj.scrollDown(driver, "0", "400");
	Thread.sleep(3000);

	login_obj.clickOnLoginButton();
	Thread.sleep(3000);

	dash_obj.enterCompanyName("Wipro");
	Thread.sleep(3000);

	dash_obj.clickOnOption();
	Thread.sleep(3000);

	
	util_obj.scrollDown(driver, "0", "600");
	Thread.sleep(3000);

	exchange_obj.clickOnBuyBtn1();
	
	exchange_obj.enterQuantityOfTextbox("2");
	Thread.sleep(3000);

	util_obj.scrollDown(driver, "0", "250");
	Thread.sleep(3000);

	exchange_obj.clickOnBuyBtn2();
	Thread.sleep(5000);

	String Actual_Result=exchange_obj.getOrderStatus();
	Assert.assertEquals(Actual_Result, Expected_Result);
}


@Test

public void verifyBuyFunctionalityWithIntradayAndMarket() throws InterruptedException
{	
	String Expected_Result = "Order Created Successfully";
	LoginPage login_obj = new LoginPage(driver);
	UtilClass util_obj = new UtilClass();
	DashboardPage dash_obj = new DashboardPage(driver);
	ExchangePage  exchange_obj = new ExchangePage(driver);
	login_obj.enterEmailAddress("adiwant996@gmail.com");
	login_obj.enterPassword("Adi@12456");
	util_obj.scrollDown(driver, "0", "400");
	Thread.sleep(3000);

	login_obj.clickOnLoginButton();
	Thread.sleep(3000);

	dash_obj.enterCompanyName("Wipro");
	Thread.sleep(3000);

	dash_obj.clickOnOption();
	Thread.sleep(3000);

	
	util_obj.scrollDown(driver, "0", "600");
	Thread.sleep(3000);

	exchange_obj.clickOnBuyBtn1();
	exchange_obj.clickOnIntraday();
	exchange_obj.enterQuantityOfTextbox("2");
	Thread.sleep(3000);

	util_obj.scrollDown(driver, "0", "250");
	Thread.sleep(3000);

	exchange_obj.clickOnBuyBtn2();
	Thread.sleep(5000);

	String Actual_Result=exchange_obj.getOrderStatus();
	Assert.assertEquals(Actual_Result, Expected_Result);

}
}