class Rectangle
{
		float length;
		float breadth;
		
		public void setData(float l,float b)
		{
			length=l;
			breadth=b;
		}
		public float getArea()
		{
				return length*breadth;
		}
		public static void main(String[] args)
		{
			Rectangle r1= new Rectangle();
			r1.setData(12.4,13);
			System.out.println("Area of R1 = "+r1.getArea());
			
			Rectangle r2= new Rectangle();
			r2.setData(10.5,9);
			System.out.println("Area of R2 = "+r2.getArea());
			
			Rectangle r3= new Rectangle();
			r3.setData(13,14);
			System.out.println("Area of R3 = "+r3.getArea());
			
		}
}