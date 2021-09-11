package herokupp.cu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
	private final WebDriver driver;

	//set locators in the page
	private By usernamefield = By.id("username");

	private By passwordfield = By.id("password");

	private By button_login = By.className("radius");

	private By ErroruserLogin = By.id("flash-messages");

	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void SetUsername(String username)
	{
		driver.findElement(usernamefield).clear();
		driver.findElement(usernamefield).sendKeys(username);
	}
	public void SetPassword(String password)
	{
		driver.findElement(passwordfield).clear();
		driver.findElement(passwordfield).sendKeys(password);
	}
	public SecureAreaPage ClickSubmitButton()
	{
		driver.findElement(button_login).click();
		return new SecureAreaPage(driver);
	}
	public String GetFailedLoginText()
	{
		return driver.findElement(ErroruserLogin).getText();
	}
}
