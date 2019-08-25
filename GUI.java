package system;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import system.Patient;

interface GUI {
	
	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame("HMS MAIN");
		JFrame frame_succes = new JFrame("Succes");
		JFrame frame_fail = new JFrame("Fail");
		JFrame frame_ssucces = new JFrame("Succes");
		JFrame frame_sfail = new JFrame("Fail");
		JFrame frame_EPatient = new JFrame("Edit Patient");
		JFrame frame_RPatient = new JFrame("Patient Registration");
		JFrame frame_SPatient = new JFrame("Find Patient");
		JFrame frame_EStaff = new JFrame("Edit Staff");
		JFrame frame_RStaff = new JFrame("Staff Registration");
		JFrame frame_SStaff = new JFrame("Find Staff");
		
		/** This makes all the frames used in the GUI*/
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		panel.setBackground(Color.WHITE);
		
		JPanel panel_Pregister = new JPanel();
		panel_Pregister.setLayout(new BoxLayout(panel_Pregister, BoxLayout.PAGE_AXIS));
		panel_Pregister.setBackground(Color.WHITE);
		panel_Pregister.setPreferredSize(new Dimension(500, 300));
		
		JPanel panel_Eregister = new JPanel();
		panel_Eregister.setLayout(new BoxLayout(panel_Eregister, BoxLayout.PAGE_AXIS));
		panel_Eregister.setBackground(Color.WHITE);
		panel_Eregister.setPreferredSize(new Dimension(500, 300));
		
		JPanel panel_Sregister = new JPanel();
		panel_Sregister.setLayout(new BoxLayout(panel_Sregister, BoxLayout.PAGE_AXIS));
		panel_Sregister.setBackground(Color.WHITE);
		panel_Sregister.setPreferredSize(new Dimension(400, 200));
		
		JPanel panel_ESregister = new JPanel();
		panel_ESregister.setLayout(new BoxLayout(panel_ESregister, BoxLayout.PAGE_AXIS));
		panel_ESregister.setBackground(Color.WHITE);
		panel_ESregister.setPreferredSize(new Dimension(400, 200));
		
		JPanel panel_succes = new JPanel();
		panel_succes.setBackground(Color.WHITE);
		panel_succes.setLayout(new BoxLayout(panel_succes, BoxLayout.PAGE_AXIS));
		
		JPanel panel_ssucces = new JPanel();
		panel_ssucces.setBackground(Color.WHITE);
		panel_ssucces.setLayout(new BoxLayout(panel_ssucces, BoxLayout.PAGE_AXIS));
		
		JPanel panel_fail = new JPanel();
		panel_fail.setBackground(Color.WHITE);
		panel_fail.setLayout(new BoxLayout(panel_fail, BoxLayout.PAGE_AXIS));
		
		JPanel panel_sfail = new JPanel();
		panel_sfail.setBackground(Color.WHITE);
		panel_sfail.setLayout(new BoxLayout(panel_sfail, BoxLayout.PAGE_AXIS));
		
		JPanel panel_SPatient = new JPanel();
		panel_SPatient.setBackground(Color.WHITE);
		panel_SPatient.setLayout(new BoxLayout(panel_SPatient, BoxLayout.PAGE_AXIS));		
		
		JPanel panel_SStaff = new JPanel();
		panel_SStaff.setBackground(Color.WHITE);
		panel_SStaff.setLayout(new BoxLayout(panel_SStaff, BoxLayout.PAGE_AXIS));
		
		/** This makes all the panels used in the program*/
		
			
		JButton B_RPatient = new JButton("          Register Patient              ");
		B_RPatient.setBackground(Color.white);
		
		JButton B_EPatient = new JButton("          Edit Patient                       ");
		B_EPatient.setBackground(Color.white);
		
		JButton B_RStaff = new JButton("          Register Staff                  ");
		B_RStaff.setBackground(Color.white);
		
		JButton B_SStaff = new JButton("          Find Staff                          ");
		B_SStaff.setBackground(Color.white);
		
		JButton B_SPatient = new JButton("          Find Patient                      ");
		B_SPatient.setBackground(Color.white);
		
		JButton B_EStaff = new JButton("          Edit Staff                           ");
		B_EStaff.setBackground(Color.white);
		
		JButton B_APatient = new JButton("          Patient Admission          ");
		B_APatient.setBackground(Color.white);
		
		JButton Register = new JButton("          Register          ");			
		Register.setBackground(Color.white);
		
		JButton Cancel = new JButton("          Cancel             ");	
		Cancel.setBackground(Color.white);
		
