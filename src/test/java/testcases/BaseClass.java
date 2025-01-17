package testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void SetUpDriver() {
		
		WebDriverManager.chromedriver().clearDriverCache().setup();
		
		driver= new ChromeDriver();
		driver.get("http://localhost:8081/medicare");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	}
	@AfterMethod
	public void TearDown() {
		
		// driver.close();
		
	}
	
	
	

}
