Feature: Checkout Process
  As a user 
  I want to login with valid credential
  So that I can view the site

  Scenario: Launching URL
    Given launch the browser
    When type url and hit enter
    Then it should take me to Login screen

  Scenario Outline: Successful Login
    Given I am on the login page
    When I enter "<username>" and "<password>   And click on "Login" button
    Then I should redirect to the Home screen

    Examples: 
      | username  | password |
      | benny.1   | Pass@1   |
      |           | Pass@123 |
      | benny.1   |          |
      |           |          |
      | benny.123 | Pass@123 |

  Scenario: Adding product to cart
    Given I view the product
    When I click on add to cart button
    Then It should take me to cart page
    And The cart should display the added product
    And I can increase and decrease the quantity
    And I can remove the item from the cart

  Scenario: Make Payment
    Given I have a product in the cart
    When I click the "Checkout" button
    And I am redirected to Checkout screen
    And I enter "CardNumber", "CVV" and "ExpirationDate"
    And click the "Pay" button
    And Redirects to the OTP screen
    And Enter he valid OTP
    Then it should show the successful Payment confirmation message