		JButton ERegister = new JButton("          Register          ");			
		ERegister.setBackground(Color.white);
		
		JButton ECancel = new JButton("          Cancel             ");	
		ECancel.setBackground(Color.white);
		
		JButton B_PSearch = new JButton("          Search              ");	
		B_PSearch.setBackground(Color.white);
		
		JButton SRegister = new JButton("          Register          ");			
		SRegister.setBackground(Color.white);
		
		JButton SCancel = new JButton("          Cancel             ");	
		SCancel.setBackground(Color.white);
		
		JButton SERegister = new JButton("          Register          ");			
		SERegister.setBackground(Color.white);
		
		JButton SECancel = new JButton("          Cancel             ");	
		SECancel.setBackground(Color.white);
		
		JButton B_SSearch = new JButton("          Search              ");	
		B_SSearch.setBackground(Color.white);
		
		JButton BOK = new JButton("OK");
		BOK.setBackground(Color.white);	
		JButton EBOK = new JButton("OK");
		EBOK.setBackground(Color.white);
		
		JButton SBOK = new JButton("OK");
		SBOK.setBackground(Color.white);	
		JButton SEBOK = new JButton("OK");
		SEBOK.setBackground(Color.white);
		
		JButton Done = new JButton("Done");
		Done.setBackground(Color.white);
		
		JButton SDone = new JButton("Done");
		SDone.setBackground(Color.white);
		
		/** This makes all the Buttons used in the program*/
		
		JTextField T_Patientnumber = new JTextField("Patient Number");
		T_Patientnumber.setBackground(Color.white);
		
		JTextField T_Name = new JTextField("Name");
		T_Name.setBackground(Color.white);
		
		JTextField T_Surname = new JTextField("Surname");
		T_Surname.setBackground(Color.white);
		
		JTextField T_Address = new JTextField("Address");
		T_Address.setBackground(Color.white);
		
		JTextField T_Phonenumber = new JTextField("Number");
		T_Phonenumber.setBackground(Color.white);
		
		JTextField T_Staffnumber = new JTextField("Staff Number");
		T_Staffnumber.setBackground(Color.white);
		
		JTextField T_StName = new JTextField("Name");
		T_StName.setBackground(Color.white);
		
		JTextField T_StSurname = new JTextField("Surname");
		T_StSurname.setBackground(Color.white);
		
		JTextField T_EPatientnumber = new JTextField("Patient Number");
		T_EPatientnumber.setBackground(Color.white);
		
		JTextField T_EName = new JTextField("Name");
		T_EName.setBackground(Color.white);
		
		JTextField T_ESurname = new JTextField("Surname");
		T_ESurname.setBackground(Color.white);
		
		JTextField T_EAddress = new JTextField("Address");
		T_EAddress.setBackground(Color.white);
		
		JTextField T_EPhonenumber = new JTextField("Number");
		T_EPhonenumber.setBackground(Color.white);

		JTextField T_EStaffnumber = new JTextField("Staff Number");
		T_EStaffnumber.setBackground(Color.white);
		
		JTextField T_ESName = new JTextField("Name");
		T_ESName.setBackground(Color.white);
		
		JTextField T_ESSurname = new JTextField("Surname");
		T_ESSurname.setBackground(Color.white);
		
		JTextField T_SSurname = new JTextField("Surname");
		T_SSurname.setBackground(Color.white);
	
		JTextField T_SSSurname = new JTextField("Surname");
		T_SSSurname.setBackground(Color.white);
		

		/** This makes all the textfields used in the program*/
		
		
		
		String[] Day = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31","Day"};
		@SuppressWarnings({ "unchecked", "rawtypes" })
		JComboBox CB_Day = new JComboBox(Day);
		CB_Day.setSelectedIndex(31);
		CB_Day.setBackground(Color.white);
		
