package system;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyTest{
	
	@Test
	void Test() {
	Patient test = new Patient();
	
	assertEquals(false, test.check("1001"),"No Patients registered");
	assertEquals(false, test.check("A"),"No Patients registered");
	assertEquals(0, Patient.SearchS("Andersen"),"No Patients registered");
	
	test.Name = "Jeppe";
	test.Surname = "Andersen";
	test.Birthdate = "01";
	test.Birthmonth = "01";
	test.Birthyear = "2000";
	test.Address = "Street";
	test.Phonenumber = "01233456789";
	Patient.Patientnumber++;
	test.save();
	
	
	assertEquals(false, test.check("0"),"One Patient registered");
	assertEquals(true, test.check("1"),"One Patient registered");
	System.out.println(Patient.Names[1]);
	assertEquals(0, Patient.SearchS("Jeppe"),"No Patients registered");
	assertEquals(1, Patient.SearchS("Andersen"),"No Patients registered");
	
	test.EditPatientnumber = "1";
	test.Name = "Jepp";
	test.Surname = "Anderse";
	test.Birthdate = "01";
	test.Birthmonth = "01";
	test.Birthyear = "2000";
	test.Address = "Street";
	test.Phonenumber = "01233456789";
	test.save_Edit();
	

	assertEquals(0, Patient.SearchS("Jeppe"),"No Patients registered");
	assertEquals(0, Patient.SearchS("Andersen"),"No Patients registered");

	
	Staff test2 = new Staff();
	
	assertEquals(false, test2.check("1001"),"No Staffs registered");
	assertEquals(false, test2.check("A"),"No Staffs registered");
	assertEquals(0, Staff.SearchS("Andersen"),"No Staffs registered");
	
	test2.Name = "Jeppe";
	test2.Surname = "Andersen";
	test2.Proffession = "Clerk";
	Staff.Staffnumber++;
	test2.save();
	
	
	assertEquals(false, test2.check("0"),"One Staff registered");
	assertEquals(true, test2.check("1"),"One Staff registered");
	System.out.println(Staff.Names[1]);

	assertEquals(0, Staff.SearchS("Jeppe"),"No Staffs registered");
	assertEquals(1, Staff.SearchS("Andersen"),"No Staffs registered");
	
	test2.EditStaffnumber = "1";
	test2.Name = "Jepp";
	test2.Surname = "Anderse";
	test2.save_Edit();
	
	assertEquals(0, Staff.SearchS("Jeppe"),"No Staffs registered");
	assertEquals(0, Staff.SearchS("Andersen"),"No Staffs registered");
	
	
	
	
	
	
	
	}

	
}
