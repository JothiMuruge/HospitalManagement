package appmain;

import java.util.Scanner;

public class staff {
	{
	int i;
	staff[] s= new staff[1000];
	 for (i = 0; i < 100; i++)
         s[i] = new staff();
	 s[0].sid = "22";
     s[0].sname = "Prakash";
     s[0].desg = "Worker";
     s[0].sex = "Male";
     s[0].salary = 5000;
     s[1].sid = "23";
     s[1].sname = "Komal";
     s[1].desg = "Nurse";
     s[1].sex = "Female";
     s[1].salary = 2000;
     s[2].sid = "24";
     s[2].sname = "Raju";
     s[2].desg = "Worker";
     s[2].sex = "Male";
     s[2].salary = 5000;
     s[3].sid = "25";
     s[3].sname = "Rani";
     s[3].desg = "Nurse";
     s[3].sex = "Female";
     s[3].salary = 20000;

}
	 String sid, sname, desg, sex;
	    int salary;
	    void new_staff()
	    
	    {
	        Scanner input = new Scanner(System.in);
	        System.out.print("id:-");
	        sid = input.nextLine();
	        System.out.print("name:-");
	        sname = input.nextLine();
	        System.out.print("desigination:-");
	        desg = input.nextLine();
	        System.out.print("sex:-");
	        sex = input.nextLine();
	        System.out.print("salary:-");
	        salary = input.nextInt();
	    }
	    void staff_info()
	    {
	        System.out.println(sid + "\t" + sname + "\t" + sex + "\t" + salary);
	    }

}
