package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitUtility {
	
	//1) Why ---To apply Waits
		//2) What are inputs?    --- WebElement
		//3) What Will be output? --- null

	public void waitForElement(WebElement element, WebDriver driver, long timeInSec){
		WebDriverWait wait = new WebDriverWait(driver,  timeInSec);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	@Test
	public void Test(WebElement element, WebDriver driver, long timeInSec){
		waitForElement(element, driver, timeInSec);
		
	}
	
	
}
