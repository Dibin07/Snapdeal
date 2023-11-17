package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hpage {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/span[2]/i")
	WebElement sign;
	
	@FindBy(xpath = "//input[@id='userName']")
	WebElement un;
	
	@FindBy(xpath = "//*[@id=\"checkUser\"]")
	WebElement continu;
	public Hpage(WebDriver driver)
	{
		this .driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void signin()
	{
		Actions act=new Actions(driver);
		
		act.moveToElement(sign).perform();
		driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[1]")).click();
	}
	public void setvalues(String username)
	{
		un.sendKeys(username);
		continu.click();

}}
