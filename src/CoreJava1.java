
public class CoreJava1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		String a = "Boney";
		char letter = 'r';
		double b = 6.8;
		boolean myCard = true;
		
		System.out.println(num);
		System.out.println(num+"  is the value stored in variable num");
		
		//Arrays 
		int[] array = new int[5];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=4;
		array[4]=5;
		
		int[] array1= {1,2,3,4,5};
		System.out.println(array[2]); 
		
		//For loop
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		//string array
		
		String[] name= {"Boney","M","Varghese"};
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		
		//For loop
		for(String s:name)
		{
			System.out.println(s);
		}
	
		

			
		
		
		

	}

}
