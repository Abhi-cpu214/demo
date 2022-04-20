import java.util.Scanner;
class emp
{
        int id,age;
	String name;	
	emp()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id");
			id=sc.nextInt();
			System.out.println("Enter age");
			age=sc.nextInt();
			System.out.println("Enter name");
			name=sc.next();
         	}
      void display()
	{
		System.out.println("Enter id"+id);
		System.out.println("Enter age"+age);
		System.out.println("Enter name"+name);
	}
}

class dev extends emp
{
	dev()
		{
			}
}
class tester extends emp
{
	tester()
		{
		}
}
public class demo4
{
public static void main(String args[])
{
dev a=new dev();
a.display();
tester t=new tester();
t.display();
}
}
			