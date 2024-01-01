package pomObjectsPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateProfilePageObject {
	
	@FindBy(xpath = "//a[contains(text(),'My Profile')]")
	public static WebElement myProfile;
	
	@FindBy(id = "Phone")
	public static WebElement phoneNumber;
	
	@FindBy(id = "City")
	public static WebElement cityName;
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement updateSubmit;
}
