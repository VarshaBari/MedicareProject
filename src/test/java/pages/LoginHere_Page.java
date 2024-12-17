package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.BaseClass;

public class LoginHere_Page {
	
	WebDriver driver= BaseClass.driver;
	
	@FindBy(xpath="//a[text()='Login Here']")
	WebElement LoginHereBtn;
	
	public LoginHere_Page() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void LoginHereFunctionality() {
		LoginHereBtn.click();
	}

}
