package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import system.Staff;

public class StepDefinitions implements GUI{
	
	Patient p = new Patient();
	
	@Given("Patient with viable informationd")
	public void save() {
	    p.save();
	    throw new cucumber.api.PendingException();
	}
	
	@And ("Number of registered patients under 1000")
	public void Number_of_registered_patients_under_1001() {
		p.Patientnumber = 1000;
	    throw new cucumber.api.PendingException();
	}

	@When("I click register")
	public void I_click_register() {
		GUI.Register.doClick();
	    throw new cucumber.api.PendingException();
	}

	@Then("A Patient has been registered")
	public void A_Patient_has_been_registered() {
		GUI.frame_succes.setVisibilty(true)
	    throw new cucumber.api.PendingException();
	}


	Staff s = new Staff();
	
	@Given("staff with viable information")
	public void staff_with_viable_information() {
	    s.save();
	    throw new cucumber.api.PendingException();
	}
	
	@And ("Number of registered staffs under 1000")
	public void Number_of_registered_staff_under_1001() {
		s.staffnumber = 1000;
	    throw new cucumber.api.PendingException();
	}
	
	@When("I click register")
	public void I_click_register2() {
		GUI.SRegister.doClick();
	    throw new cucumber.api.PendingException();
	}
	
	@Then("A staff member has been registered")
	public void A_staff_has_been_registered() {
		GUI.frame_ssucces.setVisibilty(true);
	    throw new cucumber.api.PendingException();
	}
	}
	
	Patient p = new Patient();
	
	@Given("Patient with viable information")
	public void save2() {
	    p.save();
	    throw new cucumber.api.PendingException();
	}
	
	@And ("A Patient number that can be converted to integer")
	public void edit1() {
		p.EditPatientnumber = 1;
	    throw new cucumber.api.PendingException();
	}
	
	@And ("A Patient number above 0")
	public void edit2() {
		p.EditPatientnumber = 1;
	    throw new cucumber.api.PendingException();
	}
	
	@And ("A Patient number below the number of Patients registered")
	public void edit3() {
		p.EditPatientnumber = 1;
	    throw new cucumber.api.PendingException();
	}
	
	@When("I click register")
	public void I_click_register3() {
		GUI.ERegister.doClick();
	    throw new cucumber.api.PendingException();
	}
	
	@Then("A Patient has been registered")
	public void A_Patient_has_been_registered2() {
		GUI.frame_succes.setVisibilty(true)
	    throw new cucumber.api.PendingException();
	}
	
	staff s = new staff();
	
	@Given("staff with viable information")
	public void staff_with_viable_information2() {
	    s.save();
	    throw new cucumber.api.PendingException();
	}
	
	@And ("A staff number that can be converted to integer")
	public void sedit1() {
		s.Editstaffnumber = 1;
	    throw new cucumber.api.PendingException();
	}
	
	@And ("A staff number above 0")
	public void sedit2() {
		s.Editstaffnumber = 1;
	    throw new cucumber.api.PendingException();
	}
	
	@And ("A staff number below the number of staffs registered")
	public void sedit3() {
		s.Editstaffnumber = 1;
	    throw new cucumber.api.PendingException();
	}
	
	@When("I click register")
	public void I_click_register4() {
		GUI.ESRegister.doClick();
	    throw new cucumber.api.PendingException();
	}
	
	@Then("A staff has been registered")
	public void A_staff_has_been_registered2() {
		GUI.frame_ssucces.setVisibilty(true);
	    throw new cucumber.api.PendingException();
	}
	
	
	@Given("Patient with surname Andersen has been registered")
	public void Patient_with_surname_Andersen_has_been_registered() {
	    GUI.Patient.surnames[1] = "Andersen";
	    throw new cucumber.api.PendingException();
	}
	
	@And ("Andersen is typed in the search field")
	public void Andersen_is_typed_in_the_search_field() {
		GUI.T_SSurname.setText("Andersen");
	    throw new cucumber.api.PendingException();
	}

	@When("I click search button")
	public void I_click_search1() {
		GUI.B_PSearch.doClick();
	    throw new cucumber.api.PendingException();
	}

	@Then("The search table shows the patient information for patients with surname Andersen")
	public void Patient_information() {
		GUI.T_Search.getModel().setValueAt("Andersen", 0, 2);;
	    throw new cucumber.api.PendingException();
	
	@Given("Staff with surname Andersen has been registered")
	public void Staff_with_surname_Andersen_has_been_registered() {
	    GUI.Staff.surnames[1] = "Andersen";
		throw new cucumber.api.PendingException();
		}
		
	@And ("Andersen is typed in the search field")
	public void Andersen_is_typed_in_the_search_field2() {
		GUI.T_SSSurname.setText("Andersen");
		throw new cucumber.api.PendingException();
		}

	@When("I click search button")
	public void I_click_search2() {
		GUI.B_SSearch.doClick();
		throw new cucumber.api.PendingException();
		}

	@Then("The search table shows the Staff information for Staff members with surname Andersen")
		public void Staff_information() {
		GUI.T_SSearch.getModel().setValueAt("Andersen", 0, 2);;
	    throw new cucumber.api.PendingException();
	}
	}

