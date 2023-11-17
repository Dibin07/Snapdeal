package test;
import java.util.Set;

import org.testng.annotations.Test;

import base.baseurl;
import page.homepage;
import page.selectspeaker;
import page.signinn;
import page.speaker;
import utilities.Exelutilities;


public class test1 extends baseurl
{
	@Test
	public void tests() throws Exception 
	{
		homepage ob=new homepage(driver);
		selectspeaker a=new selectspeaker(driver) ;
		
		ob.setvalues("speaker");
		a.selectitem();
		
		String parentwindow=driver.getWindowHandle();
		
		   Set<String> allwindows=driver.getWindowHandles();
		    for(String handle:allwindows)
		    

			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				
				speaker b=new speaker(driver);
		
			
		b.cart();
		driver.close();
	}
		    driver.switchTo().window(parentwindow);
		    ob.signin();
		    
		    String xl="C:\\Users\\sinta\\OneDrive\\Documents\\pincode.xlsx";
			String sheet="sheet1";
			int rowCount=Exelutilities.getRowCount(xl, sheet);
			for(int i=1;i<=rowCount;i++)
			{
				String username=Exelutilities.getcellvalue(xl, sheet, i, 0);
		    driver.switchTo().frame("iframeLogin");
		    
		    signinn c=new signinn(driver);
		    
		    c.setvalues(username);
		    Thread.sleep(2000);
		    
		    
		    c.register("9633552171", "dibin", "12/04/2002", "dibin@2002"); 
		    driver.navigate().back();
		    
		    
		    
	
			}	

}

}