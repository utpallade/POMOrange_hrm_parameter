package pom.Orange_hrm.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pom.Orange_hrm.base.TestBase;

public class HomePage extends TestBase{
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public HomePage clickProfileMenue() {
	driver.findElement(By.className("oxd-userdropdown-tab")).click();
	return this;
	}
	public LoginPage clickLogout() {
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	return new LoginPage(driver);
	}
	public PIMPage selectPIMSubmenu() {
	driver.findElement(By.linkText("PIM")).click();
	return new PIMPage(driver);
	}
}