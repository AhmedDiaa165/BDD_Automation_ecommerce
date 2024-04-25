@regression
Feature:Follow us
  Scenario: user clicks on facebook icon
    Given user navigates to home page
    When user clicks on facebook icon
    Then facebook is opened in new tab "https://www.facebook.com/nopCommerce"

    Scenario: user clicks on twitter icon
      Given user navigates to home page
      When user clicks on twitter icon
      Then twitter is opened in new tab "https://twitter.com/nopCommerce"

      Scenario: user clicks on rss icon
        Given user navigates to home page
        When user clicks on rss icon
        Then rss is opened in new tab "https://demo.nopcommerce.com/new-online-store-is-open"

        Scenario: user clicks on youtube icon
          Given user navigates to home page
          When user clicks on youtube icon
          Then youtube is opened in new tab "https://www.youtube.com/user/nopCommerce"