@regression
Feature: check home slider
  Scenario: check first slider on homepage
    Given user navigates to home page
    When user click on first slider
    Then user should be redirected to this url "https://demo.nopcommerce.com/nokia-lumia-1020"

  Scenario: check second slider on homepage
    Given user navigates to home page
    When user click on second slider
    Then user should be redirected to this URL "https://demo.nopcommerce.com/iphone-6"