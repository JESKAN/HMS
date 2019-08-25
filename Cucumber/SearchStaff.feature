Feature: Search Staff
	Scenario: A Staff Surname has been typed in the search field and the search button is clicked
    Given Staff member with surname Andersen has been registered
    And Andersen is typed in the search field
    When I click the search button
    Then The search table shows the staff member information for staff members with surname Andersen
