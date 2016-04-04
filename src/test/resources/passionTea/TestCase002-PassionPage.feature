@all
Feature: Assurity Clients Page
  As a customer, I want to view Assurity clients page, so that I know what Assurity's clients are

  Background: Assurity Clients Page UI & Functional Testing

  Scenario: Navigate to Assurity's Clients Page
    When I open Assurity clients page URL
    When I view all the clients
    When I view all the case studies
    Then I should land at correct clients page