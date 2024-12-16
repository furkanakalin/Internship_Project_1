Feature: Finance Functionality

  Background:
    Given  Navigate to Campus
    When  Enter username and password and click login button
    Then User should login successfully


  Scenario: Successful payment

    And Click on the Element in HeaderMenu
      | hamburgerMenu |

    And Hover over the Element in HeaderMenu
      | finance |

    And Click on the Element in HeaderMenu
      | myFinance |

    And Click on the Element in DialogContent
      | eyeButton |
      | radiobtf  |
      | radiobts  |
      | radiobtt  |

    And User sending the keys in Dialog
      | amount | 10 |

    And Click on the Element in DialogContent
      | pay |
      | pay |