package mywebapp;

import junit.framework.TestCase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Testlogin extends TestCase {

	public void testDoGetHttpServletRequestHttpServletResponse() {
		
		//System.setProperty("webdriver.gecko.driver","D:\\Java\\Practice\\Practice Workspaces\\Seleni\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		//fail("Not yet implemented");
	}

}
