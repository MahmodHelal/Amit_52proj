@smoke
  Feature: Search functionality

    Scenario Outline: User could search using product name
      Given User is on home page
      When user enter "<product-name>" and click enter
      Then the right product will appear "<product-name>"
      Examples:
        | product-name |
        | book         |
        | laptop       |
        | nike         |

    Scenario Outline: User could search using sku
      Given User is on home page
      When user enter "<sku>" and click enter
      Then  SKU shown on the product page contains the searched "<sku>"
      Examples:
        | sku          |
        | SCI_FAITH    |
        | APPLE_CAM    |
        | SF_PRO_11    |