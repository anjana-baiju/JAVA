import java.io.*;
import java.util.*; 

class Person
{
	String Name,Address,Gender;
	int Age;
	Person(String name, String address, int age,String gender){
		this.Name=name;
		this.Address=address;
		this.Age=age;
		this.Gender=gender;
	}
}

class Employee extends Person
{
	int EmpId;
	String Company_name,Qualification;
	int Salary;
	Employee(int empId, String firm_name, String Quali, int salary,String name, String address, int age,String gender)
	{
		super(name,address,age, gender);
		this.EmpId=empId;
		this.Company_name=firm_name;
		this.Qualification=Quali;
		this.Salary=salary;
		
	}
}
class Teacher extends Employee
{
	String subject,department;
	int teacherId;
	Teacher(String subject,String department, int teacherId,int empId, String firm_name, String Quali, int salary,String name, String address, int age,String gender)
	{
		super(empId, firm_name,  Quali, salary, name, address, age, gender);
		this.subject=subject;
		this.department=department;
		this.teacherId=teacherId;
	}	
	public void display()
	{
		System.out.println("Name : "+Name+"\n"+"Address : "+Address+"\n"+"Age : "+Age+"\n"+"Gender : "+Gender+"\n"+"Employee Id : "+EmpId+"\n"+"Company Name : "+ Company_name+"\n"+"Qualification : "+Qualification+"\n"+"Salary : "+Salary+"\n"+"Subject : "+subject+"\n"+"Department : "+department+"\n"+"Teacher Id : "+teacherId);
	}
}
class Inheritance
{
	public static void main(String args[])
	{
		
		int N,age,emp_id,teach_id, salary;
		String name,add,com_name,qual,sub,dept,gen;
		
		Scanner br = new Scanner(System.in); 
		
		System.out.println("Enter the Number of Teachers");
		N=br.nextInt();
		Teacher teach[] = new Teacher[N];
		for(int i=0;i<N;i++)
		{	
			System.out.println("Enter the Name :");
			name=br.nextLine();
			
			System.out.println("Enter the Address :");
			add=br.nextLine();
			
			System.out.println("Enter the Age :");
			age=br.nextInt();
			
			System.out.println("Enter the Gender  :");
			gen=br.nextLine();
			
			System.out.println("Enter the Employee ID :");
			emp_id=br.nextInt();
			
			System.out.println("Enter the Company Name :");
			com_name=br.nextLine();
			
			System.out.println("Enter the Qualification :");
			qual=br.nextLine();
			
			System.out.println("Enter the Salary :");
			salary=br.nextInt();
			
			System.out.println("Enter the Subject :");
			sub=br.nextLine();
			
			System.out.println("Enter the Department :");
			dept=br.nextLine();
			
			System.out.println("Enter the Teacher Id :");
			teach_id=br.nextInt();
			
			teach[i] =new Teacher(sub,dept,teach_id,emp_id,com_name,qual,salary,name,add,age,gen);
		} 
			
			for(int i=0;i<N;i++)
			{
				System.out.println("Details of Teacher "+(i+1));
				teach[i].display();
			}
	}
}