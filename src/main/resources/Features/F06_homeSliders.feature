@smoke
Feature: Testing Home Page Sliders

  Scenario: First slider is clickable on home page
    Given User opens the home page
    When User clicks on the first slider
    Then The URL should contain "nokia-lumia-1020"

  Scenario: Second slider is clickable on home page
    Given User opens the home page
    When User clicks on the second slider
    Then The URL should contain "iphone-14"