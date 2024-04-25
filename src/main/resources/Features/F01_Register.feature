@regression
Feature:user register with new account
    Scenario: user could register with valid data successfully
      Given user go to register page
      When user select gender type
      And user enter first name "automation" and last name "tester"
      And user select date of birth "7" "October" "1998"
      And user enter email "test@example.com"
      And user enter password "P@ssw0rd" and confirmation password "P@ssw0rd"
      And user clicks on register button
      Then registration should be complete
