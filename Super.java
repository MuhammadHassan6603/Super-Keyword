class A
{
    int i,j;
	void show()
	{
		int i=10;
		int j=20;
        System.out.println("i=" +i + "j=" +j);
	}
}
class B extends A
{
	void print()
	{
	    super.show();
	}

}
class Super{
	public static void main(String args[])
	{
		A aa=new A();
		B bb=new B();
		bb.print();
	}
}