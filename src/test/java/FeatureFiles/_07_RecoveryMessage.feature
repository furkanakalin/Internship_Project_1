Feature: Message Recovery Functionality

  Background:
    Given  Navigate to Campus
    When  Enter username and password and click login button
    Then User should login successfully

  Scenario: Recover Message from Trash

    And Click on the Element in HeaderMenu
      | hamburgerMenu |

    And Hover over the Element in HeaderMenu
      | messaging |

    And Click on the Element in HeaderMenu
      | trash |

    And Click on the Element in DialogContent
      | recover |

    And Success message should be displayed

    And Click on the Element in DialogContent
      | trashIcon |
      | submit    |

    And Success message should be displayed

