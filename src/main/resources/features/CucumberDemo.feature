
@Smoke
Feature: Login functionality
  # here we would write the feature name to be tested
  #we create one feature file per feature(functionality)

  Background: User is on Facebook
    Given User is logged in to https://www.facebook.com/

@Regression
  Scenario: Verify user can login with valid credentials
    #Given steps are used for precondition
    #When -> Action
    When User enter test@test.com to email field
    #And == When
    And User should enter Hello1234 in password input field
    And User should click on log in button
    #Then -> Validation
    Then User should successfully logged in to the Facebook




    Scenario: Verify user can login with valid email and invalid password

      When User enter test@test.com to email field
      And User should enter Hello12 in password input field
      And User should click on log in button
      Then User should be unable to log in to facebook.com