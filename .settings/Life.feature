Feature: Verify the functionality of the Insurance Application

Scenario: Testing the functionality of Life Insurance
Given the user is on the login page
When the user click on insurance button
Then click on the life insurance to navigate to life insurance page

Scenario: Testing the functinality of Life Insurance Quotes
Given the user click Start comparing button
Then user click on Gender option
And user enter the some information <Age> and <Postal code> and select the state
|Age|Postal code|
|25 |54216      |
And user click on smoke option and enter <occupation> types
|Occupation|
|Accountant|
And user choose the level of life cover and the click the checkbox
Then click compare now button and user will navigate to comparison page





     
