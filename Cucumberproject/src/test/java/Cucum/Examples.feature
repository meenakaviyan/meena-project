Feature: Use Facebook Application
Scenario Outline: Login The Application
Given user Launch The Application
When user Enter The "<Username>" And "<Password>"
Then user Enter The Login Button

Examples:
|Username|Password| 
| meenakannan | meena |
