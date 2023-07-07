package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class base 
{
	WebDriver driver;
	public void launchbrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Reporter.log("launching browser....",true);
	}
	public void closingbrowser()
	{
		
		Reporter.log("Closing browser....",true);
	
		driver.quit();
	}
}
