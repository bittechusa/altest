package TestPakage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{

	WebDriver driver;
	
	@Before
	public void start()
	{
		driver = new FirefoxDriver();
		driver.get("http://www.bluefly.com");
	}
	
	@After 
	public void end() throws Exception
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
