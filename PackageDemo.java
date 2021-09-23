import Graphics.Rectangle;
import Graphics.Circle;
import Graphics.Square;
import Graphics.Triangle;
import java.util.*;
import java.io.*;
public class PackageDemo
{
    public static void main(String[] args)
    {
      int a;

        Rectangle r = new Rectangle();
          Circle c = new Circle();
          Square s=new Square();
              Triangle t=new Triangle();
          do
          {
            System.out.println("Enter your choice");
            System.out.println("1.To calculate area of Rectangle ");
         System.out.println("2.To calculate area of Square ");
          System.out.println("3.To calculate area of Circle");
         System.out.println("4.To calculate area of Triangle");
          Scanner sc = new Scanner(System.in);
a=sc.nextInt();

          switch(a)
          {
            case 1:
                   r.area();
                   break;
                   case 2:
                          s.area();
                          break;



                          case 3:
                                 c.area();
                                 break;
                                 case 4:
                                        t.area();
                                        break;

                                        default: System.out.println("WRONG CHOICE");
                                        break;
          }}
          while(a<=4);


    }
}
