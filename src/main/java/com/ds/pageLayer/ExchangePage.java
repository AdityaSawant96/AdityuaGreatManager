package com.ds.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExchangePage {

	public ExchangePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//.......obj Repository....
	
	@FindBy(xpath="//a[text()=\"Buy\"]")
	private WebElement buy_btn1;
	
	@FindBy(xpath="//input[@name=\"input-Qunatity\"]")
	private WebElement quantity_textbox;
	
	@FindBy(xpath="//button[text()=\"Buy\"]")
	private WebElement buy_btn2;
	@FindBy(xpath="//div[contains(text(),'Order Created')]")
	private WebElement status_msg;
	@FindBy (xpath="//label[text()=\"Intraday\"]")
	private WebElement intraday_btn;
	//.........Actions Method......
	
	public void clickOnBuyBtn1() 
	{
		buy_btn1.click();
	}
	
	
	public void enterQuantityOfTextbox(String count) 
	{
		quantity_textbox.click();
		quantity_textbox.sendKeys(count);
	}
	
	public void clickOnBuyBtn2() 
	{
		buy_btn2.click();
	}


	public String getOrderStatus()
	{
	String msg=	status_msg.getText();
	return msg;
	}


	public void clickOnIntraday() 
	{
		intraday_btn.click();
	}
	
	
	
	
}
