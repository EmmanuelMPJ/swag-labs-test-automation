@Suite @Login
Feature: CP01 - Validate login

  Background: Validate login with valid and invalid credentials

    Given the user navigates to the website

    @ValidCredentials
    Scenario: 1 - Validate with correct credentials
      When enter valid credentials
      Then the application should display the main product module

    @InvalidCredentials
    Scenario: 2 - Validate with incorrect credentials
      When enter invalid credentials
      Then the application should display an error message