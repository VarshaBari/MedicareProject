package testcases;

import org.testng.annotations.Test;

import pages.LoginHere_Page;
import pages.SignUpPage;
import pages.SignUp_AddressPage;
import pages.SignUp_ConfirmPage;

public class SignUpPageTest extends BaseClass{
	
   @Test

	public void TC01_signUptest() {
	
	SignUpPage sp= new SignUpPage();
	sp.SignUpPersonal("Varsha", "Bari","abcde@xyz.com","7744552233","Admin@123","Admin@123");
	
	SignUp_AddressPage sap=new SignUp_AddressPage();
	sap.SignUp_AddressPageDetails("abcdLane1", "abcdlane2", "Pune", "411031", "Maharashtra", "India");
	
	SignUp_ConfirmPage scp=new SignUp_ConfirmPage();
	scp.SignUp_ConfirmPagefunctionality();
	
	LoginHere_Page lp=new LoginHere_Page();
	lp.LoginHereFunctionality();
	
	}
   
}
