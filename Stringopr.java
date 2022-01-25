import java.util.*;

class Stringopr{

    Scanner scn=new Scanner(System.in);
    void reversestring(String str)
    {
        char ch[]=str.toCharArray();
        String rev=" ";
        for(int i=str.length()-1;i>=0;i--)
        rev+=ch[i];

        System.out.println("The original string is:"+str);
        System.out.println("The reversed string is:"+rev);
    }

    void searchstring(String str)
    {
        int flag=0;

        System.out.println("Enter the character to be searched:");
        char ch=scn.next().charAt(0);
        char string[]=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            if(string[i]==ch)
            flag++;

        }
        if(flag==0)
        System.out.println("The character is not found.");
        else
        System.out.println("The character is found:"+flag+"   times");

    }
    
    public static void main(String args[]) {
       
       Scanner sc=new Scanner(System.in);
        Stringopr op1=new Stringopr();
        System.out.println("Enter the string to be reversed:");
       String str1=sc.nextLine();

       op1.reversestring(str1);
       System.out.println("Enter the string to be searched for element(in lower case):");
       String str2=sc.nextLine();
       
       op1.searchstring(str2);
        
    }
}