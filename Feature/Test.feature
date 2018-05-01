@tag
Feature: Checking Radio button and check box in website

Background:
Given user in demoqa website
@tag1
Scenario: Verify the marital status

When user select radio button
Then user verifies the clicked option

@tag2
Scenario: Verify the hobby

When user select multiple check box
Then user verifies the selected check boxes

@tag3
Scenario: Verify the country

When user select the afghanistan
Then user verifies the dropped option