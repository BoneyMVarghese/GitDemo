package Java;

public class StaticVariable {
	String name;
	String branch;
	static String college="AISAT";
	
	StaticVariable(String name, String branch)
	{
		this.name=name;
		this.branch=branch;
	}
	public void getname()
	{
		System.out.println(name);
	}
	
	public void getbranch()
	{
		System.out.println(branch);
	}
	
	public  static void getcollege()
	{
		System.out.println(college);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable sv1=new StaticVariable("Boney","ECE");
		StaticVariable sv2=new StaticVariable("Sahil","Civil");
		sv1.getname();
		sv1.getbranch();
		StaticVariable.getcollege();
		sv2.getname();
		sv2.getbranch();
		StaticVariable.getcollege(); 
		
		

	}

}
