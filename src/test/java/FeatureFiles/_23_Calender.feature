Feature: Calender Functionality

  Background:
    Given navigate to Campus
    When user enters valid username and password
    And clicks on the login button
    Then user should be redirected to the dashboard successfully
    Given the user is on the Weekly Course Plan page

  Scenario: Validate Calendar Page and Navigation

    Then  user should view today's date and the Weekly Course Plan
    Then  user should view the P,S,E,C icons
    Then user should view the descriptions of the lectures
    Given user should view Weekly Course Plan and Calender buttons on the page
    And user click on the buttons
      | calenderButton |
      | weeklyButton   |
    Then the user should be redirected to the respective pages


  Scenario Outline: Interacting with the Weekly Course Plan

    Then the user should see icons to navigate forward and backward (Previous, Today, Next) on the page
    When the user clicks on the navigation icons
      | previousButton |
      | todayButton    |
      | nextButton     |
    Then the Weekly Course Plan should update to reflect the selected view
    And the user should see the list of courses they are responsible for
    When the user clicks on the "<course>"
    Then the user should see the details of the "<course>"

    Examples:
      | course      |
      | biology     |
      | chemistry   |
      | dutch       |
      | mathematics |
      | geography   |
      | physics     |
      | spanish     |
      | statistics  |
