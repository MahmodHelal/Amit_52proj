@smoke
Feature: Hover on Main Categories and Select Sub Categories

  Scenario: Hover on a Main Category and Select a Sub Category
    Given User is on the Home page
    When User selects a random main category
    And User hovers over the selected main category
    And User selects a random sub category
    Then User should verify that the sub category page title matches the selected sub category