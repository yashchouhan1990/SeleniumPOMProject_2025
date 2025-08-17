package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.GoogleSearchPage;

public class GoogleSearchTest {

	private static WebDriver driver =null;
	
 	public static void main(String[] args) throws InterruptedException {
		googleSearch();
	}

	public static void googleSearch() throws InterruptedException {
		//String ProjectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", "/Users/yashchouhan/Downloaded_Jars/geckodriver");
		
		driver= new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//URL
		driver.get("https://www.google.com");
		
		Thread.sleep(5);
		
		//enter text in search text box
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		
		Thread.sleep(10);
		
		//Click on Search Button
		//driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		Thread.sleep(5);
		
		driver.quit();
		
		System.out.println("Test is completed !!");
		
		
	}
	
}
