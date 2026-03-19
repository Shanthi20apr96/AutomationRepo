package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestngBase {
	public WebDriver driver;
	@BeforeMethod
	public void browserLaunch() {
	driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closeAndQuit() {
		//driver.close();
		//driver.quit();
	}

}
