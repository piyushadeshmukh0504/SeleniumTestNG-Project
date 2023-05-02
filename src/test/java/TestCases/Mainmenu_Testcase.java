package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.MainMenu;
import Resources.Baseclass;
import Resources.CommonUtilities;

public class Mainmenu_Testcase  extends Baseclass{

	@Test
	
	public static void Verify() throws InterruptedException {
		
	MainMenu mp =new MainMenu(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	CommonUtilities.mouseOverHandle(mp.menuClick(), driver);
	mp.showallClick().click();
	mp.addtowishlistClick().click();
	
	CommonUtilities.mouseOverHandle(mp.laptopmenuClick(), driver);
	mp.showalllaptopClick().click();
	mp.listviewClick().click();
	CommonUtilities.handleDropDown(mp.sortbyClick(), 3);
	CommonUtilities.handleDropDown(mp.showbyClicl(), 1);
	mp.compare().click();
	mp.product().click();
	
	CommonUtilities.mouseOverHandle(mp.componentmenu(), driver);
	mp.componentoption().click();
	mp.componentgrid().click();
		
		
	CommonUtilities.mouseOverHandle(mp.mp3playermenuClick(), driver);
	mp.mp3optionClick().click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
