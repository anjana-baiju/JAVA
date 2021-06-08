import java.io.*;
import java.util.Scanner; 

class Complex
{
	int real;
	int img;
	
	public void getNum()
	{
		Scanner br = new Scanner(System.in);
		System.out.print("Real Part : ");
		real = Integer.parseInt(br.nextLine());
		System.out.print("Imaginary Part : ");
		img = Integer.parseInt(br.nextLine());
	}
	public static Complex sum(Complex c1,Complex c2)
	{
		Complex temp = new Complex();
		temp.real= c1.real + c2.real;
		temp.img = c1.img + c2.img;
		return temp;
	}
	public static void main(String[] args) throws IOException
	{
		Complex c1 = new Complex();
		System.out.println("Enter First Complex Number");
		c1.getNum();
		
		Complex c2 = new Complex();
		System.out.println("Enter Second Complex Number");
		c2.getNum();
		
		Complex temp=sum(c1,c2);
		
		System.out.println("Sum of Complex Numbers : ");
		System.out.print("("+c1.real+" + "+c1.img+ "i ) + (" + c2.real+" + "+c2.img + "i) = "+temp.real+" + "+temp.img+"i");
	}
}