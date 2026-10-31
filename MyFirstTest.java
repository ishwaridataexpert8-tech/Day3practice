package com.pp;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class MyFirstTest {
	    WebDriver driver;

	    @BeforeMethod
	    public void setup() {
	        driver = new ChromeDriver(); 
	        driver.get("https://google.com"); 
	    }

	    @Test
	    public void testGoogleTitle() {
	        String title = driver.getTitle();
	        System.out.println("Website Title is: " + title); 
	    }

	    @AfterMethod
	    public void tearDown() {
	        driver.quit(); 
	    }
	}