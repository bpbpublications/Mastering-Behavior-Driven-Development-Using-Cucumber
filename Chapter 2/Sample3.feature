Feature: To test login functionality to www.freecrm.com

  Scenario Outline: To test a successful login
    Given User navigates to the login page
    When User enters "<UserName>" as username
    And User enters "<Password>" as password
    And User clicks the Login button
    Then User should be shown this paragraph
      """
      Welcome to freecrm, your one stop solution for all your HR needs
      """
