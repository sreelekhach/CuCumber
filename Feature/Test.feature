@tag
Feature: Checking Radio button and check box in website

Background:
Given user in demoqa website
@tag1
Scenario: Verifying the marital status

When user selecting the option as single 
Then user has to verifing the option as single

@tag2
Scenario: Verifying the hobby 

When user selecting the option as Dance
Then user has to verifying the option as Dance
@tag3
Scenario: Verifying the country

When user is on default country as Afghanistan
Then user has to verifying the country as Afghanistan