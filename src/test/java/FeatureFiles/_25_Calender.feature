Feature: Calendar Feature Functionality

  Scenario: Validate Calendar and Course Recording Features

    Given the user is on the Weekly Course Plan page
    When the user clicks on the "Calendar" button
    Then  the user should see the list of courses they are responsible for
    When  the user selects a completed course marked as "E"
    Then  the user verifies and clicks on the "Recording" button to access the course recording

    And   the user opens the course video
    Then  the user sees the "Play" button on the video and clicks on it
    And   the user starts watching the video