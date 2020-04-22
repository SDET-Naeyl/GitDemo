package testPackage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.ParentBase;
import pageObjectPackage.LoginPage;

public class LoginTest extends ParentBase {
	
	// To access the web elements of LoginPage we have to create its class object
	
	LoginPage loginPage;

	// first we have to creat the constractor for this class
	public LoginTest() {
		super();
	}
	// we have to write annotations like
	
	@BeforeMethod
	public void setUp() {
		
		setUpSystem();// this method come from parent class
		
		loginPage = new LoginPage();
	}
	
	// Now we create our Test
	
	@Test(priority = 1)
	public void loginPageValidation() {
		
	String title=	loginPage.validateLoginTitle();
	
	Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
	
	System.out.println(title);
		
		}
	@Test(priority = 2)
	public void logoValidation() {
		
		boolean justLogo = loginPage.verifyLogo();
		
		Assert.assertTrue(justLogo);
	}
	
	@Test(priority = 3)
	public void loginTest() {
		
		loginPage.login(properties.getProperty("username"), properties.getProperty("password"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
