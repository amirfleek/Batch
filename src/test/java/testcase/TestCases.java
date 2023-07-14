package testcase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Baseclass;
import locatorsOrConfig.LoginPage;
import locatorsOrConfig.RegistrationPage;

public class TestCases extends Baseclass{
	public WebDriver driver;
	 //Create objects of all pages
	Baseclass base;
	LoginPage L2;
	RegistrationPage l1;
	
	@BeforeTest
	public void Aobjects() {
		base = new Baseclass();
		driver= base.initialize_driver();
		}
//	@Test
//	public void BRegistationPage() {
//		driver.get("https://qa.int.batchdialer.com/signup?type=trial");
//		l1 = new RegistrationPage(driver);
//		Assert.assertEquals(l1.VerifyTitle(),"");
//		System.out.println("Tittle is Matched");
//		l1.EnterFirstName();
//		l1.EnterLastName();
//		l1.Email();
//		l1.Phone();
//		l1.Company();
//		l1.Password();
//		l1.ConfirmPass();
//		l1.ClickOnSignUp();
//		
//	}
	@Test
	public void CLoginPage() {
		driver.get("https://qa.int.batchdialer.com/login/");
		L2 = new LoginPage(driver);
		L2.email();
		L2.password();
		L2.checkbox();
		L2.LoginBtn();
		//driver.switchTo().alert().accept();
	}
	
}
