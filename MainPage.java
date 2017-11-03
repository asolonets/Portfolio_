package portfolio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {
	
	public static WebDriver driver;
	
	public MainPage (WebDriver driver){
		MainPage.driver = driver;
	}
	
	@FindBy(how=How.XPATH, using="html/body/table/tbody/tr/td/table/tbody/tr[3]/td")
	public static WebElement mainPageInfo;
	
	@FindBy(how=How.LINK_TEXT, using="New Customer")
	public static WebElement newCustomer;
	
	@FindBy(how=How.XPATH, using="html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p")
	public static WebElement addNewCustomerPageCheck;
}
	
	