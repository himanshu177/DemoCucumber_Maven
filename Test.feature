Feature: Login Action

@Login_functionality
Scenario: Sucessfull Login with Valid Credentials
Given User is on Home Page
When User navigate to Login Page
And User enters Username and Password and login button
Then Message Displayed Login Sucessfull

