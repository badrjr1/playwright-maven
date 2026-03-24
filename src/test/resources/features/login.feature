Feature: Login functionality

  Scenario: User logs in successfully
    Given I navigate to "https://ecommerce-playground.lambdatest.io/"
    And I click on "My Account"
    And I enter E-mail adress "pranav@testroverautomation.com"
    And I enter Password "Test1234"
    When I click on the login button
    Then I should Verify url contains "route=account/account"

