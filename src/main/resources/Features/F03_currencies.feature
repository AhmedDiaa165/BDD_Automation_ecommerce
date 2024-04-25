@regression
Feature: user switch currency from dropdown list
  Scenario: verify when user select euro symbol is shown on the products in home page
  Given user navigates to home page
    When user select euro symbol from currency dropdown list
    Then euro symbol should be shown on the products in home page
