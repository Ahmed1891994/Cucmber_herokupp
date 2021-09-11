package herokupp.cu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {
	private WebDriver driver;

	public HoverPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void HoverImgIndex(int index)
    {
        WebElement image;
        image = driver.findElement(By.xpath("//*[@id='content']/div/div["+index+"]"));
        HoveronElement(image);
    }
    private void HoveronElement(WebElement image)
    {
        Actions action = new Actions(driver);
        action.moveToElement(image).perform();
    }
    public ProfilePage ViewProfile(int index)
    {
        WebElement image;
        Actions action = new Actions(driver);
        image = driver.findElement(By.xpath("//*[@id='content']/div/div["+index+"]/div/a"));
        action.click(image).perform();
        return new ProfilePage(driver);
    }
}
