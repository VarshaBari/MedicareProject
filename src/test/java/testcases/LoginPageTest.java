package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends BaseClass {
	
	@Test
	public void TC02_VerifyLoginSucceful() {
		HomePage hp=new HomePage();
		hp.clickOnLogin();
		LoginPage lp=new LoginPage();
		lp.Loginfunction("abcd@xyz.com", "Admin@123");
		
		
		}
	@Test
	public void TC03_ValidateErrorMessageforInvalidLogin() {
		HomePage hp=new HomePage();
		hp.clickOnLogin();
		LoginPage lp=new LoginPage();
		lp.Loginfunction("xxx@sss.com","cxzcxzcxzcxz");
		String errortxt=lp.ErrorMassage();
		Assert.assertEquals(errortxt, "Username and Password is invalid!");
			
	
		
	}
	
	

}
