package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Helper;
public class ShirtPage {
	WebDriver dr;
	
	//get driver from base test
	public ShirtPage(WebDriver x) {
		 dr=x; 
		 PageFactory.initElements(dr, this); //initalize driver in Find by annotation
	}
	@FindBy(xpath= "")WebElement anyShirt; 
public void clickOnDesiredShirt() {
	Helper.clickOnElement(anyShirt);
}
}
