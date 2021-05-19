Feature: As a customer I want to have ability to delete product
  from my basket

  Scenario: Remove product from basket
  Given I login as non registered user on haircarepanda
  And I add product to basket
  And I navigate to basket
  When I tap on “delete” icon near product name
  Then the message “Your shopping cart is empty An empty basket is a sad basket” is displayed