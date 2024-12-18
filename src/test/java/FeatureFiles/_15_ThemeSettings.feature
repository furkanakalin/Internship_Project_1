Feature: Profile Settings

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario: Theme Settings
    Given Click the Profile Button
    And Click the Settings and  Click the Theme
    When Click the Purple Theme and click the Save Button
    Then User should save succesfuly