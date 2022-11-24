import java.util.ArrayList;

public class CoreJava2 {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		for(int i=0;i<num.length;i++)
		{
			if (num[i]%2==0)
			{
				System.out.println(num[i]);
			}
			else
			{
				System.out.println(num[i] + "is not a multiple of 2");
			}
		
		}	
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Boney");
		a.add("M");
		a.add("Varghese");
		a.remove(2);
		a.get(1);
		System.out.println(a.get(1));
		
		
		

	


