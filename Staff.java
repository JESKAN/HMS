package system;

public class Staff extends User{
	String Name;
	String Surname;
	String Proffession;
	
	/** Staff instance variables*/
	
	static int Staffnumber = 0;
	/** staff number variable*/
	
	String EditStaffnumber = "0";
	/** edit staff number instance variable*/
	
	static int p = 0;
	/**search table index variable*/
	
	static int S = 1;
	/**search algorithm progress variable*/
	
	static String[] Names = new String[Array_Length];
	static String[] Surnames = new String[Array_Length];
	static String[] Proffessions = new String[Array_Length];
	static String[] Emails = new String[Array_Length];
	static int[] Staffnumbers = new int[Array_Length];
	
	/** Arrays for staff information*/
	
	void save() {	
			Names[Staffnumber] = Name;
			Surnames[Staffnumber] = Surname;
			Proffessions[Staffnumber] = Proffession;
			
		}
	/** saves the staff instance variable to the respective array where the location is the staff number*/
	
	
	void Gen_Email() {
		Emails[Staffnumber] = Name+Surname+Staffnumber+"@HMS.com";
	}
	/** creates a unique email address by combining name, surname and staff number*/
	
	void save_Edit() {
			int PN = Integer.valueOf(EditStaffnumber);
			Names[PN] = Name;
			Surnames[PN] = Surname;
			Proffessions[PN] = Proffession;
		}
	/** save the staff instance variable to the respective array where the location is the edit staff number*/


		
	static int SearchS(String surname) {
			if (Staffnumber == 0) {
				return 0;
			}
			for (int i = S; i <= Staffnumber; i++) {

			if (Surnames[i].equals(surname)) {
				return i;		
			}	
			}
		return 0;
		}
		/**searches for the input in the surnames list and return the location if a match is found or, returns 0 if no staff members are registered or no match is found*/
}
