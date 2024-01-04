package com.ds.testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		String x="CHROME";
		
		if(x.equalsIgnoreCase("Chrome"))
		{
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		}
		else if(x.equalsIgnoreCase("FireFox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(x.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Pleasae provide correct Browser Name");
		}
		driver.get("http://www.apps.dalalstreet.ai");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@AfterMethod
	public void tearDown()
	{
//		driver.quit();
	}
	
	
}
