import java.util.*;

class Student{
Scanner scn=new Scanner(System.in);
String name;
int rollno;
int marks[]=new int[10]; 
    void readdetails()
    {
        System.out.println("Enter the name of the student:");
        name=scn.nextLine();
        System.out.println("Enter the roll number:");
        rollno=scn.nextInt();
        System.out.println("Enter the marks of 5 subjects:");
        for(int i=0;i<5;i++)
        marks[i]=scn.nextInt();
    }

    void printdetails()
    {
        System.out.println("***Student Details***");
        System.out.println("Name:"+name);
        System.out.println("Roll Number:"+rollno);
        System.out.println("^^^Marks^^^");
        for(int i=0;i<5;i++)
        System.out.println("Subject  "+(i+1)+":"+marks[i]);

    }

    public static void main(String args[]) {

        Student std1=new Student();
        std1.readdetails();
        std1.printdetails();
        
    }
}