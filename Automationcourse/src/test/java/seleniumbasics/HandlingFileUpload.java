package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base{
	public void verifyFileUploadUsingSendKeys() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement fileupload = driver.findElement(By.id("uploadfile_0"));
		fileupload.sendKeys("C:\\Users\\USER\\git\\AutomationRepo\\Automationcourse\\src\\test\\resources\\UAE_Selfdrive_Car_Rental_App_Workflow.pdf");
		WebElement terms = driver.findElement(By.id("terms"));
		terms.click();
		WebElement submit = driver.findElement(By.id("submitbutton"));
		submit.click();
	}
	public void verifyFileUploadUsingRobot() throws AWTException {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement filepdf = driver.findElement(By.id("pickfiles"));
		filepdf.click();
		StringSelection string = new StringSelection("C:\\Users\\USER\\git\\AutomationRepo\\Automationcourse\\src\\test\\resources\\UAE_Selfdrive_Car_Rental_App_Workflow.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(string, null);
		Robot r = new Robot();
		r.delay(2500);
		r.keyPress(KeyEvent.VK_ENTER); 
 		r.keyRelease(KeyEvent.VK_ENTER); 
 		r.keyPress(KeyEvent.VK_CONTROL); 
 		r.keyPress(KeyEvent.VK_V); 
 		r.keyRelease(KeyEvent.VK_CONTROL); 
 		r.keyRelease(KeyEvent.VK_V); 
 		r.keyPress(KeyEvent.VK_ENTER); 
 		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFileUpload fileupload = new HandlingFileUpload();
		fileupload.browserLaunch();
		//fileupload.verifyFileUploadUsingSendKeys();
		try {
			fileupload.verifyFileUploadUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
