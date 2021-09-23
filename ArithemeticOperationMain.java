import ArithemeticOperation.Addition;
import ArithemeticOperation.Substraction;
import ArithemeticOperation.Multiplication;
import ArithemeticOperation.Division;

import java.util.*;
import java.io.*;
public class ArithemeticOperationMain
{
    public static void main(String[] args)
    {
      int k;

        Addition a = new Addition();
          Substraction s = new Substraction();
            Multiplication m = new Multiplication();
              Division d = new Division();
          do
          {
            System.out.println("Enter your choice");
            System.out.println("1.Addition ");
         System.out.println("2.Substraction ");
          System.out.println("3.Multiplication");
         System.out.println("4.Division");
          Scanner sc = new Scanner(System.in);
k=sc.nextInt();

          switch(k)
          {
            case 1:
                   a.calculate();
                   break;
                   case 2:
                          s.calculate();
                          break;



                          case 3:
                                 m.calculate();
                                 break;
                                 case 4:
                                        d.calculate();
                                        break;

                                        default: System.out.println("WRONG CHOICE");
                                        break;
          }}
          while(k<=4);


    }
}
