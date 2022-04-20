class A
{
	A(int a){
		this(100,"Abhi");
		System.out.println("A(int a)");

        }
	A(int a,String name)
	{
		this();
		System.out.println("A(int a,String name)");
	}
	A()
	{
		System.out.println("A()");
	}
	public void abc()
	{
		System.out.println("My local");
	}
	public void abc(int a)
	{
		System.out.println("my local");
	}
}
class B extends A
{
	
	public void abc()
	{
		System.out.println("My extra local");
	}
}

public class demo6
{
	public static void main(String args[])
	{
		A a=new A(100);
		a.abc();
		
	}
}