@smoke
  Feature: F02_Login | users could use login functionality to use their accounts
    @valid
    Scenario: user could login with valid email and password
      Given User go to login page
      When  user login with "valid" "test11@example.com" and "P@ssw0rd"
      And   user press on login button
      Then  user login to the system successfully

    @invalid
    Scenario: user could login with invalid email and password
      Given  User go to login page
      When   user login with "invalid" "wrong@example.com" and "P@ssw0rd"
      And    user press on login button
      Then   user could not login to the system




#    @Valid
#      Examples:
#        |case|mail|password|
#        |valid|test11@example.com|P@ssw0rd|
#
#    @InValid
#      Examples:
#        |case|mail|password|
#        |invalid|invalid@example.com|invalid123|