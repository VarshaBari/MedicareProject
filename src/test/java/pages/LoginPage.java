package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.BaseClass;

public class LoginPage {
	
	WebDriver driver=BaseClass.driver;
	
	@FindBy(id="username")
	WebElement Email;
	
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(css="[type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//div[text()='Username and Password is invalid!']")
	WebElement errorMassage;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void Loginfunction(String email, String password ) {
		Email.sendKeys(email);
		Password.sendKeys(password);
		loginBtn.click();

	}
	
	public String ErrorMassage() {
		
		String error=errorMassage.getText();
		return error;
		
	} 
	
	

}
