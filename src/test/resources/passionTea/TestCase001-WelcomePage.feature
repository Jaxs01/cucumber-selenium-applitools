@alll
Feature: PassionTea Welcome Page
  As a customer, I want to view PassionTea home page, so that I know what PassionTea is

  Background: PassionTea Welcome Page UI & Functional Testing

  Scenario: Navigate to PassionTea's Welcome Page
    When I open PassionTea welcome page URL
    And I check side navigation bar
    And I capture picture of welcome page
    Then I should land at correct welcome page