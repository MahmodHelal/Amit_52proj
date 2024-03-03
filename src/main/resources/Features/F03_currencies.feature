@smoke
  Feature: Currencies filtration
    Scenario: Select currency from the dropdown list
      Given User is on my home page
      When User select currency "Euro"
      Then Products should be displayed in "€"