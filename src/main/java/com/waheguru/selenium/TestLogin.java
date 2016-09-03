package com.waheguru.selenium;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLogin {

	WebDriver driver;
	
	@Before
	public void setUp(){
	 driver = new FirefoxDriver();
	}

        @Test
	    public void login() {
	        driver.get("http://gmail.com");        
	        driver.findElement(By.id("Email")).sendKeys("grewal.gurman1991@gmail.com");
	        driver.findElement(By.id("next")).submit(); 
	        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	        driver.findElement(By.id("Passwd")).sendKeys("MeetGod2016");
	        driver.findElement(By.id("signIn")).submit();
	       // assert("");
	    }
	    
        
	   /* public void navigate(){
	        driver.get("http://www.google.com");
	    	driver.navigate().refresh();
	    	driver.manage().deleteAllCookies();
	    }*/
}
