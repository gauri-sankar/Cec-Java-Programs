import java.util.*;

class Employee
{

    int empno;
    String s;
    long phnno;
    Scanner scn=new Scanner(System.in);


    
    
    void readdetails()
    {
        System.out.println("Enter the name of the employee:");
        s=scn.nextLine();
        System.out.println("Enter the employee number:");
        empno=scn.nextInt();

      
        
        System.out.println("Ente the Phone number of the employee:");
        phnno=scn.nextLong();

       

      
    }

    void printdetails()
    
    {
        System.out.println("\n Employee number:"+empno);
        System.out.println("Name:"+s);
        System.out.println("Contact no:"+phnno);
    }

    public static void main(String args[])
    {
        
        Employee emp[]=new Employee[50];
        for(int i=0;i<=4;i++)
        {
          emp[i]=new Employee();
        
        }
        
        for(int i=0;i<=4;i++)
            emp[i].readdetails();

            System.out.println("***EMPLOYEE DETAILS***");

        
        for(int i=0;i<=4;i++)
            emp[i].printdetails();

          }

}
