package com.ds.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
 
	
	public DashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//........obj Repiository........
	
	@FindBy(xpath="//input[@class=\"form-control\"]")
	private WebElement search_textbox;
	
	@FindBy(xpath="(//a[text()=\"WIPRO\"])[2]")
	private WebElement select_option;
	
	@FindBy (xpath="//button[@id=\"page-header-user-dropdown\"]")
	private WebElement profile_dropdown;
	
	@FindBy (xpath="//span[text()=\"Power Off\"]")
	private WebElement power_off_btn;
	
	@FindBy(xpath="//a[text()=\"Transactions\"]")
	private  WebElement transaction_link;
	
	
	//..........Actions Method.......
	
	public void enterCompanyName(String companyName)
	{
		search_textbox.sendKeys(companyName);
	}
	public void clickOnOption()
	{
		select_option.click();
	}
	public void clickOnProfileDropdown()
	{
		profile_dropdown.click();
	}
	public void clickOnPowerOffButton()
	{
		power_off_btn.click();
	}
	public void clickOnTransactionLink()
	{
		transaction_link.click();
	}
}
