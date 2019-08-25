package system;

public class Patient extends User{
	
	
	String Name;
	String Surname;
	String Birthdate;
	String Birthmonth;
	String Birthyear;
	String Address;
	String Phonenumber;
	
	/** Patient instance variables*/
	
	static int Patientnumber = 0;
	
	/** Patient number variable*/
	
	String EditPatientnumber = "0";
	/** edit Patient number instance variable*/
	
	static int p = 0;
	/**search table index variable*/
	
	static int S = 1;
	/**search algorithm progress variable*/
	
	static String[] Names = new String[Array_Length];
	static String[] Surnames = new String[Array_Length];
	static String[] Birthdates = new String[Array_Length];;
	static String[] Birthmonths = new String[Array_Length];;
	static String[] Birthyears = new String[Array_Length];;
	static String[] Addresses = new String[Array_Length];
	static String[] Phonenumbers = new String[Array_Length];
	static int[] Patientnumbers = new int[Array_Length];
	
	/** Arrays for patient information*/
	
	void save() {
		
		Names[Patientnumber] = Name;
		Surnames[Patientnumber] = Surname;
		Birthdates[Patientnumber] = Birthdate;
		Birthmonths[Patientnumber] = Birthmonth;
		Birthyears[Patientnumber] = Birthyear;
		Addresses[Patientnumber] = Address;
		Phonenumbers[Patientnumber] = Phonenumber;
		
	}
	/** saves the patient instance variable to the respective array where the location is the patient number*/
	
	void save_Edit() {
		int PN = Integer.valueOf(EditPatientnumber);
		Names[PN] = Name;
		Surnames[PN] = Surname;
		Birthdates[PN] = Birthdate;
		Birthmonths[PN] = Birthmonth;
		Birthyears[PN] = Birthyear;
		Addresses[PN] = Address;
		Phonenumbers[PN] = Phonenumber;
	}
	
	/** save the patient instance variable to the respective array where the location is the edit patient number*/


	

	
	static int SearchS(String surname) {
			if (Patientnumber == 0) {
				return 0;
			}
			
		for (int i = S; i <= Patientnumber; i++) {
			if (Surnames[i].equals(surname)) {
				return i;
				
			}
			
		}
		return 0;
	}
	/**searches for the input in the surnames list and return the location if a match is found or, returns 0 if no patient are registered or no match is found*/
}
