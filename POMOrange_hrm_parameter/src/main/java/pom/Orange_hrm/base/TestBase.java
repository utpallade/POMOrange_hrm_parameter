package pom.Orange_hrm.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public  WebDriver driver;
	
	@Parameters("url")
	@BeforeMethod
	public void setUp(String URL)
	{
		// Set the path for the ChromeDriver
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		// maximize the screen
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
	}
	
@AfterMethod
	
	public void closeWindow() {
		driver.quit();
	}
	    
}
