package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.AddToCart;
import Resources.Baseclass;
import Resources.CommonUtilities;
import Resources.Constant;

    public class Addtocart_Testcase extends Baseclass {

	@Test
	
	public static void verify() throws InterruptedException
	{
		
		
	 AddToCart mp=new AddToCart(driver);
			
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
	mp.searchenter().sendKeys(Constant.search);	
	mp.searchBtnClick().click();	
	mp.addtocartClick().click();
		
	String pricel=mp.pricecheck().getText();
	double d1=CommonUtilities.productPriceHandle(pricel);
	mp.searchenter().clear();
	mp.searchenter().sendKeys(Constant.search1);
	mp.searchBtnClick().click();
	mp.addtocartClick().click();
	String price2 =mp.pricecheck().getText();
	double d2=CommonUtilities.productPriceHandle(price2);
	
	double add=d1+d2;
	String actualPriceconvert =Double.toString(add);
	String actualPrice =("$"+actualPriceconvert);
	System.out.println("Actual Addition of price:"+actualPrice);
	
	Thread.sleep(2000);
		
		
	mp.totalitemClick().click();
	String expectedPriceCart =mp.expectedtotalprice().getText();
	double d3 =CommonUtilities.productPriceHandle(expectedPriceCart);
	String expectedPriceConvert =Double.toString(d3);
	String expectedPrice =("$"+expectedPriceConvert);
	
	System.out.println("Expected addition :"+expectedPrice);
	
	if(actualPrice.equals(expectedPrice))
	{
		System.out.println("Pass");
	}
	else {
		System.out.println("Fail");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
