import java.util.*;

class Perimeter{

    Perimeter(float r)
    {
        double p=2*3.14*r;

        System.out.println("The perimeter of the circle is:"+p);
    }

    Perimeter(float x,float y)
    {
        double perimeter=(x+y)*2;

        System.out.println("The perimeter of the rectangle is:"+perimeter);

    }

    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        float radius=scn.nextFloat();

        Perimeter p1=new Perimeter(radius);

        System.out.println("Enter the length and breadth of the rectangle:");
        float length=scn.nextFloat();
        float breadth=scn.nextFloat();

        Perimeter p2=new Perimeter(length,breadth);
    }
}