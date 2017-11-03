package portfolio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	public static WebDriver driver;
	
	public LoginPage (WebDriver driver){
		LoginPage.driver = driver;
	}
	
	@FindBy(how=How.NAME, using="uid")
	public static WebElement login;
	
	@FindBy(how=How.NAME, using="password")
	public static WebElement password;
	
	@FindBy(how=How.NAME, using="btnLogin")
	public static WebElement btnLogin;
}
