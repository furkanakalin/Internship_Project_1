Feature:Calendar Feature Functionality

  Background:
    Given navigate to Campus
    When user enters valid username and password
    And clicks on the login button
    Then user should be redirected to the dashboard successfully
    Given the user is on the Weekly Course Plan page

  Scenario:Calendar Feature Check

    Then  The user views the courses they are responsible for
    When  The user clicks on a completed (E) course
    Then  The user views the Recording button and clicks on it
      | recordingButton |

    And   The user accesses the course video
    Then  The user views the Play button in the course video and clicks on it
    And   The user starts watching the video