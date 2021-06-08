import java.io.*;

class OddEven
{
	int num;
	public void check()
	{
		if(num%2==0)
			System.out.println(num + " is Even");
		else
			System.out.println(num + " is Odd");
	}
	public static void main(String[] args) throws IOException
	{
		
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
		
		OddEven oe = new OddEven();
		System.out.println("Enter a Number");
		oe.num = Integer.parseInt(br.readLine());
		oe.check();
	
	}
}