		String[] Month = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "Month"};
		@SuppressWarnings({ "unchecked", "rawtypes" })
		JComboBox CB_Month = new JComboBox(Month);
		CB_Month.setSelectedIndex(12);
		CB_Month.setBackground(Color.white);
		
		String[] Year = {"1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "Year"};
		@SuppressWarnings({ "unchecked", "rawtypes" })
		JComboBox CB_Year = new JComboBox(Year);
		CB_Year.setSelectedIndex(101);
		CB_Year.setBackground(Color.white);	
		
		String[] Proffession = {"Doctor", "Clerk", "Nurse", "ICT Officer", "Proffession"};
		@SuppressWarnings({ "unchecked", "rawtypes" })
		JComboBox CB_Proff = new JComboBox(Proffession);
		CB_Proff.setSelectedIndex(4);
		CB_Proff.setBackground(Color.white);
		
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		JComboBox CB_EDay = new JComboBox(Day);
		CB_EDay.setSelectedIndex(31);
		CB_EDay.setBackground(Color.white);
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		JComboBox CB_EMonth = new JComboBox(Month);
		CB_EMonth.setSelectedIndex(12);
		CB_EMonth.setBackground(Color.white);
	
		@SuppressWarnings({ "unchecked", "rawtypes" })
		JComboBox CB_EYear = new JComboBox(Year);
		CB_EYear.setSelectedIndex(101);
		CB_EYear.setBackground(Color.white);	
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		JComboBox CB_EProff = new JComboBox(Proffession);
		CB_EProff.setSelectedIndex(4);
		CB_EProff.setBackground(Color.white);
		
		/** This makes all the checkboxes used in the program*/
		
		
		
		JLabel L_Succes = new JLabel("Patient Registered Succesfully");
		JLabel L_Patientnumber = new JLabel("Patient Number: " + Patient.Patientnumber);
		JLabel L_Fail = new JLabel("Patient Registration Failed");

		JLabel L_SSucces = new JLabel("Staff Registered Succesfully");
		JLabel L_Staffnumber = new JLabel("Staff Number: " + Staff.Staffnumber);
		JLabel L_SFail = new JLabel("Staff Registration Failed");
		
		/** This makes all the labels used in the program*/
		
		String[] ScolumnNames = {"Staff Number","Name","Surname","Proffession", "Email"};
		Object[][] Sdata = {{"","","","",""}, {"","","","",""}, {"","","","",""}, {"","","","",""}};
		JTable T_SSearch = new JTable(Sdata ,ScolumnNames);
        T_SSearch.setPreferredScrollableViewportSize(new Dimension(500, 70));
        T_SSearch.setFillsViewportHeight(true);
		

		String[] columnNames = {"Patient Number","Name","Surname", "Birthday","Address", "Phonenumber"};
		Object[][] data = {{"","","","","",""}, {"","","","","",""}, {"","","","","",""}, {"","","","","",""}};
		JTable T_Search = new JTable(data ,columnNames);
        T_Search.setPreferredScrollableViewportSize(new Dimension(500, 70));
        T_Search.setFillsViewportHeight(true);
        
        /** This makes all the tables used in the program*/

		
		panel.add(B_RPatient);
		panel.add(B_EPatient);
		panel.add(B_SPatient);
		panel.add(B_RStaff);
		panel.add(B_EStaff);
		panel.add(B_SStaff);
		panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		
		frame.add(panel, BorderLayout.CENTER);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			
		panel_Pregister.add(T_Name);
		panel_Pregister.add(T_Surname);
		panel_Pregister.add(CB_Day);
		panel_Pregister.add(CB_Month);
		panel_Pregister.add(CB_Year);
		panel_Pregister.add(T_Address);
		panel_Pregister.add(T_Phonenumber);
		panel_Pregister.add(Register);
		panel_Pregister.add(Cancel);
		panel_Pregister.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
			
		frame_RPatient.add(panel_Pregister, BorderLayout.CENTER);
		frame_RPatient.pack();
		
		panel_Sregister.add(T_StName);
		panel_Sregister.add(T_StSurname);
		panel_Sregister.add(CB_Proff);
		panel_Sregister.add(SRegister);
		panel_Sregister.add(SCancel);
		panel_Sregister.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
			
		frame_RStaff.add(panel_Sregister, BorderLayout.CENTER);
		frame_RStaff.pack();
		
		panel_Eregister.add(T_Patientnumber);
		panel_Eregister.add(T_EName);
		panel_Eregister.add(T_ESurname);
		panel_Eregister.add(CB_EDay);
		panel_Eregister.add(CB_EMonth);
		panel_Eregister.add(CB_EYear);
		panel_Eregister.add(T_EAddress);
		panel_Eregister.add(T_EPhonenumber);
		panel_Eregister.add(ERegister);
		panel_Eregister.add(ECancel);
		panel_Eregister.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
			
		frame_EPatient.add(panel_Eregister, BorderLayout.CENTER);
		frame_EPatient.pack();
		
		panel_ESregister.add(T_Staffnumber);
		panel_ESregister.add(T_ESName);
		panel_ESregister.add(T_ESSurname);
		panel_ESregister.add(CB_EProff);
		panel_ESregister.add(SERegister);
		panel_ESregister.add(SECancel);
		panel_ESregister.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
			
		frame_EStaff.add(panel_ESregister, BorderLayout.CENTER);
		frame_EStaff.pack();
		
	
		panel_succes.add(L_Succes);
		panel_succes.add(L_Patientnumber);
		panel_succes.add(BOK);
		panel_succes.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		
		frame_succes.add(panel_succes, BorderLayout.CENTER);
		frame_succes.pack();
		
		panel_ssucces.add(L_SSucces);
		panel_ssucces.add(L_Staffnumber);
		panel_ssucces.add(SBOK);
		panel_ssucces.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		
		frame_ssucces.add(panel_ssucces, BorderLayout.CENTER);
		frame_ssucces.pack();
		
		
		panel_fail.add(L_Fail);
		panel_fail.add(EBOK);
		panel_fail.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		frame_fail.add(panel_fail, BorderLayout.CENTER);
		frame_fail.pack();
		
		panel_sfail.add(L_SFail);
		panel_sfail.add(SEBOK);
		panel_sfail.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		frame_sfail.add(panel_sfail, BorderLayout.CENTER);
		frame_sfail.pack();
				
		panel_SPatient.add(T_SSurname);
		panel_SPatient.add(B_PSearch);
		JScrollPane SP = new JScrollPane(T_Search);
		panel_SPatient.add(SP);
		panel_SPatient.add(Done);
		panel_SPatient.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		
		frame_SPatient.add(panel_SPatient, BorderLayout.CENTER);
		frame_SPatient.pack();

		panel_SStaff.add(T_SSSurname);
		panel_SStaff.add(B_SSearch);
		panel_SStaff.add(B_SSearch);
		JScrollPane SP2 = new JScrollPane(T_SSearch);
		panel_SStaff.add(SP2);
		panel_SStaff.add(SDone);
		panel_SStaff.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		
		frame_SStaff.add(panel_SStaff, BorderLayout.CENTER);
		frame_SStaff.pack();
		
		/** This makes the all the panel setups for every frame*/

		frame.setVisible(true);
		
		/** This makes the main menu frame visible*/
		
		B_RPatient.addActionListener(		
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						frame_RPatient.setVisible(true);
					}
				}
				);
		
		/** This makes the patient register frame visible when clicked on the Register Patient button*/
		
		B_RStaff.addActionListener(
				new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					frame_RStaff.setVisible(true);
					
					}
				}
				);
		/** This makes the staff register frame visible when clicked on the Register Staff button*/
		
		B_SPatient.addActionListener(
				
		new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			frame_SPatient.setVisible(true);
			
			}
		}
		);
		
		/** This makes the Search patient frame visible when clicked on the find patient button*/
		
		B_SStaff.addActionListener(
				
			new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				frame_SStaff.setVisible(true);
					
				}
			}
			);
		
		/** This makes the Search staff frame visible when clicked on the find staff button*/
		
		B_EPatient.addActionListener(
				
		new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			frame_EPatient.setVisible(true);
			
			}
		}
		);
		
		/** This makes the edit patient frame visible when clicked on the edit patient button*/
		
		
		B_EStaff.addActionListener(
				
				new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					frame_EStaff.setVisible(true);
					
					}
				}
				);
		
		/** This makes the edit staff frame visible when clicked on the edit staff button*/
		
		Cancel.addActionListener(
				
			new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame_RPatient.setVisible(false);
				
				
				}
		}
		);
		
		/** This makes the register patient frame invisible, when the cancel button is clicked*/
		
		SCancel.addActionListener(
				
				new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame_RStaff.setVisible(false);

					
					}
			}
			);
		
		/** This makes the register staff frame invisible, when the cancel button is clicked*/
		
		ECancel.addActionListener(
				
				new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame_EPatient.setVisible(false);

					
					}
			}
			);
		
		/** This makes the edit patient frame invisible, when the cancel button is clicked*/
		
		SECancel.addActionListener(
				
				new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame_EStaff.setVisible(false);

					
					}
			}
			);
		
		/** This makes the edit staff frame invisible, when the cancel button is clicked*/
		
		Done.addActionListener(
				new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame_SPatient.setVisible(false);

					
					}
				}
				);
		
		/** This makes the search patient frame invisible, when the done button is clicked*/
		
		SDone.addActionListener(
				new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame_SStaff.setVisible(false);

					
					}
				}
				);
		
		/** This makes the search staff frame invisible, when the done button is clicked*/
					
		BOK.addActionListener(
			new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame_succes.setVisible(false);
				
				}
			}
			);
		
		
		/** This makes the succes frame invisible, when the ok button is clicked*/
		
		SBOK.addActionListener(
				new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame_ssucces.setVisible(false);
					
					}
				}
				);
		
		/** This makes the succes frame invisible, when the ok button is clicked*/
		
		EBOK.addActionListener(
				new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame_fail.setVisible(false);
					
					}
				}
				);
		
		/** This makes the fail frame invisible, when the ok button is clicked*/
		
		SEBOK.addActionListener(
				new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame_sfail.setVisible(false);
					
					}
				}
				);
		
		/** This makes the fail frame invisible, when the ok button is clicked*/
		
		Register.addActionListener(
				
			new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame_RPatient.setVisible(false);
				
				/** The patient register frame is set to invisible*/
					
				Patient p = new Patient();
				p.Name = T_Name.getText();
				p.Surname = T_Surname.getText();
				p.Birthdate = String.valueOf(CB_Day.getSelectedItem());
				p.Birthmonth = String.valueOf(CB_Month.getSelectedItem());
				p.Birthyear = String.valueOf(CB_Year.getSelectedItem());
				p.Address = T_Address.getText();
				p.Phonenumber = T_Phonenumber.getText();
				
				/** This makes a new patient from the user typed variables from the textfields and checkboxes*/
				
				Patient.Patientnumber++;
				/** Unique patient number increases*/
				L_Patientnumber.setText("Patient Number: " + Patient.Patientnumber);
				/** Succes frame's patient number changes*/
				
				if (p.check(""+Patient.Patientnumber)) {
					p.save();
					frame_succes.setVisible(true);
				}
				/** Checks for a viable patient number and saves the patient if true + shows the succes frame*/
				
				else {
					frame_fail.setVisible(true);
					Patient.Patientnumber--;
					
				}
				/** if false the patient number decreases and shows the fail frame*/
				}
			}
			);

		
		SRegister.addActionListener(
				
				new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame_RStaff.setVisible(false);

					/** The staff register frame is set to invisible*/
						
					Staff s = new Staff();
					s.Name = T_StName.getText();
					s.Surname = T_StSurname.getText();
					s.Proffession = String.valueOf(CB_Proff.getSelectedItem());
					
					/** This makes a new staff member from the user typed and checked variables from the textfields and checkboxes*/
					
					
					Staff.Staffnumber++;
					/** Unique staff number increases*/
					L_Staffnumber.setText("Staff Number: " + Staff.Staffnumber);
					/** Succes frame's staff number changes*/
					
					
					
					if (s.check(""+Staff.Staffnumber)) {
						s.save();
						s.Gen_Email();
						frame_ssucces.setVisible(true);
					}
					/** Checks for a viable staff number and saves the staff member if true + shows the succes frame*/
					
					else {
						frame_sfail.setVisible(true);
					}
					/** if false the patient number decreases and shows the fail frame*/
						
					
							
					}
				}
				);
		ERegister.addActionListener(
				
			new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame_EPatient.setVisible(false);
				
				/** The patient edit frame is set to invisible*/
				
				Patient p = new Patient();
				p.Name = T_EName.getText();
				p.Surname = T_ESurname.getText();
				p.Birthdate = String.valueOf(CB_EDay.getSelectedItem());
				p.Birthmonth = String.valueOf(CB_EMonth.getSelectedItem());
				p.Birthyear = String.valueOf(CB_EYear.getSelectedItem());
				p.Address = T_EAddress.getText();
				p.Phonenumber = T_EPhonenumber.getText();
				p.EditPatientnumber = T_Patientnumber.getText();
				
				/** This makes a new patient from the user typed variables from the textfields and checkboxes*/

				L_Patientnumber.setText("Patient Number: " + T_Patientnumber.getText());
				/** Succes frame's patient number changes*/
				
				
				if (p.check(p.EditPatientnumber) && (Integer.valueOf(p.EditPatientnumber) <= Patient.Patientnumber)) {
					p.save_Edit();
					frame_succes.setVisible(true);
				}
				/** Checks for a viable edit patient number from the textfield and saves the patient to the  patient number location if true + shows the succes frame*/
				
				else {
					frame_fail.setVisible(true);
				}
				/** if false shows the fail frame*/
				
					
				
							
				}
			}
			);
		
		SERegister.addActionListener(
				
				new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame_EStaff.setVisible(false);
					/** The staff edit frame is set to invisible*/

					Staff s = new Staff();
					s.Name = T_ESName.getText();
					s.Surname = T_ESSurname.getText();
					s.Proffession = String.valueOf(CB_EProff.getSelectedItem());
					s.EditStaffnumber = T_Staffnumber.getText();
					
					/** This makes a new staff member from the user typed variables from the textfields and checkboxes*/

					L_Patientnumber.setText("Staff Number: " + T_Staffnumber.getText());
					/** Succes frame's patient number changes*/
					
					if (s.check(s.EditStaffnumber) && (Integer.valueOf(s.EditStaffnumber) <= Staff.Staffnumber)) {
						s.save_Edit();
						frame_ssucces.setVisible(true);
					}
					/** Checks for a viable edit staff number from the textfield and saves the staff member to the staff number location if true + shows the succes frame*/
					
					else {
						frame_sfail.setVisible(true);
					}
					/** if false shows the fail frame*/
					
						
					
								
					}
				}
				);
		
		B_PSearch.addActionListener(
				new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Patient.S = 1;
					Patient.p = 0;
					/** initial variables for list index and table index*/
					
					for (int i = 0; i < 4; i++) {
						T_Search.getModel().setValueAt("", i, 0);
						T_Search.getModel().setValueAt("", i, 1);
						T_Search.getModel().setValueAt("", i, 2);
						T_Search.getModel().setValueAt("", i, 3);
						T_Search.getModel().setValueAt("", i, 4);
						T_Search.getModel().setValueAt("", i, 5);
						
					}
					/**resets the search table*/
					
					do {						
						int Cell = Patient.SearchS(T_SSurname.getText());
						
						/**gets the searched string from text field*/
			
						
						

						if (Cell != 0) { 
							T_Search.getModel().setValueAt((Cell), Patient.p, 0);
							T_Search.getModel().setValueAt((Patient.Names[Cell]), Patient.p, 1);
							T_Search.getModel().setValueAt((Patient.Surnames[Cell]), Patient.p, 2);
							T_Search.getModel().setValueAt((Patient.Birthdates[Cell] + "-" + Patient.Birthmonths[Cell] + "-" + Patient.Birthyears[Cell]), Patient.p, 3);
							T_Search.getModel().setValueAt((Patient.Addresses[Cell]), Patient.p, 4);
							T_Search.getModel().setValueAt((Patient.Phonenumbers[Cell]), Patient.p, 5);
							Patient.S = Cell + 1;
							Patient.p++;	
						}
						/**if the search is succesful the table shows the patient*/
						
						
						else {
							Patient.S = Patient.Patientnumber + 1;
							
						}
						/** if the search failed the loop ends*/
						
						} while ((Patient.S <= Patient.Patientnumber && Patient.p <= 3));
					/** Continues until the whole patient list is searched or the table is full */
					}
				}
				);
		
		
		
		B_SSearch.addActionListener(
				new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Staff.S = 1;
					Staff.p = 0;
					
					/** initial variables for list index and table index*/
					
					for (int i = 0; i < 4; i++) {
						T_SSearch.getModel().setValueAt("", i, 0);
						T_SSearch.getModel().setValueAt("", i, 1);
						T_SSearch.getModel().setValueAt("", i, 2);
						T_SSearch.getModel().setValueAt("", i, 3);
						T_SSearch.getModel().setValueAt("", i, 4);
						
					}
					/**resets the search table*/
					
					do {						
						int SCell = Staff.SearchS(T_SSSurname.getText());
						/**gets the searched string from text field*/

						if (SCell != 0) { 
							T_SSearch.getModel().setValueAt((SCell), Staff.p, 0);
							T_SSearch.getModel().setValueAt(Staff.Names[SCell], Staff.p, 1);
							T_SSearch.getModel().setValueAt(Staff.Surnames[SCell], Staff.p, 2);
							T_SSearch.getModel().setValueAt(Staff.Proffessions[SCell], Staff.p, 3); 
							T_SSearch.getModel().setValueAt(Staff.Emails[SCell], Staff.p, 4); 
							Staff.S = SCell + 1;
							Staff.p++;					
							System.out.println("1");
						}
						/**if the search is successful the table shows the staff member*/
						
						else {
							Staff.S = Staff.Staffnumber + 1;
						}
						/** if the search failed the loop ends*/
						
						} while ((Staff.S <= Staff.Staffnumber && Staff.p <= 3));
					/** Continues until the whole staff list is searched or the table is full */
					}
				}
				);
		
		
		}
	}
