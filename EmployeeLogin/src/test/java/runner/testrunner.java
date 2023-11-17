package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@CucumberOptions(
		features= {"/Users/muhammadtahir/eclipse-workspace/EmployeeLogin/src/test/java/RegisterProcess"},
		glue = {"stepdefinitions"},
		tags = {"@NavigationFlow or @ValidationData"},
		 monochrome = true, // Set monochrome to true for cleaner console output
		plugin = {"pretty", "html:target/cucumber-reports"} // Adding pretty and html plugins
	)

@RunWith(Cucumber.class)
public class testrunner {

}
