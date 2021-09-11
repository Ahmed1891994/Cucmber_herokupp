package herokupp.cu.stepdefinitions;

import org.testng.AssertJUnit;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import herokupp.cu.pages.CheckBoxPage;
import herokupp.cu.util.Testbase;


public class CheckBoxTestSteps extends Testbase {
	CheckBoxPage checkboxpage;

	@When("user enters CheckBoxPage")
	public void user_enters_CheckBoxPage()
	{
		checkboxpage = homepage.EnterCheckboxPage();
	}
	@Then("Check Checkbox_one disblayed")
	public void Check_Checkbox_one_disblayed()
	{
		AssertJUnit.assertTrue(checkboxpage.IsCheckbox_one_Displayed());
	}
	@Then("Check Checkbox_two disblayed")
	public void Check_Checkbox_two_disblayed()
	{
		AssertJUnit.assertTrue(checkboxpage.IsCheckbox_two_Displayed());
	}


	@When("user sets Checkbox_one")
	public void user_sets_Checkbox_one()
	{
		AssertJUnit.assertFalse(checkboxpage.IsselectedCheckbox_one());
		checkboxpage.SetCheckbox_one();
	}

	@When("user sets Checkbox_two")
	public void user_sets_Checkbox_two()
	{
		AssertJUnit.assertFalse(checkboxpage.IsselectedCheckbox_two());
		checkboxpage.SetCheckbox_two();
	}
	@When("user clears Checkbox_one")
	public void user_clears_Checkbox_one()
	{
		AssertJUnit.assertTrue(checkboxpage.IsselectedCheckbox_one());
		checkboxpage.ClearCheckbox_one();
	}
	@When("user clears Checkbox_two")
	public void user_clears_Checkbox_two()
	{
		AssertJUnit.assertTrue(checkboxpage.IsselectedCheckbox_two());
		checkboxpage.ClearCheckbox_two();
	}
	
	@Then("Check Checkbox_one is set")
	public void Check_Checkbox_one_is_set()
	{
		AssertJUnit.assertTrue(checkboxpage.IsselectedCheckbox_one());
	}

	@Then("Check Checkbox_two is set")
	public void Check_Checkbox_two_is_set()
	{
		AssertJUnit.assertTrue(checkboxpage.IsselectedCheckbox_two());
	}
	@Then("Check Checkbox_one is Cleared")
	public void Check_Checkbox_one_is_Cleared()
	{
		AssertJUnit.assertFalse(checkboxpage.IsselectedCheckbox_one());
	}
	@Then("Check Checkbox_two is Cleared")
	public void Check_Checkbox_two_is_Cleared()
	{
		AssertJUnit.assertFalse(checkboxpage.IsselectedCheckbox_two());
	}
}
