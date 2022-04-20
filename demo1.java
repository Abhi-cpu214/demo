 

class A
{
int a=100;
int b=200;
void m1()
{


 System.out.println("Hi"+(a+b));
}
void m2()
{
}
}
class B extends A
{
int a=1000;
int b=300;
int d=400;
void m3(int a)
{
System.out.println("Hi B:"+(a+b));
System.out.println("Hi B this:"+(this.a+b));
System.out.println("Hi B:"+(super.a+b));
}
void m4()
{
}
}
 public class demo1
{
public static void main(String args[])
{
A a=new A();
a.m1();
B b=new B();
b.m3(10);

}
}