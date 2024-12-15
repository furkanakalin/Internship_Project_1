Feature: Calendar PopUps Functionality

  Scenario: Validate Calendar Pop-Ups Functionality
    Given the user is on the Weekly Course Plan page
    And   the user clicks on the "Calendar" button

    When  the user views the following details on the Weekly Course Plan page:
      | detail          |
      | courseStatus   |
      | courseName     |
      | teacherName  |
    And   the user clicks on a completed course marked as "E"
    Then  the user verifies the following elements in the opened pop-up window:
      | element        |
      | topic          |
      | attachments    |
      | recentEvents  |

    When  the user clicks on a Course Meeting that has not yet started
    Then  the user verifies the following information:
      | information         |
      | teacherName      |
      | dateAndTime       |
      | warningMessage     |