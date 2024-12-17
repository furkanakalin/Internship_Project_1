Feature: Grading

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario: Grading
    Given Click the Grading Button
    When User should clickable the Student Transcripts Button
    Then Transcript Subject Button

