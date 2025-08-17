package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.LoginPage;

public class LoginTest {

	public static WebDriver driver = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testValidLogin();
	}
	
	public static void testValidLogin() {

		//String ProjectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", "/Users/yashchouhan/Downloaded_Jars/geckodriver");
		driver= new FirefoxDriver();
		
		//URL
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		
		
		LoginPage loginPage =  new LoginPage(driver);
		
		loginPage.enterUsername("admin@yourstore.com");
		loginPage.enterPassword("admin");
		loginPage.clickButton();
		
		driver.quit();
		System.out.println("Test is completed!!");
		
	}

}
