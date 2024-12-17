package testcases;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.VeiwProductPage;
import pages.HomePage;
import pages.LoginPage;
import pages.PaymentDetailsPage;
import pages.CheckOutPage;

public class AddToCartTest extends BaseClass {

	String medicineName = "Paracetamol";

	String[] itemsneeded = { "Paracetamol", "Combiflame" };

	@Test
	public void TC04_AddToCart() {

		HomePage hp = new HomePage();
		hp.clickOnLogin();

		LoginPage lp = new LoginPage();
		lp.Loginfunction("abcd@xyz.com", "Admin@123");

		VeiwProductPage vp = new VeiwProductPage();
		vp.singlemedicineAddtoCart(medicineName);
		vp.checkOutButton();
		CheckOutPage cp = new CheckOutPage();
		cp.selectBtn();
		PaymentDetailsPage pg = new PaymentDetailsPage();
		pg.paymentFuction();
		String paymassg = pg.paymentSuccessMassage("Your Order is Confirmed!!");
		Assert.assertEquals(paymassg, "Your Order is Confirmed!!"); 

	}

	@Test
	public void TC05_TwoItemsAddedToCart() {

		HomePage hp = new HomePage();
		hp.clickOnLogin();

		LoginPage lp = new LoginPage();
		lp.Loginfunction("abcd@xyz.com", "Admin@123");

		VeiwProductPage vp = new VeiwProductPage();
		vp.twoMedicineAddToCart(itemsneeded);
		vp.checkOutButton();
		CheckOutPage cp = new CheckOutPage();
		cp.selectBtn();

	}

	@Test
	public void TC05_multipleAddedToCart() {

		HomePage hp = new HomePage();
		hp.clickOnLogin();

		LoginPage lp = new LoginPage();
		lp.Loginfunction("abcd@xyz.com", "Admin@123");

		VeiwProductPage vp = new VeiwProductPage();
		vp.multipleMedicineAdd(itemsneeded);
		vp.checkOutButton();

		CheckOutPage cp = new CheckOutPage();

		cp.selectBtn();

		PaymentDetailsPage pg = new PaymentDetailsPage();
		pg.paymentFuction();
		String paymassg = pg.paymentSuccessMassage("Your Order is Confirmed!!");
		Assert.assertEquals(paymassg, "Your Order is Confirmed!!");

	}

}
