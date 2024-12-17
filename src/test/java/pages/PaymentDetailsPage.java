package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.BaseClass;

public class PaymentDetailsPage {

	WebDriver driver = BaseClass.driver;

	@FindBy(id = "cardNumber")
	WebElement cardNo;
	
	@FindBy(id = "expityMonth")
	WebElement expMonth;
	
	@FindBy(id = "expityYear")
	WebElement expYear;
	
	@FindBy(id = "cvCode")
	WebElement cvCode;
	
	@FindBy(xpath = "//a[text()='Pay']")
	WebElement paymentBtn;
	
	@FindBy(xpath="//h3[text()='Your Order is Confirmed!!']")
	WebElement paymentSuccessMassage;

	public PaymentDetailsPage() {

		PageFactory.initElements(driver, this);
	}
	
	public void paymentFuction() {
		cardNo.sendKeys("1234567890123412");
		expMonth.sendKeys("09");
		expYear.sendKeys("2027");
		cvCode.sendKeys("123");
		paymentBtn.click();
		
		
		
		
	}
	
	public String paymentSuccessMassage(String massg) {
		
		String successmassg=paymentSuccessMassage.getText();
		return successmassg;
	}

}
