import java.util.*;
interface newInterface
{
	void area();
	void perimeter();
}

class Rectangle implements newInterface
{
	double l;
	double b;
	Rectangle(double x,double y)
	{
		l=x;
		b=y;
	}
	public void area()
	{
		System.out.println("Area of Rectangle: "+l*b);
	}
	public void perimeter()
	{
		System.out.println("Perimeter of rectangle: "+2*(l+b));
	}
}

class Circle implements newInterface
{
	double r;
	Circle(double x)
	{
		r=x;
	}
	public void area()
	{
		System.out.println("Area of Circle: "+r*r*3.14);
	}
	public void perimeter()
	{
		System.out.println("Perimeter of Circle: "+2*3.14*r);
	}
}

class InterfaceClass
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double x,y;
		int ch=0;

		System.out.println("Enter dimensions of Rectangle: ");
		x=sc.nextDouble();
		y=sc.nextDouble();
		Rectangle rec=new Rectangle(x,y);

		System.out.println("Enter radius of Cirle: ");
		x=sc.nextDouble();
		Circle c=new Circle(x);

		System.out.println("1. Area of circle");
		System.out.println("2. Perimeter of circle");
		System.out.println("3. Area of rectangle");
		System.out.println("4. Perimeter of rectangle");
		System.out.println("5. Quit");

		System.out.println("Enter choice: ");

		ch=sc.nextInt();
		switch(ch)
		{
			case 1: c.area();
			 break;
			case 2: c.perimeter();
			 break;
			case 3: rec.area();
			 break;
			case 4: rec.perimeter();
			 break;
			case 5: System.out.println("Quit");
			 break;
			default: System.out.println("Invalid choice");
			 break;
		}
		sc.close();
	}
}