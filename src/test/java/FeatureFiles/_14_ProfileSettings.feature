Feature: Profile Settings

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario: Profile Settings
    Given Click the Profile
    And Click the Settings Button
    And Click the Profile Picture and Load Button
    When Choise the Profile Picture and Click Save Button
    Then User should save succesfuly


