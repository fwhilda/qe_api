@Suggestions
Feature: Suggestions

  As an admin
  I want to improve my platform
  So that I should open suggestions

  Scenario: GET - Get Suggestions with valid endpoint
    Given I set GET api endpoints suggestions
    When I send GET HTTP request suggestions
    Then I receive valid HTTP response code 200

  Scenario: GET - Get Suggestions by id with valid endpoint
    Given I set GET api endpoints suggestions2
    When I send GET HTTP request suggestions2
    Then I receive valid HTTP response code 200

  Scenario: GET - Get Suggestions by invalid id with valid endpoint
    Given I set GET api endpoints suggestions3
    When I send GET HTTP request suggestions3
    Then I receive valid HTTP response code 400

  Scenario: DELETE - Delete Suggestions with valid endpoint and id
    Given I set DELETE api endpoints suggestions
    When I send DELETE HTTP request suggestions
    Then I receive valid HTTP response code 200

  Scenario: DELETE - Delete Suggestions with valid endpoint and invalid id
    Given I set DELETE api endpoints suggestions2
    When I send DELETE HTTP request suggestions2
    Then I receive valid HTTP response code 400


