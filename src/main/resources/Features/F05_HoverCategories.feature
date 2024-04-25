@regression
Feature:hover over a main categories and click on sub categories
  Scenario: user hover over a main categories and click on sub categories
    Given user navigates to home page
    When user hover over a electronics categories
    And user clicks on cell phones
    Then verify that page title matches the sub categories title