Feature: Edit Staff	
	Scenario: Staff Information has been typed and Register is clicked
    Given Staff with viable information typed in
    And A Staff number that can be converted to integer
    And A Staff number above 0
    And A Staff number below the number of staff members registered
    When I click register
    Then a succes frame is displayed