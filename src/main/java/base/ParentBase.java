package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.TestUtilities;

		public class ParentBase {
			
		// intialize Webdriver and Properties as a global variable level so that it can be accessed by any class	
	public	static WebDriver driver;
		
	public	static Properties properties;
		
		
		// Here we create the constractor for this class
		
		public ParentBase() {
			
		try {	properties = new Properties();
					
				// Here we type the path or our properties file
			FileInputStream fileInput = new FileInputStream("C:\\Users\\Naeyl\\Desktop\\JAVA\\HybridTestingFramework\\src\\main\\java\\configuration\\config.properties");
			properties.load(fileInput);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
			
				public static void setUpSystem() {
					
				String browserName =	properties.getProperty("browser");
				
				if (browserName.equals("chrome")) {
				
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
					
					driver = new ChromeDriver();
					
				}else if (browserName.equals("firefox")) {
					
					System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
				
						
					}
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(TestUtilities.PAGE_LOAD_TIME_OUT, TimeUnit.SECONDS); // the time is given by TestUtil class
				driver.manage().timeouts().implicitlyWait(TestUtilities.IMPLICIT_WAIT, TimeUnit.SECONDS);// the time is given by TestUtil class
				driver.get(properties.getProperty("url"));
				
		}
			
			
		
		
		
		
		
		
		
		
			
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


