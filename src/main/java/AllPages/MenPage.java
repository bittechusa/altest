package AllPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenPage
{
	private WebDriver driver;
	
	public MenPage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void clickManPage()
	{
		driver.findElement(By.xpath("/html/body/div/header/div/div[3]/ul/li[5]/a")).click();
	}
	
	public void clickFirstProduct()
	{
		driver.findElement(By.xpath("html/body/div[2]/div[2]/div[2]/div[2]/div[1]/a/img")).click();
	}
	
	
}
