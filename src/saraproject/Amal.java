import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Amal
{
	Scanner in=new Scanner(System.in);
    protected String name;
    protected int id;
    protected boolean isBorrowed;//false


        public Amal() {
    }

    public Amal(String name, int id) {
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
		System.out.println("1000 sdg for registration!");

	}

	/*********************************** BORROW *************************************/







/*********************************** RETURN *************************************/
	public void returnbook () throws FileNotFoundException, IOException
	{
		Scanner inn = new Scanner(System.in);
 	  	FileWriter fw = new FileWriter("book.txt",true);
  		PrintWriter out = new PrintWriter(fw);
		System.out.println("The status of the book? :\n 1- Good.\n 2- Bad.");
		int status = inn.nextInt();
		//Scanner scan = new Scanner(new File(fileName));
		if(status == 1)
		{
			System.out.println("Enter the book title please:  ");
			String title =in.nextLine();
			                           ///goodbook////
		    int good=0;
  		     out.println(title);
  		      good++;
  		      out.close();
		}
		else
		{
 	  	FileWriter fw1 = new FileWriter("badbook.txt",true);
  		PrintWriter out1 = new PrintWriter(fw1);
			System.out.println("You should pay 500 vat for the spoiling the book!!");
             System.out.println("Enter the book title please:  ");
			String title =in.nextLine();
			                           ///Bsdbook////
		        int bad=0;
  		          out1.println(title);
  		              bad++;
			out1.close();
		}

	}

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
                System.out.println("Exist !!!!");
                flag++;
            }
        }
        if (flag == 0)
            	System.out.println("NOT EXIST!!!!!!!!!!!!");
	}

	public void search () throws FileNotFoundException
	{
		System.out.println("Enter the book title please:  ");
		String title = in.nextLine();
        parseFile("book.txt", title);
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

}