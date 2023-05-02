package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.Header;
import Resources.Baseclass;
import Resources.CommonUtilities;
import Resources.Constant;

public class Header_Testcase extends Baseclass {

	@Test
	public static void verifyHeader() {
		
	Header hpo =new Header(driver);
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	hpo.currencyClick().click();
	
		
	hpo.phoneClick().click();	
	hpo.nameEnter().click();
	hpo.emailEnter().click();
	hpo.enquiryEnter().click();
	hpo.submitClick().click();
	
	hpo.myacntClick().click();
	hpo.loginClick().click();
	hpo.email1Enter().click();
	hpo.passwordEnter().click();
	hpo.loginbtnClick().click();
	
		
	hpo.wishlistClick().click();
	hpo.submitClick().click();
	hpo.addtocartClick().click();
		
		
	hpo.cartClick().click();
	hpo.taxClick().click();
	CommonUtilities.handleDropDownByVisibleText(hpo.countryClick(), Constant.country);
	hpo.stateClick().click();	
	CommonUtilities.handleDropDownByVisibleText(hpo.stateClick(), Constant.state);
	hpo.pincodeEnter().sendKeys(Constant.pincode);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
