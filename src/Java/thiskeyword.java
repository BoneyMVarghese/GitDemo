package Java;

public class thiskeyword {
	int a=10;
	public void getData()
	{
		int a=50;
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thiskeyword tkw=new thiskeyword();
		tkw.getData();

	}

}
