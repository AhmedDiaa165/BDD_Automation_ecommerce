@regression
Feature: user can using search bar and searching for products
  Scenario Outline:user can search by product name
    Given user navigates to home page
    When user enters productName in search bar as "<productName>"
    And user clicks on search button
    And verify that search page is opened
    Then verify that search shows relevant results "<productName>"
    Examples:
      |productName|
      |book|
      |laptop|
      |nike|
  Scenario Outline: user can searching for product by sku
      Given user navigates to home page
      When user enters sku of product in search bar as "<SKU>"
      And user clicks on search button
      And user clicks on the product in search result
      Then verify the sku on the product matches the searched"<SKU>"
      Examples:
      |SKU|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|