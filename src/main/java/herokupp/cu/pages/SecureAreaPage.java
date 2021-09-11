package herokupp.cu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
	private final WebDriver driver;

    //Set locators in page
    private By loginsuccesstext = By.id("flash");

    public SecureAreaPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public String GetSuccessLoginText()
    {
        return driver.findElement(loginsuccesstext).getText();
    }
}
