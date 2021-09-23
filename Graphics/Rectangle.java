package Graphics;
import java.util.*;
import java.io.*;
interface TestInterface
{
  abstract  void area();


}

public class Rectangle implements TestInterface
{
  int l,b;
public  void area()
  {
  Scanner sc = new Scanner(System.in);

    System.out.println ("Enter the length of Rectangle:");
    l = sc.nextInt();
    System.out.println ("Enter the breadth of Rectangle:");
    b = sc.nextInt();
    int a=l*b;
    System.out.println ("Area of Rectangle is "+a +"sq units");
  }


}
