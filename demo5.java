class car
{
	final int speed=1000;
	int wel=4;
	final void loan()
           {
		System.out.println("5%");
	   }
}
class BMW extends car
{	
	void loan()
		{
			System.out.println("4%");
		}
}
class demo5
{
	public static void main(String args[])
	{
		BMW c=new BMW();
                System.out.println(c.speed);
                c.loan();
	}
}