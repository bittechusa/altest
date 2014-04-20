package TestPakage;

import org.junit.Test;

import AllPages.MenPage;

public class SmokeTest extends BaseTest
{
	@Test
	public void test1()
	{
		MenPage menpage = new MenPage(driver);
		menpage.clickManPage();
		menpage.clickFirstProduct();
	}

}
