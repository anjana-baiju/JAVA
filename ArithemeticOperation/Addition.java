package ArithemeticOperation;
import java.util.*;
import java.io.*;
interface TestInterface
{
  abstract  void calculate();


}

public class Addition implements TestInterface
{
  int l,b;
public  void calculate()
  {
  Scanner sc = new Scanner(System.in);

    System.out.println ("Enter the 1st num:");
    l = sc.nextInt();
    System.out.println ("Enter the 2nd num:");
    b = sc.nextInt();
    int a=l+b;
    System.out.println ("Sum is "+a +"");
  }


}
