Feature: Select Destination
  As a user I want to be able to select my location
  So that I know where to find my flight

  @Scenario Outline:
  Scenario:  As a user I am able to select my flight location
    Given I am on the travel The world page
    When I select the my departure location
    And I select my destination location
    Then I click upon the submit button



    Scenario: As a user I am able to  fill out the form
      Given I have selected my destination already
      When I fill out the form
      And I have clicked remember me
      Then I will be able to get to the confirmation page




