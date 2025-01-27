
@tag
Feature: Login to amazon
  I want to use this template for my feature file

  @tag1 
    Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser
    When User opens URL "https://testautomationpractice.blogspot.com/"
    And Enter name "Ram"
    And Enter email "abhishek@gmail.com"
    And Enter phone number "12345678912"
    And Enter address " GkW layout vijaynagar"
    And select gender 
    And select checkbox
    And select dropdown
    And select date
    #And User enter Email as "admin@yourstore.com" and password as "Admin@1998"
    #And Click on Login
    #Then Page Title should be "My Account"
    #And close browser

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
