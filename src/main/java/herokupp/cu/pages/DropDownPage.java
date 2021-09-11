package herokupp.cu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {
	private final WebDriver driver;

	//set locators in the page
	private final By dropdownlist = By.id("dropdown");
	private Select itemDropdown;

	public DropDownPage(WebDriver driver) {
		this.driver = driver;
		itemDropdown = new Select(driver.findElement(dropdownlist));
	}

	public void ChooseItem(int item)
	{
		try {
			itemDropdown.selectByIndex(item);
		}
		catch(Exception e)
		{
			//TODO
			//Log with exception
		}

	}
	public void ChooseItem(String item)
	{
		itemDropdown.selectByVisibleText(item);
	}

	public String GetSelectedItem()
	{
		//to solve problem of refreshing
		itemDropdown = new Select(driver.findElement(dropdownlist));
		return itemDropdown.getFirstSelectedOption().getText();
	}

	public String GetComparableText(int index)
	{
		String[] items ={"Please select an option","Option 1","Option 2","Please select an option"};
		String result = null;
		try {
			result = items[index];
		}
		catch(java.lang.IndexOutOfBoundsException e)
		{
			//TODO
			//Log with exception
		}
		return result;
	}
}
