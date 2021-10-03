package herokupp.cu.pages;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage {
	private final WebDriver driver;
	private String original_window_handler;
	private String Current_window_handler;
	Iterator<String> LoopHandlers;
	//private static int //windowposition = 0;

	//private String[] allwindowhandlers = new String[50];
	Set<String> allwindowhandlers = new HashSet<String>();

	//set locators in the page
	private By open_windowbtn = By.linkText("Click Here");
	private By newindowtext = By.cssSelector("div.example>h3");
	private By open_windowtext = By.cssSelector("#content > div > h3");
	//##########################################################################################
	/*constructor to save the WebDriver*/
	public MultipleWindowsPage(WebDriver driver)
	{
		this.driver = driver;
	}
	//##########################################################################################
	public void Click_OpenNewWindow()
	{
		original_window_handler = driver.getWindowHandle();		

		allwindowhandlers.add(original_window_handler);

		driver.findElement(open_windowbtn).click();
		//windowposition++;
	}
	//##########################################################################################
	/*getter for the original handler*/
	private String getOriginal_window_handler() {
		return original_window_handler;
	}
	//##########################################################################################
	/*get position for the original handler*/
	public int getOriginal_window_position() {
		return 0;
	}
	//##########################################################################################
	/*getter for the current handler*/
	private String getCurrent_window_handler() {
		return Current_window_handler;
	}
	//##########################################################################################
	/*get text of the new window*/
	public String getText_newwindow() {
		return driver.findElement(newindowtext).getText();
	}
	//##########################################################################################
	/*get text of the open new window page*/
	public String getText_original_window() {
		return driver.findElement(open_windowtext).getText();
	}	
	//##########################################################################################
	/*get position for the current handler*/
	public int getCurrent_window_position() {
		int position = -1;
		for(String windowhandler : allwindowhandlers)
		{
			position++;
			if(windowhandler.equals(getCurrent_window_handler()))
			{
				break;
			}
		}
		return position;
	}
	//##########################################################################################
	/*open window by its position*/
	public void openwindowindex(int index)
	{
		int pos = -1;
		for(String windowhandler : allwindowhandlers)
		{
			pos++;
			if(index == pos)
			{
				driver.switchTo().window(windowhandler);
				Current_window_handler = driver.getWindowHandle();
				//windowposition++;
				break;
			}
		}
	}
	//##########################################################################################
	public void OpenNewWindow()
	{
		for(String windowshandler : allwindowhandlers)
		{
			if(!windowshandler.equals(getOriginal_window_handler()))
			{
				driver.switchTo().window(windowshandler);
				//windowposition++;
				break;
			}
		}
	}
	//##########################################################################################
	public void SwitchtoNextWindow()
	{
		String LoopHandler;
		LoopHandlers = driver.getWindowHandles().iterator();
		while(LoopHandlers.hasNext())
		{
			LoopHandler = LoopHandlers.next();
			for(String Windowhandler : driver.getWindowHandles())
			{
				if(!Windowhandler.equals(LoopHandler) && !Windowhandler.equals(original_window_handler))
				{
					driver.switchTo().window(Windowhandler);
					Current_window_handler = driver.getWindowHandle();
					allwindowhandlers.add(Current_window_handler);
					break;
				}
				else;
			}

		}

	}
	//##########################################################################################
	public void OpenOriginalWindow()
	{
		driver.switchTo().window(getOriginal_window_handler());
	}
	//##########################################################################################
	public void CloseWindow()
	{
		driver.close();
		OpenOriginalWindow();
		Current_window_handler = original_window_handler;
	}


}
