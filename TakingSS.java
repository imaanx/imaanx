package HybridExcelTestNGPOM;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingSS {
	public static void main(String[] args) throws IOException, InterruptedException {
		
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.in");
	Thread.sleep(2000);
	
	
	
	//step01 typecast exlicitely
	TakesScreenshot tst = (TakesScreenshot)driver;
	
	//step02  get screenshot
	File temp = tst.getScreenshotAs(OutputType.FILE);
	
	
	//step03 specify the path
	File perm = new File("./photos/amzon.png");

	//step04 copy from temp to perm
	FileHandler.copy(temp,perm);
	
	Thread.sleep(3000);
	driver.close();
}
}
