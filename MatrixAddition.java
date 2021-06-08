import java.io.*;
class MatrixAddition
{
	int p;
	int q;
	int[][] matrix = new int[100][100];
	
	
	public boolean check(MatrixAddition m)
	{
		if(p == m.p && q == m.q)
			return true;
		return false;
			
	}
	public void addition(MatrixAddition m)
	{
		System.out.println("Matrix After Addition : \n");
		for (int i = 0; i < p; ++i) {
				for(int j = 0; j < q; ++j) 
					System.out.print(matrix[i][j] + m.matrix[i][j] + " ");
				System.out.println();
		}
		
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
		
		MatrixAddition m1 = new MatrixAddition();
		MatrixAddition m2 = new MatrixAddition(); 

		
		System.out.println("Enter the Order of First Matrix");
		m1.p = Integer.parseInt(br.readLine());
		m1.q = Integer.parseInt(br.readLine());
		
		
		System.out.println("Enter the Order of Second Matrix");
		m2.p = Integer.parseInt(br.readLine());
		m2.q = Integer.parseInt(br.readLine());
		
		
		if(m1.check(m2))
		{
			System.out.println("Enter the Values for Matrix 1");
			for (int i = 0; i < m1.p; ++i) 
				for(int j = 0; j < m1.q; ++j) 
					m1.matrix[i][j] = Integer.parseInt(br.readLine());
					
			System.out.println("Enter the Values for Matrix 2");
			for (int i = 0; i < m2.p; ++i) 
				for(int j = 0; j < m2.q; ++j) 
					m2.matrix[i][j] = Integer.parseInt(br.readLine());
				
			
			System.out.println("Matrix 1 : ");
			m1.putData();
			
			System.out.println("Matrix 2 : ");
			m2.putData();
			
			m1.addition(m2);
					
		}else
			System.out.println("Matrix with Different Orders Cannot be Added");
		
	}
}
