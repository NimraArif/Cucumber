package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"/Users/muhammadtahir/eclipse-workspace/cucumber_bdd/src/test/java/cucumber_bdd"},
		glue = {"stepdefinitions"},
		tags = {"@CartItem" , "@Bill"}
	)
public class testrunner {
}
