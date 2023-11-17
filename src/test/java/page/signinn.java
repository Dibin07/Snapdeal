package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class signinn
{
	
	WebDriver driver;
	
	
	@FindBy(xpath = "//*[@id=\"userName\"]")
	WebElement un;
	
	@FindBy(xpath = "//*[@id=\"checkUser\"]")
	WebElement continu;
	
	@FindBy(xpath = "//*[@id=\"j_number\"]")
	WebElement no;
	
	@FindBy(xpath = "//*[@id=\"j_name\"]")
	WebElement name;
	
	@FindBy(xpath = "//*[@id=\"j_dob\"]")
	WebElement dob;
	
	@FindBy(xpath = "//*[@id=\"j_password\"]")
	WebElement pw;
	
	@FindBy(xpath = "//*[@id=\"userSignup\"]")
	WebElement cbutton;
	public signinn(WebDriver driver)
	{
		this .driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setvalues(String username)
	{
		un.sendKeys(username);
		continu.click();
		
	}
	public void register(String number,String namee,String db,String pwd)
	{
		no.sendKeys(number);
		name.sendKeys(namee);
		dob.sendKeys(db);
		pw.sendKeys(pwd);
		cbutton.click();
	}
	
	

}
