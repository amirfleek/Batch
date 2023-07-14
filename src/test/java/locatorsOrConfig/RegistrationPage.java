package locatorsOrConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
	static WebDriver driver;
	//Constructor
	public RegistrationPage(WebDriver driver) {
		this.driver= driver;
	}
	
	//Identify Elements
	By Title = By.xpath("//div[@class=\"signup_container_right\"]//div[@class=\"title\"]");
	By URL = By.xpath("");
	By FirstName = By.xpath("//input[@placeholder=\"Type First Name\"]");
	By LastName = By.xpath("//input[@placeholder=\"Type Last Name\"]");
	By Email = By.xpath("//input[@placeholder=\"Type Email\"]");
	By Phone = By.xpath("//input[@placeholder=\"Type Phone Number\"]");
	By Company = By.xpath("//input[@placeholder=\"Type Company Name\"]");
	By Password = By.xpath("//input[@name=\"password\"]");
	By ConfrimPass = By.xpath("//input[@name=\"password2\"]");
	By SignUp = By.xpath("//button[@class=\"signup_button btn btn-danger\"]");
	
	//Create methods to perform actions
	public String VerifyTitle() {
		String str= driver.findElement(Title).getText();
		return str;
	}
	public void EnterFirstName() {
		driver.findElement(FirstName).sendKeys("Amir");
	}
	public void EnterLastName() {
		driver.findElement(LastName).sendKeys("Qureshi");
	}
	public void Email() {
		driver.findElement(Email).sendKeys("amir.sohil@fleekitsolutions.com");
	}
	public void Phone() {
		driver.findElement(Phone).sendKeys("9690216258");
		}
	public void Company() {
		driver.findElement(Company).sendKeys("FleekItsolutions");
	}
	public void Password() {
		driver.findElement(Password).sendKeys("Amir@123");
		}
	public void ConfirmPass() {
		driver.findElement(ConfrimPass).sendKeys("Amir@123");
	}
	public void ClickOnSignUp() {
		driver.findElement(SignUp).click();
	}
 
}
