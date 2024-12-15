Feature: Calendar PopUps Functionality

  Background:
    Given navigate to Campus
    When user enters valid username and password
    And clicks on the login button
    Then user should be redirected to the dashboard successfully
    Given the user is on the Weekly Course Plan page

  Scenario: PopUps Functionality

    And  The user clicks on a completed (E) course
    Then The user verifies the all functions of the a opened pop-up window
      | topic        |
      | attachments  |
      | recentEvents |

    And  The user clicks on the Course Meeting that has not yet started
    Then The user verifies the Teacher's name, the Date and Time of the lesson, and warning message