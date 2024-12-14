Feature: Login Functionality

  Scenario: Login with invalid username and password
    Given Navigate to Campus
    When User enters invalid username and password
    And Clicks on the login button
    Then User should see the warning message

  Scenario: Login with valid username and password
    Given Navigate to Campus
    When User enters valid username and password
    And Clicks on the login button
    Then User should be redirected to the dashboard successfully