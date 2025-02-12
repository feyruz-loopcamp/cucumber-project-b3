Feature: Docuport Login Logout Feature

  Background:
    Given user is on Docuport login page

  @smoke @batch4
  Scenario: Login as a client
    #Given user is on Docuport login page
    When user enters username for client
    And user enters password for client
    And user clicks login button
    Then user should be able to see the home for client

  @regression @smoke @batch4
  Scenario: Login as an employee
    #Given user is on Docuport login page
    When user enters username for employee
    And user enters password for employee
    And user clicks login button
    Then user should see the home page for employee

  @smoke @batch4
  Scenario: Login as an advisor
    When user enters username for advisor
    And user enters password for advisor
    And user clicks login button
    Then user should see the home page for advisor

  @smoke @batch4
  Scenario: Login as an supervisor
    When user enters username for supervisor
    And user enters password for supervisor
    And user clicks login button
    Then user should see the home page for supervisor

  @dataTableMap @smoke
  Scenario: Login as a client map practice
    When user enters credentials
      | username | b1g1_client@gmail.com |
      | password | Group1                |
    Then user should be able to see the home for client



















