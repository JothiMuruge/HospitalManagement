package appmain;

import java.util.Scanner;

public class lab {
	int i;{
	 for (i = 0; i < 20; i++)
         l[i] = new lab();
	}
	
	 l[0].fecility = "X-ray     ";
     l[0].lab_cost = 800;
     l[1].fecility = "CT Scan   ";
     l[1].lab_cost = 1200;
     l[2].fecility = "OR Scan   ";
     l[2].lab_cost = 500;
     l[3].fecility = "Blood Bank";
     l[3].lab_cost = 50;
}
{

  String fecility;
}
	    int lab_cost;
	    
	    void new_feci()
	    {
	        Scanner input = new Scanner(System.in);
	        System.out.print("fecility:-");
	        fecility = input.nextLine();
	        System.out.print("cost:-");
	        lab_cost = input.nextInt();
	    }
	    void feci_list()
	    {
	        System.out.println(fecility + "\t\t" + lab_cost);
	    }
}



