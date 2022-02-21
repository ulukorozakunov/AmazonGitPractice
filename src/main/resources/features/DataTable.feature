
@Smoke
Feature: Data Table practice
@Regression
  Scenario: Order Kimchi from Arigato
    Given user is on NambaFood
    When user clicks on Foods
    Then user should see "250 best cafe"
    And user should find Sushi category
    When user click on Sushi
    Then user should see list of Cafes
    And user should scroll down the page to the Arigato cafe
    When user click on Arigato
    Then user should see the Arigato cafe menu
    And user should find kimchi
    When user increase kimchi amount to 3
    And user should click on Oreder button
    Then on the cart user should see "450$"




    Scenario: Verify following tabs are displayed in Amazon
      Given user is on "https://www.amazon.com/"
      Then foolowing menu bar should be displayed on Home page
        | All   | Today's Deal | Customer Service | Registry | Gift Cards | Sell   |
        | Hello | Dog          | Cat              | Cow      | Summer     | Winter |
        | Cold  | Hot          | Java             | C#       | Ruby       | Swift  |




      Scenario: Cars model
        Given user is on www.car.kg
        Then following cars should be displayed
          | Bmw | Mers   | Toyota | Audi | VW   | Tesla   | Porsche  |
          | 525 | E500   | Camry  | A4   | Polo | Plaid   | 911      |
          | M5  | CLS 55 | Mark2  | S8   | Golf | Model S | Panamera |



        Scenario: Test Dry run


