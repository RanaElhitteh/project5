package project5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mytest {
	
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	public void mySetup () {
		driver.get("http://127.0.0.1:5500/index.html");
	}
	

	
	@Test
	public void myFirstTest () {
		
	System.out.println(driver.findElement(By.id("button1")).getText()
			);
	}
}
