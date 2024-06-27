package pom.Orange_hrm.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pom.Orange_hrm.base.TestBase;

public class LoginPage extends TestBase{
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public LoginPage addUsername(String username) {
	driver.findElement(By.name("username")).sendKeys(username);
	return this;
	}
	public LoginPage addPassword(String password) {
	driver.findElement(By.name("password")).sendKeys(password);
	return this;
	}
	public HomePage clickLogin() throws InterruptedException {
	driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	Thread.sleep(2000);
	return new HomePage(driver);
	}
}