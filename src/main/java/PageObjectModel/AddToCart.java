package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCart {

 public WebDriver driver;
 
 By search =By.xpath("//input[@name='search']");
 
 By searchBtn =By.xpath("//button[@class='btn btn-default btn-lg']");
	
By addtocart =By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[7]");

By addtocartsamsung =By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[8]");


public By price =By.xpath("(//p[@class='price'])[1]");
public By totalitem =By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']");
public By expectedtotalprice =By.xpath("(//td[@class='text-right'])[12]");




public AddToCart(WebDriver driver2) {
	this.driver =driver2;
}


public WebElement searchenter() {
	
	return driver.findElement(search);
}
	
public WebElement searchBtnClick() {
	
	return driver.findElement(searchBtn);
}
	

public WebElement addtocartClick() {
	
	return driver.findElement(addtocart);
}
	
	
public WebElement addtocartClick1()	{
	return driver.findElement(addtocartsamsung);
}
	
public WebElement pricecheck() {
	
	return driver.findElement(price);
}
	
public WebElement totalitemClick() {
	
	return driver.findElement(totalitem);
}
	
	
public WebElement expectedtotalprice() {
	
	return driver.findElement(expectedtotalprice);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
