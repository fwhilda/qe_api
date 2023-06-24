@Membership
Feature: Membership

  As a admin
  I want to see the products
  So that I can request endpoints register and login

  @Register
  Scenario: POST - Register with valid data data and endpoint
    Given I set POST api endpoints register Membership
    When I send POST HTTP request register Membership
    Then I receive valid HTTP response code 200

  Scenario: POST - Register with invalid email format
    Given I set POST api endpoints register Membership
    When I send POST HTTP request register2 Membership
    Then I receive valid HTTP response code 400

  Scenario: POST - Register without using email
    Given I set POST api endpoints register Membership
    When I send POST HTTP request register3 Membership
    Then I receive valid HTTP response code 400

  Scenario: POST - Register without using password
    Given I set POST api endpoints register Membership
    When I send POST HTTP request register4 Membership
    Then I receive valid HTTP response code 400

  Scenario: POST - Register using email that has been registered
    Given I set POST api endpoints register Membership
    When I send POST HTTP request register5 Membership
    Then I receive valid HTTP response code 400

  Scenario: POST - Register with a password of less than 8 characters
    Given I set POST api endpoints register Membership
    When I send POST HTTP request register6 Membership
    Then I receive valid HTTP response code 400


  Scenario: POST - Register with invalid endpoint
    Given I set POST api endpoints register2 Membership
    When I send POST HTTP request register7 Membership
    Then I receive valid HTTP response code 404


  @Login
  Scenario: POST - Login with a valid data and endpoint
    Given I set POST api endpoints login Membership
    When I send POST HTTP request login Membership
    Then I receive valid HTTP response code 200

  Scenario: POST - Login with an incorrect email
    Given I set POST api endpoints login Membership
    When I send POST HTTP request login2 Membership
    Then I receive valid HTTP response code 401

  Scenario: POST - Login with an incorrect password
    Given I set POST api endpoints login Membership
    When I send POST HTTP request login3 Membership
    Then I receive valid HTTP response code 401

  Scenario: POST - Login with an unregistered email
    Given I set POST api endpoints login Membership
    When I send POST HTTP request login4 Membership
    Then I receive valid HTTP response code 401

  Scenario: POST - Login with an empty email
    Given I set POST api endpoints login Membership
    When I send POST HTTP request login5 Membership
    Then I receive valid HTTP response code 401


  Scenario: POST - Login with an empty password
    Given I set POST api endpoints login Membership
    When I send POST HTTP request login6 Membership
    Then I receive valid HTTP response code 401

  @CheckEmail
  Scenario: GET - Check Email Valid with valid email has been register
    Given I set GET api endpoints check email Membership
    When I send GET HTTP request check email Membership
    Then I receive valid HTTP response code 200

  Scenario: GET - Check Email Valid with email has not been register
    Given I set GET api endpoints check email Membership
    When I send GET HTTP request check email2 Membership
    Then I receive valid HTTP response code 404

  Scenario: GET - Check Email Valid with empty email
    Given I set GET api endpoints check email Membership
    When I send GET HTTP request check email3 Membership
    Then I receive valid HTTP response code 404

  Scenario: GET - Check Email Valid with invalid format email
    Given I set GET api endpoints check email Membership
    When I send GET HTTP request check email4 Membership
    Then I receive valid HTTP response code 404

  @ResetPassword
  Scenario: PUT - Reset Password with vallid id
    Given I set PUT api endpoints Reset Password Membership
    When I send PUT HTTP request Reset Password1 Membership
    Then I receive valid HTTP response code 200

  Scenario: PUT - Reset Password with invalid id/email has not been registered
    Given I set PUT api endpoints Reset Password Membership2
    When I send PUT HTTP request Reset Password2 Membership
    Then I receive valid HTTP response code 404

  Scenario: PUT - Reset Password with new password less than 8 characters
    Given I set PUT api endpoints Reset Password Membership
    When I send PUT HTTP request Reset Password3 Membership
    Then I receive valid HTTP response code 400

  Scenario: PUT - Reset Password with empty on new password
    Given I set PUT api endpoints Reset Password Membership
    When I send PUT HTTP request Reset Password4 Membership
    Then I receive valid HTTP response code 400

  Scenario: PUT - Reset with the previous password
    Given I set PUT api endpoints Reset Password Membership
    When I send PUT HTTP request Reset Password5 Membership
    Then I receive valid HTTP response code 400

