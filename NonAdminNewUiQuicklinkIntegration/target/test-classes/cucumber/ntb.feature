#Author: harshala.koktare@neoquant.com
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
Feature: Functionality of ntb approch
  I want to use this template for my feature file

   # TC-01 ,TC-12
 @UINTB
  Scenario Outline: Positive test of entering Customer Mobile Number
    Given Logged in with username <uname> and password <password>
    When User clicks on valid customer quicklink
	And User searches with customer Mobile Number <mobileNumber>
#    And User clicks on search button
    Then Verify that user is able to enter customer Mobile Number

    Examples: 
      | uname  | password | mobileNumber |
      | 10059 | NQ123 | 7509652602 |
      
   # TC-02, TC_10
    @UINTB
  Scenario Outline: Positive test of entering Customer Email ID
    Given Logged in with username <uname> and password <password>
    When User clicks on valid customer quicklink
	And User searches with customer Email ID<emailID>
    And User clicks on search button
    Then Verify that user is able to enter customer Email ID

    Examples: 
      | uname  | password | emailID |
      | 10059 | NQ123 | ashueverest@gmail.com  |
      
      # TC-03
    @UINTB
  Scenario Outline: Positive test of entering Customer Application No
    Given Logged in with username <uname> and password <password>
    When User clicks on valid customer quicklink
	And User searches with customer Application No <applicationNo>
    And User clicks on search button
    Then Verify that user is able to enter customer Application No

    Examples: 
      | uname  | password | applicationNo |
      | 10059 | NQ123 | C1-00000031330674-C1  |
      
#      TC_05
@UINTB
  Scenario Outline: Positive test of entering Customer DummyCustid
    Given Logged in with username <uname> and password <password>
    When User clicks on valid customer quicklink
	And User searches with customer Dummy Cust id  <dummyCustId>
    And User clicks on search button
    Then Verify that user is able to enter customer Dummy cust id

    Examples: 
      | uname  | password | dummyCustId |
      | 10059 | NQ123 | N031330675  |
    
    
#    tc_06
    @UINTB
  Scenario Outline: Positive test of not an axisbank customer in profile
    Given Logged in with username <uname> and password <password>
    When User clicks on valid customer quicklink
	And User searches with test data <applicationNo>
   
    Then Verify that user is able to see not an axisbank customer in profile

    Examples: 
      | uname  | password | dummyCustId |
      | 10059 | NQ123 | N031330675  |
    
#    TC_13
    @UINTB
  Scenario Outline: Negative test of entering Customer Application No
    Given Logged in with username <uname> and password <password>
    When User clicks on valid customer quicklink
	And User searches with invalid  customer Application No <applicationNo>
    Then Verify that user should not be able to seach with invalid application no

    Examples: 
      | uname  | password | applicationNo |
      | 10059 | NQ123 | C1-00000031330674-C1  |
    
    #    TC_09
     @UINTB
  Scenario Outline: Negative test of entering invalid email
    Given Logged in with username <uname> and password <password>
    When User clicks on valid customer quicklink
	And User searches with invalid email <applicationNo>
    Then Verify that user should not be able to seach with invalid email

    Examples: 
      | uname  | password | email |
      | 10059 | NQ123 | sss@gmail.com  |
    
     #    TC_11
     @UINTB
  Scenario Outline: Negative test of entering invalid mobile no
    Given Logged in with username <uname> and password <password>
    When User clicks on valid customer quicklink
	And User searches with invalid mobile no <applicationNo>
    Then Verify that user should not be able to seach with invalid mobile no

    Examples: 
      | uname  | password | mobileno |
      | 10059 | NQ123 | 888888888  |

	@UI1
  Scenario Outline: Positive test of application version
    # Given Logged in with username <uname> and password <password>
#    When User clicks on valid customer quicklink
    Then Verify the application text
 
    Examples:
      | uname  | password |
      | 10059 | NQ123 |     
 

    
  