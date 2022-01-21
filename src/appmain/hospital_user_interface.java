package appmain;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Calendar;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;


import dao.Hospital_LoginDetails_Dao;
import daoimpl.Hospital_LoginDetails_DaoImpl;



public class hospital_user_interface {


	

            public void main(String[] args) {
            	{
            		String months[] = {
            			    "jan",
            				"Feb",
            				"Mar",
            				"Apr",
            				"May",
            				"Jun",
            				"Jul",
            				"Aug",
            				"Sep",
            				"Oct",
            				"Nov",
            				"Dec"
            	};
			// TODO Auto-generated method stub
            		int choice, j1, c2;
            		while(c2==j1)
            		{
            		
            			System.out.println("1: Contact US");
            			System.out.println("2: About US");
            			System.out.println("3: LinkedIn");
            			System.out.println("4: Facebook");
            			System.out.println("5: Instagram US");
            			System.out.println("6: Sign up");
            			System.out.println("7: Sign In");
            			System.out.println("8: Exit");
            		}
            		Hospital_LoginDetails_DaoImpl LoginDao=new Hospital_LoginDetails_DaoImpl();
            		String username,firstname,lastname,password, location, mobileno;
            		do {
            			System.out.println("What you do wish to check from the above list");
            		
            		
            			Scanner sn=new Scanner(System.in);
            			int option=sn.nextInt();
            			
            		
            		
            		
            		
            		
            		
			System.out.println("***********    Welcome to Hospital Management System Project    ****************");
			System.out.println("*************************************************************************************");
			Calendar calendar = Calendar .getInstance();
			System.out.println("---------------------------------------------------------------------------------------------");
			 int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;
			
			System.out.println("\t\t\t\t\t\t\t\tTime: " + Calendar .HOUR);
			Scanner input = new Scanner(System.in);
	        int choice1, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;
	        while (status == 1)
	        {
	            System.out.println("\n                                    MAIN MENU");
	            System.out.println("-----------------------------------------------------------------------------------");
	            System.out.println("1.Doctos  2. Patients  3.Medicines  4.Laboratories  5. Facilities  6. Staff ");
	            System.out.println("-----------------------------------------------------------------------------------");
	            choice = input.nextInt();
	            
	            switch (choice)
	            {
			
	            case 1:
                {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                      **DOCTOR SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    s1 = 1;
                    while (s1 == 1)
                    {
                        System.out.println("1.Add New Entry\n2.Existing Doctors List");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                                {
                                	doctor[] d= new doctor[26];
                                    d[count1].doctor_info();count1++;
                                    break;
                                }
                            case 2:
                                {
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println("id \t Name\t Specilist \t Timing \t Qualification \t Room No.");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    for (j = 0; j < count1; j++)
                                    { doctor[] d= new doctor[26];
                                        d[j].doctor_info();
                                    }
                                    break;
                                }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s1 = input.nextInt();
                    }
                    break;
                }
            case 2:
                {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                     **PATIENT SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    s2 = 1;
                    while (s2 == 1)
                    {
                        System.out.println("1.Add New Entry\n2.Existing Patients List");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                                {
                                	patient[] p= new patient[100];
                                    p[count2].new_patient();count2++;
                                    break;
                                }
                            case 2:
                                {
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println("id \t Name \t Disease \t Gender \t Admit Status \t Age");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    for (j = 0; j < count2; j++) {
                                    	patient[] p= new patient[100];
                                        p[j].patient_info();
                                    }
                                    break;
                                }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s2 = input.nextInt();
                    }
                    break;
                }
            case 3:
                {
                    s3 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                     **MEDICINE SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s3 == 1)
                    {
                        System.out.println("1.Add New Entry\n2. Existing Medicines List");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                                {
                                	medical[] m= new medical[100];
                                    m[count3].new_medi();count3++;
                                    break;
                                }
                            case 2:
                                {
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println("Name \t Company \t Expiry Date \t Cost");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    for (j = 0; j < count3; j++) {
                                    	medical[] m= new medical[100];
                                        m[j].find_medi();
                                    }
                                    break;
                                }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s3 = input.nextInt();
                    }
                    break;
                }
            case 4:
                {
                    s4 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                    **LABORATORY SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s4 == 1)
                    {
                        System.out.println("1.Add New Entry \n2.Existing Laboratories List");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                                {
                                	 lab[] l = new lab[20];
                                    l[count4].new_feci();count4++;
                                    break;
                                }
                            case 2:
                                {
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println("Fecilities\t\t Cost");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    for (j = 0; j < count4; j++) {
                                        
                                    }
                                    break;
                                }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s4 = input.nextInt();
                    }
                    break;
                }
            case 5:
                {
                    s5 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("          **HOSPITAL FACILITY SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s5 == 1)
                    {
                        System.out.println("1.Add New Facility\n2.Existing Fecilities List");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                                {
                            		fecility[] f= new fecility[200];
                                    f[count5].add_feci();count5++;
                                    break;
                                }
                            case 2:
                                {
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println("Hospital  Facility are:");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    for (j = 0; j < count5; j++) {
                                		fecility[] f= new fecility[200];
                                        f[j].show_feci();
                                    }
                                    break;
                                }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s5 = input.nextInt();
                    }
                    break;
                }
            case 6:
                {
                    s6 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                       **STAFF SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s6 == 1)
                    {
                        String a = "nurse", b = "worker", c = "security";
                        System.out.println("1.Add New Entry \n2.Existing Nurses List\n3.Existing Workers List \n4.Existing Security List");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                                {
                                	staff[] s= new staff[1000];
                                    s[count6].new_staff();count6++;
                                    break;
                                }
                            case 2:
                                {
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println("id \t Name \t Gender \t Salary");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    for (j = 0; j < count6; j++)
                                    {
                                    	staff[] s= new staff[1000];
                                        if (a.equals(s[j].desg))
                                            s[j].staff_info();
                                    }
                                    break;
                                }
                            case 3:
                                {
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println("id \t Name \t Gender \t Salary");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    for (j = 0; j < count6; j++)
                                    {
                                    	staff[] s= new staff[1000];
                                        if (b.equals(s[j].desg))
                                            s[j].staff_info();
                                    }
                                    break;
                                }
                            case 4:
                                {
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println("id \t Name \t Gender \t Salary");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    for (j = 0; j < count6; j++)
                                    {
                                    	staff[] s= new staff[1000];
                                        if (c.equals(s[j].desg))
                                            s[j].staff_info();
                                    }
                                    break;
                                }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s6 = input.nextInt();
                    }
                    break;
                }
            default:
                {
                    System.out.println(" You Have Enter Wrong Choice!!!");
                }
	            }
	            System.out.println("\nReturn to MAIN MENU Press 1");
	            status = input.nextInt();
	        }
	    }
            }
}
}

                    
                        
			