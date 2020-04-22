package pageObjectPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ParentBase;

public class SignUpPage extends ParentBase{
	
	
	@FindBy(xpath="name")
	WebElement name;
	
	
	
	
	
	
	
	
	
	
	
	
	
	public SignUpPage() {
		
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	public void waht() {
		
		name.sendKeys("");
	}
	
	
	
	

}
