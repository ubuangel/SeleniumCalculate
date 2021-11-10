package com.selenium.learn;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
//para chrome
//import org.openqa.selenium.chrome.ChromeDriver;
 
public class HelloSelenium {
	WebDriver driver;
	String url = "https://www.google.com/";
	
	@Before
	public void setUp() {
	//Set the key/value property according to the browser you are using.
	System.setProperty("webdriver.gecko.driver","/home/angel/Descargas/geckodriver-v0.30.0-linux64/geckodriver");
	 
	//Open browser instance
	driver = new FirefoxDriver();
	 
	//Open the AUT
	driver.get(url);
	}
	
	@Test
	public void test() throws InterruptedException {
		
		
		//Fetch the page title
		String pageTitle = driver.getTitle();
		System.out.println("Page title: " + pageTitle);
		 
		//Hey Google
		driver.findElement(By.name("q")).sendKeys("Hey World");
		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(5000);
		 
	
	 
	}
	
	@After
	public void tearDown() {
	//Close the browser
	driver.close();
		}
	
	 

}