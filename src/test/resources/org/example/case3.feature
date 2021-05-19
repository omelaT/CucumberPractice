Feature: Description: As a customer I want to have ability to increas quantity of products in my basket

Scenario: increase quantity of product in basket
Given I login as non registered user on haircarepanda
And I add product to basket
And I navigate to basket
When I tap on “+” icon near product name
Then the quantity of products is increased
And the price is calculated correctly