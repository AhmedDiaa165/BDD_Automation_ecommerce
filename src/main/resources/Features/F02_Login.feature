@regression
Feature: users login with their account
  Scenario: user login with valid email and password
    Given user go to login page
    When user enters valid email "test@example.com" and password "P@ssw0rd"
    And user clicks on login button
    Then user should be login successfully

    Scenario: user login with invalid email and password
      Given user go to login page
      When user enters invalid email "invalid@example.com" and password "P@ssw0rd"
      And user clicks on login button
      Then user could not login