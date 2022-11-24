package Java;
class ages
{
	public void age()
	{
		
	}
}
class child1 extends ages
{
	public void age()
	{
		System.out.println("The age of child1 is 15 years");
	}
}
class child2 extends ages
{
	public void age()
	{
		System.out.println("The age of child2 is 10 years");
		
	}
}
class child3 extends ages
{
	public void age()
	{
		System.out.println("The age of child3 is 5 years");
	}
}
public class age_methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child1 obj1=new child1();
		obj1.age();
		child2 obj2=new child2();
		obj2.age();
		child3 obj3=new child3();
		obj3.age(); 

	}

}
