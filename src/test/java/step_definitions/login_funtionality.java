package step_definitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class login_funtionality extends Base{
	@Given("I am in Landing Home Page")
	public void i_am_in_Landing_Page() {
		navigateURL("https://it.microtechlimited.com/");
		String s = getText(By.xpath("//div//h1['Welcome to MicroTech NA.']"));
		assertEquals("Welcome to MicroTech NA.", s);
	}

	@When("I Click on Loginn")
	public void i_Click_on_Login() {
		click(By.xpath("//a[@href=\"elogin.php\"]"));
	}
}
