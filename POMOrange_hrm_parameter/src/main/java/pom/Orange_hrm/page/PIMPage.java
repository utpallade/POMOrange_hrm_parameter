package pom.Orange_hrm.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pom.Orange_hrm.base.TestBase;

public class PIMPage extends TestBase {
	
	public PIMPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public PIMPage clickAdd() {
    driver.findElement(By.xpath("(//button[contains(@class, 'oxd-button--medium oxd-button--secondary')])[2]")).click();
    return this;
	}
	public PIMPage addfirstName() {
    driver.findElement(By.name("firstName")).sendKeys("Utpal");
    return this;
	}
	public PIMPage addmiddleName() {
    driver.findElement(By.name("middleName")).sendKeys("Rao");
    return this;
	}
	public PIMPage addlastName() {
    driver.findElement(By.name("lastName")).sendKeys("Lade");
    return this;
	}

   public PIMPage getemployeeId() {    
    WebElement employeeIdElement = driver.findElement(By.xpath("//label[text()='Employee Id']/../following-sibling::div//input"));
    String employeeId  = employeeIdElement.getAttribute("value");
    System.out.println("Employee ID: " + employeeId);
    return this;
   }
    public AddedPIMUserDetail clicksaveButton() throws InterruptedException {
    WebElement saveButton = driver.findElement(By.xpath("//button[@type='submit']"));
    saveButton.click();
    Thread.sleep(2000);
    return new AddedPIMUserDetail();
    }
    
    public PIMPage AddEmployeeId() {
    	driver.findElement(By.xpath("(//input[contains(@class, 'oxd-input oxd-input--active')])[2]")).sendKeys("0451");
        return this;
        }
    public PIMPage AddEmployeeName() throws InterruptedException {
    WebElement employeenameElement = driver
			.findElement(By.xpath("//label[text()='Employee Name']/../following-sibling::div//input"));
	
    employeenameElement.sendKeys("utpal");
	Thread.sleep(1000);
	employeenameElement.sendKeys(Keys.DOWN,Keys.ENTER);
	return this;
    }
    public PIMPage clickSearchBtn() throws InterruptedException {
    driver.findElement(By.xpath("//button[text()=' Search ']")).click();
	Thread.sleep(2000);
	return this;
    }
    public PIMPage clicktrashBtn() throws InterruptedException {
	driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash']")).click();
	Thread.sleep(3200);
	return this;
    }
    public PIMPage clickYesDelete() {
	driver.findElement(By.xpath("//button[text()=' Yes, Delete ']")).click();
	return this;
    }
}
