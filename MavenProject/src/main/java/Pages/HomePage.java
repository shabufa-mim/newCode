package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumHelper.Shared;

public class HomePage {

	WebDriver dr;
	@FindBy(xpath = "xpath of main menu") WebElement menMenuBar;
	@FindBy(xpath = "xpath of shirt sub menu") WebElement allshirtsubMenu;
	public HomePage(WebDriver X) {
	dr = X ;
	PageFactory.initElements(dr, this); //this means the class name
		
	}
	public void hoveroverinmainmenu() {
		
		Shared.hoverover(menMenuBar);
	}
	
	public ShirtPage clickAllShirtSubMenu() {
		
		Shared.clickonelement(allshirtsubMenu);
		return new ShirtPage(dr);
	}
	
}










