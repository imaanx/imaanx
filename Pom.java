package HybridExcelTestNGPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailtxt;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement pwdtxt;
	
	@FindBy(xpath="//button]")
	private WebElement loginbutton;
	
	public Pom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmailID(String str1)
	{
		emailtxt.sendKeys(str1);
	}
	public void enterPassword(String str2)
	{
		pwdtxt.sendKeys(str2);
	}
	public void clickLogin()
	{
		loginbutton.click();
	
	}
}
