package system;

public class User implements GUI{

	final static int Array_Length = 1000;
	/**max array length variable*/
	
	boolean check(String string) {
		
		try {
		Integer.valueOf(string);
			}catch(NumberFormatException e) {
				return false;
			}
		
		/**returns false if the string cannot be converted to integer*/
				
		if (Integer.valueOf(string) > Array_Length-1 || Integer.valueOf(string) < 1) {
			return false;
		}
		/**returns false if converted string is bigger than 1000 or less than one*/
		
		return true;	
	}
	/**returns true otherwise*/
	
}
