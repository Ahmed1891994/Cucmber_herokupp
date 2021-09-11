package herokupp.cu.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class HomePage {
	//Webdriver Variable
	private final WebDriver driver;

	//Set Links in the page
	private By Form_Authenticationlink = By.linkText("Form Authentication");
	private By Checkboxeslink = By.linkText("Checkboxes");
	private By Dropdownlink = By.linkText("Dropdown");
	private By Hoverslink = By.linkText("Hovers");
	private By Multiple_Windows = By.linkText("Multiple Windows");
	//Constructor to instantiate the driver
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}

	//Click on Form_Auth link
	public LoginPage EnterLoginPage()
	{
		driver.findElement(Form_Authenticationlink).click();
		return new LoginPage(driver);
	}

	//Click on checkbox link
	public CheckBoxPage EnterCheckboxPage()
	{
		driver.findElement(Checkboxeslink).click();
		return new CheckBoxPage(driver);
	}
	//Click on Hover link
	public HoverPage EnterHovers()
	{
		driver.findElement(Hoverslink).click();
		return new HoverPage(driver);
	}
	//Click on Inputs link
	public DropDownPage EnterDropdown()
	{


		try{
			driver.findElement(Dropdownlink).click();
		}
		catch(org.openqa.selenium.WebDriverException e)
		{
			System.out.println("page down");
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return new DropDownPage(driver);
	}

	//Click on Multiple_Windows
	public MultipleWindowsPage EnterMultiple_Windows()
	{
		driver.findElement(Multiple_Windows).click();
		return new MultipleWindowsPage(driver);
	}
}
