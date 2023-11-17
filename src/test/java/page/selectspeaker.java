package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectspeaker {
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"644964289458\"]/div[3]")
	WebElement select;
	
	@FindBy(xpath = "//*[@id=\"add-cart-button-id\"]/span")
	WebElement addcart;
 
	public selectspeaker(WebDriver driver)
	{
		this .driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void selectitem()
	{
		select.click();
	}
	public void addtocart()
	{
		addcart.click();
	}

}
