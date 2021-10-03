package herokupp.cu.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import herokupp.cu.util.Testbase;

public class Hooks extends Testbase{
	@Before
	public void user_enters_homepage()
	{
		SetUp();
	}
	
	@After
	public void Driver_Quit()
	{
		Quit();
	}
}
