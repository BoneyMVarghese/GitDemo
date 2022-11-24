package Java;

class A
{
	int a;
	int b;
	public void sum()
	{
		System.out.println(a+b);
	}
}

class B extends A
{
	int x;
	int y;
	public void diff()
	{
		System.out.println(x+y);
	}
}
class C extends B
{
	int p;
	int q;
	public void mul()
	{
		System.out.println(p+q);
	}
}

public class hybridinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1=new A();
		obj1.sum();
		obj1.a=100;
		obj1.b=200;
		
		B obj2=new B();
		obj2.diff();
		obj2.x=300;
		obj2.y=50;
		obj2.sum();
		obj2.a=120;
		obj2.b=60;
		
		C obj3=new C();
		obj3.sum();
		obj3.a=500;
		obj3.b=2;
		obj3.diff();
		obj3.x=10;
		obj3.y=2;
		obj3.mul();
		obj3.p=30;
		obj3.q=20;

	}

}
