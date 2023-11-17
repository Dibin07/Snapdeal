package test;

import org.testng.annotations.Test;

import base.baseurl;
import page.Hpage;


import utilities.Exelutilities;

public class test2 extends baseurl 
{
	@Test
	public void multiplentry() throws Exception
	{
		
		Hpage ob=new Hpage(driver);
		ob.signin();
		Thread.sleep(3000);
		
		String xl="C:\\Users\\sinta\\OneDrive\\Documents\\pincode.xlsx";
		String sheet="sheet1";
		int rowCount=Exelutilities.getRowCount(xl, sheet);
		for(int i=1;i<=rowCount;i++)
		{
			String username=Exelutilities.getcellvalue(xl, sheet, i, 0);
			driver.switchTo().frame("iframeLogin");
			ob.setvalues(username);

			
			
			//driver.navigate().refresh();
		}
		
	}

}
