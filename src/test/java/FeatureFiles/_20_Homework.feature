Feature: Login and Assignment Features

  # User Story 1: Login to the website
  Scenario: Login to the https://test.mersys.io/ website
    Given I navigate to "https://test.mersys.io/"
    When I enter the username "Student_10"
    And I enter the password "S12345"
    And I click on the login button
    Then I should see the dashboard page

  # User Story 2: Click Assignments button
  Scenario: Navigate to Assignments section
    Given I am logged into the website
    When I click the "Assignments" button
    Then I should see the Assignments page

  # User Story 3: Verify icons for Overdues
  Scenario: Check for icons on the right side of Overdues
    Given I am on the Assignments page
    When I look at the Overdues section
    Then I should see icons on the right side of each overdue item

  # User Story 4: Access overdue information
  Scenario: Click empty space of an overdue
    Given I am on the Assignments page
    When I click on an empty space of an overdue item
    Then I should see detailed information about the overdue

  # User Story 5: Discussion icon for discussions
  Scenario: Verify discussion icon for an overdue with a discussion
    Given I am on the Assignments page
    When there is a discussion opened for an overdue
    Then I should see a discussion icon on the right side of that overdue
