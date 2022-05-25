
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Raja {
		Scanner in=new Scanner(System.in);
	    protected String name;
	    protected int id;
	    private String type;
	    protected boolean isBorrowed;//false
	    private final int discount = 30;

	        public Raja() {
	    }

	    public Raja(String name, int id) {
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
	    public boolean isBorrowed() {
	        return isBorrowed;
	    }

	    public void setBorrowed(boolean borrowed) {
	        isBorrowed = borrowed;
	    }

	    @Override
	    public String toString()
	    {
	        return "Amal{" +"name='" + name + '\''
	        			+", ID=" + id +","
	        			+ (isBorrowed == true)
	        			;
	    }
	    public void regist ()
	    {
			System.out.println("Please enter Student name: \n");
			String name =in.nextLine();
			setName(name);
			System.out.println("Please enter Student ID: \n");
			int id =in.nextInt();
			setid(id);


		}

		/*********************************** BORROW *************************************/







	/*********************************** RETURN *************************************/
		public void returntools() throws FileNotFoundException, IOException
		{
			Scanner inn = new Scanner(System.in);
	 	  	FileWriter fw = new FileWriter("tools.txt",true);
	  		PrintWriter out = new PrintWriter(fw);
			System.out.println("The status of the Tools? :\n 1- Good.\n 2- Bad.");
			int status = inn.nextInt();
			//Scanner scan = new Scanner(new File(fileName));
			if(status == 1)
			{
				System.out.println("Enter the Tools title please:  ");
				String title =in.nextLine();
				                           ///good tools////
			    int good=0;
	  		     out.println(title);
	  		      good++;
	  		      out.close();
			}
			else
			{
	 	  	FileWriter fw1 = new FileWriter("badtools.txt",true);
	  		PrintWriter out1 = new PrintWriter(fw1);
				System.out.println("You can not Borrowing  for the spoiling the Tools!");
	             System.out.println("Enter the Tool title please:  ");
				String title =in.nextLine();
				                           ///Bsd Tools////
			        int bad=0;
	  		          out1.println(title);
	  		              bad++;
				out1.close();
			}

		}
		/********************************BUYTOOLS***************************/

/* public void buy() {
        try {
            FileReader reader = new FileReader("tools.txt",true);
            Scanner in = new Scanner(reader);
            int i = 0;
            Scanner lIn = new Scanner(System.in);
            System.out.println("Enter Tool To By: ");
            String name = lIn.nextLine();
            System.out.println("Enter User ID: ");
            int id = lIn.nextInt();
            int counter = 0;
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] thingLine = line.split(",");
                System.out.println(thingLine[0]);
                for (int u = 2; u < thingLine.length; u++) {
                    int userId = Integer.parseInt(thingLine[u]);
                    if (userId == id) {
                        counter++;
                    }
                }
                i++;
            }
*/

		/************************* SEARCH METHOD *****************************/
	    public void parseFile(String fileName,String searchStr) throws FileNotFoundException
	    {
	        Scanner scan = new Scanner(new File(fileName));
	        int flag = 0;
	        while(scan.hasNext())
	        {
	            String line = scan.nextLine().toLowerCase().toString();
	            if(line.contains(searchStr))
	            {
	                System.out.println(line);
	                System.out.println("Exist !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	                flag++;
	            }
	        }
	        if (flag == 0)
	            	System.out.println("NOT EXIST!!!!!!!!!!!!");
		}

		public void search () throws FileNotFoundException
		{
			System.out.println("Enter the Tools title please:  ");
			String title = in.nextLine();
	        parseFile("tools.txt", title);
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


}//end class Raja