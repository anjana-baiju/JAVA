package Graphics;
import java.util.*;
import java.io.*;

public class Square implements TestInterface
{
	int x;

	public void area()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println ("Enter the side of Square");
		  x = sc.nextInt();

		  System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
	}
}
