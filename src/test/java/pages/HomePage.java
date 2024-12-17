package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.BaseClass;

public class HomePage {

	
WebDriver driver=BaseClass.driver;
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement LoginBtn;
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnLogin() {
		LoginBtn.click();
	}
}
