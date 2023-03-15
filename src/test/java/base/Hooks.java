package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Base{
	
	@Before
	public void setup() {
		ChromeOptions option = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		browser = new ChromeDriver(option);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//JENKIN
		
	}
	@After
	public void tearDown() {
		//browser.close();
	}

}
