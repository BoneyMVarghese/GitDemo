package Java;

public class childdemo extends parentdemo {
	String str="Hi I am Boney";
	
	public void getString()
	{
		System.out.println(str);
		System.out.println(super.str);
	}
	public void favcar()
	{
		System.out.println("Ferrari");
		super.favcar();
	}
	
	public childdemo()
	{
		super();
		System.out.println("childclass cstr");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		childdemo chdem=new childdemo();
		chdem.getString();
		chdem.favcar();

	}

}
