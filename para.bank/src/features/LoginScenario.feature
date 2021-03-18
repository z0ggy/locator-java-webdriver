Feature: Login functionality

  In order to do internet banking
  As a valid Para Bank customer
  I want to login successfully


  Scenario Outline: Login successful

    Given I am i the login page of the Para Bank application
    When I enter valid "<username>" and "<password>"
    Then I should be taken to Overview page
    Examples:
      | username | password |
      |Dominik   |tester    |