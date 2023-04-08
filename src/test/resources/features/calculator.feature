@tag
Feature: Calculator
  Scenario: add two numbers
    Given Two input values, 1 and 2
    When I add the two values
    Then I expect the result 3.0

  Scenario Outline: add two numbers
    Given Two input values, <first> and <second>
    When I add the two values
    Then I expect the result <result>

    Examples:
      | first | second | result |
      | 1     | 12     | 13.0     |
      | -1    | 6      | 5.0  	|
      | 2     | 2      | 4.0	    |

  Scenario: reverse number
    Given One input values, 4
    When I want to reverse it
    Then I expect the result 0.25
