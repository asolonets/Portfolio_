package portfolio;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LoginTest {

	private WebDriver driver; 
	private String baseUrl; 

	@DataProvider(name = "LoginCredentials")
	public Object[][] testData() throws Exception {

		
		Object[][] data = new Object[4][2];
		
		// 1st row
		data[0][0] = Util.USER_NAME;
		data[0][1] = Util.PASSWD;
		//2nd row
		data[1][0] = "invalid";
		data[1][1] = Util.PASSWD;
		//3rd row
		data[2][0] = Util.USER_NAME;
		data[2][1] = "invalid";
		//4th row
		data[3][0] = "invalid";
		data[3][1] = "invalid";
	return data;
	}
	
	@BeforeMethod
	public void setUp() throws Exception {
		driver = new FirefoxDriver();

		baseUrl = Util.BASE_URL;
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(Util.WAIT_TIME, TimeUnit.SECONDS);		
	}

	@Test(dataProvider = "LoginCredentials")
	public void LoginTestCase(String username, String password) throws InterruptedException {
		String actualBoxMsg;
		PageFactory.initElements(driver, portfolio.LoginPage.class);	
		PageFactory.initElements(driver, portfolio.MainPage.class);
		
		
		LoginPage.login.clear();		
		LoginPage.login.sendKeys(username);
		LoginPage.password.clear();
		LoginPage.password.sendKeys(password);
		LoginPage.btnLogin.click();
		        
		 try{ 
				Alert alt = driver.switchTo().alert();
				actualBoxMsg = alt.getText(); 
				alt.accept();
				assertEquals(actualBoxMsg,Util.EXPECT_ERROR);		
				System.out.println("________________________________________________");
				
			}    
		    catch (NoAlertPresentException Ex){     	 	
		    	
		    	assertEquals(Util.EXPECT_CSS_MAIN_PAGE, MainPage.mainPageInfo.getText());
		    	
	        } 
		}		

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}
}