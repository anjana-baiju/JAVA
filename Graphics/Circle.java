package Graphics;
import java.util.*;
import java.io.*;
//interface TestInterface
//{
//  abstract  void area();


//}
public class Circle implements TestInterface
{

  int r;

 public void area()
 {
     Scanner sc = new Scanner(System.in);

   System.out.println ("Enter the radius of circle");
    r = sc.nextInt();


   double b=3.14*r*r;
   System.out.println ("Area of Circle is "+b+"sq units");
 }


}
