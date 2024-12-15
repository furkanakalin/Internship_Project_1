Feature: Calender Functionality

  Scenario: Validate Calendar Page and Navigation
    Given the user is on the Weekly Course Plan page
    And  user should view today's date and the Weekly Course Plan
    And  user should view the P,S,E,C icons
    And user should view the descriptions of the lectures
    When user should view Weekly Course Plan and Calender buttons on the page
    Then user click on the buttons and redirected to the respective pages

  Scenario Outline: Interacting with the Weekly Course Plan
    Given the user is on the Weekly Course Plan page
    Then the user should see icons to navigate forward and backward (Previous, Today, Next) on the page
    When the user clicks on the navigation icons
      | previousButton |
      | todayButton    |
      | nextButton     |
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

