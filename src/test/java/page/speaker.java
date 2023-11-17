package page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class speaker 
{
	WebDriver driver;	
		
	@FindBy(xpath = "//*[@id=\"add-cart-button-id\"]/span")	
	WebElement addtocart; 
	
	@FindBy(xpath = "//*[@id=\"cartProductContainer\"]/div/div[2]/div[2]/div/div[2]/div")
	WebElement cartbutton;

	@FindBy(xpath = "//form[@id='checkout-continue']")
	WebElement proceedtopay;
	
	public speaker(WebDriver driver)
	{
		this .driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void cart() throws InterruptedException
	{
		addtocart.click();
		cartbutton.click();
		Thread.sleep(2000);
		proceedtopay.click();
	}
	
	
	
		
		
		
	}
    



