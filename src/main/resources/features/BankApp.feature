Feature: BankApp
  Scenario: Account for user
    Given user should to register to with following info
      | Account      | Routing number |
      | 123456789123 | 123451234      |
    Then user should be successfully register to the bank with foolowing credentials
      | Account      | Routing number |
      | 123456789123 | 123451234      |