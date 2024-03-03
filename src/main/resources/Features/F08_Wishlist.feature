@smoke
Feature: F08_Wishlist | Users can add items to wishlist

  Scenario: Add item to wishlist
    Given User is on homepage
    When User adds an item to the wishlist
    Then Success message will appear

  Scenario: Check item in wishlist
    Given User is on homepage
    When User adds an item to the wishlist
    Then Item should be added to the wishlist