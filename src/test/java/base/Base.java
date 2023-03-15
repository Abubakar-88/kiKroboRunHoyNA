 package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;





public class Base {
	public static WebDriver driver;
	
	public static void click(By by) {

		browser.findElement(by).click();
	}
	public static void sendkeys(By by,String name) {
		browser.findElement(by).sendKeys(name);
	}
	public static boolean isDisplayed(By by) {
		return browser.findElement(by).isDisplayed();
	}
	public static boolean isEnabled(By by) {
		return browser.findElement(by).isEnabled();
	}
	public static String getText(By by) {
		return browser.findElement(by).getText();
	}
	public static void navigateURL(String url) {
		browser.get(url);
	}
	public static void clear(By by) {
		browser.findElement(by).clear();
	}
	public  String getAttributeValue(By by, String key ){
		return browser.findElement( by ).getAttribute( key );
	}

	
}//class
