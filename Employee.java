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
        
       // System.out.println("Enter a string:");
        //String str=scn.nextLine();

        Employee employee1=new Employee();
        Employee employee2=new Employee();
        Employee employee3=new Employee();
        Employee employee4=new Employee();
        Employee employee5=new Employee();

        employee1.readdetails();
        employee2.readdetails();
        employee3.readdetails();
        employee4.readdetails();
        employee5.readdetails();

        System.out.println("***EMPLOYEE DETAILS***");
        employee1.printdetails();
        employee2.printdetails();
        employee3.printdetails();
        employee4.printdetails();
        employee5.printdetails();
        



    }

}