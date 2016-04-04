@all
Feature: Assurity Home Page
  As a customer, I want to view Assurity home page, so that I know what Assurity is

  Background: Assurity Home Page UI & Functional Testing

  Scenario: Navigate to Assurity's Home Page
    When I open Assurity home page URL
    And I check top navigation bar
    And I capture picture of home page
    And I hover mouse on each block
    Then I should land at correct home page