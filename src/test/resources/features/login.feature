Feature: login functionality test


  Background:
    Given user is on login page

Scenario: successful login test
  Given user enter valid creential
  When user click on login button
  Then user shuld be able to login


  Scenario Outline: unsuccessful login test
    Given user enter invalid "<id>" and "<password>"
    When user click on login button
    Then user should not be able to login

    Examples:
    | id | password|
    | wrongid-1 | password-1  |
    | wrongid-2 | password-2  |
    | wrongid-3  | password-2 |