@regression
Feature: user adding product on wishlist
  Scenario: user adding product on wishlist
    Given user navigates to home page
    When user clicks on wishlist button
    Then verify that success message is displayed with green background color

    Scenario: user go to wishlist
      Given user navigates to home page
      When user clicks on wishlist button
      And Wait until success message disappears
      And user clicks on wishlist tap
      Then verify that Qty value is greater than zero
