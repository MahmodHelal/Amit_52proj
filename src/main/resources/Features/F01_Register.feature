@smoke
  Feature: F01_Register | users could register with new accounts
    Scenario: Guest user could register with valid data successfully
      Given User go to register page
      When  User selects gender type
      And   User enter first name "automation" and last name "tester"
      And   User selects Date of birth "1" "March" "1998"
      And   User enter email "test11@example.com" field
      And   User fills Password fields "P@ssw0rd" "P@ssw0rd"
      And   User clicks on register button
      Then  A new account should be created successfully