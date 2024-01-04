package com.ds.testLayer;

import org.testng.annotations.Test;

import com.ds.pageLayer.DashboardPage;
import com.ds.pageLayer.LoginPage;
import com.ds.pageLayer.TransactionPage;
import com.ds.testBase.TestBase;
import com.ds.utilities.UtilClass;

public class TransactionTest extends TestBase {
@Test
	public void getDataFromTransactionPage() throws InterruptedException
	{

		
		LoginPage login_obj = new LoginPage(driver);
		UtilClass util_obj = new UtilClass();
		TransactionPage  txn_obj = new TransactionPage(driver);
		DashboardPage dash_obj = new DashboardPage(driver);

		login_obj.enterEmailAddress("adiwant996@gmail.com");
		login_obj.enterPassword("Adi@12456");
		util_obj.scrollDown(driver, "0", "400");
		Thread.sleep(3000);

		login_obj.clickOnLoginButton();
		Thread.sleep(3000);

		dash_obj.clickOnTransactionLink();
		txn_obj.getAllData();
		
	}
	
	
}
