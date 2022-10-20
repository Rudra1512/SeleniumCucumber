Feature: feature to test login functionality of ORHM
  Scenario Outline: Validating Login
    Given Browser is launching
    And user is Orhm loginpage
   When user enters <ID>
    And enters <Pass>
    Then login page will be displayed
    Examples:
      | ID | Pass |
    |Admin|admin123|
    |user1|pass1   |
