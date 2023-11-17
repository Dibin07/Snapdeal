package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.Enter;

public class homepage 
{
	WebDriver driver;
	@FindBy(xpath = "//input[@placeholder='Search products & brands']")
	WebElement search;
	
	@FindBy(xpath = "//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[2]/button")
	WebElement searchbutton;
	
	@FindBy(xpath = "//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/span[2]/i")
	WebElement sign;
	
	
	public homepage(WebDriver driver)
	{
		this .driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void setvalues(String searchdata)
	{
		search.sendKeys(searchdata);
		searchbutton.click();
		
	}
	public void signin()
	{
		Actions act=new Actions(driver);
		
		act.moveToElement(sign).perform();
		driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[1]")).click();
	}
	

}
