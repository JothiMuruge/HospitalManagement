package appmain;

import java.util.Scanner;

public class doctor {
	 String did, dname, specilist, appoint, doc_qual;
	    int droom;
	    {
	    int i;
	    doctor[] d= new doctor[26];
     for (i = 0; i < 25; i++)
         d[i] = new doctor();
     d[0].did = "21";
     d[0].dname = "Dr.Ghanendra";
     d[0].specilist = "ENT";
     d[0].appoint = "5-11AM";
     d[0].doc_qual = "MBBS,MD";
     d[0].droom = 17;
     d[1].did = "32";
     d[1].dname = "Dr.Vikram";
     d[1].specilist = "Physician";
     d[1].appoint = "10-3AM";
     d[1].doc_qual = "MBBS,MD";
     d[1].droom = 45;
     d[2].did = "17";
     d[2].dname = "Dr.Rekha";
     d[2].specilist = "Surgeon";
     d[2].appoint = "8-2AM";
     d[2].doc_qual = "BDM";
     d[2].droom = 8;
     d[3].did = "33";
     d[3].dname = "Dr.Pramod";
     d[3].specilist = "Artho";
     d[3].appoint = "10-4PM";
     d[3].doc_qual = "MBBS,MS";
     d[3].droom = 40;
	    }
	    void new_doctor()
	    {
	        Scanner input = new Scanner(System.in);
	        System.out.print("id:-");
	        did = input.nextLine();
	        System.out.print("name:-");
	        dname = input.nextLine();
	        System.out.print("specilization:-");
	        specilist = input.nextLine();
	        System.out.print("work time:-");
	        appoint = input.nextLine();
	        System.out.print("qualification:-");
	        doc_qual = input.nextLine();
	        System.out.print("room no.:-");
	        droom = input.nextInt();
	    }
	    void doctor_info()
	    {
	        System.out.println(did + "\t" + dname + "  \t" + specilist + "     \t" + appoint + "    \t" + doc_qual + "       \t" + droom);
	    }
		public String getDid() {
			return did;
		}
		public void setDid(String did) {
			this.did = did;
		}
		public String getDname() {
			return dname;
		}
		public void setDname(String dname) {
			this.dname = dname;
		}
		public String getSpecilist() {
			return specilist;
		}
		public void setSpecilist(String specilist) {
			this.specilist = specilist;
		}
		public String getAppoint() {
			return appoint;
		}
		public void setAppoint(String appoint) {
			this.appoint = appoint;
		}
		public String getDoc_qual() {
			return doc_qual;
		}
		public void setDoc_qual(String doc_qual) {
			this.doc_qual = doc_qual;
		}
		public int getDroom() {
			return droom;
		}
		public void setDroom(int droom) {
			this.droom = droom;
		}
		public void doctor_info() {
			// TODO Auto-generated method stub
			
		}
		public void doctor_info() {
			// TODO Auto-generated method stub
			
		}

}
