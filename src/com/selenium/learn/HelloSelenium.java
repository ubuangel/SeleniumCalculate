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
	String url = "http://www.calculator.net/";
	
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
		
		
		//Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to("http://www.calculator.net/");
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
	//Fetch the page title
		driver.findElement(By.xpath(".//*[@id = 'menu']/div[3]/a")).click();
	      
	      // Click on Percent Calculators
	      driver.findElement(By.xpath(".//*[@id = 'menu']/div[4]/div[3]/a")).click();
	      
	      // Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("10");
	      
	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("50");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();

	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();

	      
	      // Print a Log In message to the screen
	      System.out.println(" The Result is " + result);
	
	 
	}
	
	@After
	public void tearDown() {
	//Close the browser
	driver.close();
		}
	
	 

}