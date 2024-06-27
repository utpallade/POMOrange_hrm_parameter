package pom.Orange_hrm.test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pom.Orange_hrm.base.TestBase;
import pom.Orange_hrm.page.LoginPage;

public class T002_AddPIM extends TestBase{
	
	@Parameters({"userName","password"})
	@Test
	public void AddPIM(String uname ,String pwd) throws InterruptedException
	{
		LoginPage lp =new LoginPage(driver);
		lp.addUsername(uname).addPassword(pwd).clickLogin().selectPIMSubmenu().clickAdd().addfirstName().addlastName().addmiddleName().getemployeeId().clicksaveButton();
	}
}
