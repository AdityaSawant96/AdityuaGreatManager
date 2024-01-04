package com.ds.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpNowPage {
	
	public SignUpNowPage(WebDriver driver)
	{
		PageFactory.initElements( driver, this);
	}
	
	//.........obj Repository.............
	
	@FindBy(xpath="//a[@class=\"fw-medium text-primary\"]")
	private WebElement signUp_Now;
	
	@FindBy(xpath="//input[@name=\"firstName\"]")
	private WebElement firstName_textbox;
	
	@FindBy(xpath="//input[@name=\"lastName\"]")
	private WebElement lastName_textbox;
	
	@FindBy(xpath="//input[@name=\"email\"]")
	private WebElement your_Email_Id_textbox;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement your_password_textbox;
	
	@FindBy(xpath="//input[@name=\"agreement\"]")
	private WebElement agreement_checkbox;
	
	@FindBy(xpath="//div[@class='mt-3 d-grid']")
	private WebElement submit_button;
	
	//------------Action Class-------------------------
		public void clickOnSignUpNow()
		{
			signUp_Now.click();
		}
		
		public void enterFirstName(String firstname) 
		{
			firstName_textbox.sendKeys(firstname);
		}
		
		public void enterLastName(String lasttname) 
		{
			lastName_textbox.sendKeys(lasttname);
		}
		
		public void enterEmailID(String email) 
		{
			your_Email_Id_textbox.sendKeys(email);
		}
		
		public void enterYourPassword(String password) 
		{
			your_password_textbox.sendKeys(password);
		}
		
		public void clickOnAgreementButton() 
		{
			agreement_checkbox.click();
		}
		
		public void clickOnSubmitButton() 
		{
			submit_button.click();
		}
	

}
