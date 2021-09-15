class Rectangle
{
	int length,breadth;
        void setval(int l,int b);
	{
		length=l;
		breadth=b;
	}
	int area()
	{
		int ar=length*breadth;
		return ar;
	}	
	public static void main(String args[])
	{
		Rectangle fobj = new Rectangle();
		fobj.setval(10,20);
		int area=fobj.area();
		System.out.println(area);	
	}
}
