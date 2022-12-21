import java.util.*;
import java.util.Timer;
import java.util.TimerTask;


class OnlineExamination 
{
    static String b1,b2;
    static String  pass,pass2;
    static char mcq;
    
    public static void signup()
    {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("---------------------------------------------------------------");
         System.out.println("            ENTER THE USERNAME:");
         System.out.println("----------------------------------------------------------------------");

         b1=sc.nextLine();
         System.out.println("----------------------------------------------------------------------");
        System.out.println("             ENTER THE MOBILE NUMBER");
        System.out.println("----------------------------------------------------------------------");

        long  mn=sc.nextLong();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("             Ente the Email-id");
        System.out.println("----------------------------------------------------------------------");


        String emi=sc.nextLine();
        String emid=sc.nextLine();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("              Create the password");
        System.out.println("----------------------------------------------------------------------");
        String c= sc.nextLine();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("               Confirm the password ");
        System.out.println("----------------------------------------------------------------------");

       
        pass=sc.nextLine();
        if (c.equals(pass))
        {
        System.out.println("************************************************");
         System.out.println("Susscessful -signup");
        System.out.println("************************************************");
        login();
        }
        else 
        {
         System.out.println("----------------------------------------------------------------------");
        System.out.println(" Password does not match please resubmit all detail ");
        System.out.println("----------------------------------------------------------------------");
        signup();

        }
      main(null);
    }
    public static void login()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("------------------------------------");
        System.out.println("        LOGIN");
        System.out.println("------------------------------------");
        System.out.println("ENTER THE USERNAME:");
        System.out.println("------------------------------------");


         b2=sc.nextLine();
         System.out.println("----------------------------------------------------------------------");
        System.out.println("ENTER THE PASSWORD:");
        System.out.println("------------------------------------");

         pass2=sc.nextLine();
        if (b1.equals(b2)&&pass.equals(pass2))
        {
        System.out.println("************************************************");
        System.out.println("        Login Successfully:");
        System.out.println("************************************************");

        }
        else
        {
         System.out.println("----------------------------------------------------------------------");
            System.out.println("    Incorrect Detail");
         System.out.println("----------------------------------------------------------------------");

        }

       main(null);
      }
    

    public static void update()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Update Your Username:");

        b1=sc.nextLine();
        System.out.println( "Password Update");
        pass2=sc.nextLine();
        System.out.println("************************************************");
        System.out.println("UPDATE SUCESSFULLY:");
        System.out.println("************************************************");

        main(null);



    }
    public static void display()
    {

        System.out.println(b1);
        System.out.println("Username Successfully Updated:");

    }
    public static void selectmcq()
    {   int i=1;
        while (i<=25)
        {
         Scanner sc = new Scanner (System.in);
         System.out.println( "Q.NO "+i+" SELCET ONE : \n1-A\n2-B\n3-C\n4-D");
         char c=((sc.nextLine()).charAt(0));
        char z=Character.toUpperCase(c); 
         switch (z)
         {
            case 'A':
            case 'a':
            {
           
            break;
            }
            case'B':
            case'b':
           
            break;
            case 'C':
           
            break;
            case 'D':
            
            
        }
        i++;
         }
         main(null);
    }
    public static void  close()
    {
         System.exit(0);
    }

    

    public static void main(String args[])
    {
        int choice ;
        System.out.println(" ----------------------------------------------------------------------------------------------------");
        System.out.println("              Enter the choice");
        System.out.println(" ----------------------------------------------------------------------------------------------------");

        System.out.println("            1-SignUp\n            2-Login \n            3-Update Profile and Password\n            4-Select Answers for MCQs \n            5-Timer and Auto submit\n            6-Closing Session and Logout  ");
        System.out.println(" -----------------------------------------------------------------------------------------------------------");

        Scanner sc = new Scanner (System.in);
        choice=sc.nextInt();
       switch(choice)
       {

        case 1 :
        signup();
        break;
       


        case 2:
        login();

        case 3:
        update();

        case 4:
        selectmcq();
        case 5:
        close();
        
       
       }
    
    }
}
