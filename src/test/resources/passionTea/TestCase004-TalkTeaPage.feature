@all
Feature: PassionTea TalkTeaPage Page
  As a customer, I want to view PassionTea menu page, so that I know what PassionTea's menu is

  Background: PassionTea Menu Page UI & Functional Testing

  Scenario: Navigate to PassionTea's Menu Page
    Given I open PassionTea talk-to-tea page URL
    When I fill in the form with "Di", "di.zhang@assurity.co.nz", "Test", "Hello, Test" and submit
    Then I should see successful message
