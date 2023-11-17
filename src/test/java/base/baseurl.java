package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


public class baseurl {
public static WebDriver driver;
	@BeforeTest
	public void setup() 
	{
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.snapdeal.com/");
		//Thread.sleep(2000);
		
		//driver.navigate().refresh();
	}
	

}
