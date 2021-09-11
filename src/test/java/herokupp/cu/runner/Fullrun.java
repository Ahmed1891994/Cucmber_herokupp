package herokupp.cu.runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {/*"src/main/java/herokupp/cu/features/CheckboxPage.feature",*/
				"src/test/java/herokupp/cu/features/MultipleWindowsPage.feature"},
		glue={"herokupp/cu/stepdefinitions"},
		format = {"pretty","html:test-output"}, //to generate different types of reporting
		monochrome = true,  //display data in readable way
		dryRun = false, //check if each testcase glues to steps
		strict = true
		)
public class Fullrun {
	

}
