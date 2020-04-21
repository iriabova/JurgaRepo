#this is name of feature
Feature: Login
#this is name of scenario

@TestEnvironment
Scenario: Login test to TekSchool Test Environment page

Given User is on Tekschool page
When User click on Test Environment link
Then User should see test environment page