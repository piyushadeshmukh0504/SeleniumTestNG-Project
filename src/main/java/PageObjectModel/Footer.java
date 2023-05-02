package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Footer {

	
	public WebDriver driver;
	
	//Information
	
	By aboutus =By.xpath("//a[text()='About Us']");
	By deliveryinfo =By.xpath("//a[text()='Delivery Information']");
	By privacypolicy =By.xpath("//a[text()='Privacy Policy']");
	By termsconditions =By.xpath("//a[text()='Terms & Conditions']");
	
	//CustomerService
	
	By contactus =By.xpath("//a[text()='Contact Us']");
	By returns =By.xpath("//a[text()='Returns']");
	By sitemap =By.xpath("//a[text()='Site Map']");
	
	//Extras
	
	By brand =By.xpath("//a[text()='Brands']");
	By gift  =By.xpath("//a[text()='Gift Certificates']");
	By affiliate =By.xpath("//a[text()='Affiliate']");
	By specials =By.xpath("//a[text()='Specials']");
	
	
	//Information
	
	public Footer(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement aboutus() {
		
		return driver.findElement(aboutus);
	}
	
	public WebElement deliveryinfo() {
		return driver.findElement(deliveryinfo);
	}
	
	public WebElement privacypolicy() {
		return driver.findElement(privacypolicy);
	}
	
	public WebElement termscoditions() {
		return driver.findElement(termsconditions);
	}
	
	public WebElement contactusClick() {
		return driver.findElement(contactus);
		
	}
	
	public WebElement returnsClick() {
		return driver.findElement(returns);
	}
	
	public WebElement sitemap() {
		
		return driver.findElement(sitemap);
	}
	
	public WebElement brandClick() {
		return driver.findElement(brand);
	}
	
	public WebElement gift() {
		return driver.findElement(gift);
	}
	
	public WebElement affiliateClick() {
		return driver.findElement(affiliate);
	}
	
	public WebElement specialsClick() {
		return driver.findElement(specials);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
