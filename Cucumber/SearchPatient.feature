Feature: Search Patient
	Scenario: A Patient's Surname has been typed in the search field and the search button is clicked
    Given Patient with surname Andersen has been registered
    And Andersen is typed in the search field
    When I click the search button
    Then The search table shows the Patient information for Patients with surname Andersen