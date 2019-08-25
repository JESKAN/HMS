Feature: Edit Patient

	Scenario: Patient Information has been typed and Register is clicked
    Given Patient with viable information typed in
    And A Patient number that can be converted to integer
    And A Patient number above 0
    And A Patient number below the number of Patients registered
    When I click register
    Then a succes frame is displayed
    
