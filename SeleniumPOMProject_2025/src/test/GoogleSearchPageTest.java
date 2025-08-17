package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

	static WebDriver driver=null;
	
 	public static void main(String[] args) throws InterruptedException {
		googleSearchTest();
	}
 	
 	public static void googleSearchTest() throws InterruptedException {
 		
		//String ProjectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", "/Users/yashchouhan/Downloaded_Jars/geckodriver");
		driver= new FirefoxDriver();
		
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		//URL
		driver.get("https://www.google.com");
		
		searchPageObj.setTextInSearchBox("Automation step by step");
		Thread.sleep(5);
		searchPageObj.clickSearchButton();
		Thread.sleep(10);
		
		driver.quit();
		System.out.println("Test is completed!!");
		//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		
		;

 		
 	}
 	
}
