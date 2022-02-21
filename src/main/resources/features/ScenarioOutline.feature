
@Smoke
Feature: Scenario outline demo

@Regression
  Scenario Outline: Multiple tests
    Given user is on Facebook
    When user enter "<email>"
    And User inter "<password>"
    And user clicks on log in button
    Then user should see "<message>"
    Examples:
      | email          | password  | message           |  |
      | nurs@gmail.com | Qwerty123 | Successful        |  |
      | adik@gmail.com | Hello312  | Successful        |  |
      | sam@gmail.com  | 111Sad!   | Account not found |  |

