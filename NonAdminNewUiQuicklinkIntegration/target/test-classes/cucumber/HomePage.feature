#Author: sayali.sadaye@neoquant.com
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
@tag
Feature: Functionality of Home Page 
  I want to use this template for my feature file

   

	@UITest1
  Scenario Outline: Positive test of application version
    # Given Logged in with username <uname> and password <password>
#    When User clicks on valid customer quicklink
    Then Verify the application text
 
    Examples:
      | uname  | password |
      | 10059 | NQ123 |     
 
#TC_1
@UITestDemo
Scenario: Verify Search text Box with no input values
Then click on search buttun

#TC_2
@UITest120
Scenario: Varify the Searchtype list
Then click on serachtype dropdown and varify all searchtypes are visible

#TC_3
@UITest1
Scenario: Varify user is able to see customer details.
Then select the  SearchType and enter the custID/Mobileno/email/ApplicationID in searchbox and click on search

#TC_4
@UITest1
Scenario: Verify paste on search tab.
Then Enter the custID in serchbox and paste in same searchbox
    
#TC_5
@UITest1
Scenario: Verify if user is able to enter Customer ID.
Then select the searchtype as custID and enterCustID in textbox and check the info

#TC_6
@UITest1
Scenario: Verify if user is able to enter Mobile Number
Then  select the searchtype as Mobile Number and enter  Mob No  in textbox and check the info

#TC_7
@UITest1
Scenario: Verify if user is able to enter Email ID
Then  select the searchtype as Email ID and enter Email ID in textbox and check the info

#TC_8
@UITest1
Scenario: Verify if user is able to enter applicationNo.
Then select the searchtype as applicationNo and enter applicationNo in textbox and check info

#TC_9
@UITest1
Scenario: Verify Error message is getting displayed if user enters input of length less than 5.
Then select the searchtype as custID and enter the value "100" and check ythe error msg

#TC_10
@UITest1
Scenario: Verify Error message is getting displayed if user is entering input of length more than 35.
Then select the searchtype as custumerID and enter the value "100000000000000000000000000000000000001" and check tthe error msg


# Implemented by suhas

#TC_12
@UITest2
Scenario: Verify that user details with name, employee ID, Role and Logout button are getting displayed on click of the profile icon
Then Checks  name ,employee ID,Role and logout elements are displayed

@UITest2
Scenario: Verify mobile number is masked except last 4 digits.
Then search infon with searchtype and check mobile number is masked except last 4 digits.

@UITest2
Scenario: Verify email is masked except first 3 and last 6 characters.
Then search info with searchtype and check email is masked except last 10 charactor

@UITest2
Scenario: Verify that beside customer information, user should be able to see the no. of activiites found
Then search info with searchtype and check user should be able to see the no. of activiites found

@UITest2
Scenario: Verify that seven days window date format should be DD-MON
Then search info with searchtype and check user should be able to see the seven days window date

@UITest2
Scenario: Varify  that user is able to click on Filters  arrow button
Then search info with searchtype and check user should be able to  click on Filters  arrow button

@UITest2
Scenario: Varify in filterFrame Filter Text is displayed
Then search info with searchtype and check user should be able to see the Filters Headline in FiltersFrame

@UITest2
Scenario: Verify ProcessType_ProductType headline is displayed in FiltersFrame
Then search info with searchtype and check user should be able to see the ProductType and ProcessType titles is diplayed

#@UITest2
Scenario: Verify Clear Filters and Apply Filters tabs are display.
Then Search info with Searchtype and check user should be able to see Clear Filters and Apply Filters tabs in Filters frame.

#@UITest2
Scenario: Verify  the correct options are getting displayed in the Process Type Filters
Then search info with searchtype and check user should be able to see the correct options are getting displayed in the Process Type Filters

@UITest2
Scenario: Verify if the correct options are getting displayed in the Product Type Filters
Then  search info with searchtype and check user should be able to see the correct options are getting displayed in the product Type Filters

@UITest2
Scenario: Verify Filter section is scrollable.
Then search info with searchtype and check Filter section is scrollable;

@UITestDatePicker
Scenario: Verify date picker
Then date picker functionality;

@UITestDatePicker1
Scenario: Verify date picker
Then date picker date selection;


 



  