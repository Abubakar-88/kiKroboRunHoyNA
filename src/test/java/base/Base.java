 package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;





public class Base {
	public static WebDriver driver;
	
	public static void click(By by) {

		driver.findElement(by).click();
	}
	public static void sendkeys(By by,String name) {
		driver.findElement(by).sendKeys(name);
	}
	public static boolean isDisplayed(By by) {
		return driver.findElement(by).isDisplayed();
	}
	public static boolean isEnabled(By by) {
		return driver.findElement(by).isEnabled();
	}
	public static String getText(By by) {
		return driver.findElement(by).getText();
	}
	public static void navigateURL(String url) {
		driver.get(url);
	}
	public static void clear(By by) {
		driver.findElement(by).clear();
	}
	public  String getAttributeValue(By by, String key ){
		return driver.findElement( by ).getAttribute( key );
	}

	
}//class
