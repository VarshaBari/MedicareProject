package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.BaseClass;

public class SignUp_ConfirmPage {
	
	WebDriver driver=BaseClass.driver;
	
	@FindBy(xpath="//a[text()='Confirm']")
	WebElement ConfirmBtn;
	
	
	public SignUp_ConfirmPage() {
		
		PageFactory.initElements(driver, this);
	}

	
	public void SignUp_ConfirmPagefunctionality() {
		
		ConfirmBtn.click();
		
			}
	
	
	
}
