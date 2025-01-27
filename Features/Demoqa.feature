
@tag
Feature: Login to Demoqa
  I want to use this template for my feature file

  @tag1 
    Scenario: Successful Login with Valid Credentials
    Given abhi launch Chrome browser
    When User opens demoqa URL "https://demoqa.com/widgets"
    And click on elementabhi
    And click on checkboxsection
    And click on checkbox
    
    @tag2
    Scenario: Demo testing of webtable
    Given abhi launch Chrome browser
    When User opens demoqa URL "https://demoqa.com"
    And click on elementwebtable
    And click on webtables
    And click on add button
   