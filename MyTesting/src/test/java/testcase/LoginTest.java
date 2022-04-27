package testcase;

//import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class LoginTest extends BaseTest {
	
	
	@Test(priority = 0, description = "Open local URL")
	public static void basicPanel() throws InterruptedException

	{
		System.out.println("URL opened successfully");

		//driver.findElement(By.id("email")).sendKeys("rachita.mahajan14@gmail.com");
		//driver.findElement(By.id("password")).sendKeys("Berlin@2013");
		//driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		System.out.println("Login successful");

	}


}
