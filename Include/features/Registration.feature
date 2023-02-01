Feature: Register Feature

  Scenario: As A User, I want to Register and have Cermati account
    Given I already open my browser
    And 	navigate to cermati registration page
    When 	I input my email
    And 	I input my phone number
    And 	I input my password
    And 	I confirm my password
    And 	I input my first name
    And 	I input my last name
    And 	I choose my city province
    And 	I check terms & conditions policy agreement
    And 	I click register button
    Then 	I should directed to OTP option page
    And 	I see two options to sent OTP, SMS or WhatsApp