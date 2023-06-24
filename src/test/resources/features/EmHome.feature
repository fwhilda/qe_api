@EmHome
Feature: Explore&Monitoring Home

  As a user
  I want to grow plants
  So that I should access Explore&Monitoring

  Scenario: GET - Get Weather with valid endpoint and data
    Given I set GET api endpoints EmHome
    When I send GET HTTP request EmHome
    Then I receive valid HTTP response code 200

  Scenario: GET - Get weather article with valid label_id
    Given I set GET api endpoints EmHome2
    When I send GET HTTP request EmHome2
    Then I receive valid HTTP response code 200

  Scenario: GET - Get weather article with invalid label id
    Given I set GET api endpoints EmHome3
    When I send GET HTTP request EmHome3
    Then I receive valid HTTP response code 404

  Scenario: GET - Get available plant list with a valid endpoint
    Given I set GET api endpoints EmHome4
    When I send GET HTTP request EmHome4
    Then I receive valid HTTP response code 200

  Scenario: GET - Search available plants with valid name
    Given I set GET api endpoints EmHome5
    When I send GET HTTP request EmHome
    Then I receive valid HTTP response code 200

  Scenario: GET - Get plant detail with valid plant id
    Given I set GET api endpoints EmHome6
    When I send GET HTTP request EmHome6
    Then I receive valid HTTP response code 200

  Scenario: GET - Get plant detail with valid endpoint and invalid id
    Given I set GET api endpoints EmHome7
    When I send GET HTTP request EmHome7
    Then I receive valid HTTP response code 404

  Scenario: GET - Get planting locationl with valid endpoint and plant_id
    Given I set GET api endpoints EmHome8
    When I send GET HTTP request EmHome8
    Then I receive valid HTTP response code 200

  Scenario: GET - Get planting article with valid endpoint
    Given I set GET api endpoints EmHome9
    When I send GET HTTP request EmHome9
    Then I receive valid HTTP response code 200

  Scenario: GET - Get planting article with valid endpoint and invalid id
    Given I set GET api endpoints EmHome10
    When I send GET HTTP request EmHome10
    Then I receive valid HTTP response code 404

  Scenario: GET - Get planting article with valid endpoint and invalid location
    Given I set GET api endpoints EmHome11
    When I send GET HTTP request EmHome11
    Then I receive valid HTTP response code 400
