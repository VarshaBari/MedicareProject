package pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.BaseClass;

public class VeiwProductPage {

	WebDriver driver = BaseClass.driver;

	@FindBy(xpath = "//a[text()='View']") //// div[@ng-repeat='product in pCtrl.mvProducts']/div/div/a
	List<WebElement> veiwMedicines;

	@FindBy(css = "h5.ng-binding")
	List<WebElement> medicines;

	@FindBy(xpath = "//a[text()='View Products']")
	WebElement viewProdBtn;

	@FindBy(xpath = "//td[@class='sorting_1']/following-sibling::td[1]")
	List<WebElement> medicineNamesintable;

	@FindBy(css = ".btn-primary .glyphicon")
	List<WebElement> adddMedicine;

	@FindBy(xpath = "//*[contains(text(),' Continue Shopping')]")
	WebElement continueBtn;

	@FindBy(xpath = "//a[text()=' Add to Cart']")
	WebElement AddToCartBtn;

	@FindBy(xpath = "//*[contains(text(),'Checkout ')]")
	WebElement CheckOutBtn;

	public VeiwProductPage() {

		PageFactory.initElements(driver, this);
	}

	public void singlemedicineAddtoCart(String medicinename) {

		for (int i = 0; i < medicines.size(); i++) {

			String name = medicines.get(i).getText();
			if (name.contains(medicinename)) {
				veiwMedicines.get(i).click();
				AddToCartBtn.click();
				break;

			}

		}

	}

	public void twoMedicineAddToCart(String[] itemsneeded) {

		for (int i = 0; i < medicines.size(); i++) {

			String item = medicines.get(i).getText();

			List itemsneddedList = Arrays.asList(itemsneeded);
			if (itemsneddedList.contains(item)) {
				veiwMedicines.get(i).click();
				viewProdBtn.click();
			}

		}

	}

	public void multipleMedicineAdd(String[] itemsneeded) {

		viewProdBtn.click();
		for (int i = 0; i < medicineNamesintable.size(); i++) {

			String medicineName = medicineNamesintable.get(i).getText();
			System.out.println(medicineName);

			List medicninesList = Arrays.asList(itemsneeded);

			int j = 0;
			if (medicninesList.contains(medicineName)) {
				j++;
				adddMedicine.get(i).click();
				AddToCartBtn.click();

				if (j == 2) {
					continueBtn.click();
					break;
				}

			}

		}

	}
	
	
	public void checkOutButton() {
		CheckOutBtn.click();
	}

}
