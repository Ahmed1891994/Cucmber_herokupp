package herokupp.cu.stepdefinitions;

import org.testng.AssertJUnit;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import herokupp.cu.pages.LoginPage;
import herokupp.cu.pages.SecureAreaPage;
import herokupp.cu.util.Testbase;

public class LoginTestSteps extends Testbase{
	LoginPage loginpage;
	SecureAreaPage secureareapage;

	@When("user enters loginpage")
	public void user_enters_loginpage()
	{
		loginpage = homepage.EnterLoginPage();
	}
	@When("user enters username \"([^\"]*)\"")
	public void i_enter_username(String username)
	{
		loginpage.SetUsername(username);
	}

	@When("user enters password \"([^\"]*)\"")
	public void i_enter_password(String password)
	{
		loginpage.SetPassword(password);
	}

	@When("user clicks submit button")
	public void user_clicks_submit_button()
	{
		secureareapage = loginpage.ClickSubmitButton();
	}

	@Then("user enters successfully")
	public void I_enter_successfully()
	{
		String loginsuccess = secureareapage.GetSuccessLoginText();
		AssertJUnit.assertTrue(loginsuccess.contains("You logged into a secure area!"));
	}

	@Then("Check wrong username message")
	public void Check_wrong_username_message()
	{
		String loginuserfailed = secureareapage.GetSuccessLoginText();
		AssertJUnit.assertTrue(loginuserfailed.contains("Your username is invalid!"));
	}

	@Then("Check wrong password message")
	public void Check_wrong_password_message()
	{
		String loginpassfailed = secureareapage.GetSuccessLoginText();
		AssertJUnit.assertTrue(loginpassfailed.contains("Your password is invalid!")); 
	}
}
