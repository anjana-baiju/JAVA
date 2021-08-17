import java.util.*;
abstract class Shape
{
	abstract void findArea();
}

class Rectangle extends Shape
{
	double l;
	double b;
	Rectangle(double x,double y)
	{
		l=x;
		b=y;
	}
	void findArea()
	{
		System.out.println("Area of Rectangle: "+l*b);
	}
}

class Square extends Shape
{
	double x;
	Square(double a)
	{
		x=a;
	}
	void findArea()
	{
		System.out.println("Area of Square: "+x*x);
	}
}

class Circle extends Shape
{
	double r;
	Circle(double a)
	{
		r=a;
	}
	void findArea()
	{
		System.out.println("Area of Circle: "+r*r*3.14);
	}

}

class abstractClass
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		double a,b;

		System.out.println("Enter length and breadth of rectangle: ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		Rectangle rec=new Rectangle(a,b);
		rec.findArea();

		System.out.println("Enter side of square: ");
		a=sc.nextDouble();
		Square sq=new Square(a);
		sq.findArea();

		System.out.println("Enter radius of circle: ");
		a=sc.nextDouble();
		Circle c=new Circle(a);
		c.findArea();
		sc.close();
	}
}