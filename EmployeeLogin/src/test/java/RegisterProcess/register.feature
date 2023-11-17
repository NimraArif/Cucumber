#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Registeration

@NavigationFlow
  Scenario: RegButton Validation
    Given User is on the Employee Page
    When User clicks on the Register button 
    Then User will be redirected to the Register page

  @ValidationData
  Scenario Outline: Registration Process
    Given User enters the name <name> in username field and the designation <des> and Location <loc>
    When User clicks on the Submit button 
    Then User will be landed on the Dashboard
    
   Examples: 
   |name|des|loc|
   |nimra|QA|Canada|
   |Abdullah|ACCA|Toronto
