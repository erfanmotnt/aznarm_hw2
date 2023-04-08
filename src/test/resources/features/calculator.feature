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


  Scenario: square root of a number
    Given One input values, 4
    When I want to find square root of it
    Then I expect the result 2.0

  Scenario Outline: reverse lots of number
    Given One operation and a number, <opt> <input>
    When I want to calculate it
    Then I expect the result <result>

    Examples:
      | input | opt | result  |
      | 2     | rvs  | 0.5    |
      | -4    | rvs   | -0.25     |
      | 1     | rvs   | 1.0     |

  Scenario: reverse zero
    Given One input values, 0
    When I want to reverse it
    Then I expect the result Infinity

