@test
Feature: Sample Test for Login

  Scenario: Login using invalid email
    Given On the page input email "invalid email"
    Then On the page input password "testing123"
    And On the page click login
    Then On the page verify error message "Enter Valid Email"

  Scenario: Login without input password
    Given On the page input email "khalif.testing@mail.com"
    And On the page click login
    Then On the page verify error message "Enter Password"

  Scenario: Login with not registered email
    Given On the page input email "khalif.invalid@mail.com"
    Then On the page input password "testing123"
    And On the page click login
    Then On the page verify message "Wrong Email or Password"

  Scenario: Login with invalid password
    Given On the page input email "khalif.testing@mail.com"
    Then On the page input password "testing456"
    And On the page click login
    Then On the page verify message "Wrong Email or Password"

  Scenario: Login using valid credential
    Given On the page input email "khalif.testing@mail.com"
    Then On the page input password "testing123"
    And On the page click login
    Then On the page verify login with credential "khalif.testing@mail.com"