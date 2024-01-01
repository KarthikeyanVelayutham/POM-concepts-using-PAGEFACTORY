package testCases;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomObjectsPageFactory.LoginPageObject;
import pomObjectsPageFactory.UpdateProfilePageObject;

public class LoginTestcaseUsingPageFactory {
	@SuppressWarnings("deprecation")
	@Test
	public void loginTestCase() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		PageFactory.initElements(driver , LoginPageObject.class);
		PageFactory.initElements(driver, UpdateProfilePageObject.class);
		
		driver.get("https://www.phptravels.net/login");
		LoginPageObject.userName.sendKeys("user@phptravels.com");
		LoginPageObject.passWord.sendKeys("demouser");
		LoginPageObject.submit.click();
		Thread.sleep(4000);
		UpdateProfilePageObject.myProfile.click();
		UpdateProfilePageObject.phoneNumber.clear();
		UpdateProfilePageObject.phoneNumber.sendKeys("3213456789");
		UpdateProfilePageObject.cityName.clear();
		UpdateProfilePageObject.cityName.sendKeys("india");
		UpdateProfilePageObject.updateSubmit.click();
		Thread.sleep(3000);
		driver.quit();
}
}