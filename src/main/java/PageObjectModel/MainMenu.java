package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainMenu {

	public WebDriver driver;
	
	//Desktop xpath
	
	By menu =By.xpath("(//li[@class='dropdown'])[2]");
	By showall =By.xpath("(//a[@class='see-all'])[1]");
	By addtowishlist =By.xpath("(//i[@class='fa fa-heart'])[3]");
	
	//laptop xpath
	
	By laptopmenu =By.xpath("(//li[@class='dropdown'])[3]");
	By showalllaptop =By.xpath("(//a[@class='see-all'])[2]");
	By listview =By.xpath("//i[@class='fa fa-th-list']");
	By sortby =By.xpath("//select[@id='input-sort']");
	By showby =By.xpath("//select[@id='input-limit']");
	By compare =By.xpath("(//BUTTON[@tTYPE='button'])[14]");
	By product =By.xpath("//a[@id='compare-total']");
	
	//component xpath
	By componentmenu =By.xpath("(//li[@class='dropdown'])[4]");
	By componentoption =By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=25_28']");
	By componentgrid =By.xpath("//i[@class='fa fa-th']");
	By mp3playermenu =By.xpath("(//li[@class='dropdown'])[5]");
	By mp3option =By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=34_56']");
	
	
	
	
	public MainMenu(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement menuClick() {
		return driver.findElement(menu);
	}
	
	public WebElement showallClick() {
		return driver.findElement(showall);
	}
	
	public WebElement addtowishlistClick() {
		return driver.findElement(addtowishlist);
	}
	
	public WebElement laptopmenuClick() {
		return driver.findElement(laptopmenu);
	}
	
	public WebElement showalllaptopClick() {
		return driver.findElement(showalllaptop);
	}
	
	public WebElement  listviewClick() {
		return driver.findElement(listview);
	}

	public WebElement sortbyClick() {
		return driver.findElement(sortby);
	}
	
	public WebElement  showbyClicl() {
		return driver.findElement(showby);
	}
	
	public WebElement compare() {
		return driver.findElement(compare);
	}
	
	public WebElement product() {
		return driver.findElement(product);
	}
	
	public WebElement componentmenu() {
		return driver.findElement(componentmenu);
	}
	
	public WebElement componentoption() {
		return driver.findElement(componentoption);
	}
	
	
	public WebElement  componentgrid() {
		return driver.findElement(componentgrid);
	}

	public WebElement mp3playermenuClick() {
		return driver.findElement(mp3playermenu);
	}
	
	public WebElement mp3optionClick() {
		return driver.findElement(mp3option);
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
