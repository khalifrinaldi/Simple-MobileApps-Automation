@test
Feature: Sample Test for Register

  Scenario: Register using invalid email
    Given On Homepage click on register
    When On the page input name "Khalif"
    Then On the page input email "invalidemail"
    And On the page input password "testing123"
    And On the page input confirmation password "testing123"
    Then On the page click submit
    And On the page verify error message "Enter Valid Email"

  Scenario: Register without input name
    Given On Homepage click on register
    Then On the page input email "khalif.test1@mail.com"
    And On the page input password "testing123"
    And On the page input confirmation password "testing123"
    Then On the page click submit
    And On the page verify error message "Enter Full Name"

  Scenario: Register without input password
    Given On Homepage click on register
    When On the page input name "Khalif"
    Then On the page input email "khalif.test1@mail.com"
    Then On the page click submit
    And On the page verify error message "Enter Password"

  Scenario: Register with confirmation password doesnt match
    Given On Homepage click on register
    When On the page input name "Khalif"
    Then On the page input email "khalif.test1@mail.com"
    And On the page input password "testing123"
    And On the page input confirmation password "testing456"
    Then On the page click submit
    And On the page verify error message "Password Does Not Matches"

  Scenario: Register using valid data
    Given On Homepage click on register
    When On the page input name "Khalif"
    Then On the page input email "khalif.testing@mail.com"
    And On the page input password "testing123"
    And On the page input confirmation password "testing123"
    Then On the page click submit
    And On the page verify message "Registration Successful"

  Scenario: Register with registered user data
    Given On Homepage click on register
    When On the page input name "Khalif"
    Then On the page input email "khalif.testing@mail.com"
    And On the page input password "testing123"
    And On the page input confirmation password "testing123"
    Then On the page click submit
    And On the page verify message "Email Already Exists"


