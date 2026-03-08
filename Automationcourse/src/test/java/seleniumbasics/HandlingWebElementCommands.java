package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingWebElementCommands extends Base{
	public void verifyWebElement() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement msgbox = driver.findElement(By.id("single-input-field"));
		msgbox.sendKeys("Test message");
		//WebElement button = driver.findElement(By.xpath("//button[Text() = 'Show Message']"));
		WebElement showmsgbutton = driver.findElement(By.id("button-one"));
		System.out.println(showmsgbutton.isDisplayed());
		System.out.println(showmsgbutton.isEnabled());
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
