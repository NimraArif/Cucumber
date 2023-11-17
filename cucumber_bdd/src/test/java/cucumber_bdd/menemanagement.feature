Feature: Cart Management

@CartItem
	Scenario: Add a menu to the cart 
	
	Given User selects the menu item name <Product> and price is <Price>
	When User clicks on the add button 
	Then Item should be added to the cart 

@Bill
	Scenario Outline: Validate the amount of the products
	
	Given User check the price of the <Product> is <Price>
	When User click on the show price button 
	Then User validates the price 
	Examples:
	|Product|Price|
	|Watch|100|
	|Smartphone|200|
	|Tablet|100|
	