package portfolio;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPageTest {

	private WebDriver driver;
	private String baseUrl;

	@BeforeMethod
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = Util.BASE_URL;
		driver.manage().window().maximize();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(Util.WAIT_TIME, TimeUnit.SECONDS);

	}

	@Test
	public void LoginTestCase() throws InterruptedException {

		PageFactory.initElements(driver, portfolio.LoginPage.class);
		PageFactory.initElements(driver, portfolio.MainPage.class);
		Modules.login(Util.USER_NAME, Util.PASSWD);
		assertEquals(Util.EXPECT_CSS_MAIN_PAGE, MainPage.mainPageInfo.getText());
		
	}

	@Test
	public void NewCustomerTestCase() throws InterruptedException {

		PageFactory.initElements(driver, portfolio.LoginPage.class);
		PageFactory.initElements(driver, portfolio.MainPage.class);
		Modules.login(Util.USER_NAME, Util.PASSWD);
		Thread.sleep(2000);
		MainPage.newCustomer.click();
		assertEquals(Util.EXPECT_addNewCustomerPageCheck, MainPage.addNewCustomerPageCheck.getText());

	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.close();
	}
}