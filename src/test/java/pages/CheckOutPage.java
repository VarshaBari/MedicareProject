package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.BaseClass;

public class CheckOutPage {
	
	WebDriver driver=BaseClass.driver;
	
	
	
	@FindBy(xpath="//a[text()='Select']")
	WebElement SelectBtn;
	
	
	
	public CheckOutPage() {
		
		PageFactory.initElements(driver, this);
	}

	
	
	
	public void selectBtn() {
		SelectBtn.click();
	}
}
