package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.BaseClass;

public class SignUp_AddressPage {

	WebDriver driver=BaseClass.driver;

	
	@FindBy(id="addressLineOne")
	WebElement AddressLine1;
	
	@FindBy(id="addressLineTwo")
	WebElement AddressLine2;
	
	@FindBy(id="city")
	WebElement City;
	
	@FindBy(id="postalCode")
	WebElement Postalcode;
	
	@FindBy(id="state")
	WebElement State;
	
	@FindBy(id="country")
	WebElement Country;
	
	@FindBy(css="[name='_eventId_confirm']")
	WebElement ConfirmBtn;
	
	
	public SignUp_AddressPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void SignUp_AddressPageDetails(String addressLine1, String addressLine2, String city, String postalCode, String state, String country) {
		AddressLine1.sendKeys(addressLine1);
		AddressLine2.sendKeys(addressLine2);
		City.sendKeys(city);
		Postalcode.sendKeys(postalCode);
		State.sendKeys(state);
		Country.sendKeys(country);
		ConfirmBtn.click();
		
		
		
	}
	
	
}
