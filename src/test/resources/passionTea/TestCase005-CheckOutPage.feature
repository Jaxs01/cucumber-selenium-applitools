@all
Feature: PassionTea CheckOut Page
  As a customer, I want to view PassionTea checkout page, so that I know what PassionTea's check out is

  Background: PassionTea Check Out Page UI & Functional Testing

  Scenario: Navigate to PassionTea's Check Out Page
    Given I open PassionTea checkout page URL
    When I fill in the customer form with "di.zhang@assurity.co.nz", "Di" and "Wellington"
    And I fill in the payment form with "visa", "50505050", "Di" and "123456"
    Then I should go back to menu page
