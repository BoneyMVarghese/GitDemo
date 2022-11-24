
public class CoreJava3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Boney M Varghese";
		String s2 = new String("Boney M Varghese");
		String[] splittedstring = s2.split("M");
		System.out.println(splittedstring[0]);
		System.out.println(splittedstring[1]);
		System.out.println(splittedstring[1].trim());
		for(int i=0;i<s1.length();i++)
		{
			System.out.println(s1.charAt(i));
		}
		
		
				

	}

}
