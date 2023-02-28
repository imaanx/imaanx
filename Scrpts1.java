package HybridExcelTestNGPOM;

import org.testng.annotations.Test;

import com.testNG.framework.Pom2;

public class Scrpts1 extends LaunchFB
{
	@Test()
	public void testCase1() throws InterruptedException
	{
		Pom2 pom= new Pom2(driver);
		String emailID = DataDrivenFrame.excel("Sheet1", 0, 0);
		String passWord = DataDrivenFrame.excel("Sheet1", 0, 1);
		
		pom.enterEmail(emailID);
		pom.enterPwd(passWord);
		pom.clickLogin();
		
	}
}
