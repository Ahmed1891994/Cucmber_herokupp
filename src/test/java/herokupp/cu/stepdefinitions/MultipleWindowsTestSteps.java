package herokupp.cu.stepdefinitions;

import org.testng.AssertJUnit;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import herokupp.cu.pages.MultipleWindowsPage;
import herokupp.cu.util.Testbase;


public class MultipleWindowsTestSteps extends Testbase{
	MultipleWindowsPage multiplewindowspage;
	
	
	
	@When("user enters multiplewindowspage")
	public void user_enters_multiplewindowspage()
	{
		multiplewindowspage = homepage.EnterMultiple_Windows();
	}
	
	@When("user Clicks on clickme")
	public void user_Clicks_on_clickme()
	{
		multiplewindowspage.Click_OpenNewWindow();
	}
	@When("user Switches to new window")
	public void user_Switches_to_new_window()
	{
		multiplewindowspage.SwitchtoNextWindow();
	}
	@When("user closes new window")
	public void user_closes_new_window()
	{
		multiplewindowspage.CloseWindow();
	}
	@Then("Check new open window")
	public void Check_new_open_window()
	{
		AssertJUnit.assertEquals("New Window", multiplewindowspage.getText_newwindow());
	}
	@Then("Check original window")
	public void Check_original_window()
	{
		AssertJUnit.assertEquals("Opening a new window" ,  multiplewindowspage.getText_original_window());
	}
}
