
Feature: Signup feature
  I want to verify signup feature

 
  Scenario: As a user I want to create sign up account
    Given user navigate the url
    
    When click on singin link
    And click on signup link
    And input email , password , dob
    And click on signup button
    Then I can see my profile text
    
    
    
    