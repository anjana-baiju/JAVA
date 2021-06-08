import java.io.*;
import java.util.Scanner; 
class Product
{
	int pcode;
	String pname;
	float price;
	public void setData()
	{
		Scanner br = new Scanner(System.in);
		System.out.println("Enter the Code of Product");
		pcode = Integer.parseInt(br.nextLine());
		System.out.println("Enter the Name of Product");
		pname = br.nextLine();
		System.out.println("Enter the Price of Product");
		price = Float.parseFloat(br.nextLine());
		
	}
	public boolean lowest_price( Product p)
	{
		if(price < p.price)
			return true;
		return false;
	}
	public void putData()
	{
		System.out.print("  "+pcode+"    "  );
		System.out.print(pname+"      ");
		System.out.println(price);
	}
	public static void main(String[] args) throws IOException
	{
		
		
		System.out.println("**** Product 1 ****");
		Product p1 = new Product();
		p1.setData();
		
		System.out.println("**** Product 2 ****");
		Product p2 = new Product();
		p2.setData();
		
		System.out.println("**** Product 3 ****");
		Product p3 = new Product();
		p3.setData();
		
		System.out.println("        ### Product Details ###");
		System.out.print(" Code ");
		System.out.print(" Name ");
		System.out.println("   Price ");
		p1.putData();
		p2.putData();
		p3.putData();
		
		
		if(p1.lowest_price(p2))
		{
			if(p1.lowest_price(p3))
				System.out.println(p1.pname +" has the Lowest Price");
			else
				System.out.println(p3.pname +" has the Lowest Price");
		}
		else
		{
			if(p2.lowest_price(p3))
				System.out.println(p2.pname +" has the Lowest Price");
			else
				System.out.println(p3.pname +" has the Lowest Price");
		}
	}

}
