import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public  class Duaa  {
 public Duaa() {
	         }
Scanner in=new Scanner(System.in);
    protected String name;
    protected int id;
	             public Duaa(String name, int id) {
			         this.name = name;
			         this.id = id;

			     }
			     public String getName() {
			         return name;
			     }
			     public void setName(String name) {
			         this.name = name;
			     }
			     public void setid(int id) {
			         this.id = id;
			     }

			     public int getid() {
			         return id;
			     }

			     @Override
			     public String toString()
			     {
			         return "Amal{" +"name='" + name + '\''
			         			+", ID=" + id +","
			         			;
			     }
			     public void regist ()throws FileNotFoundException, IOException
			     {
					 Scanner inn = new Scanner(System.in);
					FileWriter fw = new FileWriter("SingaleReading.txt",true);
  		            PrintWriter out = new PrintWriter(fw);
			 		System.out.println("Please enter Student name: \n");
			 		String name =in.nextLine();
			 		setName(name);
			 		System.out.println("Please enter Student ID: \n");
			 		int id =in.nextInt();
			 		setid(id);
                       out.close();

}
public void registGroup ()throws FileNotFoundException, IOException
{
	    Scanner inn = new Scanner(System.in);
	 	FileWriter fw = new FileWriter("GroupReading.txt",true);
  		PrintWriter out = new PrintWriter(fw);
	 int numbre= 0;
for (int i =0;i<numbre; i++){

	System.out.println("Please enter Student name: \n");
				 		String name =in.nextLine();
				 		setName(name);
				 		System.out.println("Please enter Student ID: \n");
				 		int id =in.nextInt();
			 		   setid(id);
                     out.close();
	}//for

}

/*********************************** REPORT *************************************/
	public void report (String fileName) throws FileNotFoundException, IOException
	{
		//System.out.println("Informtion Studans: Name :ID  ");
		Scanner scan = new Scanner(new File(fileName));
		while(scan.hasNext())
		{
		    String line = scan.nextLine().toLowerCase().toString();
		    System.out.println(line);
        }//end while

	scan.close();

	}//end report









}//end duaa