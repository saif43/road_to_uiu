
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class Road_2_UIU extends JFrame implements WindowListener,ActionListener
{

	//Frames--------------------------------
		
	
		//Main door
		JFrame main_door;

		//ARCHITECTUREtecture (Global)
		JFrame	ARCHITECTURE_frame,ARCHITECTURE_CAMPUS1_frame,ARCHITECTURE_CAMPUS2_frame,
				ARCHITECTURE_CAMPUS4_frame,ARCHITECTURE_CAMPUS1_PIC_frame,
				ARCHITECTURE_CAMPUS2_PIC_frame,ARCHITECTURE_CAMPUS4_PIC_frame;
		
		//Faculty (Global)
		JFrame	faculty_frame;
		 
		//Student Info (Global)
		JFrame	student_info_frame,si_courses_frame,si_facilities_frame,si_credits_system_frame,
				si_gpa_simulator_frame,si_waiver_frame,si_office_emp_frame,si_payment_frame;
		
				//Facilities
				JFrame 	labs_frame,studyroom_frame,library_frame,canteen_frame,student_parking_frame,
						wifi_frame,curricullum_activities_frame,gym_frame,commonroom_frame;
					
				//GPA Simulator Variables
				int 	a1 = 0,a2 = 0,a3 = 0,a4 = 0;
				int 	i = 0,j = 0,p = 0,q = 0;
				
				int[]	subject 	= new int[30];
				int[]	lab 		= new int[30];
				
				double	result_sub	= 0.00;
				double	result_lab	= 0.00;
				double result_final	= 0.00; 
				

		//Student Support (Global)
 		JFrame	$student_support_frame,$cisco_frame,$ieb_frame,$eras_frame;
		
		//Online Info (Global)
		JFrame	$online_info_frame;
		
		//Office (Global)
		JFrame	$office_frame,$admission_frame,$register_frame,$cits_frame,$student_affairs_frame,
				$student_accout_frame,$reception_frame;
		
		//About (Global)
		JFrame	about_uiu_frame;
		
		//Software Map (Global)
		JFrame	software_map_frame;
		
		//Application Credit (Global)
		JFrame	$application_credit_frame;
		
		
	//TextFields----------------------------
		
		//Main door Search (Global)
		JTextField main_door_search_tf;
	
		//GPA Simulator
		JTextField number_of_subjects_tf;
		JTextField result_tf;		 	
		JTextField number_of_labs_tf;		
		
		//Software Map
		JTextField software_map_tf;
		
	//TextAreas-----------------------------
		
		//All Text File Reader
		JTextArea text_reader;
		
		//GPA Simulator
		JTextArea gpa_of_subjects_ta;
		JTextArea gpa_of_labs_ta;
	
		
	//Labels--------------------------------
		
		//All Labels (Global)
		JLabel 	main_door_uiu_label,ARCHITECTURE_uiu_label,student_info_label,
				$student_support_label,office_label,$application_label,$anzan_label,
				$zahid_label,$saif_label,$mamun_label,$anzan_label1,$zahid_label1,$saif_label1,
				$mamun_label1,gpa_simulator_label,si_facilities_label,$office_label;
		
	//Buttons-------------------------------
	
		
		//Main door (Global)
		JButton	main_door_home,main_door_about,main_door_search,main_door_architecture,main_door_faculty,
				main_door_student_info,main_door_student_support,main_door_online_info,main_door_office,
				main_door_software_map,main_door_app_credit,main_door_exit;
		
		//ARCHITECTUREtecture (Global)
		JButton CAMPUS_1,CAMPUS_2,CAMPUS_4,ARCHITECTURE_1,IMAGE_1,ARCHITECTURE_2,IMAGE_2,
				ARCHITECTURE_4,IMAGE_4;
		
		//Faculty (Global) = No Global Buttons
		
		
		//Student Info (Global)
		JButton courses_button,facilities_button,credits_system_button,gpa_simulator_button,
				waiver_button,office_employment_button,payment_button;
		
			//Facilities (Global)
			JButton lab_button,studyroom_button,library_button,canteen_button,student_parking_button,
					wifi_button,curricullum_activities_button,gym_button,commonroom_button;
			
			//GPA Simulator (Global)
			JButton finalize_button,next_button,next1_button,reset_button;
		
		//Student Support (Global)
		JButton $cisco_button,$ieb_button,$eras_button;
		
		//Online Info (Global)
		JButton $web_button,$fb_group_button,$elms_button,$ems_button,$daily_uiu_button;
		
		//Office (Global)
		JButton $admission_button,$register_button,$cits_button,$student_affairs_button
				,$student_account_button; 
	
		//Software Map
		JButton software_map_search_button;
	
		//Home
		JButton	temporary_home;
		JButton all_home_button;
		
		
		
	public Road_2_UIU()
	{
		
		//Frame--------------------------------------------------------------------
		
		main_door 						= new JFrame("Road To UIU");
		
		software_map_frame				= new JFrame("SOFTWARE MAP");
		
		ARCHITECTURE_frame				= new JFrame("UIU ARCHITECTURE");
		ARCHITECTURE_CAMPUS1_frame		= new JFrame("UIU ARCHITECTURE CAMPUS1");
		ARCHITECTURE_CAMPUS2_frame		= new JFrame("UIU ARCHITECTURE CAMPUS2");
		ARCHITECTURE_CAMPUS4_frame		= new JFrame("UIU ARCHITECTURE CAMPUS4");
		ARCHITECTURE_CAMPUS1_PIC_frame	= new JFrame("UIU ARCHITECTURE CAMPUS1 PIC");
		ARCHITECTURE_CAMPUS2_PIC_frame	= new JFrame("UIU ARCHITECTURE CAMPUS2 PIC");
		ARCHITECTURE_CAMPUS4_PIC_frame	= new JFrame("UIU ARCHITECTURE CAMPUS4 PIC");
		
		student_info_frame				= new JFrame("STUDENT IFNO");
		si_courses_frame				= new JFrame("COURSES");
		si_facilities_frame				= new JFrame("FACILITIES");
		labs_frame						= new JFrame("LABS");
		studyroom_frame					= new JFrame("STUDYROOM");
		library_frame					= new JFrame("LIBRARY"); 
		canteen_frame					= new JFrame("CANTEEN");
		student_parking_frame			= new JFrame("STUDENT PARKING");
		wifi_frame						= new JFrame("Wi-Fi");
		curricullum_activities_frame	= new JFrame("CURRICULLUM ACTIVITIES");
		gym_frame						= new JFrame("GYM");
		commonroom_frame				= new JFrame("COMMONROOM");
		si_credits_system_frame			= new JFrame("CREDIT SYSTEM");
		si_gpa_simulator_frame			= new JFrame("GPA SIMULATOR");
		si_waiver_frame					= new JFrame("WAIVER");
		si_office_emp_frame				= new JFrame("OFFICE EMPLOYMENT");
		si_payment_frame				= new JFrame("BANKING SYSTEM");
		
		$student_support_frame			= new JFrame("UIU STUDENT SUPPORT");
		
		$online_info_frame				= new JFrame("UIU STUDENT ONLINE INFO");
		
		
		$office_frame					= new JFrame("OFFICE INFORMATION");
		$admission_frame				= new JFrame("ADMISSION OFFICE");
		$register_frame					= new JFrame("REGISTER OFFICE");
		$cits_frame						= new JFrame("CITS OFFICE");
		$student_affairs_frame			= new JFrame("STUDENT AFFAIRS");
		$student_accout_frame			= new JFrame("STUDENT ACCOUNTS");
	
		$application_credit_frame		= new JFrame("APPLICATION CREDITS");
		
		
		//Main door---------------------------------------------------------------------------------------
		
		main_door_uiu_label 			= new JLabel("ROAD TO UIU");
		main_door_home 					= new JButton("HOME");
		main_door_about 				= new JButton("ABOUT");
		main_door_search_tf 			= new JTextField();
		main_door_search 				= new JButton("SEARCH");
		main_door_architecture			= new JButton("ARCHITECTURE");
		main_door_faculty 				= new JButton("FACULTY");
		main_door_student_info 			= new JButton("STUDENT INFO");
		main_door_student_support 		= new JButton("STUDENT SUPPORT");
		main_door_online_info 			= new JButton("ONLINE INFO");
		main_door_office 				= new JButton("OFFICE");
		main_door_software_map 			= new JButton("SOFTWARE MAP");
		main_door_app_credit 			= new JButton("APPLICATION CREDITS");
		main_door_exit 					= new JButton("EXIT");
		
		
		//ARCHITECTURE------------------------------------------------------------------------------------
		ARCHITECTURE_uiu_label			= new JLabel("UNITED INTERNATIONAL UNIVERSITY ARCHITECTURE");
		CAMPUS_1 						= new JButton("CAMPUS 1");
		CAMPUS_2 						= new JButton("CAMPUS 2");
		CAMPUS_4 						= new JButton("CAMPUS 4");
		ARCHITECTURE_1					= new JButton("ARCHITECTURE C1");
		IMAGE_1 						= new JButton("IMAGE C1");
		ARCHITECTURE_2 					= new JButton("ARCHITECTURE C2");
		IMAGE_2 						= new JButton("IMAGE C2");
		ARCHITECTURE_4 					= new JButton("ARCHITECTURE C4");
		IMAGE_4 						= new JButton("IMAGE C4");
	
		//Faculty
		faculty_frame 					= new JFrame("FACULTY");
	
		//Student Info------------------------------------------------------------------------------------
		student_info_label 				= new JLabel("UIU STUDENT INFORMATION");
		courses_button					= new JButton("COURSES"); 
		facilities_button 				= new JButton("FACILITIES");
		credits_system_button 			= new JButton("CREDIT SYSTEM");
		gpa_simulator_button 			= new JButton("GPA SIMULATOR");
		waiver_button 					= new JButton("WAIVER");
		office_employment_button 		= new JButton("OFFICE EMPLOYMENT");
		payment_button 					= new JButton("PAYMENT SYSTEM");
		
		si_facilities_label				= new JLabel("STUDENT FACILITIES");
		
			
		//GPA Simulator 
		finalize_button					= new JButton("FINALIZE");
		next_button 					= new JButton("NEXT");
		next1_button					= new JButton("NEXT");
		reset_button					= new JButton("RESET");
		
		//Student Support---------------------------------------------------------------------------------
		$student_support_label			= new JLabel("UNITED INTERNATIONAL UNIVERSITY STUDENT SUPPORT");
		$cisco_button					= new JButton("CISCO & CCNA");
		$ieb_button						= new JButton("IEB");
		$eras_button					= new JButton("ERASMUS MUNDUS");
			
		//Facilities 
		lab_button						= new JButton("LAB");
		studyroom_button				= new JButton("STUDY ROOM");
		library_button					= new JButton("LIBRARY");
		canteen_button					= new JButton("CANTEEN");
		student_parking_button			= new JButton("ADVISING");
		wifi_button						= new JButton("WIFI");
		curricullum_activities_button	= new JButton("CURRICULLUM ACTIVITIES");
		gym_button						= new JButton("GYM");
		commonroom_button				= new JButton("COMMON ROOM");
		
		
		//GPA Simulator
		gpa_simulator_label				= new JLabel("GPA SIMULATOR");
		number_of_subjects_tf 			= new JTextField();
		result_tf						= new JTextField(); 	
		number_of_labs_tf				= new JTextField();
		gpa_of_subjects_ta				= new JTextArea();
		gpa_of_labs_ta					= new JTextArea();
		
		
		//Office------------------------------------------------------------------------------------------
		
		$office_label					= new JLabel("OFFICE INFORMATION");
		$admission_button				= new JButton("ADMISSION OFFICE");
		$register_button				= new JButton("REGISTER OFFICE");
		$cits_button					= new JButton("CITS OFFICE");
		$student_affairs_button			= new JButton("STUDENT AFFAIRS");
		$student_account_button			= new JButton("STUDENT ACCOUNT");
		
		//Application Credit------------------------------------------------------------------------------
		$application_label				= new JLabel("APPLICATION CREDITS");
		$anzan_label					= new JLabel("C.M Muktadir CSE, UIU" );
		$zahid_label					= new JLabel("Zahid Khan CSE,UIU");
		$saif_label						= new JLabel("Saif CSE, UIU");
		$mamun_label					= new JLabel("AL-Mamun CSE,UIU");
		$anzan_label1					= new JLabel("" );
		$zahid_label1					= new JLabel("");
		$saif_label1					= new JLabel("");
		$mamun_label1					= new JLabel("");
		
		//Software Map------------------------------------------------------------------------------------
		software_map_tf					= new JTextField();
		software_map_search_button		= new JButton("Search");
		
		//Home--------------------------------------------------------------------------------------------
		all_home_button 				= new JButton("HOME");
		temporary_home					= new JButton("Home");
	
	}
	
	
	public void Road_2_UIU()
	{
		//Action Listener---------------------------------------------------------------------------------
		
			//Frames (Main door)
			main_door.addWindowListener(this);
			main_door.setSize(1280,1024);
			main_door.setResizable(false);
			main_door.setLayout(null);
			main_door_home.addActionListener(this);
			main_door_about.addActionListener(this);
			main_door_search.addActionListener(this);
			main_door_architecture.addActionListener(this);
			main_door_faculty.addActionListener(this);
			main_door_student_info.addActionListener(this);
			main_door_student_support.addActionListener(this);
			main_door_online_info.addActionListener(this);
			main_door_office.addActionListener(this);
			main_door_software_map.addActionListener(this);
			main_door_app_credit.addActionListener(this);
			main_door_exit.addActionListener(this);
			
			//ARCHITECTURE
			CAMPUS_1.addActionListener(this);
			CAMPUS_2.addActionListener(this);
			CAMPUS_4.addActionListener(this);
			ARCHITECTURE_1.addActionListener(this);
			IMAGE_1.addActionListener(this);
			ARCHITECTURE_2.addActionListener(this);
			IMAGE_2.addActionListener(this);
			ARCHITECTURE_4.addActionListener(this);
			IMAGE_4.addActionListener(this);
			
			//Faculty
			
			//Student Info
			courses_button.addActionListener(this);
			facilities_button.addActionListener(this);
			lab_button.addActionListener(this);
			studyroom_button.addActionListener(this);
			library_button.addActionListener(this);
			canteen_button.addActionListener(this);
			student_parking_button.addActionListener(this);
			wifi_button.addActionListener(this);
			curricullum_activities_button.addActionListener(this);
			gym_button.addActionListener(this);
			commonroom_button.addActionListener(this);
			credits_system_button.addActionListener(this);
			gpa_simulator_button.addActionListener(this);
			waiver_button.addActionListener(this);
			office_employment_button.addActionListener(this);
			payment_button.addActionListener(this);
		
			//Student Support
			$cisco_button.addActionListener(this);
			$ieb_button.addActionListener(this);
			$eras_button.addActionListener(this);

			//Office
			$admission_button.addActionListener(this);
			$register_button.addActionListener(this);
			$cits_button.addActionListener(this);
			$student_affairs_button.addActionListener(this);
			$student_account_button.addActionListener(this);
				
			//All Home
			all_home_button.addActionListener(this);
			temporary_home.addActionListener(this);
			
			//Software Map
			software_map_search_button.addActionListener(this);
			
			
			
//--------------------------------------------------------------------------------------------------------
			
		//Setting BackGround And Text Color --------------------------------------------- 
		Color  text_color 	= Color.YELLOW;
		Color  button_color	= Color.getHSBColor((float) 0.1,(float) 0.1,(float) 0.1);
		
		//Font of Main door--------------------------------------------------------------
		main_door_uiu_label.setFont(new Font("CASTELLAR",Font.BOLD,25));
		main_door_uiu_label.setBounds(555, 20, 600,25);
		main_door_home.setBounds(30,20,85,30);
		main_door_home.setFont(new Font("Ariel",Font.BOLD,15));
		main_door_about.setBounds(1240,20,100,30);
		main_door_about.setFont(new Font("Ariel",Font.BOLD,15));
		main_door_search.setBounds(600,150,110,30);
		main_door_search_tf.setBounds(555,80,200,30);
		main_door_search.setFont(new Font("Ariel",Font.BOLD,15));
		main_door_architecture.setBounds(340,380,200,30);
		main_door_architecture.setFont(new Font("Ariel",Font.BOLD,15));
		main_door_faculty.setBounds(240,470,200,30);
		main_door_faculty.setFont(new Font("Ariel",Font.BOLD,15));
		main_door_student_info.setBounds(140,560,200,30);
		main_door_student_info.setFont(new Font("Ariel",Font.BOLD,15));
		main_door_student_support.setBounds(800,380,200,30);
		main_door_student_support.setFont(new Font("Ariel",Font.BOLD,15));
		main_door_office.setBounds(900,470,200,30);
		main_door_office.setFont(new Font("Ariel",Font.BOLD,15));
		main_door_online_info.setBounds(1000,560,200,30);
		main_door_online_info.setFont(new Font("Ariel",Font.BOLD,15));
		main_door_software_map.setBounds(30,650,200,30);;
		main_door_software_map.setFont(new Font("Ariel",Font.BOLD,15));
		main_door_app_credit.setBounds(1106,650,220,30);
		main_door_app_credit.setFont(new Font("Ariel",Font.BOLD,15));
		main_door_exit.setBounds(625,650,100,30);
		main_door_exit.setFont(new Font("Ariel",Font.BOLD,15));	
		
		
		
		//Font of ARCHITECTURE-----------------------------------------------------------
		ARCHITECTURE_uiu_label.setFont(new Font("Castellar",Font.BOLD,25));
		ARCHITECTURE_uiu_label.setBounds(259, 21, 900,25);
		CAMPUS_1.setBounds(349,202,160,40);
		CAMPUS_1.setFont(new Font("Ariel",Font.BOLD,15));
		CAMPUS_2.setBounds(349,402,160,40);
		CAMPUS_2.setFont(new Font("Ariel",Font.BOLD,15));
		CAMPUS_4.setBounds(349,602,160,40);
		CAMPUS_4.setFont(new Font("Ariel",Font.BOLD,15));
		ARCHITECTURE_1.setBounds(799,152,180,30);
		ARCHITECTURE_1.setFont(new Font("Ariel",Font.BOLD,15));
		IMAGE_1.setBounds(799,252,140,30);
		IMAGE_1.setFont(new Font("Ariel",Font.BOLD,15));
		ARCHITECTURE_2.setBounds(799,352,180,30);
		ARCHITECTURE_2.setFont(new Font("Ariel",Font.BOLD,15));
		IMAGE_2.setBounds(799,452,140,30);
		IMAGE_2.setFont(new Font("Ariel",Font.BOLD,15));
		ARCHITECTURE_4.setBounds(799,552,180,30);
		ARCHITECTURE_4.setFont(new Font("Ariel",Font.BOLD,15));
		IMAGE_4.setBounds(799,652,140,30);
		IMAGE_4.setFont(new Font("Ariel",Font.BOLD,15));
			
		//Font of Faculty----------------------------------------------------------------
	
		//Font of Student Info-----------------------------------------------------------
		student_info_label.setFont(new Font("Castellar",Font.BOLD,25));
		student_info_label.setBounds(450,20,450,25);
		
		facilities_button.setFont(new Font("Ariel",Font.BOLD,15));
		facilities_button.setBounds(550,252,210,30);
		courses_button.setFont(new Font("Ariel",Font.BOLD,15));
		courses_button.setBounds(350,350,210,30);
		credits_system_button.setFont(new Font("Ariel",Font.BOLD,15));
		credits_system_button.setBounds(280,440,210,30);
		gpa_simulator_button.setFont(new Font("Ariel",Font.BOLD,15));
		gpa_simulator_button.setBounds(210,530,210,30);
		waiver_button.setFont(new Font("Ariel",Font.BOLD,15));
		waiver_button.setBounds(770,350,210,30);
		office_employment_button.setFont(new Font("Ariel",Font.BOLD,15));
		office_employment_button.setBounds(840,440,210,30);
		payment_button.setFont(new Font("Ariel",Font.BOLD,15));
		payment_button.setBounds(910,530,210,30);
		
			//Facilities;			
			si_facilities_label.setFont(new Font("Castellar",Font.BOLD,25));
			si_facilities_label.setBounds(530,20,450,25);
			lab_button.setBounds(540,252,240,30);
			lab_button.setFont(new Font("Ariel",Font.BOLD,15));
			studyroom_button.setBounds(330,350,240,30);
			studyroom_button.setFont(new Font("Ariel",Font.BOLD,15));
			library_button.setBounds(280,420,240,30);
			library_button.setFont(new Font("Ariel",Font.BOLD,15));
			canteen_button.setBounds(230,490,240,30);
			canteen_button.setFont(new Font("Ariel",Font.BOLD,15));
			student_parking_button.setBounds(180,560,240,30);
			student_parking_button.setFont(new Font("Ariel",Font.BOLD,15));
			wifi_button.setBounds(760,350,240,30);
			wifi_button.setFont(new Font("Ariel",Font.BOLD,15));
			curricullum_activities_button.setBounds(810,420,240,30);
			curricullum_activities_button.setFont(new Font("Ariel",Font.BOLD,15));
			gym_button.setBounds(860,490,240,30);
			gym_button.setFont(new Font("Ariel",Font.BOLD,15));
			commonroom_button.setBounds(910,560,240,30);
			commonroom_button.setFont(new Font("Ariel",Font.BOLD,15));
		
		//Font of Student Support--------------------------------------------------------
		$student_support_label.setFont(new Font("CASTELLAR",Font.BOLD,25));
		$student_support_label.setBounds(260, 20, 900,25);
		$cisco_button.setBounds(555,222,200,60);
		$cisco_button.setFont(new Font("Ariel",Font.BOLD,15));
		$ieb_button.setBounds(250,400,200,60);
		$ieb_button.setFont(new Font("Ariel",Font.BOLD,15));
		$eras_button.setBounds(890,400,200,60);
		$eras_button.setFont(new Font("Ariel",Font.BOLD,15));
		
		//Font of Office-----------------------------------------------------------------
		$office_label.setFont(new Font("Castellar",Font.BOLD,25));
		$office_label.setBounds(510,20,1000,60);
		$admission_button.setFont(new Font("Ariel",Font.BOLD,15));
		$admission_button.setBounds(550,242,220,40);
		$register_button.setFont(new Font("Ariel",Font.BOLD,15));
		$register_button.setBounds(350,350,220,40);
		$cits_button.setFont(new Font("Ariel",Font.BOLD,15));
		$cits_button.setBounds(230,480,220,40);
		$student_affairs_button.setFont(new Font("Ariel",Font.BOLD,15));
		$student_affairs_button.setBounds(760,350,220,40);
		$student_account_button.setFont(new Font("Ariel",Font.BOLD,15));
		$student_account_button.setBounds(880,480,220,40);
		
		//Font of Application Credit-----------------------------------------------------
		$application_label.setFont(new Font("CASTELLAR",Font.BOLD,25));
		$application_label.setBounds(500,20,1000,25);
			
		$anzan_label1.setBounds(220,-30,400,500);
		$zahid_label1.setBounds(890,-30,400,500);
		$saif_label1.setBounds(220,300,400,500);
		$mamun_label1.setBounds(890,300, 400,500);
			
		$anzan_label.setFont(new Font("CASTELLAR",Font.BOLD,15));
		$anzan_label.setBounds(240,390,600,15);
		$zahid_label.setFont(new Font("CASTELLAR",Font.BOLD,15));
		$zahid_label.setBounds(910,390,600,15 );
		$saif_label.setFont(new Font("CASTELLAR",Font.BOLD,15));
		$saif_label.setBounds(260,690,600,25);
		$mamun_label.setFont(new Font("CASTELLAR",Font.BOLD,15));
		$mamun_label.setBounds(910, 690, 600,25);
	
		//Font of All Home---------------------------------------------------------------
		all_home_button.setBounds(30,20,85,30);
		all_home_button.setFont(new Font("Ariel",Font.BOLD,15));
		
		//Font of Search-----------------------------------------------------------------
		
//--------------------------------------------------------------------------------------------------------		
		
		//Text Color of Main door
		main_door_home.setForeground(text_color);
		main_door_about.setForeground(text_color);
		main_door_search.setForeground(text_color);
		main_door_architecture.setForeground(text_color);
		main_door_faculty.setForeground(text_color);
		main_door_student_info.setForeground(text_color);
		main_door_student_support.setForeground(text_color);
		main_door_online_info.setForeground(text_color);
		main_door_office.setForeground(text_color);
		main_door_software_map.setForeground(text_color);
		main_door_app_credit.setForeground(text_color);
		main_door_exit.setForeground(text_color);
		
		
		//Text Color of ARCHITECTURE
		CAMPUS_1.setForeground(text_color);
		CAMPUS_2.setForeground(text_color);
		CAMPUS_4.setForeground(text_color);
		ARCHITECTURE_1.setForeground(text_color);
		IMAGE_1.setForeground(text_color);
		ARCHITECTURE_2.setForeground(text_color);
		IMAGE_2.setForeground(text_color);
		ARCHITECTURE_4.setForeground(text_color);
		IMAGE_4.setForeground(text_color);
			
		
		//Text Color of Student Info
		courses_button.setForeground(text_color);
		facilities_button.setForeground(text_color);
		credits_system_button.setForeground(text_color);
		gpa_simulator_button.setForeground(text_color);
		waiver_button.setForeground(text_color);
		office_employment_button.setForeground(text_color);
		payment_button.setForeground(text_color);
		
		//Text Color of Student Support
		$cisco_button.setForeground(text_color);
		$ieb_button.setForeground(text_color);
		$eras_button.setForeground(text_color);
		
		//Text Color of Office Buttons
		$admission_button.setForeground(text_color);
		$register_button.setForeground(text_color);
		$cits_button.setForeground(text_color);
		$student_affairs_button.setForeground(text_color);
		$student_account_button.setForeground(text_color);

		
		//Text Color of Application Credit
		$anzan_label.setForeground(text_color);
		$zahid_label.setForeground(text_color);
		$saif_label.setForeground(text_color);
		$mamun_label.setForeground(text_color);
		$application_label.setForeground(text_color);
		
		//Text Color Of Labels
		main_door_uiu_label.setForeground(text_color);
		student_info_label.setForeground(text_color);;
		ARCHITECTURE_uiu_label.setForeground(text_color);
		$student_support_label.setForeground(text_color);
		$office_label.setForeground(text_color);
		
		//Text And Background Color of All Home
		all_home_button.setForeground(text_color);
		all_home_button.setBackground(button_color);
		
		//Text  Color of Facilities Button
		si_facilities_label.setForeground(text_color);
		lab_button.setForeground(text_color);
		studyroom_button.setForeground(text_color);
		library_button.setForeground(text_color);
		canteen_button.setForeground(text_color);
		student_parking_button.setForeground(text_color);
		wifi_button.setForeground(text_color);
		curricullum_activities_button.setForeground(text_color);
		commonroom_button.setForeground(text_color);
		gym_button.setForeground(text_color);
		
					
		
//--------------------------------------------------------------------------------------------------------
		
		//Background Colors of Main door Buttons
		main_door_home.setBackground(button_color);
		main_door_about.setBackground(button_color);
		main_door_search.setBackground(button_color);
		main_door_architecture.setBackground(button_color);
		main_door_faculty.setBackground(button_color);
		main_door_student_info.setBackground(button_color);
		main_door_student_support.setBackground(button_color);
		main_door_online_info.setBackground(button_color);
		main_door_office.setBackground(button_color);
		main_door_software_map.setBackground(button_color);
		main_door_app_credit.setBackground(button_color);
		main_door_exit.setBackground(button_color);
			
		//Background Colors of ARCHITECTURE Buttons
		CAMPUS_1.setBackground(button_color);
		CAMPUS_2.setBackground(button_color);
		CAMPUS_4.setBackground(button_color);
		ARCHITECTURE_1.setBackground(button_color);
		IMAGE_1.setBackground(button_color);
		ARCHITECTURE_2.setBackground(button_color);
		IMAGE_2.setBackground(button_color);
		ARCHITECTURE_4.setBackground(button_color);
		IMAGE_4.setBackground(button_color);
		
		
		//Background Colors of Faculty Buttons
		
		//Background Color of Student Info Buttons
		courses_button.setBackground(button_color);
		facilities_button.setBackground(button_color);
		credits_system_button.setBackground(button_color);
		gpa_simulator_button.setBackground(button_color);
		waiver_button.setBackground(button_color);
		office_employment_button.setBackground(button_color);
		payment_button.setBackground(button_color);
		
		//Background Color of Facilities Button
		lab_button.setBackground(button_color);
		studyroom_button.setBackground(button_color);
		library_button.setBackground(button_color);
		canteen_button.setBackground(button_color);
		student_parking_button.setBackground(button_color);
		wifi_button.setBackground(button_color);
		curricullum_activities_button.setBackground(button_color);
		commonroom_button.setBackground(button_color);
		gym_button.setBackground(button_color);
		
		//Background Colors of Student Support Buttons
		$cisco_button.setBackground(button_color);
		$ieb_button.setBackground(button_color);
		$eras_button.setBackground(button_color);
		
		//Background Color of Office Buttons
		$admission_button.setBackground(button_color);
		$register_button.setBackground(button_color);
		$cits_button.setBackground(button_color);
		$student_affairs_button.setBackground(button_color);
		$student_account_button.setBackground(button_color);
		
//--------------------------------------------------------------------------------------------------------		
		
		
		//Setting Background Image Picture
		try
		{
			main_door.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Menu.jpg")))));
		}
		catch(IOException e) {}
		
		//Adding Main door Buttons to Main door Frame
		main_door.add(main_door_uiu_label);
		main_door.add(main_door_home);
		main_door.add(main_door_about);
		main_door.add(main_door_search_tf);
		main_door.add(main_door_architecture);
		main_door.add(main_door_faculty);
		main_door.add(main_door_student_info);
		main_door.add(main_door_student_support);
		main_door.add(main_door_office);
		main_door.add(main_door_online_info);
		main_door.add(main_door_software_map);
		main_door.add(main_door_app_credit);
		main_door.add(main_door_search);
		main_door.add(main_door_exit);
		
		
		main_door.setVisible(true);	
			
	}
	
	
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getActionCommand().equals("HOME"))
		{
			if(ARCHITECTURE_frame.isVisible()==true)
			{
				ARCHITECTURE_frame.setVisible(false);
				main_door.setVisible(true);
			}
		
			else if(student_info_frame.isVisible()==true)
			{
				student_info_frame.setVisible(false);
				main_door.setVisible(true);
			}
			
			else if($student_support_frame.isVisible()==true)
			{
				$student_support_frame.setVisible(false);
				main_door.setVisible(true);
			}
			
			else if($online_info_frame.isVisible()==true)
			{
				$online_info_frame.setVisible(false);
				main_door.setVisible(true);
			}
			
			else if(software_map_frame.isVisible()==true)
			{
				software_map_frame.setVisible(false);
				main_door.setVisible(true);
			}
			
			else if($application_credit_frame.isVisible()==true)
			{
				$application_credit_frame.setVisible(false);
				main_door.setVisible(true);
			}
			
			
			else if($office_frame.isVisible()==true)
			{
				$office_frame.setVisible(false);
				main_door.setVisible(true);
			}
		}
		
		else if(e.getActionCommand().equals("Home"))
		{
			if(si_facilities_frame.isVisible()==true)
			{
				si_facilities_frame.setVisible(false);
				main_door.setVisible(true);
			}
		}
		
		//Architecture------------------------------------------------------------------------------------
		
		if(e.getActionCommand().equals("ARCHITECTURE"))
		{
			ARCHITECTURE_frame.addWindowListener(this);
			ARCHITECTURE_frame.setSize(1280,1024);
			ARCHITECTURE_frame.setResizable(false);
			ARCHITECTURE_frame.setLayout(null);
			ARCHITECTURE_frame.setVisible(true);
			
			try
			{
				ARCHITECTURE_frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Architecture.jpg")))));
				
			}
			catch(IOException ioe) {}
			
			ARCHITECTURE_frame.add(all_home_button);
			ARCHITECTURE_frame.add(ARCHITECTURE_uiu_label);
			ARCHITECTURE_frame.add(CAMPUS_1);
			ARCHITECTURE_frame.add(CAMPUS_2);
			ARCHITECTURE_frame.add(CAMPUS_4);
			ARCHITECTURE_frame.add(ARCHITECTURE_1);
			ARCHITECTURE_frame.add(IMAGE_1);
			ARCHITECTURE_frame.add(ARCHITECTURE_2);
			ARCHITECTURE_frame.add(IMAGE_2);
			ARCHITECTURE_frame.add(ARCHITECTURE_4);
			ARCHITECTURE_frame.add(IMAGE_4);
			
			if(main_door.isVisible()==true)
			{
				main_door.setVisible(true);
				ARCHITECTURE_frame.setVisible(true);
			}
		}
		
		else if(e.getActionCommand().equals("ARCHITECTURE C1"))
		{
			ARCHITECTURE_CAMPUS1_frame.addWindowListener(this);
			ARCHITECTURE_CAMPUS1_frame.setSize(1280,1024);
			ARCHITECTURE_CAMPUS1_frame.setResizable(false);
			ARCHITECTURE_CAMPUS1_frame.setVisible(true);
			
			JButton ARCHITECTURE_STRUCTURE_CAMPUS1_1,ARCHITECTURE_STRUCTURE_CAMPUS1_2,ARCHITECTURE_STRUCTURE_CAMPUS1_3,ARCHITECTURE_STRUCTURE_CAMPUS1_4,ARCHITECTURE_STRUCTURE_CAMPUS1_5;
			ARCHITECTURE_STRUCTURE_CAMPUS1_1 = new JButton("");
			ARCHITECTURE_STRUCTURE_CAMPUS1_2 = new JButton("");
			ARCHITECTURE_STRUCTURE_CAMPUS1_3 = new JButton("");
			ARCHITECTURE_STRUCTURE_CAMPUS1_4 = new JButton("");
			ARCHITECTURE_STRUCTURE_CAMPUS1_5 = new JButton("");
			ARCHITECTURE_STRUCTURE_CAMPUS1_1.setBounds(30, 180, 633,374);
			ARCHITECTURE_STRUCTURE_CAMPUS1_2.setBounds(693, 180, 633,374);
			ARCHITECTURE_STRUCTURE_CAMPUS1_3.setBounds(30, 670, 633,374);
			ARCHITECTURE_STRUCTURE_CAMPUS1_4.setBounds(693, 670, 633,374);
			ARCHITECTURE_STRUCTURE_CAMPUS1_5.setBounds(30, 1160, 633,374);
			
			JLabel archi_uiu_label;
			archi_uiu_label = new JLabel("UNITED INTERNATIONAL UNVERSITY ARCHITECUTRE");
			archi_uiu_label.setFont(new Font("Castellar",Font.BOLD,30));
			archi_uiu_label.setBounds(180,20,1050,35);
			Color  text_color = Color.ORANGE;
			archi_uiu_label.setForeground(text_color);
			
			
			JLabel level1,level2,level3,level4,level5;
			level1=new JLabel("UPPER BASEMENT");
			level1.setFont(new Font("Ariel",Font.BOLD,30));
			level1.setBounds(220, 130, 450,25);
			level2=new JLabel("GROUND FLOOR");
			level2.setFont(new Font("Ariel",Font.BOLD,30));
			level2.setBounds(880, 130, 450,25);
			level3=new JLabel("FLOOR 1");
			level3.setFont(new Font("Ariel",Font.BOLD,30));
			level3.setBounds(260, 590, 450,25);
			level4=new JLabel("FLOOR 2");
			level4.setFont(new Font("Ariel",Font.BOLD,30));
			level4.setBounds(940, 590, 450,25);
			level5=new JLabel("FLOOR 4");
			level5.setFont(new Font("Ariel",Font.BOLD,30));
			level5.setBounds(260, 1080, 450,25);
			level1.setForeground(text_color);
			level2.setForeground(text_color);
			level3.setForeground(text_color);
			level4.setForeground(text_color);
			level5.setForeground(text_color);
			
			ARCHITECTURE_STRUCTURE_CAMPUS1_1.setIcon(new ImageIcon("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\1.1.jpg"));
			ARCHITECTURE_STRUCTURE_CAMPUS1_2.setIcon(new ImageIcon("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\1.2.jpg"));
			ARCHITECTURE_STRUCTURE_CAMPUS1_3.setIcon(new ImageIcon("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\1.3.jpg"));
			ARCHITECTURE_STRUCTURE_CAMPUS1_4.setIcon(new ImageIcon("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\1.4.jpg"));
			ARCHITECTURE_STRUCTURE_CAMPUS1_5.setIcon(new ImageIcon("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\1.5.jpg"));
			ARCHITECTURE_STRUCTURE_CAMPUS1_1.setBorderPainted(false);
			ARCHITECTURE_STRUCTURE_CAMPUS1_1.setBackground(Color.WHITE);
			ARCHITECTURE_STRUCTURE_CAMPUS1_2.setBorderPainted(false);
			ARCHITECTURE_STRUCTURE_CAMPUS1_2.setBackground(Color.WHITE);
			ARCHITECTURE_STRUCTURE_CAMPUS1_3.setBorderPainted(false);
			ARCHITECTURE_STRUCTURE_CAMPUS1_3.setBackground(Color.WHITE);
			ARCHITECTURE_STRUCTURE_CAMPUS1_4.setBorderPainted(false);
			ARCHITECTURE_STRUCTURE_CAMPUS1_4.setBackground(Color.WHITE);
			ARCHITECTURE_STRUCTURE_CAMPUS1_5.setBorderPainted(false);
			ARCHITECTURE_STRUCTURE_CAMPUS1_5.setBackground(Color.WHITE);
			
			text_reader = new JTextArea();
			text_reader.setBackground(Color.BLACK);
	
			try
			{
				text_reader.read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\Hello.txt"),null);
			}
			catch(IOException ioe)	{}
			
			text_reader.add(archi_uiu_label);
			text_reader.add(ARCHITECTURE_STRUCTURE_CAMPUS1_1);
			text_reader.add(ARCHITECTURE_STRUCTURE_CAMPUS1_2);
			text_reader.add(ARCHITECTURE_STRUCTURE_CAMPUS1_3);
			text_reader.add(ARCHITECTURE_STRUCTURE_CAMPUS1_4);
			text_reader.add(ARCHITECTURE_STRUCTURE_CAMPUS1_5);
			text_reader.add(level1);
			text_reader.add(level2);
			text_reader.add(level3);
			text_reader.add(level4);
			text_reader.add(level5);
					
			JScrollPane scroll = new JScrollPane(text_reader,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		      
			ARCHITECTURE_CAMPUS1_frame.add(scroll);
		}
		
		else if(e.getActionCommand().equals("ARCHITECTURE C2"))
		{
			ARCHITECTURE_CAMPUS2_frame.addWindowListener(this);
			ARCHITECTURE_CAMPUS2_frame.setSize(1280,1024);
			ARCHITECTURE_CAMPUS2_frame.setResizable(false);
			ARCHITECTURE_CAMPUS2_frame.setVisible(true);
			
			JButton ARCHITECTURE_STRUCTURE_CAMPUS2_1,ARCHITECTURE_STRUCTURE_CAMPUS2_2,ARCHITECTURE_STRUCTURE_CAMPUS2_3,ARCHITECTURE_STRUCTURE_CAMPUS2_4,ARCHITECTURE_STRUCTURE_CAMPUS2_5;
			ARCHITECTURE_STRUCTURE_CAMPUS2_1 = new JButton("");
			ARCHITECTURE_STRUCTURE_CAMPUS2_2 = new JButton("");
			ARCHITECTURE_STRUCTURE_CAMPUS2_3 = new JButton("");
			ARCHITECTURE_STRUCTURE_CAMPUS2_4 = new JButton("");
			ARCHITECTURE_STRUCTURE_CAMPUS2_5 = new JButton("");
			ARCHITECTURE_STRUCTURE_CAMPUS2_1.setBounds(10, 180, 633,374);
			ARCHITECTURE_STRUCTURE_CAMPUS2_2.setBounds(693, 180, 633,374);
			ARCHITECTURE_STRUCTURE_CAMPUS2_3.setBounds(10, 670, 633,374);
			ARCHITECTURE_STRUCTURE_CAMPUS2_4.setBounds(693, 670, 633,374);
			ARCHITECTURE_STRUCTURE_CAMPUS2_5.setBounds(10, 1160, 633,374);

			JLabel archi_uiu_label;
			archi_uiu_label = new JLabel("United International University Architechture");
			archi_uiu_label.setFont(new Font("Castellar",Font.BOLD,30));
			archi_uiu_label.setBounds(220, 20, 1050,35);
			Color  text_color = Color.ORANGE;
			archi_uiu_label.setForeground(text_color);
			
			JLabel level1,level2,level3,level4,level5;
			level1=new JLabel("FLOOR 1");
			level1.setFont(new Font("Ariel",Font.BOLD,30));
			level1.setBounds(260, 130, 450,25);
			level2=new JLabel("FLOOR 2");
			level2.setFont(new Font("Ariel",Font.BOLD,30));
			level2.setBounds(940, 130, 450,25);
			level3=new JLabel("FLOOR 3");
			level3.setFont(new Font("Ariel",Font.BOLD,30));
			level3.setBounds(260, 590, 450,25);
			level4=new JLabel("FLOOR 4");
			level4.setFont(new Font("Ariel",Font.BOLD,30));
			level4.setBounds(940, 590, 450,25);
			level5=new JLabel("FLOOR 5");
			level5.setFont(new Font("Ariel",Font.BOLD,30));
			level5.setBounds(260, 1080, 450,25);
			level1.setForeground(text_color);
			level2.setForeground(text_color);
			level3.setForeground(text_color);
			level4.setForeground(text_color);
			level5.setForeground(text_color);
			
			ARCHITECTURE_STRUCTURE_CAMPUS2_1.setIcon(new ImageIcon("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\2.1.jpg"));
			ARCHITECTURE_STRUCTURE_CAMPUS2_2.setIcon(new ImageIcon("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\2.2.jpg"));
			ARCHITECTURE_STRUCTURE_CAMPUS2_3.setIcon(new ImageIcon("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\2.3.jpg"));
			ARCHITECTURE_STRUCTURE_CAMPUS2_4.setIcon(new ImageIcon("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\2.4.jpg"));
			ARCHITECTURE_STRUCTURE_CAMPUS2_5.setIcon(new ImageIcon("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\2.5.jpg"));
			ARCHITECTURE_STRUCTURE_CAMPUS2_1.setBorderPainted(false);
			ARCHITECTURE_STRUCTURE_CAMPUS2_1.setBackground(Color.WHITE);
			ARCHITECTURE_STRUCTURE_CAMPUS2_2.setBorderPainted(false);
			ARCHITECTURE_STRUCTURE_CAMPUS2_2.setBackground(Color.WHITE);
			ARCHITECTURE_STRUCTURE_CAMPUS2_3.setBorderPainted(false);
			ARCHITECTURE_STRUCTURE_CAMPUS2_3.setBackground(Color.WHITE);
			ARCHITECTURE_STRUCTURE_CAMPUS2_4.setBorderPainted(false);
			ARCHITECTURE_STRUCTURE_CAMPUS2_4.setBackground(Color.WHITE);
			ARCHITECTURE_STRUCTURE_CAMPUS2_5.setBorderPainted(false);
			ARCHITECTURE_STRUCTURE_CAMPUS2_5.setBackground(Color.WHITE);

			text_reader = new JTextArea();
			text_reader.setBackground(Color.BLACK);
	
			try
			{
				text_reader.read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\Hello.txt"),null);
			}
			catch(IOException ioe) {}
			
			text_reader.add(ARCHITECTURE_STRUCTURE_CAMPUS2_1);
			text_reader.add(ARCHITECTURE_STRUCTURE_CAMPUS2_2);
			text_reader.add(ARCHITECTURE_STRUCTURE_CAMPUS2_3);
			text_reader.add(ARCHITECTURE_STRUCTURE_CAMPUS2_4);
			text_reader.add(ARCHITECTURE_STRUCTURE_CAMPUS2_5);
			text_reader.add(archi_uiu_label);
			text_reader.add(level1);
			text_reader.add(level2);
			text_reader.add(level3);
			text_reader.add(level4);
			text_reader.add(level5);
			
			JScrollPane scroll = new JScrollPane(text_reader,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		    ARCHITECTURE_CAMPUS2_frame.add(scroll);
			
		}
		
		else if(e.getActionCommand().equals("ARCHITECTURE C4"))
		{
			ARCHITECTURE_CAMPUS4_frame.addWindowListener(this);
			ARCHITECTURE_CAMPUS4_frame.setSize(1280,1024);
			ARCHITECTURE_CAMPUS4_frame.setResizable(false);
			ARCHITECTURE_CAMPUS4_frame.setVisible(true);
			
			JButton ARCHITECTURE_STRUCTURE_CAMPUS4_1,ARCHITECTURE_STRUCTURE_CAMPUS4_2,ARCHITECTURE_STRUCTURE_CAMPUS4_3,ARCHITECTURE_STRUCTURE_CAMPUS4_4,ARCHITECTURE_STRUCTURE_CAMPUS4_5;
			ARCHITECTURE_STRUCTURE_CAMPUS4_1 = new JButton("");
			ARCHITECTURE_STRUCTURE_CAMPUS4_2 = new JButton("");
			ARCHITECTURE_STRUCTURE_CAMPUS4_3 = new JButton("");
			ARCHITECTURE_STRUCTURE_CAMPUS4_4 = new JButton("");
			ARCHITECTURE_STRUCTURE_CAMPUS4_5 = new JButton("");
			ARCHITECTURE_STRUCTURE_CAMPUS4_1.setBounds(10, 180, 633,374);
			ARCHITECTURE_STRUCTURE_CAMPUS4_2.setBounds(693, 180, 633,374);
			ARCHITECTURE_STRUCTURE_CAMPUS4_3.setBounds(10, 650, 633,374);
			ARCHITECTURE_STRUCTURE_CAMPUS4_4.setBounds(693, 650, 633,374);
			ARCHITECTURE_STRUCTURE_CAMPUS4_5.setBounds(10, 1160, 633,374);
			
			JLabel archi_uiu_label;
			archi_uiu_label = new JLabel("United International University Architechture");
			archi_uiu_label.setFont(new Font("Castellar",Font.BOLD,30));
			archi_uiu_label.setBounds(220, 20, 1050,35);
			
			Color  text_color = Color.ORANGE;
			archi_uiu_label.setForeground(text_color);
			JLabel level1,level2,level3,level4,level5;
			level1=new JLabel("GROUND FLOOR");
			level1.setFont(new Font("Ariel",Font.BOLD,30));
			level1.setBounds(220, 130, 450,25);
			level2=new JLabel("LIBRARY");
			level2.setFont(new Font("Ariel",Font.BOLD,30));
			level2.setBounds(940, 130, 450,25);
			level3=new JLabel("FLOOR 3");
			level3.setFont(new Font("Ariel",Font.BOLD,30));
			level3.setBounds(260, 590, 450,25);
			level4=new JLabel("FLOOR 4");
			level4.setFont(new Font("Ariel",Font.BOLD,30));
			level4.setBounds(940, 590, 450,25);
			level5=new JLabel("FLOOR 5");
			level5.setFont(new Font("Ariel",Font.BOLD,30));
			level5.setBounds(260, 1080, 450,25);
			level1.setForeground(text_color);
			level2.setForeground(text_color);
			level3.setForeground(text_color);
			level4.setForeground(text_color);
			level5.setForeground(text_color);
			
			ARCHITECTURE_STRUCTURE_CAMPUS4_1.setIcon(new ImageIcon("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\4.1.jpg"));
			ARCHITECTURE_STRUCTURE_CAMPUS4_2.setIcon(new ImageIcon("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\4.2.jpg"));
			ARCHITECTURE_STRUCTURE_CAMPUS4_3.setIcon(new ImageIcon("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\4.3.jpg"));
			ARCHITECTURE_STRUCTURE_CAMPUS4_4.setIcon(new ImageIcon("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\4.4.jpg"));
			ARCHITECTURE_STRUCTURE_CAMPUS4_5.setIcon(new ImageIcon("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\4.5.jpg"));
			ARCHITECTURE_STRUCTURE_CAMPUS4_1.setBorderPainted(false);
			ARCHITECTURE_STRUCTURE_CAMPUS4_1.setBackground(Color.WHITE);
			ARCHITECTURE_STRUCTURE_CAMPUS4_2.setBorderPainted(false);
			ARCHITECTURE_STRUCTURE_CAMPUS4_2.setBackground(Color.WHITE);
			ARCHITECTURE_STRUCTURE_CAMPUS4_3.setBorderPainted(false);
			ARCHITECTURE_STRUCTURE_CAMPUS4_3.setBackground(Color.WHITE);
			ARCHITECTURE_STRUCTURE_CAMPUS4_4.setBorderPainted(false);
			ARCHITECTURE_STRUCTURE_CAMPUS4_4.setBackground(Color.WHITE);
			ARCHITECTURE_STRUCTURE_CAMPUS4_5.setBorderPainted(false);
			ARCHITECTURE_STRUCTURE_CAMPUS4_5.setBackground(Color.WHITE);

			text_reader = new JTextArea();
			text_reader.setBackground(Color.BLACK);
	
			try
			{
				text_reader.read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\Hello.txt"),null);
			}
			catch(IOException ioe) {}
			
			text_reader.add(ARCHITECTURE_STRUCTURE_CAMPUS4_1);
			text_reader.add(ARCHITECTURE_STRUCTURE_CAMPUS4_2);
			text_reader.add(ARCHITECTURE_STRUCTURE_CAMPUS4_3);
			text_reader.add(ARCHITECTURE_STRUCTURE_CAMPUS4_4);
			text_reader.add(ARCHITECTURE_STRUCTURE_CAMPUS4_5);
			text_reader.add(archi_uiu_label);
			text_reader.add(level1);
			text_reader.add(level2);
			text_reader.add(level3);
			text_reader.add(level4);
			text_reader.add(level5);

			JScrollPane scroll = new JScrollPane(text_reader,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		      
			ARCHITECTURE_CAMPUS4_frame.add(scroll);
			
		}
		
		
		else if(e.getActionCommand().equals("IMAGE C1"))
		{
			ARCHITECTURE_CAMPUS1_PIC_frame.addWindowListener(this);
			ARCHITECTURE_CAMPUS1_PIC_frame.setSize(1280,1024);
			ARCHITECTURE_CAMPUS1_PIC_frame.setResizable(false);
			ARCHITECTURE_CAMPUS1_PIC_frame.setVisible(true);
			
			JButton[] pic1 = new JButton[20];
			
			text_reader = new JTextArea(); 
			text_reader.setBackground(Color.BLACK);

	       
	        try
		    {
	        	text_reader.read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\Hello.txt"),null);		
		    }
		    catch(IOException ioe) {}
	        
	        for(int i=0; i<20; i++)
			{
	        	pic1[i]	= new JButton();
	        	pic1[i].setBackground(Color.BLACK);
				pic1[i].setBorderPainted(false);
				
			}
	        
	        int height	= 180;
	        int width	= 10;
	        for(int i=0; i<4; i++)
			{
	        	pic1[i].setBounds(width,height,315,180);
	        	width	= width+330;
	        }
	        
	        height	= height+200;
	        width	= 10;
	        for(int i=4; i<8; i++)
			{
	        	pic1[i].setBounds(width,height,315,180);
	        	width	= width+330;
	        }
	        
	        height	= height+200;
	        width	= 10;
	        for(int i=8; i<12; i++)
			{
	        	pic1[i].setBounds(width,height,315,180);
	        	width	= width+330;
	        }
	        
	        height	= height+200;
	        width	= 10;
	        for(int i=12; i<16; i++)
			{
	        	pic1[i].setBounds(width,height,315,180);
	        	width	= width+330;
	        }
	        
	        height	= height+200;
	        width	= 10;
	        for(int i=16; i<20; i++)
			{
	        	pic1[i].setBounds(width,height,315,180);
	        	width	= width+330;
	        }
	        
	        try
		    {
	        	pic1[0].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 1\\1.jpg"))));
	        	pic1[1].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 1\\2.jpg"))));
	        	pic1[2].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 1\\3.jpg"))));
	        	pic1[3].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 1\\4.jpg"))));
	        	pic1[4].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 1\\5.jpg"))));
	        	pic1[5].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 1\\6.jpg"))));
	        	pic1[6].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 1\\7.jpg"))));
	        	pic1[7].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 1\\8.jpg"))));
	        	pic1[8].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 1\\9.jpg"))));
	        	pic1[9].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 1\\10.jpg"))));
	        	pic1[10].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 1\\11.jpg"))));
	        	pic1[11].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 1\\12.jpg"))));
	        	pic1[12].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 1\\13.jpg"))));
	        	pic1[13].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 1\\14.jpg"))));
	        	pic1[14].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 1\\15.jpg"))));
	        	pic1[15].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 1\\16.jpg"))));
	        	pic1[16].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 1\\17.jpg"))));
	        	pic1[17].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 1\\18.jpg"))));
	        	pic1[18].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 1\\19.jpg"))));
	        	pic1[19].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 1\\20.jpg"))));
	        	
		    }
		    catch(IOException ioe) {}
	        
	        for(int j=0;j<20;j++)
	        {
	        	text_reader.add(pic1[j]);
        	}
	        
	        JLabel archi_uiu_label_pic;
	        archi_uiu_label_pic = new JLabel("United International University");
			archi_uiu_label_pic.setFont(new Font("Castellar",Font.BOLD,40));
			archi_uiu_label_pic.setBounds(220, 20, 1050,35);
			Color  text_color = Color.ORANGE;
			archi_uiu_label_pic.setForeground(text_color);
			text_reader.add(archi_uiu_label_pic);
			
            JScrollPane scroll = new JScrollPane(text_reader,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			text_reader.setEditable(false);
			ARCHITECTURE_CAMPUS1_PIC_frame.add(scroll);
		}
		
		else if(e.getActionCommand().equals("IMAGE C2"))
		{
			ARCHITECTURE_CAMPUS2_PIC_frame.addWindowListener(this);
			ARCHITECTURE_CAMPUS2_PIC_frame.setSize(1280,1024);
			ARCHITECTURE_CAMPUS2_PIC_frame.setResizable(false);
			ARCHITECTURE_CAMPUS2_PIC_frame.setVisible(true);
			
			JButton[] pic	= new JButton[20];
			text_reader 	= new JTextArea(); 
			text_reader.setBackground(Color.BLACK);

	        try
		    {
	        	text_reader.read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\Hello.txt"),null);		
		    }
		    catch(IOException ioe) {}
	        
	        for(int i=0; i<20; i++)
			{
	        	pic[i] = new JButton();
	        	pic[i].setBackground(Color.BLACK);
				pic[i].setBorderPainted(false);	
			}
	        
	        int height	= 180;
	        int width	= 10;
	        for(int i=0; i<4; i++)
			{
	        	pic[i].setBounds(width,height,315,180);
	        	width = width+330;
	        }
	        
	        height	= height+200;
	        width	= 10;
	        for(int i=4; i<8; i++)
			{
	        	pic[i].setBounds(width,height,315,180);
	        	width = width+330;
	        }
	        
	        height	= height+200;
	        width	= 10;
	        for(int i=8; i<12; i++)
			{
	        	pic[i].setBounds(width,height,315,180);
	        	width = width+330;
	        }
	        
	        height	= height+200;
	        width	= 10;
	        for(int i=12; i<16; i++)
			{
	        	pic[i].setBounds(width,height,315,180);
	        	width = width+330;
	        }
	        
	        height  = height+200;
	        width	= 10;
	        for(int i=16; i<20; i++)
			{
	        	pic[i].setBounds(width,height,315,180);
	        	width = width+330;
			}
	        
	        try
		    {
	        	pic[0].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 2\\1.jpg"))));
	        	pic[1].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 2\\2.jpg"))));
	        	pic[2].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 2\\3.jpg"))));
	        	pic[3].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 2\\4.jpg"))));
	        	pic[4].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 2\\5.jpg"))));
	        	pic[5].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 2\\6.jpg"))));
	        	pic[6].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 2\\7.jpg"))));
	        	pic[7].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 2\\8.jpg"))));
	        	pic[8].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 2\\9.jpg"))));
	        	pic[9].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 2\\10.jpg"))));
	        	pic[10].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 2\\11.jpg"))));
	        	pic[11].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 2\\12.jpg"))));
	        	pic[12].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 2\\13.jpg"))));
	        	pic[13].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 2\\14.jpg"))));
	        	pic[14].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 2\\15.jpg"))));
	        	pic[15].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 2\\16.jpg"))));
	        	pic[16].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 2\\17.jpg"))));
	        	pic[17].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 2\\18.jpg"))));
	        	pic[18].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 2\\19.jpg"))));
	        	pic[19].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 2\\20.jpg"))));
	        	
		    }
		    catch(IOException ioe) {}
	        
	        for(int j=0;j<20;j++)
	        {
	        	text_reader.add(pic[j]);
        	}
	        
	        JLabel archi_uiu_label_pic;
	        archi_uiu_label_pic = new JLabel("United International University");
			archi_uiu_label_pic.setFont(new Font("Castellar",Font.BOLD,40));
			archi_uiu_label_pic.setBounds(220, 20, 1050,35);
			Color  text_color = Color.ORANGE;
			archi_uiu_label_pic.setForeground(text_color);
			text_reader.add(archi_uiu_label_pic);
			
            JScrollPane scroll = new JScrollPane(text_reader,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			text_reader.setEditable(false);
			ARCHITECTURE_CAMPUS2_PIC_frame.add(scroll);
		}
		
		else if(e.getActionCommand().equals("IMAGE C4"))
		{
			ARCHITECTURE_CAMPUS4_PIC_frame.addWindowListener(this);
			ARCHITECTURE_CAMPUS4_PIC_frame.setSize(1280,1024);
			ARCHITECTURE_CAMPUS4_PIC_frame.setResizable(false);
			ARCHITECTURE_CAMPUS4_PIC_frame.setVisible(true);
			
			JButton[] pic4	= new JButton[20];
			text_reader 	= new JTextArea(); 
			text_reader.setBackground(Color.BLACK);

	       
	        try
		    {
	        	text_reader.read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\Hello.txt"),null);		
		    }
		    catch(IOException ioe) {}
	        
	        for(int i=0; i<20; i++)
			{
	        	pic4[i] = new JButton();
	        	pic4[i].setBackground(Color.BLACK);
				pic4[i].setBorderPainted(false);
			}
	        
	        int height	= 180;
	        int width	= 10;
	        for(int i=0; i<4; i++)
			{
	        	pic4[i].setBounds(width,height,315,180);
	        	width = width+330;
	        }
	        
	        height 	= height+200;
	        width	= 10;
	        for(int i=4; i<8; i++)
			{
	        	pic4[i].setBounds(width,height,315,180);
	        	width = width+330;
	        }
	        
	        height	= height+200;
	        width	= 10;
	        for(int i=8; i<12; i++)
			{
	        	pic4[i].setBounds(width,height,315,180);
	        	width=width+330;
	        }
	        
	        height	= height+200;
	        width	= 10;
	        for(int i=12; i<16; i++)
			{
	        	pic4[i].setBounds(width,height,315,180);
	        	width=width+330;
	        }
	        
	        height	= height+200;
	        width	= 10;
	        for(int i=16; i<20; i++)
			{
	        	pic4[i].setBounds(width,height,315,180);
	        	width = width+330;
	        }
	        
	        try
		    {
	        	pic4[0].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 4\\1.jpg"))));
	        	pic4[1].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 4\\2.jpg"))));
	        	pic4[2].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 4\\3.jpg"))));
	        	pic4[3].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 4\\4.jpg"))));
	        	pic4[4].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 4\\5.jpg"))));
	        	pic4[5].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 4\\6.jpg"))));
	        	pic4[6].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 4\\7.jpg"))));
	        	pic4[7].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 4\\8.jpg"))));
	        	pic4[8].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 4\\9.jpg"))));
	        	pic4[9].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 4\\10.jpg"))));
	        	pic4[10].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 4\\11.jpg"))));
	        	pic4[11].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 4\\12.jpg"))));
	        	pic4[12].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 4\\13.jpg"))));
	        	pic4[13].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 4\\14.jpg"))));
	        	pic4[14].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 4\\15.jpg"))));
	        	pic4[15].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 4\\16.jpg"))));
	        	pic4[16].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 4\\17.jpg"))));
	        	pic4[17].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 4\\18.jpg"))));
	        	pic4[18].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 4\\19.jpg"))));
	        	pic4[19].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\ARCHITECTURE\\campus 4\\20.jpg"))));
	        	
		    }
		    catch(IOException ioe) {}
	        for(int j=0;j<20;j++)
	        {
	        	text_reader.add(pic4[j]);
        	}
	        
	        JLabel archi_uiu_label_pic;
	        archi_uiu_label_pic = new JLabel("United International University");
			archi_uiu_label_pic.setFont(new Font("Castellar",Font.BOLD,40));
			archi_uiu_label_pic.setBounds(220, 20, 1050,35);
			Color  text_color = Color.ORANGE;
			archi_uiu_label_pic.setForeground(text_color);
			text_reader.add(archi_uiu_label_pic);
			
            JScrollPane scroll = new JScrollPane(text_reader,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			text_reader.setEditable(false);
			ARCHITECTURE_CAMPUS4_PIC_frame.add(scroll);
		}
		
		
		//Faculty-----------------------------------------------------------------------------------------
		
		else if(e.getActionCommand().equals("FACULTY"))
		{
			main_door.setVisible(true);
			faculty_frame.addWindowListener(this);
	        faculty_frame.setSize(1280,1024);
	        faculty_frame.setResizable(false);
	          
			JButton[] pics= new JButton[28];
			JTextArea[] info = new JTextArea[28];
			
			text_reader = new JTextArea();
			text_reader.setBackground(Color.BLACK);
			
	        try
		    {
	        	text_reader.read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Empty.txt"),null);		
		    }
		    catch(IOException ioe) {}
	        
	        for(int i=0; i<28; i++)
			{
	        	pics[i] = new JButton();
	        	info[i] = new JTextArea();
				pics[i].setBackground(Color.BLACK);
				pics[i].setBorderPainted(false);
				info[i].setBackground(Color.LIGHT_GRAY);
			}
			
			for(int i=0; i<28; i++)
			{
				text_reader.add(pics[i]);
				text_reader.add(info[i]);
			}
			
			JLabel faculty_pic = new JLabel("PHOTO");
			JLabel faculty_info= new JLabel("FACULTY INFO");
			JLabel topic= new JLabel("UNITED INTERNATIONAL UNIVERSITY FACULTY");
			
			topic.setFont(new Font("Ariel",Font.BOLD,45));
			faculty_pic.setFont(new Font("Ariel",Font.BOLD,25));
			faculty_info.setFont(new Font("Ariel",Font.BOLD,25));
	    	
			text_reader.add(topic);
			text_reader.add(faculty_pic);
			text_reader.add(faculty_info);
			
			topic.setBounds(250,-250,800,600);
			topic.setFont(new Font("Ariel",Font.BOLD,35));

			faculty_pic.setBounds(330,110,150,150);
			faculty_info.setBounds(700,135,300,100);
			
			topic.setForeground(Color.ORANGE);
			faculty_pic.setForeground(Color.ORANGE);
			faculty_info.setForeground(Color.ORANGE);
			
			int height = 250;
			
			for(int i=0; i<28; i++)
			{
				info[i].setBounds(700,height,300,100);
				
				pics[i].setBounds(300,height,150,150);
				
				height = height + 175;
				
				info[i].setFont(new Font("Ariel",Font.BOLD,15));
				info[i].setEditable(false);
			}
			
			try 
			{
				pics[0].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Abu Shafin.jpg"))));
				pics[1].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Benzir.jpg"))));
				pics[2].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Chowdhury mofizur rahman.jpg"))));
				pics[3].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Hasan Sarwar.jpg"))));
				pics[4].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Imtiaz Ahmad.jpg"))));
				pics[5].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Kamrul hasan.jpg"))));
				pics[6].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Khairul Mottakin.jpg"))));
				pics[7].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Khandokar nayem.jpg"))));
				pics[8].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Khondokar Mamun.jpg"))));
				pics[9].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Mahbuba Afrin.jpg"))));
				pics[10].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Mahmudur Rahman rana.jpg"))));
				pics[11].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Maitraye das.jpg"))));
				pics[12].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Mamun Elahi.jpg"))));
				pics[13].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Md. Ridwan Parvez.jpg"))));
				pics[14].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Md.nasim.jpg"))));
				pics[15].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Mofiul Islam.jpg"))));
				pics[16].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Nasif.jpg"))));
				pics[17].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Nurul Huda.jpg"))));
				pics[18].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Redowan Mahmud.jpg"))));
				pics[19].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Salekul Islam.jpg"))));
				pics[20].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Samia Kabir.jpg"))));
				pics[21].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Samrose.jpg"))));
				pics[22].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Sanjay Saha.jpg"))));
				pics[23].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Suman Ahmmed.jpg"))));
				pics[24].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Swakkhor Shatabda.jpg"))));
				pics[25].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Tanjina Helaly.jpg"))));
				pics[26].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Tasnim.jpg"))));
				pics[27].setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Zarin Tasnim Sworna.jpg"))));
			} 

			catch (IOException ioe) {}
			
			try
		    {
				info[0].read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Abu Shafin.txt"),null);
				info[1].read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Benzir.txt"),null);
				info[2].read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Chowdhury mofizur rahman.txt"),null);
				info[3].read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Hasan Sarwar.txt"),null);
				info[4].read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Imtiaz Ahmad.txt"),null);
				info[5].read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Kamrul hasan.txt"),null);
				info[6].read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Khairul Mottakin.txt"),null);
				info[7].read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Khandokar Nayem.txt"),null);
				info[8].read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Khondokar Mamun.txt"),null);
				info[9].read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Mahbuba Afrin.txt"),null);
		    	info[10].read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Mahmudur Rahman Rana.txt"),null);
		    	info[11].read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Maitraye das.txt"),null);
		    	info[12].read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Mamun Elahi.txt"),null);
		    	info[13].read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Md. Ridwan Parvez.txt"),null);
		    	info[14].read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Md.Nasim.txt"),null);
		    	info[15].read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Mofiul Islam.txt"),null);
		    	info[16].read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Nasif.txt"),null);
		    	info[17].read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Nurul Huda.txt"),null);
		    	info[18].read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Redowan Mahmud.txt"),null);
		    	info[19].read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Salekul Islam.txt"),null);
		    	info[20].read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Samia Kabir.txt"),null);
		    	info[21].read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Samrose.txt"),null);
		    	info[22].read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Sanjay Saha.txt"),null);
		    	info[23].read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Suman Ahmmed.txt"),null);
		    	info[24].read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Swakkhor Shatabda.txt"),null);
		    	info[25].read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Tanjina Helaly.txt"),null);
		    	info[26].read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Tasnim.txt"),null);
		    	info[27].read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\faculty\\Zarin Tasnim Sworna.txt"),null);
		    }
		    catch(IOException ioe) {}
			
			JScrollPane scroll = new JScrollPane(text_reader,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			
			text_reader.setEditable(false);
			
			faculty_frame.add(scroll);
			faculty_frame.setVisible(true);
			
			if(main_door.isVisible()==true)
			{
				main_door.setVisible(true);
				faculty_frame.setVisible(true);
			}
			
			
		}
		
		//Student Info------------------------------------------------------------------------------------
		
		else if(e.getActionCommand().equals("STUDENT INFO"))
		{
			student_info_frame.addWindowListener(this);
			student_info_frame.setSize(1280,1024);
			student_info_frame.setResizable(false);
			student_info_frame.setLayout(null);
			student_info_frame.setVisible(true);
			
			try
			{
				student_info_frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Menu.jpg")))));
			}
			catch(IOException ioe){}
			
			student_info_frame.add(all_home_button);
			student_info_frame.add(student_info_label);
			student_info_frame.add(courses_button);
			student_info_frame.add(facilities_button);
			student_info_frame.add(credits_system_button);
			student_info_frame.add(gpa_simulator_button);
			student_info_frame.add(waiver_button);
			student_info_frame.add(office_employment_button);
			student_info_frame.add(payment_button);
			
			if(main_door.isVisible()==true)
			{
				main_door.setVisible(true);
				student_info_frame.setVisible(true);
			}
		}
		else if(e.getActionCommand().equals("COURSES"))
		{
			JPanel panel = new JPanel();

	       	si_courses_frame.addWindowListener(this);
	       	si_courses_frame.setSize(1280,1024);
	       	si_courses_frame.setResizable(false);
			
	       	text_reader = new JTextArea();
	       	text_reader.setFont(new Font("Ariel",Font.BOLD,15));
	       	
			try
		    {
				text_reader.read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Student Info\\Courses.txt"),null);
		    }
		    catch(IOException ioe){
		    	
		    }
			
			panel.setBackground(Color.BLACK);
			panel.add(text_reader);
			JScrollPane scroll = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			
			
			text_reader.setEditable(false);
			text_reader.setBackground(Color.WHITE);
			si_courses_frame.add(scroll);
			si_courses_frame.setVisible(true);

 
		}
		if(e.getActionCommand().equals("FACILITIES"))
		{
			main_door.setVisible(true);
			si_facilities_frame.addWindowListener(this);
			si_facilities_frame.setSize(1280,1024);
			si_facilities_frame.setResizable(false);
			si_facilities_frame.setLayout(null);
			si_facilities_frame.setVisible(true);
			
			try
			{
				si_facilities_frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Menu.jpg")))));
			}
			catch(IOException ioe){}
			
			
			// FACILITIES FRAME BUTTONS		
			
			Color  text_color 	= Color.YELLOW;
			Color  button_color	= Color.getHSBColor((float) 0.1,(float) 0.1,(float) 0.1);
		
			temporary_home.setFont(new Font("Ariel",Font.BOLD,15));
			temporary_home.setBounds(30,20,85,30);
			temporary_home.setForeground(text_color);
			temporary_home.setBackground(button_color);
			
			si_facilities_frame.add(si_facilities_label);
			si_facilities_frame.add(temporary_home);
			si_facilities_frame.add(lab_button);
			si_facilities_frame.add(studyroom_button);
			si_facilities_frame.add(library_button);
			si_facilities_frame.add(canteen_button);
			si_facilities_frame.add(student_parking_button);
			si_facilities_frame.add(wifi_button);
			si_facilities_frame.add(curricullum_activities_button);
			si_facilities_frame.add(gym_button);
			si_facilities_frame.add(commonroom_button);
			
			if(student_info_frame.isVisible()==true)
			{
				student_info_frame.setVisible(true);
				si_facilities_frame.setVisible(true);
			}
		}
		
		else if(e.getActionCommand().equals("LAB"))
		{
			JPanel panel = new JPanel(); 
			
			text_reader = new JTextArea();
			text_reader.setFont(new Font("Ariel",Font.BOLD,15));	
			labs_frame.addWindowListener(this);
			labs_frame.setSize(1280,1024);
			labs_frame.setResizable(false);
			
			try
			{
				text_reader.read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Student Info\\Facilities\\Lab.txt"),null);
			}
			catch(IOException ioe) {}
			
			panel.setBackground(Color.BLACK);
			panel.add(text_reader);
			
			JScrollPane scroll = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			text_reader.setEditable(false);
			labs_frame.add(scroll);
			labs_frame.setVisible(true);
		}
		else if(e.getActionCommand().equals("STUDY ROOM"))
		{
			JPanel panel = new JPanel(); 
			
			text_reader = new JTextArea();
			text_reader.setFont(new Font("Ariel",Font.BOLD,15));	
			studyroom_frame.addWindowListener(this);
			studyroom_frame.setSize(1280,1024);
			studyroom_frame.setResizable(false);
			
			try
			{
				text_reader.read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Student Info\\Facilities\\Study Room.txt"),null);
			}
			catch(IOException ioe) {}
			
			panel.setBackground(Color.BLACK);
			panel.add(text_reader);
			
			JScrollPane scroll = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			text_reader.setEditable(false);
			studyroom_frame.add(scroll);
			studyroom_frame.setVisible(true);
		}
		else if(e.getActionCommand().equals("LIBRARY"))
		{
			JPanel panel = new JPanel(); 
			
			text_reader = new JTextArea();
			text_reader.setFont(new Font("Ariel",Font.BOLD,15));	
			library_frame.addWindowListener(this);
			library_frame.setSize(1280,1024);
			library_frame.setResizable(false);
			
			try
			{
				text_reader.read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Student Info\\Facilities\\Library.txt"),null);
			}
			catch(IOException ioe) {}
			
			panel.setBackground(Color.BLACK);
			panel.add(text_reader);
			
			JScrollPane scroll = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			text_reader.setEditable(false);
			library_frame.add(scroll);
			library_frame.setVisible(true);
		}
		else if(e.getActionCommand().equals("CANTEEN"))
		{
			JPanel panel = new JPanel(); 
			
			text_reader = new JTextArea();
			text_reader.setFont(new Font("Ariel",Font.BOLD,15));	
			canteen_frame.addWindowListener(this);
			canteen_frame.setSize(1280,1024);
			canteen_frame.setResizable(false);
			canteen_frame.setBackground(Color.BLACK);
			
			try
			{
				canteen_frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Student Info\\Facilities\\Canteen.jpg")))));
				
			}
			catch(IOException ioe) {}
			
			panel.setBackground(Color.BLACK);
			panel.add(text_reader);
			
			JScrollPane scroll = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			text_reader.setEditable(false);
			canteen_frame.add(scroll);
			canteen_frame.setVisible(true);
		}
		else if(e.getActionCommand().equals("ADVISING"))
		{
			JPanel panel = new JPanel(); 
			
			text_reader = new JTextArea();
			text_reader.setFont(new Font("Ariel",Font.BOLD,15));	
			student_parking_frame.addWindowListener(this);
			student_parking_frame.setSize(1280,1024);
			student_parking_frame.setResizable(false);
			
			try
			{
				text_reader.read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Student Info\\Facilities\\Advising.txt"),null);
			}
			catch(IOException ioe) {}
			
			panel.setBackground(Color.BLACK);
			panel.add(text_reader);
			
			JScrollPane scroll = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			text_reader.setEditable(false);
			student_parking_frame.add(scroll);
			student_parking_frame.setVisible(true);
		}
		else if(e.getActionCommand().equals("WIFI"))
		{
			JPanel panel = new JPanel(); 
			
			text_reader = new JTextArea();
			text_reader.setFont(new Font("Ariel",Font.BOLD,15));	
			wifi_frame.addWindowListener(this);
			wifi_frame.setSize(1280,1024);
			wifi_frame.setResizable(false);
			
			try
			{
				text_reader.read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Student Info\\Facilities\\Wifi.txt"),null);
			}
			catch(IOException ioe) {}
			
			panel.setBackground(Color.BLACK);
			panel.add(text_reader);
			
			JScrollPane scroll = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			text_reader.setEditable(false);
			wifi_frame.add(scroll);
			wifi_frame.setVisible(true);
		}
		else if(e.getActionCommand().equals("CURRICULLUM ACTIVITIES"))
		{
			JPanel panel = new JPanel(); 
			
			text_reader = new JTextArea();
			text_reader.setFont(new Font("Ariel",Font.BOLD,15));	
			curricullum_activities_frame.addWindowListener(this);
			curricullum_activities_frame.setSize(1280,1024);
			curricullum_activities_frame.setResizable(false);
			
			try
			{
				text_reader.read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Student Info\\Facilities\\Curricullum Activities.txt"),null);
			}
			catch(IOException ioe) {}
			
			panel.setBackground(Color.BLACK);
			panel.add(text_reader);
			
			JScrollPane scroll = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			text_reader.setEditable(false);
			curricullum_activities_frame.add(scroll);
			curricullum_activities_frame.setVisible(true);
		}
		else if(e.getActionCommand().equals("GYM"))
		{
			JPanel panel = new JPanel(); 
			
			text_reader = new JTextArea();
			text_reader.setFont(new Font("Ariel",Font.BOLD,15));	
			gym_frame.addWindowListener(this);
			gym_frame.setSize(1280,1024);
			gym_frame.setResizable(false);
			
			try
			{
				text_reader.read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Student Info\\Facilities\\Gym.txt"),null);
			}
			catch(IOException ioe) {}
			
			panel.setBackground(Color.BLACK);
			panel.add(text_reader);
			
			JScrollPane scroll = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			text_reader.setEditable(false);
			gym_frame.add(scroll);
			gym_frame.setVisible(true);
		}
		else if(e.getActionCommand().equals("COMMON ROOM"))
		{
			JPanel panel = new JPanel(); 
			
			text_reader = new JTextArea();
			text_reader.setFont(new Font("Ariel",Font.BOLD,15));	
			commonroom_frame.addWindowListener(this);
			commonroom_frame.setSize(1280,1024);
			commonroom_frame.setResizable(false);
			
			try
			{
				text_reader.read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Student Info\\Facilities\\Common Room.txt"),null);
			}
			catch(IOException ioe) {}
			
			panel.setBackground(Color.BLACK);
			panel.add(text_reader);
			
			JScrollPane scroll = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			text_reader.setEditable(false);
			commonroom_frame.add(scroll);
			commonroom_frame.setVisible(true);
		}
		else if(e.getActionCommand().equals("CREDIT SYSTEM"))
		{
			JPanel panel = new JPanel(); 
			
			text_reader = new JTextArea();
			text_reader.setFont(new Font("Ariel",Font.BOLD,15));	
			si_credits_system_frame.addWindowListener(this);
			si_credits_system_frame.setSize(1280,1024);
			si_credits_system_frame.setResizable(false);
			
			try
			{
				text_reader.read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Student Info\\Credits System.txt"),null);
			}
			catch(IOException ioe) {}
			
			panel.setBackground(Color.BLACK);
			panel.add(text_reader);
			
			JScrollPane scroll = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			text_reader.setEditable(false);
			si_credits_system_frame.add(scroll);
			si_credits_system_frame.setVisible(true);
			
		}
		else if(e.getActionCommand().equals("GPA SIMULATOR"))
		{
			main_door.setVisible(true);
			
			si_gpa_simulator_frame.addWindowListener(this);
			si_gpa_simulator_frame.setSize(1280,1024);
			si_gpa_simulator_frame.setResizable(false);
			si_gpa_simulator_frame.setLayout(null);
			
			Color text_color = Color.ORANGE;
			Color button_color = Color.getHSBColor((float) 0.1,(float) 0.1,(float) 0.1);
			
			try
			{
				si_gpa_simulator_frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Menu.jpg")))));		
			}
			catch(IOException ioe) {}

			gpa_simulator_label.setFont(new Font("CASTELLAR",Font.BOLD,25));
			gpa_simulator_label.setForeground(text_color);
			gpa_simulator_label.setBounds(530,20,450,25);
			
			JLabel number_of_subjects_l = new JLabel("Enter Number of Subjects");
			number_of_subjects_l.setFont(new Font("CASTELLAR",Font.BOLD,14));
			number_of_subjects_l.setForeground(text_color);
			number_of_subjects_l.setBounds(152,400,250,30);
			number_of_subjects_tf.setBounds(175,440,200,30);
			
			JLabel gpa_of_subjects_l = new JLabel("Enter GPA of Subjects");
			gpa_of_subjects_l.setFont(new Font("CASTELLAR",Font.BOLD,14));
			gpa_of_subjects_l.setForeground(text_color);
			gpa_of_subjects_l.setBounds(170,500,250,30);
			gpa_of_subjects_ta.setBounds(175,540,200,30);
			
			next_button.setFont(new Font("Ariel",Font.BOLD,14));
			next_button.setForeground(text_color);
			next_button.setBackground(button_color);
			next_button.setBounds(395,540,100,30);
			next_button.addActionListener(this);
			
			JLabel number_of_labs_l = new JLabel("Enter Number of Labs");
			number_of_labs_l.setFont(new Font("CASTELLAR",Font.BOLD,14));
			number_of_labs_l.setForeground(text_color);
			number_of_labs_l.setBounds(970,400,250,30);
			number_of_labs_tf.setBounds(975,440,200,30);
			
			JLabel gpa_of_labs_l = new JLabel("Enter GPA of Labs");
			gpa_of_labs_l.setFont(new Font("CASTELLAR",Font.BOLD,14));
			gpa_of_labs_l.setForeground(text_color);
			gpa_of_labs_l.setBounds(985,500,250,30);
			gpa_of_labs_ta.setBounds(970,540,200,30);
			
			next1_button.setFont(new Font("Ariel",Font.BOLD,14));
			next1_button.setForeground(text_color);
			next1_button.setBackground(button_color);
			next1_button.setBounds(1190,540,100,30);
			next1_button.addActionListener(this);
			
			JLabel result_l = new JLabel("Result");
			result_l.setFont(new Font("CASTELLAR",Font.BOLD,14));
			result_l.setForeground(text_color);
			result_l.setBounds(620,220,250,30);
			result_tf.setBounds(555,252,200,30);
			
			finalize_button.setFont(new Font("Ariel",Font.BOLD,14));
			finalize_button.setForeground(text_color);
			finalize_button.setBackground(button_color);
			finalize_button.setBounds(620,480,100,30);
			finalize_button.addActionListener(this);
			
			reset_button.setFont(new Font("Ariel",Font.BOLD,14));
			reset_button.setForeground(text_color);
			reset_button.setBackground(button_color);
			reset_button.setBounds(620,630,100,30);
			reset_button.addActionListener(this);
			
			si_gpa_simulator_frame.add(number_of_subjects_l);
			si_gpa_simulator_frame.add(number_of_subjects_tf);
			si_gpa_simulator_frame.add(number_of_labs_l);
			si_gpa_simulator_frame.add(number_of_labs_tf);
			si_gpa_simulator_frame.add(gpa_simulator_label);
			si_gpa_simulator_frame.add(gpa_of_subjects_l);
			si_gpa_simulator_frame.add(gpa_of_subjects_ta);
			si_gpa_simulator_frame.add(gpa_of_labs_l);
			si_gpa_simulator_frame.add(gpa_of_labs_ta);
			si_gpa_simulator_frame.add(next_button);
			si_gpa_simulator_frame.add(next1_button);
			si_gpa_simulator_frame.add(finalize_button);
			si_gpa_simulator_frame.add(result_l);
			si_gpa_simulator_frame.add(result_tf);
			si_gpa_simulator_frame.add(reset_button);
			si_gpa_simulator_frame.setVisible(true);
			
			if(student_info_frame.isVisible()==true)
			{
				student_info_frame.setVisible(true);
				si_gpa_simulator_frame.setVisible(true);
			}
			
		}
		else if(e.getSource()==next_button)
		{
			String h=number_of_subjects_tf.getText();
			String c=gpa_of_subjects_ta.getText();
			a1= Integer.parseInt(h);
			a2= Integer.parseInt(c);
			Road_2_UIU  a = new Road_2_UIU ();
			if(p == 0)
			{
				i=a1;
			}
			if(i == a1)
			{
				p++;
				a.value(a1);
			    gpa_of_subjects_ta.setText(null);
			   	subject[a1-i]=a2;
			    result_sub=result_sub+(subject[a1-i]*3);
            }
			
			else if(i != a1 && i>0)
			{
				subject[a1-i]=a2;
		    	result_sub=result_sub+(subject[a1-i]*3);
		    	gpa_of_subjects_ta.setText(null);
			}
			
			i--;
		}
		else if(e.getSource()==next1_button)
		{
			String h=number_of_labs_tf.getText();
			String c=gpa_of_labs_ta.getText();
			a3= Integer.parseInt(h);
			a4= Integer.parseInt(c);
			Road_2_UIU  b = new Road_2_UIU ();
			if(q == 0)
			{
				j=a3;
			}
			if(j == a3)
			{
				q++;
				b.value(a3);
				gpa_of_labs_ta.setText(null);
			   	subject[a3-i]=a4;
			    result_sub=result_sub+(subject[a3-i]*1);
            }
			
			else if(j != a3 && j>0)
			{
				subject[a3-i]=a4;
		    	result_sub=result_sub+(subject[a3-i]*1);
		    	gpa_of_labs_ta.setText(null);
			}
			
			j--;
		}
		else if(e.getActionCommand().equals("FINALIZE"))
		{
			result_final = (result_sub+result_lab)/((a1*3)+(a3*1));
			result_tf.setText(""+result_final);
		}
		else if(e.getActionCommand().equals("RESET"))
		{
			 gpa_of_subjects_ta.setText(null);
			 number_of_subjects_tf.setText(null);
			 gpa_of_labs_ta.setText(null);
			 number_of_labs_tf.setText(null);
			 result_tf.setText(null);
			 
			 for(int k=0;k<30;k++)
			 {
				 subject[k]=0;
			 }
			 for(int g=0;g<30;g++)
			 {
				 lab[g]=0;
			 }
			
			result_sub=0.00;
			result_lab=0.00;
			a1=0;
			a2=0;
			a3=0;
			a4=0;
			i=0;
			j=0;
			p=0;
			q=0;
		}
		
		
		
		else if(e.getActionCommand().equals("WAIVER"))
		{
			JPanel panel = new JPanel(); 
			
			text_reader = new JTextArea();
			text_reader.setFont(new Font("Ariel",Font.BOLD,15));
			
			si_waiver_frame.addWindowListener(this);
			si_waiver_frame.setSize(1280,1024);
			si_waiver_frame.setResizable(false);
			
			try
			{
				text_reader.read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Student Info\\Waiver.txt"),null);
			}
			catch(IOException ioe) {}
			
			panel.setBackground(Color.BLACK);
			panel.add(text_reader);
			
			JScrollPane scroll = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			
			text_reader.setEditable(false);
			si_waiver_frame.add(scroll);
			si_waiver_frame.setVisible(true);
			
		}
		
		else if(e.getActionCommand().equals("OFFICE EMPLOYMENT"))
		{
			JPanel panel = new JPanel(); 
			
			text_reader = new JTextArea();
			text_reader.setFont(new Font("Ariel",Font.BOLD,15));
			
			si_office_emp_frame.addWindowListener(this);
			si_office_emp_frame.setSize(1280,1024);
			si_office_emp_frame.setResizable(false);
			
			try
			{
				text_reader.read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Student Info\\Office Employment.txt"),null);
			}
			catch(IOException ioe) {}
			
			panel.setBackground(Color.BLACK);
			panel.add(text_reader);
			
			JScrollPane scroll = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			
			text_reader.setEditable(false);
			si_office_emp_frame.add(scroll);
			si_office_emp_frame.setVisible(true);
		}
		
		else if(e.getActionCommand().equals("PAYMENT SYSTEM"))
		{
			JPanel panel = new JPanel(); 
			
			text_reader = new JTextArea();
			text_reader.setFont(new Font("Ariel",Font.BOLD,15));
			
			si_payment_frame.addWindowListener(this);
			si_payment_frame.setSize(1280,1024);
			si_payment_frame.setResizable(false);
			
			try
			{
				text_reader.read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Student Info\\Payment System.txt"),null);
			}
			catch(IOException ioe) {}
			
			panel.setBackground(Color.BLACK);
			panel.add(text_reader);
			
			JScrollPane scroll = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			
			text_reader.setEditable(false);
			si_payment_frame.add(scroll);
			si_payment_frame.setVisible(true);
		}
		
		//Student Support---------------------------------------------------------------------------------
		
		else if(e.getActionCommand().equals("STUDENT SUPPORT"))
		{	
			$student_support_frame.addWindowListener(this);
			$student_support_frame.setSize(1280,1024);
			$student_support_frame.setResizable(false);
			$student_support_frame.setLayout(null);
			$student_support_frame.setVisible(true);
			
			try
			{
				$student_support_frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Menu.jpg")))));
			}
			catch(IOException ioe) {}
			
			$student_support_frame.add($student_support_label);
			$student_support_frame.add(all_home_button);
			$student_support_frame.add($cisco_button);
			$student_support_frame.add($ieb_button);
			$student_support_frame.add($eras_button);
			
			if(main_door.isVisible()==true)
			{
				main_door.setVisible(true);
				$student_support_frame.setVisible(true);
			}
		}
		
		else if(e.getActionCommand().equals("CISCO & CCNA"))
		{
			JPanel panel = new JPanel(); 
			
			$cisco_frame = new JFrame("CISCO & CCNA");
			text_reader = new JTextArea();
			text_reader.setFont(new Font("Ariel",Font.BOLD,15));
			$cisco_frame.addWindowListener(this);
			$cisco_frame.setSize(1280,1024);
			$cisco_frame.setResizable(false);
			
			try
			{
				text_reader.read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Student Support\\Cisco.txt"),null);
			}
			catch(IOException ioe) {}

			panel.setBackground(Color.BLACK);
			panel.add(text_reader);
			
			JScrollPane scroll = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			text_reader.setEditable(false);
			$cisco_frame.add(scroll);
			$cisco_frame.setVisible(true);
		}
		else if(e.getActionCommand().equals("IEB"))
		{
			JPanel panel = new JPanel(); 
			
			$ieb_frame = new JFrame("IEB");
			text_reader = new JTextArea();
			text_reader.setFont(new Font("Ariel",Font.BOLD,15));
			$ieb_frame.addWindowListener(this);
			$ieb_frame.setSize(1280,1024);
			$ieb_frame.setResizable(false);
			
			try
			{
				text_reader.read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Student Support\\Ieb.txt"),null);
			}
			catch(IOException ioe) {}

			panel.setBackground(Color.BLACK);
			panel.add(text_reader);
			
			JScrollPane scroll = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			text_reader.setEditable(false);
			$ieb_frame.add(scroll);
			$ieb_frame.setVisible(true);
		}
		else if(e.getActionCommand().equals("ERASMUS MUNDUS"))
		{
			JPanel panel = new JPanel(); 
			
			$eras_frame = new JFrame("ERASMUS MUNDUS");
			text_reader = new JTextArea();
			text_reader.setFont(new Font("Ariel",Font.BOLD,15));
			$eras_frame.addWindowListener(this);
			$eras_frame.setSize(1280,1024);
			$eras_frame.setResizable(false);
			
			try
			{
				text_reader.read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Student Support\\Urusmus Mundus.txt"),null);
			}
			catch(IOException ioe) {}

			panel.setBackground(Color.BLACK);
			panel.add(text_reader);
			
			JScrollPane scroll = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			text_reader.setEditable(false);
			$eras_frame.add(scroll);
			$eras_frame.setVisible(true);
		}
		
		//Office------------------------------------------------------------------------------------------
		else if(e.getActionCommand().equals("OFFICE"))
		{
			$office_frame.addWindowListener(this);
			$office_frame.setSize(1280,1024);
			$office_frame.setResizable(false);
			$office_frame.setLayout(null);
			$office_frame.setVisible(true);
			
			try
			{
				$office_frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Menu.jpg")))));
			}
			catch(IOException ioe) {}
			
			$office_frame.add($office_label);
			$office_frame.add(all_home_button);
			$office_frame.add($admission_button);
			$office_frame.add($register_button);
			$office_frame.add($cits_button);
			$office_frame.add($student_affairs_button);
			$office_frame.add($student_account_button);
			
			if(main_door.isVisible()==true)
			{
				main_door.setVisible(true);
				$office_frame.setVisible(true);
			}
			
		}
		else if(e.getActionCommand().equals("ADMISSION OFFICE"))
		{
			JPanel panel = new JPanel(); 
			
			//$admission_frame = new JFrame("ADMISSION OFFICE");
			text_reader = new JTextArea();
			text_reader.setFont(new Font("Ariel",Font.BOLD,15));
			$admission_frame.addWindowListener(this);
			$admission_frame.setSize(1280,1024);
			$admission_frame.setResizable(false);
			
			try
			{
				text_reader.read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Office\\Admisson Office.txt"),null);
			}
			catch(IOException ioe) {}

			panel.setBackground(Color.BLACK);
			panel.add(text_reader);
			
			JScrollPane scroll = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			text_reader.setEditable(false);
			$admission_frame.add(scroll);
			$admission_frame.setVisible(true);
		}
			
		else if(e.getActionCommand().equals("REGISTER OFFICE"))
		{
			JPanel panel = new JPanel();
			
			JTextArea text_reader = new JTextArea();
			text_reader.setFont(new Font("Ariel",Font.BOLD,15));
			
			$register_frame.addWindowListener(this);
			$register_frame.setSize(1280,1024);
			$register_frame.setResizable(false);
			
			try
			{
				text_reader.read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Office\\Registar Office.txt"),null);
			}
			catch(IOException ioe) {}
			
			text_reader.setEditable(false);
			panel.setBackground(Color.BLACK);
			panel.add(text_reader);
			JScrollPane scroll = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			$register_frame.add(scroll);
			$register_frame.setVisible(true);
		}
		else if(e.getActionCommand().equals("CITS OFFICE"))
		{
			JPanel panel = new JPanel();
			
			JTextArea text_reader = new JTextArea();
			text_reader.setFont(new Font("Ariel",Font.BOLD,15));
			
			$cits_frame.addWindowListener(this);
			$cits_frame.setSize(1280,1024);
			$cits_frame.setResizable(false);
			
			try
			{
				text_reader.read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Office\\CITS Office.txt"),null);
			}
			catch(IOException ioe) {}
			
			panel.setBackground(Color.BLACK);
			text_reader.setEditable(false);
			panel.add(text_reader);
			JScrollPane scroll = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			$cits_frame.add(scroll);
			$cits_frame.setVisible(true);
			
		}
		else if(e.getActionCommand().equals("STUDENT AFFAIRS"))
		{
			JPanel panel = new JPanel();
			
			JTextArea text_reader = new JTextArea();
			text_reader.setFont(new Font("Ariel",Font.BOLD,15));
			
			$student_affairs_frame.addWindowListener(this);
			$student_affairs_frame.setSize(1280,1024);
			$student_affairs_frame.setResizable(false);
			
			try
			{
				text_reader.read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Office\\Student Affairs.txt"),null);
			}
			catch(IOException ioe) {}
			
			panel.setBackground(Color.BLACK);
			text_reader.setEditable(false);
			panel.add(text_reader);
			JScrollPane scroll = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			$student_affairs_frame.add(scroll);
			$student_affairs_frame.setVisible(true);
		}
		else if(e.getActionCommand().equals("STUDENT ACCOUNT"))
		{
			JPanel panel = new JPanel();
			
			JTextArea text_reader = new JTextArea();
			text_reader.setFont(new Font("Ariel",Font.BOLD,15));
		
			$student_accout_frame.addWindowListener(this);
			$student_accout_frame.setSize(1280,1024);
			$student_accout_frame.setResizable(false);

			try
			{	
				text_reader.read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Office\\Student Account.txt"),null);
			}
			catch(IOException ioe) {}
			
			text_reader.setEditable(false);
			panel.setBackground(Color.BLACK);
			panel.add(text_reader);
			JScrollPane scroll = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			
			
			
			$student_accout_frame.add(scroll);
			$student_accout_frame.setVisible(true);
		}

		
		//Online Info-------------------------------------------------------------------------------------
		
		else if(e.getActionCommand().equals("ONLINE INFO"))
		{
			$online_info_frame.addWindowListener(this);
			$online_info_frame.setSize(1280,1024);
			$online_info_frame.setResizable(false);
			
			JPanel panel = new JPanel(); 
			text_reader = new JTextArea();
			text_reader.setFont(new Font("Ariel",Font.BOLD,15));
			
			try
		    {
				text_reader.read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Online Info\\Online Info.txt"),null);
		    }
		    catch(IOException ioe)	{}
			
			panel.setBackground(Color.BLACK);
			panel.add(text_reader);
			
			JScrollPane scroll = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			text_reader.setEditable(false);
			$online_info_frame.add(scroll);
			$online_info_frame.setVisible(true);
		
			
		}
		
		//Application Credit-------------------------------------------------------------------------------
		else if(e.getActionCommand().equals("APPLICATION CREDITS"))
		{
			$application_credit_frame.addWindowListener(this);
			$application_credit_frame.setSize(1280,1024);
			$application_credit_frame.setResizable(false);
			$application_credit_frame.setLayout(null);
			$application_credit_frame.setVisible(true);
			
			Image img=new ImageIcon(this.getClass().getResource("\\1.png")).getImage();
			$anzan_label1.setIcon(new ImageIcon(img));
			Image img1=new ImageIcon(this.getClass().getResource("\\2.png")).getImage();
			$zahid_label1.setIcon(new ImageIcon(img1));
			Image img2=new ImageIcon(this.getClass().getResource("\\3.png")).getImage();
			$saif_label1.setIcon(new ImageIcon(img2));
			Image img3=new ImageIcon(this.getClass().getResource("\\4.png")).getImage();
			$mamun_label1.setIcon(new ImageIcon(img3));
			
			try
			{
				$application_credit_frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Menu.jpg")))));
			}
			catch(IOException ioe) {}
			
			$application_credit_frame.add(all_home_button);
			$application_credit_frame.add($application_label);
			$application_credit_frame.add($anzan_label);
			$application_credit_frame.add($zahid_label);
			$application_credit_frame.add($saif_label);
			$application_credit_frame.add($mamun_label);
			$application_credit_frame.add($anzan_label1);
			$application_credit_frame.add($zahid_label1);
			$application_credit_frame.add($saif_label1);
			$application_credit_frame.add($mamun_label1);
			
			
			if(main_door.isVisible()==true)
			{
				main_door.setVisible(true);
				$application_credit_frame.setVisible(true);
			}
		
		}
		
		//Search------------------------------------------------------------------------------------------
		
		else if(e.getActionCommand().equals("SEARCH"))
		{
			
			String search_text = main_door_search_tf.getText();
			search_text= search_text.toUpperCase();
			
			if(search_text.equals("ARCHITECTURE")||search_text.equals("ARCHITECTURE C1")||search_text.equals("ARCHITECTURE C2")||
			   search_text.equals("ARCHITECTURE C4")||search_text.equals("IMAGE C1")||search_text.equals("IMAGE C2")||
			   search_text.equals("IMAGE C4")||search_text.equals("ARCHITECTURE C1")||search_text.equals("STUDENT SUPPORT")||
			   search_text.equals("IEB")||search_text.equals("CISCO & CCNA")||search_text.equals("ERASMUS MUNDUS")||
			   search_text.equals("OFFICE")||search_text.equals("ADMISSION OFFICE")||search_text.equals("REGISTER OFFICE")||
			   search_text.equals("CITS OFFICE")||search_text.equals("STUDENT ACCOUNT")||search_text.equals("STUDENT AFFAIRS")||
			   search_text.equals("FACULTY")||search_text.equals("ONLINE INFO")||search_text.equals("STUDENT INFO")||
			   search_text.equals("FACILITIES")||search_text.equals("COURSES")||search_text.equals("CREDIT SYSTEM")||
			   search_text.equals("GPA SIMULATOR")||search_text.equals("WAIVER")||search_text.equals("OFFICE EMPLOYMENT")||
			   search_text.equals("PAYMENT SYSTEM")||search_text.equals("LAB")||search_text.equals("STUDY ROOM")||
			   search_text.equals("LIBRARY")||search_text.equals("CANTEEN")||search_text.equals("COMMON ROOM")||
			   search_text.equals("WIFI")||search_text.equals("CURRICULLUM ACTIVITIES")||search_text.equals("GYM")||
			   search_text.equals("ADVISING")||search_text.equals("APPLICATION CREDITS")||search_text.equals("SOFTWARE MAP")||
			   search_text.equals("ABOUT")||search_text.equals("EXIT")
			  )
			{
				main_door_search_tf.setText(null);
				
				JFrame search_frame=new JFrame("SEARCH");
				search_frame.setSize(1280,1024);
				search_frame.setResizable(false);
				search_frame.setLayout(null);
				search_frame.setVisible(true);
				
				try
				{
					search_frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Menu.jpg")))));
				}
				catch(IOException ioee) {}
					
				
				JButton search_button = new JButton(search_text);
				Color  text_color = Color.ORANGE;
				Color  button_color = Color.getHSBColor((float) 0.1,(float) 0.1,(float) 0.1);
				search_button.setForeground(text_color);
				search_button.setBackground(button_color);
				search_button.setFont(new Font("Ariel",Font.BOLD,15));
				search_button.setBounds(565,340,210,30);
				search_button.addActionListener(this);
				search_text = null;
				search_frame.add(search_button);
			
			}
			else if(search_text.equals(""))
			{
				main_door_search_tf.setText("TYPE SOMETHING TO SEARCH ");
				
				main_door_search_tf.addMouseListener(new MouseAdapter()
				{
		        
		            public void mouseClicked(MouseEvent e)
		            {
		            	main_door_search_tf.setText("");
		            }
				}
				);
			}
			else
			{
				main_door_search_tf.setText("NOTHING FOUND");
				
				main_door_search_tf.addMouseListener(new MouseAdapter()
				{
		        
		            public void mouseClicked(MouseEvent e)
		            {
		            	main_door_search_tf.setText("");
		            }
				}
				);
			}
		}
		
		//Software Map
		else if(e.getActionCommand().equals("SOFTWARE MAP"))
		{
			software_map_frame.addWindowListener(this);  
			software_map_frame.setSize(1280,1024);
			software_map_frame.setResizable(false);
			software_map_frame.setLayout(null);
			software_map_frame.setBackground(Color.BLACK);
			
			try
			{
				software_map_frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\MAP.jpg")))));		
				
			}
			catch(IOException ioe) {}
			
			
			Color  text_color = Color.ORANGE;
			Color  button_color = Color.getHSBColor((float) 0.1,(float) 0.1,(float) 0.1);
			
			software_map_tf.setBounds(1180,20,150,30);
			software_map_search_button.setFont(new Font("Ariel",Font.BOLD,15));
			software_map_search_button.setBounds(1230,60,100,30);
			software_map_search_button.setForeground(text_color);
			software_map_search_button.setBackground(button_color);
			
			software_map_frame.add(software_map_tf);
			software_map_frame.add(software_map_search_button);
			software_map_frame.add(all_home_button);			
			
			if(main_door.isVisible()==true)
			{
				main_door.setVisible(true);
				software_map_frame.setVisible(true);
			}
			
		}
		else if(e.getActionCommand().equals("Search"))
		{
			software_map_frame.addWindowListener(this);
			software_map_frame.setSize(1280,1024);
			
			software_map_frame.setVisible(true);
			software_map_frame.setBackground(Color.BLACK);
			
			String 	search	=	software_map_tf.getText();
					search	= 	search.toUpperCase();
					
			Color  text_color = Color.ORANGE;
			Color  button_color = Color.getHSBColor((float) 0.1,(float) 0.1,(float) 0.1);
			software_map_search_button.setForeground(text_color);
			software_map_search_button.setBackground(button_color);
			
			JButton image = new JButton();
			image.setBorderPainted(false);
			image.setBackground(Color.BLACK);
			image.setBounds(185,0,990,748);
			
			if(!search.equals(""))
			{
				if(search.equals("ADMISSION")||search.equals("ADMISSION OFFICE"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\admission.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("ARCHITECTURE"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\architecture.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}

				else if((search.equals("ATM CARD"))||(search.equals("ATM"))||(search.equals("CARD")))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\atm card.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("CANTEEN"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\canteen.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("CISCO & CCNA")||search.equals("CISCO")||search.equals("CCNA")||search.equals("CISCO AND CCNA")||search.equals("CISCO & CCNA"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\cisco _ ccna.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("CITS")||search.equals("CITS OFFICE"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\cits.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("CLUBS"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\clubs.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("COMMON ROOM")||search.equals("COMMON")||search.equals("ROOM"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\common room.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("COURSE")||search.equals("COURSES"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\COURSES.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				
				else if(search.equals("CREDIT SYSTEM")||search.equals("CREDIT"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\CREDIT SYSTEM.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("DAILY UIU")||search.equals("DAILY"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\COURSES.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("DBBL BANK")||search.equals("DBBL"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\dbbl bank.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("ELMS"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\elms.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("EMS"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\ems.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("ERASMUS MUNDUS")||search.equals("ERASMUS")||search.equals("MUNDUS"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\erasmus mundus.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("FACILITIES"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\facilities.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("FACULTY"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\faculty.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("ALL FB GROUPS")||search.equals("ALL FB PAGES")||search.equals("FB GROUPS")||search.equals("FB PAGES")||search.equals("PAGES")||search.equals("GROUPS"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\faculty.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("GPA SIMULATOR")||search.equals("GPA")||search.equals("SIMULATOR"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\GPA SIMULATOR.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("GRADER"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\grader.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("IEB"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\ieb.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("INTERNSHIP")||search.equals("INTERN"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\internship.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("LABS")||search.equals("LAB"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\labs.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("LIBRARY"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\library.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				
				else if(search.equals("MAX CREDIT")||search.equals("MIN CREDIT")||search.equals("MIN")||search.equals("MAX"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\max_min credit.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("MUTUAL TRUST BANK")||search.equals("MUTUAL TRUST")||search.equals("TRUST BANK")||search.equals("MUTUAL  BANK")||search.equals("MUTUAL")||search.equals("TRUST"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\library.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("OFFICE"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\office.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("OFFICIAL EMPLOYMENT")||search.equals("OFFICIAL")||search.equals("EMPLOYMENT"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\OFFICIAL EMPLOYMENT.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("ONLINE INFORMATION")||search.equals("ONLINE INFO")||search.equals("ONLINE"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\online info.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("PAYMENT SYSTEM")||search.equals("PAYMENT"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\PAYMENT SYSTEM.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("PROBATION"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\probation.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("REGISTER OFFICE")||search.equals("REGISTER"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\register.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("ACCOUNTS")||search.equals("FINANCE ACCOUNTS")||search.equals("FINANCE")||search.equals("STUDENT ACCOUNTS")||search.equals("ACCOUNT")||search.equals("ACCOUNTS OFFICE")||search.equals("FINANCE ACCOUNTS OFFICE")||search.equals("FINANCE OFFICE")||search.equals("STUDENT ACCOUNTS OFFICE")||search.equals("ACCOUNT OFFICE"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\student accounts.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("STUDENT AFFAIR")||search.equals("AFFAIR")||search.equals("STUDENT AFFAIR OFFICE")||search.equals("AFFAIR OFFICE"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\student affairs.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("STUDENT INFORMATION")||search.equals("STUDENT INFO"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\student info.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("STUDENT PARKING")||search.equals("PARKING"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\student parking.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("STUDNET SUPPORT")||search.equals("SUPPORT"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\student support.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("STUDY ROOM")||search.equals("STUDY"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\study room.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("TA")||search.equals("ASSISTANT")||search.equals("TEACHERS ASSISTANT")||search.equals("TEACHER ASSISTANT"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\probation.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("TOTAL CREDIT"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\total credit.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("UIU WEBSITE")||search.equals("WEBSITE"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\uiu website.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else if(search.equals("WAIVER")||search.equals("WAIVER SYSTEM"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\WAIVER.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				
				else if(search.equals("WIFI")||search.equals("WIFI FACILITY"))
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\wifi facility.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);
				}
				else
				{
					try
					{
						image.setIcon(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\not found.jpg"))));
					}
					catch(IOException ioe) {}
					
					software_map_frame.add(image);
					software_map_frame.add(all_home_button);	
					software_map_frame.add(software_map_tf);
					software_map_frame.add(software_map_search_button);
					software_map_tf.setText(null);				}
			}
			else
			{
				software_map_frame.addWindowListener(this);  
				software_map_frame.setSize(1280,1024);
				software_map_frame.setResizable(false);
				software_map_frame.setLayout(null);
				software_map_frame.setBackground(Color.BLACK);
				
				try
				{
					software_map_frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\SOFTWARE MAP\\MAP.jpg")))));	
					
				}
				catch(IOException ioe) {}
				
				software_map_tf.setBounds(1180,20,150,30);
				software_map_search_button.setFont(new Font("Ariel",Font.BOLD,15));
				software_map_search_button.setBounds(1230,60,100,30);
				
				software_map_frame.add(software_map_tf);
				software_map_frame.add(software_map_search_button);
				software_map_frame.add(all_home_button);			
				
				if(main_door.isVisible()==true)
				{
					main_door.setVisible(true);
					software_map_frame.setVisible(true);
				}
				
				software_map_frame.setResizable(false);
			}
				
		}
		
		
		//About-------------------------------------------------------------------------------------------
		
		else if(e.getActionCommand().equals("ABOUT"))
		{
			JPanel panel = new JPanel(); 
			
			about_uiu_frame = new JFrame("ABOUT UIU");
			text_reader = new JTextArea();
			text_reader.setFont(new Font("Ariel",Font.BOLD,15));
			about_uiu_frame.addWindowListener(this);
			about_uiu_frame.setSize(1280,1024);
			about_uiu_frame.setResizable(false);
			
			try
		    {
				text_reader.read(new FileReader("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\About UIU\\About UIU.txt"),null);
		    }
		    catch(IOException ioe)	{}
			
			panel.setBackground(Color.BLACK);
			panel.add(text_reader);
			
			JScrollPane scroll = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			text_reader.setEditable(false);
			about_uiu_frame.add(scroll);
	        about_uiu_frame.setVisible(true);
		}
		
		else if(e.getActionCommand().equals("EXIT"))
		{
			System.exit(0);
		}
	}
	
	//GPA Simulator Methods
	public void value(int a1)
	{
		i=a1;
	}
	public void value1(int a3)
	{
		j=a3;
	}
	
	//Background Music
	public void backgroundMusic() 
	{
		try
	    {
			AudioInputStream audio = AudioSystem.getAudioInputStream(new File("C:\\Users\\common.lab-05\\Desktop\\Road To UIU\\Road To UIU.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audio);
			clip.start();
	    }
		catch(UnsupportedAudioFileException uae)
		{
	    	System.out.println(uae);
	    }
		catch(IOException ioe) 
		{
			System.out.println(ioe);
		}
		catch(LineUnavailableException lua) 
		{
			System.out.println(lua);
		}
	    if(main_door.isVisible()==true)
		{
			main_door.setVisible(true);
			
		}
	
	}
	
	public void windowClosing(WindowEvent e) 
	{
		main_door.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}
	
	public static void main(String[] e)
	{
		Road_2_UIU azsm = new Road_2_UIU();
		
		azsm.Road_2_UIU();
		azsm.backgroundMusic();
	}

	public void textValueChanged(TextEvent e) 		{}
	public void windowActivated(WindowEvent e) 		{}
	public void windowClosed(WindowEvent e)			{}
	public void windowDeactivated(WindowEvent e) 	{}
	public void windowDeiconified(WindowEvent e) 	{}
	public void windowIconified(WindowEvent e) 		{}
	public void windowOpened(WindowEvent e) 		{}


	
}



