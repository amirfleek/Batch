package locatorsOrConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.qameta.allure.Step;

public class LoginPage {
	static WebDriver driver;
	//constructor

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	//elements
	By Email = By.xpath("//input[@placeholder=\"Email\"]");
	By Password = By.xpath("//input[@name=\"password\"]");
	By Checkbox = By.xpath("//span[@class=\"checkmark\"]");
	By LoginBtn = By.xpath("//div[@class=\"full_width_input\"]//button[@type=\"submit\"]");
	
	
	@Step ("Trigger the URL")
	public String URL() {
		String str = "https://qa.int.batchdialer.com/login/";
		return str;
	}
	@Step ("Enter email")
	public void email() {
		driver.findElement(Email).sendKeys("mohammad.mehandi+54@batchservice.com");
	}
	@Step ("Enter password")
	public void password() {
		driver.findElement(Password).sendKeys("Test@123");
	}
	@Step ("Enable checkbox")
	public void checkbox() {
		driver.findElement(Checkbox).click();
	}
	@Step ("Click on LoginBtn")
	public void LoginBtn() {
		driver.findElement(LoginBtn).click();
	}

	

}
