Feature: SignIn Positive

  Scenario: User must be sign in with valid value

    Given user is on the SignIn page
    And user provides username "standard_user"
    And user provides password "secret_sauce"
    And user clicks signInButton
    Then user must be signIn