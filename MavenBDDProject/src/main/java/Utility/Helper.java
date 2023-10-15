package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

// because hover over needs to be used mutlipte time and Hover over is utility 
public class Helper {
	
	
	public class hoverHover {

	}

	public static void hoverHover(WebDriver dr, WebElement element) { Actions a= new Actions(dr); //wants driver. And if we want to import driver from base test we  
		a.moveToElement(element).build().perform();
	}
public static void clickOnElement(WebElement element) {
	element.click();
}
}
//parameter since we do not know WHAT SPECIFIC element but we know that we need to use element