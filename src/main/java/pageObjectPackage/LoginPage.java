package pageObjectPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ParentBase;

public class LoginPage extends ParentBase{
	
	// Here we use Page factory to initialize web elements
	
	@FindBy(xpath="//a[@href='https://ui.freecrm.com']")
	WebElement login;
	
	@FindBy(xpath= "//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input\r\n")
	
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input")
	WebElement password;
	
	@FindBy(xpath="//div[contains(@class, 'blue submit button')]")
	WebElement secondLogin;
	
	@FindBy(xpath ="//a[contains(@class, 'fa-twitter')]")
	WebElement logo;
	
	
	// Now we create the constractor of this class
	
	public LoginPage() {
		
		// we use pageFactory to initialize elements
		PageFactory.initElements(driver, this);
	
	}
	
	
	// Now we have to write some methods
	
	public String validateLoginTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyLogo() {
		return logo.isDisplayed();
	}
	
	public void login(String uName, String pName) {
		
		login.click();
		email.sendKeys(uName);
		password.sendKeys(pName);
		
		secondLogin.click();
	}
	
	
	
	
	
	
	
	

}
