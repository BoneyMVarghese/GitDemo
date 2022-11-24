package Java;

public class constructor {
	public constructor()
	{
		System.out.println("Inside the constructor");
	}
	public constructor(String a, String b)
	{
		System.out.println("Inside para constr");
		
	}
	public void getData()
	{
		System.out.println("Inside the method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor cons=new constructor("Devops","Cloud ");
	}

}
