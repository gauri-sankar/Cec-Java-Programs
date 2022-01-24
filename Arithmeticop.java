import java.util.*;
class Arithmeticop{
    void factorialop(int num){
        int fact=1;
        for(int i=1;i<=num;i++)
        fact=fact*i;

        System.out.println("The factorial of the number is:"+fact);
    }

    void sumofdigits(int num)
    {
        int d,sum=0;
        while(num!=0)
        {
            d=num%10;
            sum=sum+d;
            num=num/10;
        }
        System.out.println("The sum of digits of the number is:"+sum);
    }

    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number for performing factorial function:");
        int num1=scn.nextInt();
        System.out.println("Enter the number for performing sum of digits function:");
        int num2=scn.nextInt();
         Arithmeticop op1=new Arithmeticop();
        op1.factorialop(num1);
        op1.sumofdigits(num2);
    }
}