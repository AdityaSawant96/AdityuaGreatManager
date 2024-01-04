package com.ds.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ds.testBase.TestBase;

public class UtilClass extends TestBase {
	
	public UtilClass()
	{
		PageFactory.initElements(driver, this);
	}

	//get url 
	
	public String getWebPageUrl()
	{
		String url = driver.getCurrentUrl();
		return url;
	}
	public void scrollDown(WebDriver driver ,String x,String y)
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x +"," +y+" )");
	}

	
}
