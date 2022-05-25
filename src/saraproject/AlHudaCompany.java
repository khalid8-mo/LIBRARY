import java.io.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class AlHudaCompany
{
    public static void main(String[] args) throws  IOException
    {
   		Scanner in=new Scanner(System.in);
   		FileWriter fw = new FileWriter("amal.txt",true);
        PrintWriter out = new PrintWriter(fw);
		FileReader fr = new FileReader("amal.txt");
		Scanner inFile = new Scanner(fr);




        Amal amal = new Amal();
        Raja raja = new Raja();
        Duaa duaa = new Duaa();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  WELCOME TO Al HUDA COMPANY FOR LIBRARY MANAGEMANT  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
        System.out.println("\n1-Al Amal Library(for borrow books) \n2-Al Raja Library(for Selling & borrowing University Studant Tools)  \n3-Al Duaa Library(for Reading) \n4-General Mangaer \n5-Exit ");
        System.out.println("Enter your choice");
        int ch =in.nextInt();
        for(;;){

        switch(ch)
        {
        case 1:
                System.out.println("**************************  WELCOME TO Al AMAL LIBRARY  ******************************** ");

               for(;;){
				   System.out.println("\n1- New registration.\n2- borrowing.\n3- Return books.\n4- Report.\n5- Exit.");
                 System.out.println("Enter your choice");
                int case1 =in.nextInt();

                if (case1 == 1)
                {
                	amal.regist();
                	out.print(amal.getName());
					out.print(" ");
					out.println(amal.getid());
				 	out.close();
				}

				else if (case1 == 2) // Borrow
					amal.search();
				else if (case1 == 3)//Return
					amal.returnbook();
				else if (case1 == 4)
				{
					System.out.println("ALL USERS");
					amal.report("amal.txt");
					System.out.println("ALL GOOD BOOKS");
					amal.report("book.txt");
					System.out.println("ALL BAD BOOKS");
					amal.report("badbook.txt");
				}//Report
				else  // Exit
					 System.exit(0);
				}//end for
        case 2:
  System.out.println("**************************  WELCOME TO Al RAJA LIBRARY  ******************************** ");
    for(;;){
                System.out.println("\n1- New registration.\n2- borrowing Tools.\n3- Return Tools.\n4- Report.\n5- Exit.");
                 System.out.println("Enter your choice");
                int case2 =in.nextInt();

             if (case2 == 1)
               {
                    raja.regist();
                	out.print(raja.getName());
					out.print(" ");
					out.println(raja.getid());
				 	out.close();
				}

				else if (case2 == 2) // Borrow
					raja.search();
				else if (case2 == 3)//Return
					raja.returntools();
				else if (case2 == 4)
				{
					System.out.println("ALL USERS");
					raja.report("raja.txt");
					System.out.println("ALL GOOD TOOLS");
					raja.report("tools.txt");
					System.out.println("ALL BAD TOOLS");
					raja.report("badtools.txt");
				}//Report
				else  // Exit
				System.exit(0);

}//end for

        case 3:

  System.out.println("**************************  WELCOME TO Al DUAA LIBRARY  ******************************** ");
    for(;;){
                System.out.println("\n1- Singale Reading.\n2- Group Reading.\n3- Report.\n4- Exit.");
                 System.out.println("Enter your choice");
                int case3 =in.nextInt();

      if (case3 == 1)
              {
				                    raja.regist();
				                    out.print(duaa.getName());
				  					out.print(" ");
				  					out.println(duaa.getid());
				                  	out.close();


    System.out.println("\n1- Daily Subscribption (for100 pounds).\n2- Weekly Subscribption (for500 pounds).\n3- Monthly Subscribption (for15000 pounds).");
    System.out.println("Enter your choice");
	int c =in.nextInt();
	if (c==1)
	System.out.println("Intenet is vailbei with a fee of 40 % of the Subscribption fee ");
           }
else if(case3 == 2){
		System.out.println("  How many studant in groub");
	     int numbre =in.nextInt();
					                    duaa.registGroup();
					                    out.print(duaa.getName());
					  					out.print(" ");
					  					out.println(duaa.getid());
				                       	out.close();
	}
 else if (case3 == 3){
	                     System.out.println("ALL Regist Singale");
	 					duaa.report("SingaleReading.txt");
	 					System.out.println("ALL RegistGroup ");
	 					duaa.report("GroupReading.txt");
	 }
	 else
	      System.exit(0);







	  }//for





       case 4:
  System.out.println("**************************  WELCOME TO MANAGEMANT SYSTEM  ******************************** ");
  System.out.println("\n1-Reports Al Amal Library\n2-Reports Al Raja Library.\n3-Reports Al Duaa Library.\n4- Reports of Aull Librarys.\n5- Exit.");
     int case4 =in.nextInt();
if(case4 == 1){
	System.out.println("***************************** Ai AMAL Reports******************************************");
                           System.out.println("ALL USERS");
							amal.report("amal.txt");
							System.out.println("ALL GOOD BOOKS");
							amal.report("book.txt");
							System.out.println("ALL BAD BOOKS");
					            amal.report("badbook.txt");
}
else if(case4 == 2){
        System.out.println("****************************Al RAJA Reports*******************************************");

                    System.out.println("ALL USERS");
					raja.report("raja.txt");
					System.out.println("ALL GOOD TOOLS");
					raja.report("tools.txt");
					System.out.println("ALL BAD TOOLS");
					raja.report("badtools.txt");
}
else if(case4 == 3){
        System.out.println("********************************Al Duaa Reports***************************************");
                               System.out.println("ALL Regist Singale");
			 					duaa.report("SingaleReading.txt");
			 					System.out.println("ALL RegistGroup ");
	 					         duaa.report("GroupReading.txt");
}

else if(case4 == 4){

 System.out.println("********************** Ai AMAL Reports*************************");
                           System.out.println("ALL USERS");
							amal.report("amal.txt");
							System.out.println("ALL GOOD BOOKS");
							amal.report("book.txt");
							System.out.println("ALL BAD BOOKS");
					            amal.report("badbook.txt");
 System.out.println("************************Al RAJA Reports************************");

                    System.out.println("ALL USERS");
					raja.report("raja.txt");
					System.out.println("ALL GOOD TOOLS");
					raja.report("tools.txt");
					System.out.println("ALL BAD TOOLS");
					raja.report("badtools.txt");
System.out.println("*************************Al Duaa Reports*************************");

                         System.out.println("ALL Regist Singale");
	 					duaa.report("SingaleReading.txt");
	 					System.out.println("ALL RegistGroup ");
	 					duaa.report("GroupReading.txt");
	}
	else
     System.exit(0);
        case 5:
            System.exit(0);
        default:
              System.out.println("Pleas Try again");



        }//end switch
	}//end for
    }//end main
}//end class
