package herokupp.cu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxPage {
	private final WebDriver driver;

	//set locators in the page
	private By Checkbox_one = By.cssSelector("#checkboxes>:nth-child(1)");
	private By Checkbox_two = By.cssSelector("#checkboxes>:nth-child(3)");

	public CheckBoxPage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean IsCheckbox_one_Displayed()
	{
		return driver.findElement(Checkbox_one).isDisplayed();
	}
	public boolean IsCheckbox_two_Displayed()
	{
		return driver.findElement(Checkbox_two).isDisplayed();
	}
	public void SetCheckbox_one()
	{
		if(!IsselectedCheckbox_one())
			driver.findElement(Checkbox_one).click();
		else;
	}
	public void ClearCheckbox_one()
	{
		if(IsselectedCheckbox_one())
			driver.findElement(Checkbox_one).click();
		else;
	}
	public void SetCheckbox_two()
	{
		if(!IsselectedCheckbox_two())
			driver.findElement(Checkbox_two).click();
		else;
	}
	public void ClearCheckbox_two()
	{
		if(IsselectedCheckbox_two())
			driver.findElement(Checkbox_two).click();
		else;
	}

	public boolean IsselectedCheckbox_one()
	{
		boolean flag = true;
		if(driver.findElement(Checkbox_one).getAttribute("Checked")!=null)
			flag = true;
		else
			flag = false;
		return flag;
	}

	public boolean IsselectedCheckbox_two()
	{
		boolean flag = true;
		if(driver.findElement(Checkbox_two).getAttribute("Checked")!=null)
			flag = true;
		else
			flag = false;
		return flag;
	}
}
