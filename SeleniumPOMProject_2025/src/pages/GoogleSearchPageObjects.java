package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	
	WebDriver driver = null;
	
	//Adding Object Locators
	By textbox_search = By.id("APjFqb");
	By button_search=By.name("btnK");
	
	public GoogleSearchPageObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	//Defining Actions
	public void setTextInSearchBox(String text) {
		driver.findElement(textbox_search).sendKeys(text);
	}
	
	public void clickSearchButton() {
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}

}
