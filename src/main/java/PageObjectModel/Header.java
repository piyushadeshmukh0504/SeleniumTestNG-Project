package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header {

	public WebDriver driver;
	
	//currency
	
	By currency =By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[1]");
	By option =By.xpath("(//button[@class='currency-select btn btn-link btn-block'])[2]");
	
	//phone
	
	By phone =By.xpath("//i[@class='fa fa-phone']");
	By name =By.xpath("//input[@id='input-name']");
	By email =By.xpath("//input[@id='input-email']");
	By enquiry =By.xpath("//textarea[@id='input-enquiry']");
	By submit =By.xpath("//input[@type='submit']");
	
	//account
	
	By myacnt =By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[3]");
	By login =By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/login'])[1]");
	By email1 =By.xpath("//input[@id='input-email']");
	By password =By.xpath("//input[@id='input-password']");
	By loginbtn =By.xpath("//input[@type='submit']");
	
    //wishlist
	
	By wishlist =By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[4]");
	By addtocart =By.xpath("(//i[@class='fa fa-shopping-cart'])[4]");
	
	//shoppingcart
	
	By cart =By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md')[5]");
	By cartqty =By.xpath("(//button[@class='btn btn-primary'])[1]");
	By cartrefresh =By.xpath("(//i[@class='fa fa-refresh'])[1]");
	
	//checkout
	
	By checkout =By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[6]");
	By tax =By.xpath("(//a[@class='accoedion-toggle'])[2]");
	By country =By.xpath("//select[@id='input-country']");
	By state =By.xpath("//select[@name='zone_id']");
	By pincode =By.xpath("//input[@id='input-postcode']");
	
	
	
	
	public Header(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement currencyClick() {
		
		return driver.findElement(currency);
	}
	
	public WebElement option() {
		return driver.findElement(option);
		
	}
	
	public WebElement phoneClick() {
		return driver.findElement(phone);
	}
	
	public WebElement nameEnter() {
		return driver.findElement(name);
	}
	
	public WebElement emailEnter() {
		return driver.findElement(email);
	}
	
    public WebElement enquiryEnter() {
		return driver.findElement(enquiry);
	}
	
	public WebElement submitClick() {
		return driver.findElement(submit);
	}
	
	public WebElement myacntClick() {
		return driver.findElement(myacnt);
	}
	
	public WebElement loginClick() {
		return driver.findElement(login);
	}
	
	public WebElement email1Enter() {
		return driver.findElement(email1);
	}
	
	public WebElement  passwordEnter() {
		return driver.findElement(password);
	}
	
	public WebElement loginbtnClick() {
		return driver.findElement(loginbtn);
	}
	
	public WebElement wishlistClick() {
		return driver.findElement(wishlist);
	}
	
	public WebElement addtocartClick() {
		return driver.findElement(addtocart);
	}
	
	public WebElement cartClick() {
		return driver.findElement(cart);
	}
	
	public WebElement cartqty() {
		return driver.findElement(cartqty);
	}
	
	public WebElement cartrefreshClick() {
		return driver.findElement(cartrefresh);
	}
	

	public WebElement checkout() {
		return driver.findElement(checkout);
	}
	
	public WebElement  taxClick() {
		return driver.findElement(tax);
	}
	
	public WebElement  countryClick() {
		return driver.findElement(country);
	}

	public WebElement  stateClick() {
		return driver.findElement(state);
	}
	
	public WebElement pincodeEnter() {
		return driver.findElement(pincode);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
