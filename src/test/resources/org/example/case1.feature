
Feature: As a customer I want to have ability to buy product immediately
Scenario: Add to basket via “Buy now” button
Given I login as non registered user on haircarepanda
And I select category “gummies”
And I put cursor on product
When I tap on “Buy now” button
Then the basket page is displayed with selected previously product
