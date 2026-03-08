package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownCheckboxRadiobutton extends Base {
	public void dropDown() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown = driver.findElement(By.id("dropdowm-menu-1"));
		Select select = new Select(dropdown);
		//select.selectByIndex(2);
		//select.selectByValue("c#");
		select.selectByVisibleText("SQL");
	}
	public void verifyCheckBox() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox = driver.findElement(By.xpath("//input[@value='option-2']"));
		System.out.println(checkbox.isSelected());
		checkbox.click();
		
	}
	public void verifyRadioButton() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radiobtn = driver.findElement(By.xpath("//input[@value='green']"));
		radiobtn.click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingDropdownCheckboxRadiobutton drop = new HandlingDropdownCheckboxRadiobutton();
		drop.browserLaunch();
		//drop.dropDown();
		//drop.verifyCheckBox();
		drop.verifyRadioButton();
	}

}
