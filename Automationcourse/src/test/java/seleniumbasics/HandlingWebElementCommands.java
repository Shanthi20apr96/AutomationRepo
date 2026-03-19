package seleniumbasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingWebElementCommands extends Base{
	public void verifyWebElement() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement msgbox = driver.findElement(By.id("single-input-field"));
		msgbox.sendKeys("Test message");
		//WebElement button = driver.findElement(By.xpath("//button[Text() = 'Show Message']"));
		WebElement showmsgbutton = driver.findElement(By.id("button-one"));
		System.out.println(showmsgbutton.isDisplayed());
		System.out.println(showmsgbutton.isEnabled());
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(showmsgbutton));
		//fluent wait
		Wait<WebDriver> fluent = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
		fluent.until(ExpectedConditions.elementToBeClickable(showmsgbutton));
		showmsgbutton.click();
		WebElement yourmsg = driver.findElement(By.id("message-one"));
		System.out.println(yourmsg.getText());
		msgbox.clear();
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingWebElementCommands commands = new HandlingWebElementCommands();
		commands.browserLaunch();
		commands.verifyWebElement();
	}

}
