/**
 * 
 */
/**
 * 
 */
module SeleniumPOMProject {
	requires org.seleniumhq.selenium.api;
	requires org.seleniumhq.selenium.firefox_driver;
	requires org.seleniumhq.selenium.support;
	
	opens pages to org.seleniumhq.selenium.support;

}