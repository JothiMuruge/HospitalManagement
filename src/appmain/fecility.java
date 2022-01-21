package appmain;

import java.util.Scanner;

public class fecility {
	int i;
	{
		fecility[] f= new fecility[200];
	 for (i = 0; i < 20; i++)
         f[i] = new fecility();
	 f[0].fec_name = "Ambulance";
     f[1].fec_name = "Admit Facility ";
     f[2].fec_name = "Canteen";
     f[3].fec_name = "Emergency";
	 
}
	 String fec_name;
	    void add_feci()
	    {
	        Scanner input = new Scanner(System.in);
	        System.out.print("fecility:-");
	        fec_name = input.nextLine();
	    }
	    void show_feci()
	    {
	        System.out.println(fec_name);
	    }
}

