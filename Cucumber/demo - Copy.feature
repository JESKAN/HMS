Feature: Register Patient

Scenario: Patient Information has been typed and Register is clicked
    Given Patient with viable information
    And An arraylength under 1001
    When I click register
    Then a succes frame is displayed
    


 