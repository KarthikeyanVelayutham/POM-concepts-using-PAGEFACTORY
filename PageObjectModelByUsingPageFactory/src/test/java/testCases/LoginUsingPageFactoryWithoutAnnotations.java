package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomObjectsPageFactory.LoginPageObject;
import pomObjectsPageFactory.UpdateProfilePageObject;

public class LoginUsingPageFactoryWithoutAnnotations {
	
	
	public static WebElement email;
	public static WebElement password;
	public static WebElement submitBTN;
	
	@Test
	public void loginTestCase() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	PageFactory.initElements(driver , LoginUsingPageFactoryWithoutAnnotations.class);
	driver.get("https://www.phptravels.net/login");
	email.sendKeys("user@phptravels.com");
	password.sendKeys("demouser");
	submitBTN.click();
	driver.quit();
}
}