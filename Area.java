import java.io.*;
class Overloading
{
	double area;
	public void area(int l,int b)
	{
		area=l*b;
		
	}
	public void area(int a)
	{
		area=a*a;
	}
	public void area(double r)
	{
		area=3.14*r*r;
	}
	public void display()
	{
		System.out.println(area);
	}
	public static void main (String args[])
	{
		Overloading a = new Overloading();
		a.area(2,3);
		System.out.print("Area of Rectangle : ");
		a.display();
		System.out.print("Area of Square : ");
		a.area(4);
		a.display();
		a.area(2.0);
		System.out.print("Area of Circle : ");
		a.display();
	}
}