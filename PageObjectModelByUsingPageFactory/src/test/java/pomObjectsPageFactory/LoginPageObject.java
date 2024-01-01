package pomObjectsPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject {
	//username, password, submit button
	
	
	
	@FindBy(id = "email")
	public static WebElement userName;
	
	@FindBy(id = "password")
	public static WebElement passWord;
	
	@FindBy(id = "submitBTN")
	public static WebElement submit;
		
}
