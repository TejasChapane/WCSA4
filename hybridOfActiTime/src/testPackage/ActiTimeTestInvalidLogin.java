package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomListener;
import genericPackage.Flib;
import pagePackage.LoginPage;
@Listeners(CustomListener.class)
public class ActiTimeTestInvalidLogin extends BaseTest 
{

	@Test
	public void inValidTest() throws IOException, InterruptedException
	{
		Flib flib = new Flib();
	    int rc = flib.lastRowNum(EXCEL_PATH,"invalidcreds" );
         LoginPage lp = new LoginPage(driver);	
	    for(int i=1;i<rc;i++)
	    {
	    	lp.actiTimeInvalidLogin(flib.readExcelData(EXCEL_PATH,"invalidcreds", i, 0), flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1));
	    }
	}
}
