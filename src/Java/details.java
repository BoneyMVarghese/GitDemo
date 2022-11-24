package Java;

public class details {
	String name;
	String company;
	static String base_location="Kochi";
	
	details(String name, String company)
	{
		this.name=name;
		this.company=company;
	}
	public void getname()
	{
		System.out.println(name);
		
	}
	public void getCompany()
	{
		System.out.println(company);
	}
	
	public static void getBaselocation()
	{
		
		System.out.println(base_location);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		details obj1=new details("Boney","TCS");
		details obj2=new details("Rahila","IBS");
		details obj3 =new details("Sahil","Lulu");
		obj1.getname();
		obj1.getCompany();
		obj1.getBaselocation();
		obj2.getname();
		obj2.getCompany();
		obj2.getBaselocation();
		obj3.getname();
		obj3.getCompany();
		obj3.getBaselocation();

	}

}
