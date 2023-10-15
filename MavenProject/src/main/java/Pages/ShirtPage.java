package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumHelper.Shared;

public class ShirtPage {
     WebDriver dr;
	@FindBy(xpath = "xpath of first shirt") WebElement firstShirt;
	
	public ShirtPage(WebDriver x) {
		dr = x;
		PageFactory.initElements(dr, this);
	}
	public ProductDetailPage clickOnFirstShirt() {
		Shared.clickonelement(null);
		return new ProductDetailPage();
	}
}
