package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.Footer;
import Resources.Baseclass;

public class Footer_Testcase extends Baseclass{

	@Test
	public static void verifyfooter()
	{
		
		Footer fpo =new Footer(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		fpo.aboutus().click();
		fpo.deliveryinfo().click();
		fpo.privacypolicy().click();
		fpo.termscoditions().click();
		
		fpo.contactusClick().click();
		fpo.returnsClick().click();
		fpo.sitemap().click();
		
		fpo.brandClick().click();
		fpo.gift().click();
		fpo.affiliateClick().click();
		fpo.specialsClick().click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
