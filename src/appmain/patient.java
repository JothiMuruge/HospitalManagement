package appmain;

import java.util.Scanner;

public class patient {
	int i;
	{
	patient[] p= new patient[100];
	  for (i = 0; i < 100; i++)
          p[i] = new patient();
	  p[0].pid = "12";
      p[0].pname = "Pankaj";
      p[0].disease = "Cancer";
      p[0].sex = "Male";
      p[0].admit_status = "y";
      p[0].age = 30;
      p[1].pid = "13";
      p[1].pname = "Sumit";
      p[1].disease = "Cold";
      p[1].sex = "Male";
      p[1].admit_status = "y";
      p[1].age = 23;
      p[2].pid = "14";
      p[2].pname = "Alok";
      p[2].disease = "Maleriya";
      p[2].sex = "Male";
      p[2].admit_status = "y";
      p[2].age = 45;
      p[3].pid = "15";
      p[3].pname = "Ravi";
      p[3].disease = "Diabetes";
      p[3].sex = "Male";
      p[3].admit_status = "y";
      p[3].age = 25;

	}
	 String pid, pname, disease, sex, admit_status;
	    int age;
	    void new_patient()
	    {
	        Scanner input = new Scanner(System.in);
	        System.out.print("id:-");
	        pid = input.nextLine();
	        System.out.print("name:-");
	        pname = input.nextLine();
	        System.out.print("disease:-");
	        disease = input.nextLine();
	        System.out.print("sex:-");
	        sex = input.nextLine();
	        System.out.print("admit_status:-");
	        admit_status = input.nextLine();
	        System.out.print("age:-");
	        age = input.nextInt();
	    }
	    void patient_info()
	    {
	        System.out.println(pid + "\t" + pname + " \t" + disease + "     \t" + sex + "      \t" + admit_status + "\t" + age);
	    }

}
