package herokupp.cu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {
	private final WebDriver driver;

	private final By ProfileText = By.xpath("/html/body/h1");

	public ProfilePage(WebDriver driver)
	{
		this.driver = driver;
	}

	public String GetProfileText()
	{
		return driver.findElement(ProfileText).getText();
	}
}
