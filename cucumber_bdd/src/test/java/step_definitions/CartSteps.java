package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CartSteps {

	ResturantMenuItemCart cart ;
	linkedlist list = new linkedlist() ;
	@Given("User selects the menu item name {string} and price is {int}")
	public void user_selects_the_menu_item_name_and_price_is(String string, int string2) {
		 cart =  new ResturantMenuItemCart(string , string2);
		System.out.println("Select");
	}
	
	@When ("User clicks on the add button")
	public void click () {
		boolean check = list.adddItem(cart);
		System.out.print(check);
		System.out.println("Added");
		
	}
	@Then("Item should be added to the cart")
	public void item_should_be_added_to_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("Clicked");
	}
	
	@Given("User check the price of the {string} is {int}")
	public void user_check_the_price_of_the_is(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Amount Check");
	}

	@And("price of the {string} is {int}")
	public void price_of_the_is(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Amount Check");
	}
	
	@When("User click on the show price button")
	public void user_click_on_the_show_price_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Price");
	}
	
	@Then("User validates the price")
	public void user_validates_the_price() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Verified");
	}
	@Given("User selects the menu item name <Product> and price is <Price>")
	public void user_selects_the_menu_item_name_Product_and_price_is_Price() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Verified");
	}

	@Given("User check the price of the Watch is {int}")
	public void user_check_the_price_of_the_Watch_is(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Verified");
	}

	@Given("User check the price of the Smartphone is {int}")
	public void user_check_the_price_of_the_Smartphone_is(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Verified");
	}

	@Given("User check the price of the Tablet is {int}")
	public void user_check_the_price_of_the_Tablet_is(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Verified");
		
	}
	
}
