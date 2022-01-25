import java.util.*;
class Areaofshapes{

    void Area(float r)
    {
        double area= 3.14*r*r;
        System.out.println("The area of the circle is:"+area);

    }

    void Area(float x,float y)
    {
        float area=x*y;
        System.out.println("The area of the rectangle is:"+area);
    }

    void Area(int a,int b)
    {
        int area=(a*b)/2;
        System.out.println("The area of the triangle is:"+area);
    }

    public static void main(String args[])
    {
      Scanner scn=new Scanner(System.in);
      Areaofshapes a1=new Areaofshapes();

      System.out.println("Enter the radius of the circle:");
      float r=scn.nextFloat();

      a1.Area(r);

      System.out.println("Enter the length and breadth of the rectangle:");
      float l=scn.nextFloat();
      float b=scn.nextFloat();

      a1.Area(l,b);

      System.out.println("Enter the altitude and base measurements of the triangle:");
      int a=scn.nextInt();
      int base=scn.nextInt();
      a1.Area(a, b);
    }
}