package mywebapp;

import junit.framework.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Testlogin extends TestCase {

	public void testDoGetHttpServletRequestHttpServletResponse() {
		
		//System.setProperty("webdriver.gecko.driver","D:\\Java\\Practice\\Practice Workspaces\\Seleni\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8080/mywebapp/");
		driver.findElement(By.name("username")).sendKeys("hahahahhhahahaha");
		driver.findElement(By.name("password")).sendKeys("dhakan007");
		driver.findElement(By.name("submit")).click();
		System.out.println("Yurekkaaaaaaa...!!!!!");
		//fail("Not yet implemented");
	}
}
