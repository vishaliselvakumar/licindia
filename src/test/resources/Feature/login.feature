Feature: Insurance Plans


Background: User launches the insurance application
Given user launches the Application "https://licindia.in/en"


Scenario: Testing the functionality of Endownment plans
When user clicks product option
Then user click insurance plan option
And user click endownment button
Then user select the LIC Single Premium Endowment Plan
And user choose sales brochure


Scenario: User able to get a new Endownment plans
When user choose a product button
Then user select insurance plan 
And user click endownment plan option
Then user select the LIC new Endownment Plan
And user select Policy document


Scenario: Testing the fuctionality of Unit Linked Plan
When user select product option
Then user click Unit Linked plan button
And user click LIC Nivesh plan
Then user select sales brochure from Unit Linked Plan


Scenario: Testing the functionality of term assurance plan
When user click the product button
Then user clicks term insurance plan
And user selcts the term assurance plan
And click LIC Digi term plan 
Then user select the sales brochure










































#Feature: Life insurance
#
#Scenario: Testing the functionlaity of life insurance
#Given user is on the homepage
#When the user click on insurance button
#And click on the life insurance button 
#Then User will be navigated to life insurance home page

#@valid
#Scenario: Testing the functinality of Life Insurance Quotes
#Given user click Start comparing button
#When user click on Gender option
#And user enters the information about Age and Postal code
#|Age| 25 |
#|Postal code |54216     |
#Then User selects the state
#And user has to click yes or no for smoke option 
#And User selects the occupation type
#|Occupation|
#|Accountant|
#And user chooses the level of life cover and then clicks on the checkbox
#Then User click on compare now button and then user will be navigated to the comparison page

#@Invalid
#Scenario: Testing the functinality of Life Insurance Quotes with Invalid Details
#Given User is on Life insurace quotes page
#When user enter Gender option
#And user enters details of Age and Postalcode
#|Age|15|
#|Postal code|45367|
#Then user selects the state from dropdown
#And user has to click yes or no for smoke options
#And user selects the occupation type
#|Occupation|
#|Daily wages|
#And user click compare now button
#Then user get a message like you have entered a incorrect details
#
#@HealthInsurance
#Scenario: Testing the functinality of health Insurance 
#Given user is on home page
#When user click on insurance button
#And user click on health insurance button
#And user selects on single coverage option
#Then user should navigate to health insurance page
#
#@HealthInsuranceQuotes
#Scenario: Testing the functinality of health insurance quotes
#Given user selects single coverage option from the dropdown
#When user enter the postal code
#|postal code|56737|
#And user click start comparing quotes button
#Then user select the option for heath cover status
#And user enter date of birth
#|14-02-2000|
#And user selects annual income option 
#And user click checkbox and continue button
#Then user navigate to comparison page of health insurace
#

















#Feature: Testing the functionality of Telecommunication Application
#
#Scenario: Testing the functionality of mobile module
#Given user is on the home page of the application
#When user click on the dropdown of Mobile 
#And User click on latest mobile option to navigate to mobile phone page
#When user selects any of the mobile 
#And choose the color and storage size of the selected mobile
#And user select the network plan of the mobile and click continue
#Then user click the radio button to choose the new user option and click continue
#
#
#Scenario: Testing the functionality of Selected product option
#Given the user is on the product option page
#When user select the sim type of the product
#And user click the product upgrade and Protected subscription plan and click continue
#Then user navigate to the cart page of the application
























