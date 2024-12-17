package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.BaseClass;

public class SignUpPage {
	
	WebDriver driver=BaseClass.driver;
	
	//===================Locators=============
	
	@FindBy(id="signup")
	WebElement signupBtn;
	
	@FindBy(id="firstName")
	WebElement FirstName;
	
	@FindBy(id="lastName")
	WebElement LastName;
	
	@FindBy(id="email")
	WebElement Email;
	
	@FindBy(id="contactNumber")
	WebElement ContactNo;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="confirmPassword")
	WebElement ConfirmedPass;
	
	
	@FindBy(id="role1")
	WebElement Role;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement NextBillingBtn;
	
	
	
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
	
	
	
	
	
	
	
	
	public SignUpPage(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void SignUpPersonal(String firstName, String lastName, String email, String contactNo, String password, String confPassword) {
		
		signupBtn.click();
		FirstName.sendKeys(firstName);
		LastName.sendKeys(lastName);
		Email.sendKeys(email);
		ContactNo.sendKeys(contactNo);
		Password.sendKeys(password);
		ConfirmedPass.sendKeys(confPassword);
		Role.click();
		NextBillingBtn.click();
		
		
		
		
		
		
		
	}
	

}
