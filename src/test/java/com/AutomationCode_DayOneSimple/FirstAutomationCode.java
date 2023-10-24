package com.AutomationCode_DayOneSimple;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstAutomationCode {

	
	@Test
	public void firstAutomationCode() {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.switchTo().newWindow(WindowType.TAB);//new tab in browser
		driver.get("https://amazon.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://tutorialsninja.com/demo");
		driver.quit();
		
	}
	
	
	
}
