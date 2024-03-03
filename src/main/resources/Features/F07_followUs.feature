@smoke
Feature: F07_followUs | users could open followUs links

  Scenario: User opens Facebook link
    Given User is on the homepage
    When User clicks on the Facebook link
    Then User should be redirected to the Facebook page "https://www.facebook.com/nopCommerce"

  Scenario: User opens Twitter link
    Given User is on the homepage
    When User clicks on the Twitter link
    Then User should be redirected to the Twitter page "https://twitter.com/nopCommerce"

  Scenario: User opens RSS link
    Given User is on the homepage
    When User clicks on the RSS link
    Then User should be redirected to the correct RSS feed "https://demo.nopcommerce.com/new-online-store-is-open"

  Scenario: User opens YouTube link
    Given User is on the homepage
    When User clicks on the YouTube link
    Then User should be redirected to the YouTube page "https://www.youtube.com/user/nopCommerce"