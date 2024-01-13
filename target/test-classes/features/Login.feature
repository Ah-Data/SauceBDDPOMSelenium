Feature: Login Functionality

  @login @e2e
  Scenario: User logs in with the valid credentials
    Given User is on the login page
    When User enters valid username and password
    And User clicks the login button
    Then User should be redirected to the Swag Labs home page

  @login @e2e
  Scenario: User logs in with invalid credentials
    Given User is on the login page
    When User enters invalid username and password
    And User clicks the login button
    Then User should see an error message
