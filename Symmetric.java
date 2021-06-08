import java.io.*;
class Symmetric
{
	int p;
	int q;
	int[][] matrix = new int[100][100];
	
	
	public boolean check()
	{
		if(p == q)
			return true;
		return false;
			
	}
	public void symmetric_check()
	{
		int flag=0;
		for (int i = 0; i < p; ++i) {
				for(int j = 0; j < q; ++j) 
				{
					if(matrix[i][j] != matrix[j][i])
						flag=1;
				}
		}
		if(flag == 1)
			System.out.println("The Enterted Matrix is not Symmetric");
		else
			System.out.println("The Enterted Matrix is Symmetric");
		
	}
	public void putData()
	{
		for (int i = 0; i < p; ++i) {
				for(int j = 0; j < q; ++j) 
					System.out.print(matrix[i][j] + " ");
				System.out.println();
		}
	}
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Symmetric m1 = new Symmetric();

		
		System.out.println("Enter the Order of Matrix");
		m1.p = Integer.parseInt(br.readLine());
		m1.q = Integer.parseInt(br.readLine());
		
		
		
		if(m1.check())
		{
			System.out.println("Enter the Values for Matrix");
			for (int i = 0; i < m1.p; ++i) 
				for(int j = 0; j < m1.q; ++j) 
					m1.matrix[i][j] = Integer.parseInt(br.readLine());
					
			
			System.out.println("Matrix is : ");
			m1.putData();
			
			
			m1.symmetric_check();
					
		}else
			System.out.println("The Matrix is Not Square Matrix and Not Symmetric");
		
	}
}
