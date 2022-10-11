Feature: Sales Force Automation scripts in Cucumber
Test cases with Cucumber
 
 	Background:
 	Given when you go to url "https://login.salesforce.com/"
 	
 
    Scenario: Login to SalesForce TC 1
    When I enter correct username as "User@gmail.com" and wrong password as ""
    And click the login button
    Then i should get the Error message
	

    Scenario: Login to SalesForce TC 2
    When I enter correct username as "johnabrahim@tekarch.com" and password as "Sahil@123"
    And click the login button
    Then Home page should appear
    

    Scenario: Remember Me TC 3
    When I enter correct username as "johnabrahim@tekarch.com" and password as "Sahil@123"
    When I click on remember me button 
    Then click the login button
    Then Home page should appear 
    And Click on user dropdown menu
    And click on Logout tag
    Then logout page should display
    
    Scenario: Forgot Password
    When click on forgot password
    When I enter correct username as "johnabrahim@tekarch.com" 
    Then click continue

    Scenario: Forgot Password 4B
    When I enter correct username as "123" and password as "22131"
    And click the login button
    Then Error message should appear
    

    Scenario: TC 05
    When I enter correct username as "johnabrahim@tekarch.com" and password as "Sahil@123" 
    When I click the login button
    Then Home page should appear
    Then Click on userId 