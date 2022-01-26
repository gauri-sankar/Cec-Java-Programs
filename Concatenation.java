import java.util.*;

class Concatenation
{

    void concat(String s1,String s2)
    {
        String s3=s1.concat(s2);
        System.out.println("The concatenated string is:"+s3);
    }

    void concat(int n1,int n2)
    {
        String s1=Integer.toString(n1);
        String s2=Integer.toString(n2);

        String s3=s1+s2;

        int num=Integer.parseInt(s3);
        System.out.println("The concatenated number is:"+num);

    }

    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter the Strings to concatenate in order:");
        String s1=scn.nextLine();
        String s2=scn.nextLine();

        Concatenation c=new Concatenation();
        c.concat(s1,s2);

        System.out.println("Enter the numbers to concatenate:");
        int num1=scn.nextInt();
        int num2=scn.nextInt();

        c.concat(num1,num2);
    }
}