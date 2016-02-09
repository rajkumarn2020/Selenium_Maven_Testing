package com.learnautomation.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class demo {
	public static WebDriver dr;
	@Test
	public void testhello(){
		String browser = "Chrome";
		switch (browser) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			dr = new ChromeDriver();
			break;
		case "IE":
			System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe");
			dr = new InternetExplorerDriver();
			break;
		case "Firefox":
			dr = new FirefoxDriver();
			break;
		default:
			dr = new FirefoxDriver();
			break;
		}
		dr.get("http://learn-automation.com/integration-of-selenium-with-maven-and-create-build-for-continuous-integration/");
		dr.manage().window().maximize();
	}

}
