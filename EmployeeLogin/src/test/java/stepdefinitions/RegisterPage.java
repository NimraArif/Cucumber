package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterPage {
	
	EmployeeList list;
	
	@Given("User is on the Employee Page")
	public void user_is_on_the_Employee_Page() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.print("Employee Page");
	}

	@When("User clicks on the Register button")
	public void user_clicks_on_the_Register_button() {
	    // Write code here that turns the phrase above into concrete actions
		   System.out.print("User is redirecting to the Register Page");
	}

	@Then("User will be redirected to the Register page")
	public void user_will_be_redirected_to_the_Register_page() {
	    // Write code here that turns the phrase above into concrete actions
		   System.out.print("User is on Register Page");
	}

	@Given("User enters the name {string} in username field and the designation {string} and Location {string}")
	public void user_enters_the_name_in_username_field_and_the_designation_and_Location(String name, String designation, String loc) {
	    // Write code here that turns the phrase above into concrete actions
	list = new EmployeeList();
	list.addEmployee(name, designation, loc);
		
	}


	@When("User clicks on the Submit button")
	public void user_clicks_on_the_Submit_button() {
	    // Write code here that turns the phrase above into concrete actions
		   System.out.print("Employee Page");
	}

	@Then("User will be landed on the Dashboard")
	public void user_will_be_landed_on_the_Dashboard() {
	    // Write code here that turns the phrase above into concrete actions
		   System.out.print("Employee Page");
	}


}
